package airline.reservation.system;
//Import Statements
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.SQLIntegrityConstraintViolationException;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;

public final class RegisterGUI extends javax.swing.JFrame {
    public RegisterGUI() {
        // Initialize the graphical components of the registration GUI
        initComponents();
        
        // Center the registration window on the screen
        setLocationRelativeTo(null);
        
        // Add placeholder styles to text fields for better user experience
        addPlaceholderStyle(nameTextField);
        addPlaceholderStyle(emailTextField);
        addPlaceholderStyle(phoneNumberField);
        addPlaceholderStyle(usernameField);
        addPlaceholderStyle(confirmPasswordField);
        addPlaceholderStyle(passwordField);
        
        //Hide the validation labels 
        hideComponents();
        
    }
    
    public void hideComponents(){
        nameRequiredLabel.setVisible(false);
        usernameRequiredLabel.setVisible(false);
        emailRequiredLabel.setVisible(false);
        phoneNumberReqiuredLabel.setVisible(false);
        passwordRequiredLabel.setVisible(false);
        confirmPasswordRequiredLabel.setVisible(false);
    }
    
    /**
    * Adds a placeholder style to the specified JTextField.
    * This method sets the font style to plain and the text color
    * to gray, providing a visual cue for placeholder text.
    *
    * @param textfield The JTextField to which the placeholder style is applied.
    */
    public void addPlaceholderStyle(JTextField textfield){
        // Get the current font of the text field
        Font font = textfield.getFont();
        // Derive a new font with plain style
        font = font.deriveFont(Font.PLAIN);
         // Set the font and text color for placeholder style
        textfield.setFont(font);
        textfield.setForeground(Color.gray);
    }
    
