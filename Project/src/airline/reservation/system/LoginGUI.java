package airline.reservation.system;
//Import Statements
import java.awt.Color;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.border.LineBorder;


public final class LoginGUI extends javax.swing.JFrame {
     // Variable to store the user name entered by the user.
    public String userName;

    public LoginGUI() {
        // Initialize the components of the GUI.
        initComponents();
        // Center the GUI on the screen.
        setLocationRelativeTo(null);  
        // Hide the specific components from the GUI
        hideComponents();
        
    }
    
    public void hideComponents(){
        usernameRequiredLabel.setVisible(false);
        passwordRequiredLabel.setVisible(false);  
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        loginPanel = new javax.swing.JPanel();
        loginLabel = new javax.swing.JLabel();
        usernameLabel = new javax.swing.JLabel();
        usernameTextField = new javax.swing.JTextField();
        passwordLabel = new javax.swing.JLabel();
        passwordField = new javax.swing.JPasswordField();
        loginButton = new javax.swing.JButton();
        createAccountLabel = new javax.swing.JLabel();
        registerButton = new javax.swing.JButton();
        logo = new javax.swing.JLabel();
        usernameRequiredLabel = new javax.swing.JLabel();
        passwordRequiredLabel = new javax.swing.JLabel();
        loginImagePanel = new javax.swing.JPanel();
        loginImage = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Login ");
        setName("LoginFrame"); // NOI18N
        setResizable(false);
        addWindowFocusListener(new java.awt.event.WindowFocusListener() {
            public void windowGainedFocus(java.awt.event.WindowEvent evt) {
                formWindowGainedFocus(evt);
            }
            public void windowLostFocus(java.awt.event.WindowEvent evt) {
            }
        });

        loginPanel.setBackground(new java.awt.Color(228, 240, 255));
        loginPanel.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 153, 255), 2, true));

        loginLabel.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        loginLabel.setForeground(new java.awt.Color(7, 109, 157));
        loginLabel.setText("Login");

        usernameLabel.setText("Username");

        usernameTextField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                usernameTextFieldFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                usernameTextFieldFocusLost(evt);
            }
        });

        passwordLabel.setText("Password");

        passwordField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                passwordFieldFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                passwordFieldFocusLost(evt);
            }
        });

        loginButton.setBackground(new java.awt.Color(7, 120, 173));
        loginButton.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        loginButton.setForeground(new java.awt.Color(255, 255, 255));
        loginButton.setText("Login");
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

        createAccountLabel.setFont(new java.awt.Font("Segoe UI Light", 1, 12)); // NOI18N
        createAccountLabel.setText("Don't have an account ?");

        registerButton.setBackground(new java.awt.Color(228, 240, 255));
        registerButton.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        registerButton.setForeground(new java.awt.Color(0, 153, 153));
        registerButton.setText("Register here");
        registerButton.setBorder(null);
        registerButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
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

        logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8-plane-48 (1).png"))); // NOI18N

        usernameRequiredLabel.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        usernameRequiredLabel.setForeground(new java.awt.Color(153, 0, 0));
        usernameRequiredLabel.setText("* Username is required ");

        passwordRequiredLabel.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        passwordRequiredLabel.setForeground(new java.awt.Color(153, 0, 51));
        passwordRequiredLabel.setText("* Password is required");

        javax.swing.GroupLayout loginPanelLayout = new javax.swing.GroupLayout(loginPanel);
        loginPanel.setLayout(loginPanelLayout);
        loginPanelLayout.setHorizontalGroup(
            loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, loginPanelLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(logo)
                .addGap(157, 157, 157))
            .addGroup(loginPanelLayout.createSequentialGroup()
                .addGap(131, 131, 131)
                .addComponent(loginLabel)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, loginPanelLayout.createSequentialGroup()
                .addContainerGap(50, Short.MAX_VALUE)
                .addGroup(loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(passwordRequiredLabel)
                    .addComponent(usernameLabel)
                    .addComponent(usernameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(passwordLabel)
                    .addComponent(passwordField, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(usernameRequiredLabel))
                .addGap(50, 50, 50))
            .addGroup(loginPanelLayout.createSequentialGroup()
                .addGroup(loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(loginPanelLayout.createSequentialGroup()
                        .addGap(118, 118, 118)
                        .addComponent(createAccountLabel))
                    .addGroup(loginPanelLayout.createSequentialGroup()
                        .addGap(143, 143, 143)
                        .addComponent(loginButton))
                    .addGroup(loginPanelLayout.createSequentialGroup()
                        .addGap(134, 134, 134)
                        .addComponent(registerButton, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        loginPanelLayout.setVerticalGroup(
            loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(loginPanelLayout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(logo)
                .addGap(18, 18, 18)
                .addComponent(loginLabel)
                .addGap(26, 26, 26)
                .addComponent(usernameLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(usernameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(usernameRequiredLabel)
                .addGap(25, 25, 25)
                .addComponent(passwordLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(passwordField, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(passwordRequiredLabel)
                .addGap(40, 40, 40)
                .addComponent(loginButton, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(createAccountLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(registerButton, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        loginImagePanel.setBackground(new java.awt.Color(255, 255, 255));
        loginImagePanel.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 153, 255), 2, true));

        loginImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/d4ec0c90971b03bbf0a750139d5cacc2_1.jpg"))); // NOI18N

        javax.swing.GroupLayout loginImagePanelLayout = new javax.swing.GroupLayout(loginImagePanel);
        loginImagePanel.setLayout(loginImagePanelLayout);
        loginImagePanelLayout.setHorizontalGroup(
            loginImagePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(loginImage, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        loginImagePanelLayout.setVerticalGroup(
            loginImagePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(loginImagePanelLayout.createSequentialGroup()
                .addComponent(loginImage, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(loginImagePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(loginPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(loginImagePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addComponent(loginPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void loginButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginButtonActionPerformed
        // Get the entered username and password from the text fields
        userName = usernameTextField.getText();
        String password = passwordField.getText();
        
        //save the username in a temporary file for reuse it later.
        setCredential();
        
        // Check if either or both fields are empty
        if(userName.isEmpty() && password.isEmpty()){
            // Show an error message if both fields are empty
            usernameRequiredLabel.setVisible(true);
            passwordRequiredLabel.setVisible(true); 
            usernameTextField.setBorder(new LineBorder( new Color(153,0,0)));
            passwordField.setBorder(new LineBorder( new Color(153,0,0)));
        }
        else{
            //Check if the username field is empty
            if(userName.isEmpty()){
               usernameRequiredLabel.setVisible(true);
               usernameTextField.setBorder(new LineBorder( new Color(153,0,0)));
               
            }
            //Check if the password field is empty
            else if(password.isEmpty()){
                passwordRequiredLabel.setVisible(true); 
                passwordField.setBorder(new LineBorder( new Color(153,0,0)));
            }
            else{
                 try {
                    // Establish a database connection
                    Connection connection = DatabaseHandler.getConnection();                    
                    // Prepare and execute a SQL query to check username and password
                    PreparedStatement statement = (PreparedStatement) connection.prepareStatement("Select UserName,Password from customer where UserName=? and Password=?");
                    
                    // Set the first parameter in the prepared statement to the entered username
                    statement.setString(1, userName);
                    // Set the second parameter in the prepared statement to the entered password
                    statement.setString(2, password);

                    // Execute the query and retrieve the result set from the database
                    ResultSet result_set = statement.executeQuery();
                    
                    // Check if the query returned a result
                    if(result_set.next()){
                         // If the credentials are valid, open the FlightDetailsGUI and close the current window
                         FlightDetailsGUI gui = new FlightDetailsGUI();
                         gui.setVisible(true);
                         dispose(); 
                    }else{
                        // Show an error message for invalid credentials
                        JOptionPane.showMessageDialog(loginButton,"Invalid Username or Password");
                    }  

                    // Close the database connection using the DatabaseHandler
                    DatabaseHandler.closeConnection(connection);                    
                }
                catch (SQLException ex) {
                    // Log any SQLException that may occur
                    Logger.getLogger(AirlineReservation.class.getName()).log(Level.SEVERE, null, ex);
                } 
            }
        }
    }//GEN-LAST:event_loginButtonActionPerformed
   
    // Method to set user credentials by writing the username to a file
    private void setCredential() {
        // Name of the file where credentials will be stored
        String fileName = "credentials.txt";

        try (PrintWriter writer = new PrintWriter(new FileWriter(fileName))) {
            // Append the username to the file
            writer.println(userName);

        } catch (IOException ex) {
            // Handle any IOException that may occur during file writing
            System.out.println(ex.getMessage());
        }    
    }
    
    // Method to retrieve user credentials from a file
    public String getCredentials() {
        // Name of the file where credentials are stored
        String fileName = "credentials.txt";

        // Variable to store the retrieved username
        String username = null;

        try (Scanner scanner = new Scanner(new File(fileName))) {
            // Check if there is a next line in the file
            if (scanner.hasNextLine()) {
                // If a line exists, retrieve it and assign it to the 'username' variable
                username = scanner.nextLine();
            }
        } catch (FileNotFoundException e) {
            // Handle a FileNotFoundException by printing the error message
            System.out.println(e.getMessage());
        }

        // Return the retrieved username (or null if not found)
        return username;
    }

    
    private void usernameTextFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_usernameTextFieldFocusGained
        //Set a custom border color when the username text field gains focus
        usernameTextField.setBorder(new LineBorder(new Color(47,163,246,253)));
        usernameRequiredLabel.setVisible(false);
        
    }//GEN-LAST:event_usernameTextFieldFocusGained

    private void usernameTextFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_usernameTextFieldFocusLost
        //Reset the border color when the username text field loses focus
        usernameTextField.setBorder(new LineBorder(Color.BLACK));
    }//GEN-LAST:event_usernameTextFieldFocusLost

    private void passwordFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_passwordFieldFocusGained
        //Set a custom border color when the password field gains focus
        passwordField.setBorder(new LineBorder(new Color(47,163,246,253)));
        passwordRequiredLabel.setVisible(false);  
    }//GEN-LAST:event_passwordFieldFocusGained

    private void passwordFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_passwordFieldFocusLost
        //Reset the border color when the password field loses focus
        passwordField.setBorder(new LineBorder(Color.BLACK));
    }//GEN-LAST:event_passwordFieldFocusLost

    private void loginButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginButtonMouseEntered
       //Set a custom background color when the login button is hovered over
        loginButton.setBackground(new Color(47,163,246,253));
    }//GEN-LAST:event_loginButtonMouseEntered

    private void loginButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginButtonMouseExited
        //Reset the background color when the login button is no longer hovered over
        loginButton.setBackground(new Color(0,152,204));
    }//GEN-LAST:event_loginButtonMouseExited

    private void formWindowGainedFocus(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowGainedFocus
        // Ensure the window gains focus when it is focused
        this.requestFocusInWindow();
    }//GEN-LAST:event_formWindowGainedFocus

    private void registerButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registerButtonActionPerformed
         // Create a new instance of RegisterGUI to open the registration window
        RegisterGUI gui = new RegisterGUI();
        // Set the registration window to be visible
        gui.setVisible(true);
        // Close the current window (login window)
        dispose();
    }//GEN-LAST:event_registerButtonActionPerformed

    private void registerButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_registerButtonMouseEntered
        //Set a custom text color when the register button is hovered over
        registerButton.setForeground(new Color(128, 0, 128));
    }//GEN-LAST:event_registerButtonMouseEntered

    private void registerButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_registerButtonMouseExited
       //Reset the text color when the register button is no longer hovered over
        registerButton.setForeground(new Color(0,152,204));
    }//GEN-LAST:event_registerButtonMouseExited


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel createAccountLabel;
    private javax.swing.JButton loginButton;
    private javax.swing.JLabel loginImage;
    private javax.swing.JPanel loginImagePanel;
    private javax.swing.JLabel loginLabel;
    private javax.swing.JPanel loginPanel;
    private javax.swing.JLabel logo;
    private javax.swing.JPasswordField passwordField;
    private javax.swing.JLabel passwordLabel;
    private javax.swing.JLabel passwordRequiredLabel;
    private javax.swing.JButton registerButton;
    private javax.swing.JLabel usernameLabel;
    private javax.swing.JLabel usernameRequiredLabel;
    private javax.swing.JTextField usernameTextField;
    // End of variables declaration//GEN-END:variables
}
