/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui;

import java.awt.CardLayout;
import java.awt.Image;
import java.io.File;
import java.util.regex.Pattern;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.filechooser.FileNameExtensionFilter;
import model.Patient;

/**
 *
 * @author rishabhkaushick
 */
public class FormPanel extends javax.swing.JPanel {

    /**
     * Creates new form FormPanel
     */
    
    private JPanel bottomPanel;
    public FormPanel(JPanel bottomPanel) {
        this.bottomPanel = bottomPanel;
        initComponents();
    }

    public String profilePicName="";// this is the global variable for the name of image uploaded by user.
    public File profilePicture;     // this is the global variable for the profile image uploaded by user.
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        genderButtonGroup = new javax.swing.ButtonGroup();
        mainPanel = new javax.swing.JPanel();
        titleLabel = new javax.swing.JLabel();
        firstNameLabel = new javax.swing.JLabel();
        firstNameTextField = new javax.swing.JTextField();
        lastNameLabel = new javax.swing.JLabel();
        lastNameTextField = new javax.swing.JTextField();
        ageLabel = new javax.swing.JLabel();
        ageTextField = new javax.swing.JTextField();
        emailTextField = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        messageTextArea = new javax.swing.JTextArea();
        emailLabel = new javax.swing.JLabel();
        messageLabel = new javax.swing.JLabel();
        imageLabel = new javax.swing.JLabel();
        submitButton = new javax.swing.JButton();
        attachPicButton = new javax.swing.JButton();
        patientTypeLabel = new javax.swing.JLabel();
        patientTypeComboBox = new javax.swing.JComboBox<>();
        genderLabel = new javax.swing.JLabel();
        maleRadioButton = new javax.swing.JRadioButton();
        femaleRadioButton = new javax.swing.JRadioButton();
        undisclosedRadioButton = new javax.swing.JRadioButton();

        mainPanel.setBackground(new java.awt.Color(0, 153, 204));
        mainPanel.setForeground(new java.awt.Color(255, 255, 255));
        mainPanel.setPreferredSize(new java.awt.Dimension(800, 600));

        titleLabel.setFont(new java.awt.Font("Arima Koshi", 1, 28)); // NOI18N
        titleLabel.setForeground(new java.awt.Color(255, 255, 255));
        titleLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titleLabel.setText("Patient Registration Form");
        titleLabel.setToolTipText("");
        titleLabel.setPreferredSize(new java.awt.Dimension(358, 46));

        firstNameLabel.setFont(new java.awt.Font("Annai MN", 0, 14)); // NOI18N
        firstNameLabel.setForeground(new java.awt.Color(255, 255, 255));
        firstNameLabel.setText("First Name");

