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
        String query = "INSERT INTO PATIENT(NAME,AGE) VALUES(?,?)";
        try (Connection conn = DriverManager.getConnection(URL, USERNAME, PASSWORD)) {
            PreparedStatement stmt = conn.prepareStatement(query);
            stmt.setString(1, patient.getFirstName());
            stmt.setInt(2, patient.getAge());
            int rows = stmt.executeUpdate();
            System.out.println("Rows impacted : " + rows);
//            conn.close();
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
        ArrayList<Patient> users = new ArrayList<>();

        String query = "SELECT * FROM PATIENT";
        try (Connection conn = DriverManager.getConnection(URL, USERNAME, PASSWORD)) {
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(query);
            while (rs.next()) {
                Patient u = new Patient();
                u.setFirstName(rs.getString("name"));
                u.setAge(rs.getInt("age"));
                u.setId(rs.getInt("id"));
                users.add(u);
            }
            rs.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return users;
    }

    /**
     * Delete a given patient from the database
     * @see Patient
     * @param u Patient to be deleted
     * 
     */
    public static void deleteUser(Patient u) {
        String query = "delete from PATIENT where id = ?";

        try (Connection conn = DriverManager.getConnection(URL, USERNAME, PASSWORD)) {
            PreparedStatement stmt = conn.prepareStatement(query);
            stmt.setInt(1, u.getId());
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
