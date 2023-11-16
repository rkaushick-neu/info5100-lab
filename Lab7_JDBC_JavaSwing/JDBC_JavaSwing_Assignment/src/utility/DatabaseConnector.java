/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package utility;

import java.sql.*;
import java.util.ArrayList;
import model.Patient;

/**
 *
 * @author rishabhkaushick
 */
public class DatabaseConnector {
    private static final String URL = "jdbc:mysql://localhost:3306/medicaldb?useSSL=false";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "my-secret-pw";
    
    /**
     * Privatized constructor so as to not allow object creation
     */
    private DatabaseConnector(){
    }
    
    /**
     * Add the patient details into the database
     * @see Patient
     * @param patient Patient object to be added
     */
    public static void addPatient(Patient patient) {
        //add to database
        String query = "INSERT INTO patient(first_name, last_name, age, patient_type) VALUES(?,?,?,?)";
        try (Connection conn = DriverManager.getConnection(URL, USERNAME, PASSWORD)) {
            PreparedStatement stmt = conn.prepareStatement(query);
            stmt.setString(1, patient.getFirstName());
            stmt.setString(2, patient.getLastName());
            stmt.setInt(3, patient.getAge());
            stmt.setString(4, patient.getPatientType());
            int rows = stmt.executeUpdate();
            System.out.println("Rows impacted : " + rows);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    /**
     * Returns a list of all the patients in the database
     * @see Patient
     * @return array-list of patients
     */
    public static ArrayList<Patient> getAllPatients() {
        ArrayList<Patient> patients = new ArrayList<>();

        String query = "SELECT * FROM patient";
        try (Connection conn = DriverManager.getConnection(URL, USERNAME, PASSWORD)) {
            // the try block will close the cursor, so we do not need to write conn.close()
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(query);
            while (rs.next()) {
                Patient patient = new Patient();
                patient.setFirstName(rs.getString("first_name"));
                patient.setLastName(rs.getString("last_name"));
                patient.setAge(rs.getInt("age"));
                patient.setPatientType(rs.getString("patient_type"));
                patient.setId(rs.getInt("id"));
                patients.add(patient);
            }
            rs.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return patients;
    }

    /**
     * Delete a given patient from the database
     * @see Patient
     * @param patient Patient to be deleted
     * 
     */
    public static void deleteUser(Patient patient) {
        String query = "DELETE FROM patient WHERE id = ?";

        try (Connection conn = DriverManager.getConnection(URL, USERNAME, PASSWORD)) {
            PreparedStatement stmt = conn.prepareStatement(query);
            stmt.setInt(1, patient.getId());
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    /**
     * Edit the details of a patient in the database
     * @param oldPatient existing patient in database
     * @param newPatient modified patient details
     */
    public static void editUser(Patient oldPatient, Patient newPatient) {
        String query = "UPDATE USER SET name=?, age=? WHERE id=?";

        try (Connection conn = DriverManager.getConnection(URL, USERNAME, PASSWORD)) {
            PreparedStatement stmt = conn.prepareStatement(query);
            stmt.setString(1, newPatient.getFirstName());
            stmt.setInt(2, newPatient.getAge());
            stmt.setInt(3, oldPatient.getId());
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