        /**
     * Removes the placeholder style from the specified JTextField.
     * This method sets the font style to plain and bold, and the text
     * color to black, restoring the regular appearance of the text field.
     *
     * @param textfield The JTextField from which the placeholder style is removed.
     */
    public void removePlaceholderStyle(JTextField textfield){
        // Get the current font of the text field
        Font font = textfield.getFont();

        // Derive a new font with plain and bold style
        font = font.deriveFont(Font.BOLD);

        // Set the font and text color to restore the regular appearance
        textfield.setFont(font);
        textfield.setForeground(Color.black);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        RegistrationPanel = new javax.swing.JPanel();
        registrationLabel = new javax.swing.JLabel();
        nameLabel = new javax.swing.JLabel();
        nameTextField = new javax.swing.JTextField();
        emailLabel = new javax.swing.JLabel();
        emailTextField = new javax.swing.JTextField();
        passwordLabel = new javax.swing.JLabel();
        passwordField = new javax.swing.JPasswordField();
        usernameLabel = new javax.swing.JLabel();
        usernameField = new javax.swing.JTextField();
        phoneNumberLabel = new javax.swing.JLabel();
        phoneNumberField = new javax.swing.JFormattedTextField();
        confirmPasswordLabel = new javax.swing.JLabel();
        confirmPasswordField = new javax.swing.JPasswordField();
        registerButton = new javax.swing.JButton();
        loginButton = new javax.swing.JButton();
        logo = new javax.swing.JLabel();
        nameRequiredLabel = new javax.swing.JLabel();
        usernameRequiredLabel = new javax.swing.JLabel();
        emailRequiredLabel = new javax.swing.JLabel();
        phoneNumberReqiuredLabel = new javax.swing.JLabel();
        passwordRequiredLabel = new javax.swing.JLabel();
        confirmPasswordRequiredLabel = new javax.swing.JLabel();
        RegisterImagePanel = new javax.swing.JPanel();
        registerImage = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Registration ");
        setName("RegistrationForm"); // NOI18N
        setResizable(false);
        addWindowFocusListener(new java.awt.event.WindowFocusListener() {
            public void windowGainedFocus(java.awt.event.WindowEvent evt) {
                formWindowGainedFocus(evt);
            }
            public void windowLostFocus(java.awt.event.WindowEvent evt) {
            }
        });

        RegistrationPanel.setBackground(new java.awt.Color(228, 240, 253));
        RegistrationPanel.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 153, 255), 2, true));

        registrationLabel.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        registrationLabel.setForeground(new java.awt.Color(7, 109, 157));
        registrationLabel.setText("Register");

        nameLabel.setText("Name");

        nameTextField.setText("Enter your name");
        nameTextField.setToolTipText("");
        nameTextField.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        nameTextField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                nameTextFieldFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                nameTextFieldFocusLost(evt);
            }
        });

        emailLabel.setText("Email");

        emailTextField.setText("Enter your email");
        emailTextField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                emailTextFieldFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                emailTextFieldFocusLost(evt);
            }
        });
        emailTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emailTextFieldActionPerformed(evt);
            }
        });

        passwordLabel.setText("Password ");

        passwordField.setText("Enter your password");
        passwordField.setDoubleBuffered(true);
        passwordField.setEchoChar('\u0000');
        passwordField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                passwordFieldFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                passwordFieldFocusLost(evt);
            }
        });
        passwordField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordFieldActionPerformed(evt);
            }
        });

        usernameLabel.setText("Username");

        usernameField.setText("Enter your username");
        usernameField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                usernameFieldFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                usernameFieldFocusLost(evt);
            }
        });

        phoneNumberLabel.setText("Phone Number");

        phoneNumberField.setText("Enter your number");
        phoneNumberField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                phoneNumberFieldFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                phoneNumberFieldFocusLost(evt);
            }
        });

        confirmPasswordLabel.setText("Confirm Password");

        confirmPasswordField.setText("Confirm your password");
        confirmPasswordField.setEchoChar('\u0000');
        confirmPasswordField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                confirmPasswordFieldFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                confirmPasswordFieldFocusLost(evt);
            }
        });
        confirmPasswordField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirmPasswordFieldActionPerformed(evt);
            }
        });

        registerButton.setBackground(new java.awt.Color(0, 153, 204));
        registerButton.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        registerButton.setForeground(new java.awt.Color(255, 255, 255));
        registerButton.setText("Register");
        registerButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                registerButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                registerButtonMouseExited(evt);
            }
        });
        registerButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registerButtonActionPerformed(evt);
            }
        });

        loginButton.setBackground(new java.awt.Color(228, 240, 255));
        loginButton.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        loginButton.setForeground(new java.awt.Color(0, 153, 153));
        loginButton.setText("Back to Login");
        loginButton.setBorder(null);
        loginButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        loginButton.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        loginButton.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        loginButton.setIconTextGap(3);
        loginButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                loginButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                loginButtonMouseExited(evt);
            }
        });
        loginButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginButtonActionPerformed(evt);
            }
        });

        logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8-airport-48.png"))); // NOI18N

        nameRequiredLabel.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        nameRequiredLabel.setForeground(new java.awt.Color(153, 0, 0));
        nameRequiredLabel.setText("* Name is required");

        usernameRequiredLabel.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        usernameRequiredLabel.setForeground(new java.awt.Color(153, 0, 0));
        usernameRequiredLabel.setText("* Username is required");

        emailRequiredLabel.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        emailRequiredLabel.setForeground(new java.awt.Color(153, 0, 0));
        emailRequiredLabel.setText("* Email is required");

        phoneNumberReqiuredLabel.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        phoneNumberReqiuredLabel.setForeground(new java.awt.Color(153, 0, 0));
        phoneNumberReqiuredLabel.setText("* Phone Number is required");

        passwordRequiredLabel.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        passwordRequiredLabel.setForeground(new java.awt.Color(153, 0, 0));
        passwordRequiredLabel.setText("* Password is required");

        confirmPasswordRequiredLabel.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        confirmPasswordRequiredLabel.setForeground(new java.awt.Color(153, 0, 0));
        confirmPasswordRequiredLabel.setText("* Confirm password is required");

        javax.swing.GroupLayout RegistrationPanelLayout = new javax.swing.GroupLayout(RegistrationPanel);
        RegistrationPanel.setLayout(RegistrationPanelLayout);
        RegistrationPanelLayout.setHorizontalGroup(
            RegistrationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(RegistrationPanelLayout.createSequentialGroup()
                .addGroup(RegistrationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(RegistrationPanelLayout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addGroup(RegistrationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(RegistrationPanelLayout.createSequentialGroup()
                                .addComponent(registrationLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(logo))
                            .addGroup(RegistrationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(passwordLabel)
                                .addComponent(nameTextField)
                                .addComponent(emailTextField)
                                .addComponent(passwordField, javax.swing.GroupLayout.DEFAULT_SIZE, 203, Short.MAX_VALUE)
                                .addComponent(nameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(emailLabel))
                            .addComponent(nameRequiredLabel)
                            .addComponent(emailRequiredLabel)
                            .addComponent(passwordRequiredLabel))
                        .addGap(85, 85, 85)
                        .addGroup(RegistrationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(confirmPasswordRequiredLabel)
                            .addComponent(phoneNumberReqiuredLabel)
                            .addComponent(usernameRequiredLabel)
                            .addComponent(usernameField, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(usernameLabel)
                            .addComponent(phoneNumberLabel)
                            .addComponent(confirmPasswordLabel)
                            .addComponent(confirmPasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(phoneNumberField, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(RegistrationPanelLayout.createSequentialGroup()
                        .addGap(217, 217, 217)
                        .addComponent(registerButton, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(RegistrationPanelLayout.createSequentialGroup()
                        .addGap(236, 236, 236)
                        .addComponent(loginButton)))
                .addContainerGap(37, Short.MAX_VALUE))
        );
        RegistrationPanelLayout.setVerticalGroup(
            RegistrationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(RegistrationPanelLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(RegistrationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(registrationLabel)
                    .addComponent(logo))
                .addGap(40, 40, 40)
                .addGroup(RegistrationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nameLabel)
                    .addComponent(usernameLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(RegistrationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(usernameField, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(RegistrationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nameRequiredLabel)
                    .addComponent(usernameRequiredLabel))
                .addGap(33, 33, 33)
                .addGroup(RegistrationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(emailLabel)
                    .addComponent(phoneNumberLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(RegistrationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(phoneNumberField, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(emailTextField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(RegistrationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(phoneNumberReqiuredLabel)
                    .addComponent(emailRequiredLabel))
                .addGap(33, 33, 33)
                .addGroup(RegistrationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(passwordLabel)
                    .addComponent(confirmPasswordLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(RegistrationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(passwordField, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(confirmPasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(RegistrationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(passwordRequiredLabel)
                    .addComponent(confirmPasswordRequiredLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                .addComponent(registerButton, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(loginButton)
                .addGap(54, 54, 54))
        );

        phoneNumberField.getAccessibleContext().setAccessibleName("");

        RegisterImagePanel.setBackground(new java.awt.Color(255, 255, 255));
        RegisterImagePanel.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 153, 255), 2, true));

        registerImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/b52933430789b6d9b80bc61dd0bfaf3d.jpg"))); // NOI18N

        javax.swing.GroupLayout RegisterImagePanelLayout = new javax.swing.GroupLayout(RegisterImagePanel);
        RegisterImagePanel.setLayout(RegisterImagePanelLayout);
        RegisterImagePanelLayout.setHorizontalGroup(
            RegisterImagePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(RegisterImagePanelLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(registerImage, javax.swing.GroupLayout.PREFERRED_SIZE, 481, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );
        RegisterImagePanelLayout.setVerticalGroup(
            RegisterImagePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(RegisterImagePanelLayout.createSequentialGroup()
                .addGap(88, 88, 88)
                .addComponent(registerImage, javax.swing.GroupLayout.PREFERRED_SIZE, 355, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(RegisterImagePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0)
                .addComponent(RegistrationPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(RegisterImagePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(RegistrationPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void registerButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registerButtonActionPerformed
        // Get user inputs from the JTextFields
        String name =  nameTextField.getText();
        String username = usernameField.getText();
        String email = emailTextField.getText();
        String phoneNumber = phoneNumberField.getText();
        int length = phoneNumber.length();
        String password = passwordField.getText();
        String confirmPassword = confirmPasswordField.getText();
        
            // Validate the user inputs
            if (name.equals("Enter your name")) {
                nameRequiredLabel.setVisible(true);
                nameTextField.setBorder(new LineBorder(new Color(153,0,0)));
            }else if (name.matches(".*[0-9!@#$%^&*()_+{}|:\"<>?~`].*")) {
                JOptionPane.showMessageDialog(registerButton, "Invalid name", "Error", JOptionPane.ERROR_MESSAGE);
            }  
            
            if (username.equals("Enter your username")) {
                usernameRequiredLabel.setVisible(true);
                usernameField.setBorder(new LineBorder(new Color(153,0,0)));
            }
            
            if (email.equals("Enter your email") ) {
                emailRequiredLabel.setVisible(true);
                emailTextField.setBorder(new LineBorder(new Color(153,0,0)));
            }else if(!email.matches("^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$")){
                JOptionPane.showMessageDialog(registerButton, "Enter a valid email address","Error",JOptionPane.ERROR_MESSAGE);
            }
            
            if (phoneNumber.equals("Enter your number")) {
                phoneNumberReqiuredLabel.setVisible(true);
                phoneNumberField.setBorder(new LineBorder(new Color(153,0,0)));
            }else if(length != 10 || !phoneNumber.matches("\\d+")){
                JOptionPane.showMessageDialog(registerButton, "Enter a valid 10-digit phone number","Error",JOptionPane.ERROR_MESSAGE);   
            }
                    
            if (password.equals("Enter your password")) {
                passwordRequiredLabel.setVisible(true);
                passwordField.setBorder(new LineBorder(new Color(153,0,0)));
            }else if(password.length() < 8){
                JOptionPane.showMessageDialog(registerButton, "Password must be at least 8 characters long","Error",JOptionPane.ERROR_MESSAGE);
            }
                                    
            if (confirmPassword.equals("Confirm your password")) {
                confirmPasswordRequiredLabel.setVisible(true);
                confirmPasswordField.setBorder(new LineBorder(new Color(153,0,0)));
            }else if (!confirmPassword.equals(password)) {
                JOptionPane.showMessageDialog(registerButton, "Passwords do not match","Error",JOptionPane.ERROR_MESSAGE);
            }
            else{
                try {
                        // Get a connection from the DatabaseHandler
                        Connection connection = DatabaseHandler.getConnection();

                        // Generate a customer ID
                        String customerId = generateCustomerId();

                        String query = "INSERT INTO customer VALUES('" + customerId + "','" + name + "','" + username + "', '" + email + "','" + phoneNumber + "','" + password + "','" + confirmPassword + "')";
                        Statement statement = connection.createStatement();

                        // Execute the query to insert the new customer
                        statement.executeUpdate(query);

                        // Display a success message
                        JOptionPane.showMessageDialog(registerButton,"Your account is sucessfully created");

                        // Close the database connection using the DatabaseHandler
                        DatabaseHandler.closeConnection(connection);

                        // Create a FlightDetailsGUI object, make it visible, and close the current window
                        FlightDetailsGUI gui = new FlightDetailsGUI();
                        gui.setVisible(true);
                        dispose();   

                }catch (SQLIntegrityConstraintViolationException ex) {
                        // Handle the case where the username is already taken
                        JOptionPane.showMessageDialog(registerButton, "Account alredy exist");
                }catch (SQLException ex) {
                        // Handle SQL-related exceptions
                        Logger.getLogger(AirlineReservation.class.getName()).log(Level.SEVERE, null, ex);
                }  
            }
    }//GEN-LAST:event_registerButtonActionPerformed
    
    /**
    * Generates a unique customer ID consisting of an uppercase letter and a 4-digit random number.
    * The letter is selected randomly from the range 'A' to 'Z', and the number is a random 4-digit integer.
    *
    * @return A string representing the generated customer ID.
    */
    private String generateCustomerId() {
    // Generate an uppercase letter
    char randomLetter = (char) ('A' + (Math.random() * 26));
    // Generate a 4-digit random number
    int randomNumber = (int) (Math.random() * 9000) + 1000;
    // Combine the letter and number
    return String.format("%c%04d", randomLetter,randomNumber);
   }
    
    private void nameTextFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_nameTextFieldFocusGained
        nameTextField.setBorder(new LineBorder(new Color(47,163,246,253)));
        if(nameTextField.getText().equals("Enter your name")){
            nameTextField.setText(null);
            removePlaceholderStyle(nameTextField);
        }
        nameRequiredLabel.setVisible(false);
    }//GEN-LAST:event_nameTextFieldFocusGained

    private void nameTextFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_nameTextFieldFocusLost
        // Change the border color to indicate focus
        nameTextField.setBorder(new LineBorder(Color.BLACK));
        
        //Check if the field is empty 
         if(nameTextField.getText().length()==0){
             // If the 'nameTextField' is empty:
            addPlaceholderStyle(nameTextField);  // Apply placeholder styling
            nameTextField.setText("Enter your name"); // Set placeholder text
         }
    }//GEN-LAST:event_nameTextFieldFocusLost

    private void passwordFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_passwordFieldFocusGained
        passwordField.setBorder(new LineBorder(new Color(47,163,246,253)));
        
        // Check if the current text is the default placeholder text
        if(passwordField.getText().equals("Enter your password")){
            // If the text matches the placeholder:
            passwordField.setText(null); // Clear the placeholder text
            passwordField.requestFocus(); // Set focus to the 'passwordField'
            passwordField.setEchoChar('\u2022'); // Set echo character to display bullets for password masking
            removePlaceholderStyle(passwordField); // Adjust styling to indicate the absence of placeholder
        }
        passwordRequiredLabel.setVisible(false);
    }//GEN-LAST:event_passwordFieldFocusGained

    private void formWindowGainedFocus(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowGainedFocus
       // Requests focus for the current component's window to ensure proper user interaction.
       this.requestFocusInWindow();

    }//GEN-LAST:event_formWindowGainedFocus

    private void passwordFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_passwordFieldFocusLost
         passwordField.setBorder(new LineBorder(Color.BLACK));
        // Check if the 'passwordField' is empty
        if (passwordField.getText().length() == 0) {
            addPlaceholderStyle(passwordField);  // Apply placeholder styling
            passwordField.setText("Enter your password");  // Set placeholder text
            passwordField.setEchoChar('\u0000');  // Remove password masking
        }   
    }//GEN-LAST:event_passwordFieldFocusLost

    private void emailTextFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_emailTextFieldFocusGained
       emailTextField.setBorder(new LineBorder(new Color(47,163,246,253)));
       
       // Check if the current text is the placeholder, and if so, clear it
        if(emailTextField.getText().equals("Enter your email")){
            emailTextField.setText(null);
            removePlaceholderStyle(emailTextField);
        }
        emailRequiredLabel.setVisible(false);
    }//GEN-LAST:event_emailTextFieldFocusGained

    private void emailTextFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_emailTextFieldFocusLost
         emailTextField.setBorder(new LineBorder(Color.BLACK));
         
        // Check if the 'emailTextField' is empty
        if (emailTextField.getText().length() == 0) {
            addPlaceholderStyle(emailTextField);  // Apply placeholder styling
            emailTextField.setText("Enter your email");  // Set placeholder text
        }
    }//GEN-LAST:event_emailTextFieldFocusLost

    private void usernameFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_usernameFieldFocusGained
         usernameField.setBorder(new LineBorder(new Color(47,163,246,253)));
       
       // Check if the current text is the placeholder, and if so, clear it
        if( usernameField.getText().equals("Enter your username")){
             usernameField.setText(null);
            removePlaceholderStyle( usernameField);
        }
        usernameRequiredLabel.setVisible(false);
    }//GEN-LAST:event_usernameFieldFocusGained

    private void usernameFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_usernameFieldFocusLost
        usernameField.setBorder(new LineBorder(Color.BLACK));
         
        // Check if the 'usernameField' is empty
        if (usernameField.getText().length() == 0) {
            addPlaceholderStyle(usernameField);  // Apply placeholder styling
            usernameField.setText("Enter your username");  // Set placeholder text
        }
    }//GEN-LAST:event_usernameFieldFocusLost

    private void phoneNumberFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_phoneNumberFieldFocusGained
         phoneNumberField.setBorder(new LineBorder(new Color(47,163,246,253)));
        // Check if the current text is the placeholder, and if so, clear it
        if (phoneNumberField.getText().equals("Enter your number")) {
            phoneNumberField.setText(null);
            removePlaceholderStyle(phoneNumberField);
        }
        phoneNumberReqiuredLabel.setVisible(false);
    }//GEN-LAST:event_phoneNumberFieldFocusGained

    private void phoneNumberFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_phoneNumberFieldFocusLost
        phoneNumberField.setBorder(new LineBorder(Color.BLACK));
        // Check if the 'phoneNumberField' is empty
        if (phoneNumberField.getText().length() == 0) {
            addPlaceholderStyle(phoneNumberField);  // Apply placeholder styling
            phoneNumberField.setText("Enter your number");  // Set placeholder text
        }
    }//GEN-LAST:event_phoneNumberFieldFocusLost

    private void confirmPasswordFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_confirmPasswordFieldFocusGained
         confirmPasswordField.setBorder(new LineBorder(new Color(47,163,246,253)));
         // Check if the current text is the placeholder, and if so, clear it
        if (confirmPasswordField.getText().equals("Confirm your password")) {
            confirmPasswordField.setText(null);
            confirmPasswordField.requestFocus();
            confirmPasswordField.setEchoChar('\u2022');  // Set password masking
            removePlaceholderStyle(confirmPasswordField);
        }
        confirmPasswordRequiredLabel.setVisible(false);
    }//GEN-LAST:event_confirmPasswordFieldFocusGained

    private void confirmPasswordFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_confirmPasswordFieldFocusLost
        confirmPasswordField.setBorder(new LineBorder(Color.BLACK));
         
        confirmPasswordField.setBorder(new LineBorder(Color.BLACK));

        // Check if the 'confirmPasswordField' is empty
        if (confirmPasswordField.getText().length() == 0) {
            addPlaceholderStyle(confirmPasswordField);  // Apply placeholder styling
            confirmPasswordField.setText("Confirm your password");  // Set placeholder text
            confirmPasswordField.setEchoChar('\u0000');  // Remove password masking
        }
    }//GEN-LAST:event_confirmPasswordFieldFocusLost

    private void registerButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_registerButtonMouseEntered
       //Changes the background color to indicate a hover effect.
        registerButton.setBackground(new Color(47,163,246,253));
    }//GEN-LAST:event_registerButtonMouseEntered

    private void registerButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_registerButtonMouseExited
        //Resets the background color to its original state.
        registerButton.setBackground(new Color(0,152,204));
    }//GEN-LAST:event_registerButtonMouseExited

    private void loginButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginButtonMouseEntered
        // Changes the text color to indicate a hover effect.
        loginButton.setForeground(new Color(128, 0, 128));
    }//GEN-LAST:event_loginButtonMouseEntered

    private void loginButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginButtonMouseExited
        // Resets the text color to its original state.
        loginButton.setForeground(new Color(0,152,204));
    }//GEN-LAST:event_loginButtonMouseExited

    private void loginButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginButtonActionPerformed
      // Creates a new instance of LoginGUI, makes it visible, and disposes of the current window.
      LoginGUI gui = new LoginGUI();
      gui.setVisible(true);
      dispose();
    }//GEN-LAST:event_loginButtonActionPerformed

    private void passwordFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passwordFieldActionPerformed

    private void confirmPasswordFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmPasswordFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_confirmPasswordFieldActionPerformed

    private void emailTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emailTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_emailTextFieldActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel RegisterImagePanel;
    private javax.swing.JPanel RegistrationPanel;
    private javax.swing.JPasswordField confirmPasswordField;
    private javax.swing.JLabel confirmPasswordLabel;
    private javax.swing.JLabel confirmPasswordRequiredLabel;
    private javax.swing.JLabel emailLabel;
    private javax.swing.JLabel emailRequiredLabel;
    private javax.swing.JTextField emailTextField;
    private javax.swing.JButton loginButton;
    private javax.swing.JLabel logo;
    private javax.swing.JLabel nameLabel;
    private javax.swing.JLabel nameRequiredLabel;
    private javax.swing.JTextField nameTextField;
    private javax.swing.JPasswordField passwordField;
    private javax.swing.JLabel passwordLabel;
    private javax.swing.JLabel passwordRequiredLabel;
    private javax.swing.JFormattedTextField phoneNumberField;
    private javax.swing.JLabel phoneNumberLabel;
    private javax.swing.JLabel phoneNumberReqiuredLabel;
    private javax.swing.JButton registerButton;
    private javax.swing.JLabel registerImage;
    private javax.swing.JLabel registrationLabel;
    private javax.swing.JTextField usernameField;
    private javax.swing.JLabel usernameLabel;
    private javax.swing.JLabel usernameRequiredLabel;
    // End of variables declaration//GEN-END:variables
}