        firstNameTextField.setFont(new java.awt.Font("Annai MN", 0, 13)); // NOI18N
        firstNameTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                firstNameTextFieldActionPerformed(evt);
            }
        });

        lastNameLabel.setFont(new java.awt.Font("Annai MN", 0, 14)); // NOI18N
        lastNameLabel.setForeground(new java.awt.Color(255, 255, 255));
        lastNameLabel.setText("Last Name");

        lastNameTextField.setFont(new java.awt.Font("Annai MN", 0, 13)); // NOI18N
        lastNameTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lastNameTextFieldActionPerformed(evt);
            }
        });

        ageLabel.setFont(new java.awt.Font("Annai MN", 0, 14)); // NOI18N
        ageLabel.setForeground(new java.awt.Color(255, 255, 255));
        ageLabel.setText("Age");

        ageTextField.setFont(new java.awt.Font("Annai MN", 0, 13)); // NOI18N

        emailTextField.setFont(new java.awt.Font("Annai MN", 0, 13)); // NOI18N

        messageTextArea.setColumns(20);
        messageTextArea.setFont(new java.awt.Font("Annai MN", 0, 13)); // NOI18N
        messageTextArea.setRows(5);
        jScrollPane1.setViewportView(messageTextArea);

        emailLabel.setFont(new java.awt.Font("Annai MN", 0, 14)); // NOI18N
        emailLabel.setForeground(new java.awt.Color(255, 255, 255));
        emailLabel.setText("Email");

        messageLabel.setFont(new java.awt.Font("Annai MN", 0, 14)); // NOI18N
        messageLabel.setForeground(new java.awt.Color(255, 255, 255));
        messageLabel.setText("Message");

        imageLabel.setFont(new java.awt.Font("Annai MN", 0, 14)); // NOI18N
        imageLabel.setForeground(new java.awt.Color(255, 255, 255));
        imageLabel.setText("Profile Picture");

        submitButton.setFont(new java.awt.Font("Annai MN", 0, 13)); // NOI18N
        submitButton.setText("Submit");
        submitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitButtonActionPerformed(evt);
            }
        });

        attachPicButton.setFont(new java.awt.Font("Annai MN", 0, 13)); // NOI18N
        attachPicButton.setText("Attach a Picture");
        attachPicButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                attachPicButtonActionPerformed(evt);
            }
        });

        patientTypeLabel.setFont(new java.awt.Font("Annai MN", 0, 13)); // NOI18N
        patientTypeLabel.setForeground(new java.awt.Color(255, 255, 255));
        patientTypeLabel.setText("Patient Type");

        patientTypeComboBox.setFont(new java.awt.Font("Annai MN", 0, 13)); // NOI18N
        patientTypeComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Emergency", "Appointment", "Follow-up Appointment", "Walk In" }));
        patientTypeComboBox.setSelectedIndex(-1);
        patientTypeComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                patientTypeComboBoxActionPerformed(evt);
            }
        });

        genderLabel.setFont(new java.awt.Font("Annai MN", 0, 13)); // NOI18N
        genderLabel.setForeground(new java.awt.Color(255, 255, 255));
        genderLabel.setText("Gender");

        genderButtonGroup.add(maleRadioButton);
        maleRadioButton.setFont(new java.awt.Font("Annai MN", 0, 13)); // NOI18N
        maleRadioButton.setForeground(new java.awt.Color(255, 255, 255));
        maleRadioButton.setText("Male");
        maleRadioButton.setActionCommand("MALE");
        maleRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                maleRadioButtonActionPerformed(evt);
            }
        });

        genderButtonGroup.add(femaleRadioButton);
        femaleRadioButton.setFont(new java.awt.Font("Annai MN", 0, 13)); // NOI18N
        femaleRadioButton.setForeground(new java.awt.Color(255, 255, 255));
        femaleRadioButton.setText("Female");
        femaleRadioButton.setActionCommand("FEMALE");
        femaleRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                femaleRadioButtonActionPerformed(evt);
            }
        });

        genderButtonGroup.add(undisclosedRadioButton);
        undisclosedRadioButton.setFont(new java.awt.Font("Annai MN", 0, 13)); // NOI18N
        undisclosedRadioButton.setForeground(new java.awt.Color(255, 255, 255));
        undisclosedRadioButton.setText("Prefer Not To Say");
        undisclosedRadioButton.setActionCommand("UNDISCLOSED");
        undisclosedRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                undisclosedRadioButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout mainPanelLayout = new javax.swing.GroupLayout(mainPanel);
        mainPanel.setLayout(mainPanelLayout);
        mainPanelLayout.setHorizontalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addGap(135, 135, 135)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mainPanelLayout.createSequentialGroup()
                        .addComponent(titleLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 368, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(199, 199, 199))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mainPanelLayout.createSequentialGroup()
                        .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(mainPanelLayout.createSequentialGroup()
                                .addGap(17, 17, 17)
                                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(messageLabel)
                                    .addComponent(ageLabel)))
                            .addComponent(firstNameLabel, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 425, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(mainPanelLayout.createSequentialGroup()
                                .addComponent(firstNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lastNameLabel)
                                .addGap(37, 37, 37)
                                .addComponent(lastNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(mainPanelLayout.createSequentialGroup()
                                .addComponent(ageTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(57, 57, 57)
                                .addComponent(emailLabel)
                                .addGap(18, 18, 18)
                                .addComponent(emailTextField)))
                        .addGap(155, 155, 155))
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addGap(91, 91, 91)
                        .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(imageLabel)
                            .addComponent(patientTypeLabel)
                            .addComponent(genderLabel))
                        .addGap(18, 18, 18)
                        .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(mainPanelLayout.createSequentialGroup()
                                .addComponent(patientTypeComboBox, 0, 1, Short.MAX_VALUE)
                                .addGap(273, 273, 273))
                            .addGroup(mainPanelLayout.createSequentialGroup()
                                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(maleRadioButton)
                                    .addComponent(femaleRadioButton)
                                    .addComponent(attachPicButton)
                                    .addComponent(undisclosedRadioButton)
                                    .addGroup(mainPanelLayout.createSequentialGroup()
                                        .addGap(10, 10, 10)
                                        .addComponent(submitButton, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addContainerGap())))))
        );
        mainPanelLayout.setVerticalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(titleLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(firstNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(firstNameLabel)
                    .addComponent(lastNameLabel)
                    .addComponent(lastNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ageLabel)
                    .addComponent(ageTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(emailLabel)
                    .addComponent(emailTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(messageLabel)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(patientTypeLabel)
                    .addComponent(patientTypeComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(genderLabel)
                    .addComponent(maleRadioButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(femaleRadioButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(undisclosedRadioButton)
                .addGap(18, 18, 18)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(imageLabel)
                    .addComponent(attachPicButton))
                .addGap(18, 18, 18)
                .addComponent(submitButton)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 580, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void firstNameTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_firstNameTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_firstNameTextFieldActionPerformed

    private void lastNameTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lastNameTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lastNameTextFieldActionPerformed

    // helper function to update most relevant title of the popup title
    public String updatePopupTitle(String popupTitle, String newPopupTitle){
        if (popupTitle.equals("")){
            //this means that this is the first error. Therefore we display a specific error message in the title
            return newPopupTitle;
        } else{
            //this means that there are multiple errors in the form submission
            return "Please Fix Below Erros:";
        }
    }
    
    // helper funtion to update all the errors present in the popup message
    public String updatePopupMessage(String popupMessage, String newPopupMessage){
        if(popupMessage.equals("")){
            return newPopupMessage;
        } else{
            return popupMessage+"\n"+newPopupMessage;
        }
    }
    private void submitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitButtonActionPerformed
        // TODO add your handling code here:
        
        // Now need to get the data into the User
        
        // adding error handling string messages here
        String popupTitle="", popupMessage="";

        // Using Regex to Validate the User Inputs
        String regexString = "[(')a-zA-z]*";
        String numericString = "[0-9]*";
        String emailString = "([a-zA-Z0-9.!#$%&'*+=?^_`{|}~-]+@[a-zA-Z0-9-]+\\.[a-zA-Z0-9]+(\\.[a-zA-Z0-9]+)*)";
        Pattern regexNamePattern = Pattern.compile(regexString);
        Pattern regexAgePattern = Pattern.compile(numericString);
        Pattern regexEmailPattern = Pattern.compile(emailString);

        Boolean errorFlag = false;

        // Creating an ImageIcon variable to display the icon (if the user selects an image)
        ImageIcon profilePicIcon = new ImageIcon();

        // If the user does not select an icon - it will display either the success icon or fail icon based on the validations
        ImageIcon successIcon = new ImageIcon(System.getProperty("user.dir")+"/src/ui/success_image.png");
        // scaling the success icon
        Image successImage = successIcon.getImage();
        successImage = successImage.getScaledInstance(120, 120, WIDTH);
        successIcon = new ImageIcon(successImage);

        ImageIcon errorIcon = new ImageIcon(System.getProperty("user.dir")+"/src/ui/error_image.png");
        // similarly scaling the failure icon
        Image errorImage = errorIcon.getImage();
        errorImage = errorImage.getScaledInstance(120, 120, WIDTH);
        errorIcon = new ImageIcon(errorImage);

        try{
            // First Name Validations
            // testing if the first name is blank
            if(firstNameTextField.getText().isBlank()){
                // first name is mandatory - popup should say that it is required.
                popupTitle = updatePopupTitle(popupTitle, "First Name Required!");
                popupMessage = updatePopupMessage(popupMessage, "Please enter your first name to proceed.");
                errorFlag = true;
            } // testing if first name contains any special characters
            else if((!regexNamePattern.matcher(firstNameTextField.getText()).matches())){
                // if first name is not blank - it should not have any special characters
                popupTitle = updatePopupTitle(popupTitle, "Special Characters/ Numbers Not Allowed in First Name");
                popupMessage = updatePopupMessage(popupMessage, "Sorry, special characters or numbers are not allowed in the First Name.");
                errorFlag = true;
            }

            // Last Name Validations
            // last name cannot contain special characters as well (except for ' for names like D'Souza
                if(!regexNamePattern.matcher(lastNameTextField.getText()).matches()){
                    popupTitle = updatePopupTitle(popupTitle, "Numbers / Special Characters Not Allowed in Last Name");
                    popupMessage = updatePopupMessage(popupMessage, "Sorry, special characters or numbers are not allowed in the Last Name.");
                    errorFlag = true;
                }

                // Age validations
                if(ageTextField.getText().isBlank()){
                    popupTitle = updatePopupTitle(popupTitle, "Age is Required!");
                    popupMessage = updatePopupMessage(popupMessage, "Please enter your age to proceed.");
                    errorFlag = true;
                }
                else if(!regexAgePattern.matcher(ageTextField.getText()).matches()){
                    // not a number
                    popupTitle = updatePopupTitle(popupTitle, "Age Should a Numeric Value");
                    popupMessage = updatePopupMessage(popupMessage, "Please enter the value of your age in numeric values between 1 - 130");
                    errorFlag = true;
                } else if (ageTextField.getText().equals("0")){
                    // age cannot be 0
                    popupTitle = updatePopupTitle(popupTitle, "Age Cannot be 0");
                    popupMessage = updatePopupMessage(popupMessage, "Please enter a valid age between 1 - 130");
                    errorFlag = true;
                } else if (Integer.parseInt(ageTextField.getText()) > 130){
                    // age greater than 130 is not possible - update the error message
                    popupTitle = updatePopupTitle(popupTitle, "Too Old!!");
                    popupMessage = updatePopupMessage(popupMessage, "The Age you entered is too old to live, please re-check and enter your real age to proceed.");
                    errorFlag = true;
                }

                // Email Validations
                if(emailTextField.getText().isBlank()){
                    popupTitle = updatePopupTitle(popupTitle, "Email is Required!");
                    popupMessage = updatePopupMessage(popupMessage, "Please enter your email to proceed.");
                    errorFlag = true;
                } else if(!regexEmailPattern.matcher(emailTextField.getText()).matches()){
                    // test if email matches the regex pattern
                    popupTitle = updatePopupTitle(popupTitle, "Invalid Email Address!");
                    popupMessage = updatePopupMessage(popupMessage, "Please enter a valid email address to proceed.");
                    errorFlag = true;
                }
                
                // Patient Type Validations
                if(patientTypeComboBox.getSelectedIndex() == -1){
                    // this means the user has not selected any values --> throw error
                    popupTitle = updatePopupTitle(popupTitle, "Invalid Patient Type!");
                    popupMessage = updatePopupMessage(popupMessage, "Please select a valid patient type from the dropdown to proceed.");
                    errorFlag = true;
                }
                
                // Gender Validations
                // System.out.println("Gender Validations");
                // any one of the radio buttons in the button group must be selected
                if(genderButtonGroup.isSelected(maleRadioButton.getModel()) == false &&
                        genderButtonGroup.isSelected(femaleRadioButton.getModel()) == false &&
                        genderButtonGroup.isSelected(undisclosedRadioButton.getModel()) == false){
                    // if all of them are false, then none of them has been selected by the user --> hence display error popup to user.
                    // if any one of them is true then it is selected
                    popupTitle = updatePopupTitle(popupTitle, "Gender is Required!");
                    popupMessage = updatePopupMessage(popupMessage, "Please select one of the gender choices to proceed.");
                    errorFlag = true;
                }
                // System.out.println("Male selection is: "+genderButtonGroup.isSelected(maleRadioButton.getModel()));

                // Test if the selected photo is an image - jpg, jpeg, png, heic
                if(this.profilePicName.isBlank() || this.profilePicName.equals("No Image Uploaded")){
                    // this means that the user has not uploaded any image
                    this.profilePicName = "No Image Uploaded";
                } else {
                    // this means the user has uploaded an image
                    // creating an icon out of the image file:
                    profilePicIcon = new ImageIcon(this.profilePicture.getAbsolutePath());
                    // scaling the profile picture icon
                    Image profilePicImage = profilePicIcon.getImage();
                    profilePicImage = profilePicImage.getScaledInstance(120, 120, WIDTH);
                    profilePicIcon = new ImageIcon(profilePicImage);
                }

                if(popupTitle.equals("") && popupMessage.equals("") && (!errorFlag)){
                    popupTitle = "Submitted!";
                    popupMessage = "Your entry has been recorded!"+"\n"
                    +"Name: "+firstNameTextField.getText()+" "+lastNameTextField.getText()+"\n"
                    +"Age: "+ageTextField.getText()+"\n"
                    +"Email:"+emailTextField.getText()+"\n"
                    +"Message: "+"\n"+messageTextArea.getText()+"\n"
                    +"Image:"+this.profilePicName+"\n";

                }
                // logging message for debugging
                System.out.println("Popup Title: "+popupTitle);
                System.out.println("Popup Body: "+popupMessage);
                if(errorFlag){
                    // this means there is an error - so displaying the error message with the error icon
                    // System.out.println(System.getProperty("user.dir")+"/src/ui/error_image.jpeg"); // debug
                    JOptionPane.showMessageDialog(this, popupMessage, popupTitle, HEIGHT, errorIcon);
                } else {
                    // no error
                    if(this.profilePicName.isBlank() || this.profilePicName.equals("No Image Uploaded")){
                        // no profile picture
                        // display the details with the success icon
                        // System.out.println(System.getProperty("user.dir")+"/src/ui/success_image.png");
                        // JOptionPane.showMessageDialog(this, popupMessage, popupTitle, HEIGHT, successIcon);
                        // instead of getting a dialog box --> we must put it in the Patient object.
                        Patient patient1 = new Patient();
                        patient1.setFirstName(firstNameTextField.getText());
                        patient1.setLastName(lastNameTextField.getText());
                        patient1.setAge(Integer.parseInt(ageTextField.getText()));
                        patient1.setEmail(emailTextField.getText());
                        patient1.setMessage(messageTextArea.getText());
                        patient1.setDisplayPic(successIcon);
                        
                        // trying to understand how to get the selected value of the 
                        System.out.println(genderButtonGroup.getSelection().getActionCommand());
                        
                        patient1.setGender(genderButtonGroup.getSelection().getActionCommand());
                        
                        ViewPanel newViewPanel = new ViewPanel(patient1);
                        this.bottomPanel.add(newViewPanel);
                        CardLayout layout = (CardLayout) this.bottomPanel.getLayout();
                        layout.next(this.bottomPanel);
                        
                    } else {
                        // profile picture loaded by the user
                        // System.out.println(this.profilePicture.getAbsolutePath());
                        // JOptionPane.showMessageDialog(this, popupMessage, popupTitle, HEIGHT, profilePicIcon);
                        // instead of getting a dialog box --> we must put it in the Patient object.
                        // and then view the ViewPane button
                        
                        // Here the patient record must be initialized and it should go to the View Panel page
                        Patient patient1 = new Patient();
                        patient1.setFirstName(firstNameTextField.getText());                        
                        patient1.setLastName(lastNameTextField.getText());
                        patient1.setAge(Integer.parseInt(ageTextField.getText()));
                        patient1.setEmail(emailTextField.getText());
                        patient1.setMessage(messageTextArea.getText());
//                        System.out.println(genderButtonGroup.getSelection().getActionCommand());
                        profilePicIcon = new ImageIcon(this.profilePicture.getAbsolutePath());
                        patient1.setDisplayPic(profilePicIcon);

                        ViewPanel newViewPanel = new ViewPanel(patient1);
                        this.bottomPanel.add(newViewPanel);
                        CardLayout layout = (CardLayout) this.bottomPanel.getLayout();
                        layout.next(this.bottomPanel);                         
                        
                    }
                }
            } catch(Exception e){
                JOptionPane.showMessageDialog(this, "Sorry, but there was an error while submitting! Please see the below error details:"+"\n"+e, "Oops!", HEIGHT);
            }
    }//GEN-LAST:event_submitButtonActionPerformed

    private void attachPicButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_attachPicButtonActionPerformed
        // TODO add your handling code here:
        JFileChooser picChooser = new JFileChooser();
        // we need to make sure that this file chooser is allowed to only select picture files
        // so we need a FileNameExtensionFilter
        FileNameExtensionFilter imagesFilter = new FileNameExtensionFilter("Image Files", "jpg", "png", "gif", "jpeg");
        picChooser.setFileFilter(imagesFilter);
        picChooser.showOpenDialog(null);

        try{
            File imageFile = picChooser.getSelectedFile();
            String fileAbsolutePath = imageFile.getAbsolutePath();
            //            System.out.println(fileAbsolutePath); //debug
            String fileNameExtension = fileAbsolutePath.split("\\.")[1];
            fileNameExtension = fileNameExtension.toLowerCase(); // in case the files extensions are in upper case.
            //            System.out.println(fileNameExtension); //debug
            // now checking if the file which was selected was an image file
            if ((fileNameExtension.equals("jpg")) ||
                (fileNameExtension.equals("png")) ||
                (fileNameExtension.equals("gif")) ||
                (fileNameExtension.equals("jpeg"))){
                // User has selected an image
                this.profilePicture = imageFile;
                this.profilePicName = imageFile.getName();
            } else{
                // wrong file format
                // show an error popup
                this.profilePicName = ""; // setting it back to blank in case it was initially set before.
                JOptionPane.showMessageDialog(this, "Please select an image file containing one of the following extensions - png, jpg, jpeg, gif", "Image File Not Selected!", HEIGHT);
            }
        } catch(NullPointerException npe){
            // this exception occurs when user presses cancel instead of selecting any image.
            this.profilePicName = ""; // setting it back to blank
        } catch(Exception e){
            System.out.println("Something went wrong here - attachPicButtonActionPerformed()");
            System.out.println(e);
            JOptionPane.showMessageDialog(this, "Sorry, but there was an error while selecting the file. Please see the error below:"+"\n"+e, "Oops!", HEIGHT);

        }
    }//GEN-LAST:event_attachPicButtonActionPerformed

    private void patientTypeComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_patientTypeComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_patientTypeComboBoxActionPerformed

    private void maleRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_maleRadioButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_maleRadioButtonActionPerformed

    private void femaleRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_femaleRadioButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_femaleRadioButtonActionPerformed

    private void undisclosedRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_undisclosedRadioButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_undisclosedRadioButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ageLabel;
    private javax.swing.JTextField ageTextField;
    private javax.swing.JButton attachPicButton;
    private javax.swing.JLabel emailLabel;
    private javax.swing.JTextField emailTextField;
    private javax.swing.JRadioButton femaleRadioButton;
    private javax.swing.JLabel firstNameLabel;
    private javax.swing.JTextField firstNameTextField;
    private javax.swing.ButtonGroup genderButtonGroup;
    private javax.swing.JLabel genderLabel;
    private javax.swing.JLabel imageLabel;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lastNameLabel;
    private javax.swing.JTextField lastNameTextField;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JRadioButton maleRadioButton;
    private javax.swing.JLabel messageLabel;
    private javax.swing.JTextArea messageTextArea;
    private javax.swing.JComboBox<String> patientTypeComboBox;
    private javax.swing.JLabel patientTypeLabel;
    private javax.swing.JButton submitButton;
    private javax.swing.JLabel titleLabel;
    private javax.swing.JRadioButton undisclosedRadioButton;
    // End of variables declaration//GEN-END:variables
}
