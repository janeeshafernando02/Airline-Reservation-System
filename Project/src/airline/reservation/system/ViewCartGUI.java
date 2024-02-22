package airline.reservation.system;

//Import Statements
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.SpinnerNumberModel;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

public class ViewCartGUI extends javax.swing.JFrame {
        public FlightDetailsGUI gui;
        public LoginGUI gui2;
          
        public ViewCartGUI() {
            initComponents();
            setInitialUI();
            setLocationRelativeTo(null);
            gui = new FlightDetailsGUI();
            gui.loadFromFile();
            getDataFromFlightList();
            setupReservedFlightDetailsTable();
            setupTicketsSpinner();
         }
        
        /**
         * Sets initial UI settings, such as hiding the pricePanel.
         */
        private void setInitialUI() {
            pricePanel.setVisible(false);
        }

        /**
         * Populates the reserved flight details table with data and sets up its styling.
         */
        private void setupReservedFlightDetailsTable() {
            reservedflightDetailsTable.getTableHeader().setBackground(new Color(93, 53, 135));
            reservedflightDetailsTable.getTableHeader().setForeground(Color.WHITE);
            reservedflightDetailsTable.getTableHeader().setFont(new Font("Segoe", Font.BOLD, 12));

            // Create a custom cell renderer to center the data in the table
            DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
            centerRenderer.setHorizontalAlignment(SwingConstants.CENTER);

            // Apply the custom renderer to all columns in the reserved flight details table
            for (int i = 0; i < reservedflightDetailsTable.getColumnCount(); i++) {
                reservedflightDetailsTable.getColumnModel().getColumn(i).setCellRenderer(centerRenderer);
            }
        }

        /**
         * Sets up the tickets spinner with a defined range and disables editing.
         */
        private void setupTicketsSpinner() {
            int minTickets = 0;
            int maxTickets = 200; 
            int initialTickets = 1;

            // Create a SpinnerNumberModel with the defined range
            SpinnerNumberModel ticketsSpinnerModel = new SpinnerNumberModel(initialTickets, minTickets, maxTickets, 1);

            // Set the SpinnerNumberModel for noOfTicketsSpinner
            noOfTicketsSpinner.setModel(ticketsSpinnerModel);

        }

        /**
        * Retrieves data from the FlightDetailsGUI and populates the reserved flight details table.
        */
        private void getDataFromFlightList() {
           // Get the table model from the reserved flight details table
           DefaultTableModel model = (DefaultTableModel) reservedflightDetailsTable.getModel();

           // Create an array to hold data for each column in a row
           Object[] rowData = new Object[6];

           // Iterate through each Flight object in the FlightDetailsGUI's flights list
           for (Flight flight : gui.flights) {
               // Set the data for each column in the current row
               rowData[0] = flight.getFlight_id();
               rowData[1] = flight.getSource();
               rowData[2] = flight.getDestination();
               rowData[3] = flight.getDate();
               rowData[4] = flight.getDeparture_time();
               rowData[5] = flight.getNo_of_seats();

               // Add the current row data to the table model
               model.addRow(rowData);
           }
       }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ReserveTicketPanel = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        reservedflightDetailsTable = new javax.swing.JTable();
        reservationLabel = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        goBackButton = new javax.swing.JButton();
        flightNoLabel = new javax.swing.JLabel();
        flightNoTextField = new javax.swing.JTextField();
        sourceLabel = new javax.swing.JLabel();
        sourceTextField = new javax.swing.JTextField();
        destinationLabel = new javax.swing.JLabel();
        destinationTextField = new javax.swing.JTextField();
        selectClassLabel = new javax.swing.JLabel();
        classesComboBox = new javax.swing.JComboBox<>();
        flightDateLabel = new javax.swing.JLabel();
        noOfTicketsLabel = new javax.swing.JLabel();
        noOfTicketsSpinner = new javax.swing.JSpinner();
        pricePanel = new javax.swing.JPanel();
        ticketPriceLabel = new javax.swing.JLabel();
        ticketPriceValueLabel = new javax.swing.JLabel();
        totalPriceLabel = new javax.swing.JLabel();
        totalPriceValueLabel = new javax.swing.JLabel();
        paymentButton = new javax.swing.JButton();
        cancelTicketButton = new javax.swing.JButton();
        logo = new javax.swing.JLabel();
        exitButton = new javax.swing.JButton();
        dateTextField = new javax.swing.JTextField();
        checkPriceButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Reserve Tickets");
        setName("CartFrame"); // NOI18N
        setResizable(false);

        ReserveTicketPanel.setBackground(new java.awt.Color(249, 249, 255));

        reservedflightDetailsTable.setAutoCreateRowSorter(true);
        reservedflightDetailsTable.setBackground(new java.awt.Color(247, 247, 255));
        reservedflightDetailsTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Flight ID", "Source", "Destination ", "Date", "Departure Time", "Available Seats"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        reservedflightDetailsTable.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        reservedflightDetailsTable.setSelectionBackground(new java.awt.Color(204, 204, 255));
        reservedflightDetailsTable.setShowGrid(true);
        reservedflightDetailsTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                reservedflightDetailsTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(reservedflightDetailsTable);
        if (reservedflightDetailsTable.getColumnModel().getColumnCount() > 0) {
            reservedflightDetailsTable.getColumnModel().getColumn(0).setResizable(false);
            reservedflightDetailsTable.getColumnModel().getColumn(1).setResizable(false);
            reservedflightDetailsTable.getColumnModel().getColumn(2).setResizable(false);
            reservedflightDetailsTable.getColumnModel().getColumn(3).setResizable(false);
            reservedflightDetailsTable.getColumnModel().getColumn(4).setResizable(false);
            reservedflightDetailsTable.getColumnModel().getColumn(5).setResizable(false);
        }

        reservationLabel.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        reservationLabel.setForeground(new java.awt.Color(112, 48, 160));
        reservationLabel.setText("Reservations");

        jSeparator1.setBackground(new java.awt.Color(51, 0, 102));
        jSeparator1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(51, 0, 102))); // NOI18N

        goBackButton.setBackground(new java.awt.Color(112, 48, 160));
        goBackButton.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        goBackButton.setForeground(new java.awt.Color(255, 255, 255));
        goBackButton.setText("Go Back");
        goBackButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                goBackButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                goBackButtonMouseExited(evt);
            }
        });
        goBackButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                goBackButtonActionPerformed(evt);
            }
        });

        flightNoLabel.setText("Flight No  ");

        flightNoTextField.setEditable(false);

        sourceLabel.setText("Source ");

        sourceTextField.setEditable(false);

        destinationLabel.setText("Destination");

        destinationTextField.setEditable(false);

        selectClassLabel.setText("Select Class");

        classesComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "None", "Economy", "Premium Economy", "Business Class", "First Class" }));

        flightDateLabel.setText("Flight Date");

        noOfTicketsLabel.setText("No. of Tickets");

        noOfTicketsSpinner.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        pricePanel.setBackground(new java.awt.Color(234, 234, 255));
        pricePanel.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        ticketPriceLabel.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        ticketPriceLabel.setText("Ticket Price :");

        totalPriceLabel.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        totalPriceLabel.setText("Total Price :");

        totalPriceValueLabel.setForeground(new java.awt.Color(204, 0, 153));

        paymentButton.setBackground(new java.awt.Color(112, 48, 160));
        paymentButton.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        paymentButton.setForeground(new java.awt.Color(255, 255, 255));
        paymentButton.setText("Pay Now");
        paymentButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                paymentButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                paymentButtonMouseExited(evt);
            }
        });

        javax.swing.GroupLayout pricePanelLayout = new javax.swing.GroupLayout(pricePanel);
        pricePanel.setLayout(pricePanelLayout);
        pricePanelLayout.setHorizontalGroup(
            pricePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pricePanelLayout.createSequentialGroup()
                .addGroup(pricePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pricePanelLayout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(pricePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(totalPriceLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ticketPriceLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pricePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pricePanelLayout.createSequentialGroup()
                                .addComponent(ticketPriceValueLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 8, Short.MAX_VALUE))
                            .addComponent(totalPriceValueLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(pricePanelLayout.createSequentialGroup()
                        .addGap(74, 74, 74)
                        .addComponent(paymentButton, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(74, Short.MAX_VALUE))
        );
        pricePanelLayout.setVerticalGroup(
            pricePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pricePanelLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(pricePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(ticketPriceValueLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ticketPriceLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(41, 41, 41)
                .addGroup(pricePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(totalPriceLabel)
                    .addComponent(totalPriceValueLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(49, 49, 49)
                .addComponent(paymentButton, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(40, Short.MAX_VALUE))
        );

        cancelTicketButton.setBackground(new java.awt.Color(204, 0, 153));
        cancelTicketButton.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        cancelTicketButton.setForeground(new java.awt.Color(255, 255, 255));
        cancelTicketButton.setText("Cancel Ticket");
        cancelTicketButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cancelTicketButtonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                cancelTicketButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                cancelTicketButtonMouseExited(evt);
            }
        });

        logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8-plane-96.png"))); // NOI18N

        exitButton.setBackground(new java.awt.Color(112, 48, 160));
        exitButton.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        exitButton.setForeground(new java.awt.Color(255, 255, 255));
        exitButton.setText("Exit");
        exitButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                exitButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                exitButtonMouseExited(evt);
            }
        });
        exitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitButtonActionPerformed(evt);
            }
        });

        dateTextField.setEditable(false);

        checkPriceButton.setBackground(new java.awt.Color(112, 48, 160));
        checkPriceButton.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        checkPriceButton.setForeground(new java.awt.Color(255, 255, 255));
        checkPriceButton.setText("Check Price");
        checkPriceButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                checkPriceButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                checkPriceButtonMouseExited(evt);
            }
        });
        checkPriceButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkPriceButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout ReserveTicketPanelLayout = new javax.swing.GroupLayout(ReserveTicketPanel);
        ReserveTicketPanel.setLayout(ReserveTicketPanelLayout);
        ReserveTicketPanelLayout.setHorizontalGroup(
            ReserveTicketPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1)
            .addGroup(ReserveTicketPanelLayout.createSequentialGroup()
                .addGroup(ReserveTicketPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ReserveTicketPanelLayout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(ReserveTicketPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(flightNoLabel)
                            .addComponent(sourceLabel)
                            .addComponent(destinationLabel))
                        .addGap(18, 18, 18)
                        .addGroup(ReserveTicketPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(flightNoTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 143, Short.MAX_VALUE)
                            .addComponent(sourceTextField)
                            .addComponent(destinationTextField))
                        .addGap(49, 49, 49)
                        .addGroup(ReserveTicketPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(flightDateLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(selectClassLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(noOfTicketsLabel))
                        .addGap(25, 25, 25)
                        .addGroup(ReserveTicketPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(classesComboBox, 0, 143, Short.MAX_VALUE)
                            .addComponent(noOfTicketsSpinner)
                            .addComponent(dateTextField)))
                    .addGroup(ReserveTicketPanelLayout.createSequentialGroup()
                        .addGap(213, 213, 213)
                        .addComponent(checkPriceButton)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(pricePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(56, 56, 56))
            .addGroup(ReserveTicketPanelLayout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addGroup(ReserveTicketPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ReserveTicketPanelLayout.createSequentialGroup()
                        .addGroup(ReserveTicketPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 775, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cancelTicketButton))
                        .addContainerGap(54, Short.MAX_VALUE))
                    .addGroup(ReserveTicketPanelLayout.createSequentialGroup()
                        .addComponent(reservationLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(logo, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(goBackButton, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(exitButton, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26))))
        );
        ReserveTicketPanelLayout.setVerticalGroup(
            ReserveTicketPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ReserveTicketPanelLayout.createSequentialGroup()
                .addGroup(ReserveTicketPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ReserveTicketPanelLayout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addGroup(ReserveTicketPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(goBackButton, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(exitButton, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(ReserveTicketPanelLayout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(reservationLabel))
                    .addGroup(ReserveTicketPanelLayout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(logo, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(10, 10, 10)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(cancelTicketButton)
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(ReserveTicketPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ReserveTicketPanelLayout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addGroup(ReserveTicketPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(flightNoLabel)
                            .addComponent(flightNoTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(flightDateLabel)
                            .addComponent(dateTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(48, 48, 48)
                        .addGroup(ReserveTicketPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(sourceLabel)
                            .addComponent(sourceTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(classesComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(selectClassLabel))
                        .addGap(48, 48, 48)
                        .addGroup(ReserveTicketPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(destinationLabel)
                            .addComponent(destinationTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(noOfTicketsLabel)
                            .addComponent(noOfTicketsSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                        .addComponent(checkPriceButton)
                        .addGap(30, 30, 30))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ReserveTicketPanelLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(pricePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(21, 21, 21))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ReserveTicketPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ReserveTicketPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void goBackButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_goBackButtonActionPerformed
        // Saves the current data to a file before closing the ViewCartGUI.
        saveToFile();

        // Creates a new instance of FlightDetailsGUI, makes it visible, and disposes of the current ViewCartGUI.
        FlightDetailsGUI gui = new FlightDetailsGUI();
        gui.setVisible(true);
        dispose();

    }//GEN-LAST:event_goBackButtonActionPerformed

    private void goBackButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_goBackButtonMouseEntered
        // Change the background color when the mouse enters the goBackButton
        goBackButton.setBackground(new Color(137,59,195));
    }//GEN-LAST:event_goBackButtonMouseEntered

    private void goBackButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_goBackButtonMouseExited
        // Change the background color when the mouse exits the goBackButton
        goBackButton.setBackground(new Color(112,48,160));
    }//GEN-LAST:event_goBackButtonMouseExited

    private void paymentButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_paymentButtonMouseEntered
        // Change the background color when the mouse enters the paymentButton
        paymentButton.setBackground(new Color(137,59,195));
    }//GEN-LAST:event_paymentButtonMouseEntered

    private void paymentButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_paymentButtonMouseExited
        // Change the background color when the mouse exits the paymentButton
        paymentButton.setBackground(new Color(112,48,160));
    }//GEN-LAST:event_paymentButtonMouseExited

    private void cancelTicketButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cancelTicketButtonMouseEntered
        // Change the background color when the mouse enters the cancelTicketButton
        cancelTicketButton.setBackground(new Color(153,0,153));
    }//GEN-LAST:event_cancelTicketButtonMouseEntered

    private void cancelTicketButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cancelTicketButtonMouseExited
        // Change the background color when the mouse exits the cancelTicketButton
        cancelTicketButton.setBackground(new Color(204,0,153));
    }//GEN-LAST:event_cancelTicketButtonMouseExited

    // Perform exit confirmation and delete files before exiting the application
    private void exitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitButtonActionPerformed
         // Display an exit confirmation dialog
        int result = JOptionPane.showConfirmDialog(this, "Are you sure you want to exit?", "Exit Confirmation", JOptionPane.YES_NO_OPTION);
    
        if (result == JOptionPane.YES_OPTION) {
        // Delete user_session.txt
        String userSessionFileName = "user_session.txt";
        File userSessionFile = new File(userSessionFileName);

         // Check if user_session.txt exists
        if (!userSessionFile.exists()) {
             System.out.println("user_session.txt does not exist.");
        } else {
            userSessionFile.delete();
        }

        // Delete credentials.txt
        String credentialsFileName = "credentials.txt";
        File credentialsFile = new File(credentialsFileName);

        // Check if credentials.txt exists
        if (!credentialsFile.exists()) {
            System.out.println("credentials.txt does not exist.");
           
        } else {
            // Delete credentials.txt
            credentialsFile.delete();
        }
        // Exit the application
        System.exit(0);
        }
    }//GEN-LAST:event_exitButtonActionPerformed

    private void exitButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitButtonMouseEntered
        exitButton.setBackground(new Color(137,59,195));
    }//GEN-LAST:event_exitButtonMouseEntered

    private void exitButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitButtonMouseExited
         exitButton.setBackground(new Color(112,48,160));
    }//GEN-LAST:event_exitButtonMouseExited

    private void cancelTicketButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cancelTicketButtonMouseClicked
        int column = reservedflightDetailsTable.getColumnModel().getColumnIndexAtX(evt.getX());
        int row = evt.getY() / reservedflightDetailsTable.getRowHeight();

        if (row < reservedflightDetailsTable.getRowCount() && row >= 0
                && column < reservedflightDetailsTable.getColumnCount() && column >= 0) {
            // Get the selected row indices
            int[] selectedRows = reservedflightDetailsTable.getSelectedRows();

            // Check if there are selected rows
            if (selectedRows.length > 0) {
                DefaultTableModel tableModel = (DefaultTableModel) reservedflightDetailsTable.getModel();

                // Remove selected rows in reverse order to avoid index issues
                for (int i = selectedRows.length - 1; i >= 0; i--) {
                    // Remove from the collection
                    gui.flights.remove(selectedRows[i]);
                    // Remove from the table
                    tableModel.removeRow(selectedRows[i]);
                }

                pricePanel.setVisible(false);
                
                flightNoTextField.setText(" ");
                sourceTextField.setText(" ");
                destinationTextField.setText(" ");
                dateTextField.setText(" ");
                
                // Set the selected index of the classesComboBox to none
                classesComboBox.setSelectedIndex(0);
                
                // Save the updated data to the file
                saveToFile();
            }
        }
    }//GEN-LAST:event_cancelTicketButtonMouseClicked

   
    //Saves flight details from the FlightDetailsGUI's flights list to a file named "user_session.txt".
    
    private void saveToFile() {
        try {
           //Uses a FileWriter to write each flight's information as a line in the file. 
           FileWriter writer = new FileWriter("user_session.txt");

            // Iterate through the Flight objects in the FlightDetailsGUI's flights list
            for (Flight flight : gui.flights) {
                // Format the flight details as a line in the file
                String line = String.format("%s, %s, %s, %s, %s, %d%n",
                        flight.getFlight_id(), flight.getSource(), flight.getDestination(),
                        flight.getDate(), flight.getDeparture_time(), flight.getNo_of_seats());
                // Write the line to the file
                writer.write(line);
            }

            // Close the FileWriter
            writer.close();
        } catch (IOException e) {
            // Handle IOException by printing an error message
            System.out.println("An error occurred while saving flights to the file.");
            System.out.println(e.getMessage());
        }
    }

    private void reservedflightDetailsTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_reservedflightDetailsTableMouseClicked
        // Get the selected row index from the reservedflightDetailsTable
        int i = reservedflightDetailsTable.getSelectedRow();

        // Get the TableModel from the reservedflightDetailsTable
        TableModel model = reservedflightDetailsTable.getModel();

        // Set values in corresponding JTextFields based on the selected row
        flightNoTextField.setText(model.getValueAt(i, 0).toString());
        sourceTextField.setText(model.getValueAt(i, 1).toString());
        destinationTextField.setText(model.getValueAt(i, 2).toString());
        dateTextField.setText(model.getValueAt(i, 3).toString());

        // Set the selected index of the classesComboBox to none
        classesComboBox.setSelectedIndex(0);

        // Set the JSpinner to the default value
        noOfTicketsSpinner.setValue(1);

        // Hide the pricePanel
        pricePanel.setVisible(false);

    }//GEN-LAST:event_reservedflightDetailsTableMouseClicked

    // Prefix for generating purchase history IDs
    private static final String PREFIX = "PH";

    /**
     * Generates a unique purchase history ID by appending a random number to the prefix.
     * @return A string representing the generated purchase history ID.
     */
    private String generatePurchaseHistoryID() {
        // Generating a random number
        Random random = new Random();
        int randomNumber = random.nextInt(1000); // You can adjust the range as needed

        // Creating the purchase history ID by combining the prefix and random number
        String purchaseHistoryID = PREFIX + randomNumber;

        return purchaseHistoryID;
    }


    /**
    * Handles the action when the "Check Price" button is clicked.
    * Retrieves flight details, validates user selection, calculates and displays the price,
    * shows the price panel, and sets up the payment button action.
    * @param evt The ActionEvent triggered by the button click.
    */
    private void checkPriceButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkPriceButtonActionPerformed
         // Get flight details from the UI components
        String flight_no = flightNoTextField.getText();
        String selectedClass = (String) classesComboBox.getSelectedItem();
        
        // Remove spaces from the selected class
        selectedClass = selectedClass.replace(" ", "");
        // Get the selected number of tickets
        int selectedNoOfTickets = (int) noOfTicketsSpinner.getValue();

        // Validate the user's selection
        if (validateSelection(selectedClass, selectedNoOfTickets)) {
            // Calculate and display the price
            calculateAndDisplayPrice(flight_no, selectedClass, selectedNoOfTickets);
            // Show the price panel
            pricePanel.setVisible(true);
            // Set up the action for the payment button
            setPaymentButtonAction();
        }    
    }//GEN-LAST:event_checkPriceButtonActionPerformed

    /**
    * Validates the user's selection of class and number of tickets.
    * Displays error messages if the selection is invalid.
    * @param selectedClass The selected class.
    * @param selectedNoOfTickets The selected number of tickets.
    * @return True if the selection is valid, false otherwise.
    */
    private boolean validateSelection(String selectedClass, int selectedNoOfTickets) {
        // Validate that a class is selected
        if (selectedClass.equals("None")) {
            // Display an error message for class not selected
            JOptionPane.showMessageDialog(this, "Please select the preferred class", "Error", JOptionPane.ERROR_MESSAGE);
            return false;
        }
       
        // Validate that a valid number of tickets is selected
        if (selectedNoOfTickets <= 0) {
            // Display an error message for an invalid number of tickets
            JOptionPane.showMessageDialog(this, "Please select no of tickets", "Error", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        
        if(selectedNoOfTickets > 100){
            JOptionPane.showMessageDialog(this, "No of ticket limit has been exceeded", "Error", JOptionPane.ERROR_MESSAGE);
            return false;
        }

        // The selection is valid
        return true;
    }

    /**
    * Calculates the total price based on the selected flight, class, and number of tickets,
    * and displays the price in the UI components.
    * @param flight_no The selected flight number.
    * @param selectedClass The selected class.
    * @param selectedNoOfTickets The selected number of tickets.
    */
    private void calculateAndDisplayPrice(String flight_no, String selectedClass, int selectedNoOfTickets) {
        try {
            // Get a connection from the DatabaseHandler
            Connection connection = DatabaseHandler.getConnection();
            
             // Prepare a statement to retrieve the price for the selected class and flight
            PreparedStatement prepare_statement = connection.prepareStatement("SELECT " + selectedClass + " FROM ticketprices WHERE FlightID=?");
            prepare_statement.setString(1, flight_no);
           
            // Execute the query and get the result set
            ResultSet result_set = prepare_statement.executeQuery();

             // Check if the ResultSet has any rows
            if (result_set.next()) {
                 // Get the price from the ResultSet
                int price = result_set.getInt(selectedClass);
                // Display the price in the label
                ticketPriceValueLabel.setText("$" + price);

                // Calculate the total price
                int totalPrice = price * selectedNoOfTickets;
                
                // Display the total price in the "Total Price" label
                totalPriceValueLabel.setText("$" + totalPrice);
            }

            // Close the database connection using the DatabaseHandler
            DatabaseHandler.closeConnection(connection);
        } catch (SQLException ex) {
            Logger.getLogger(AirlineReservation.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    
    /**
    * Sets up the action for the payment button.
    * Adds an ActionListener to the payment button to handle the payment process.
    */
    private void setPaymentButtonAction() {
        paymentButton.addActionListener((ActionEvent e) -> {
            // Handle the payment process
            handlePayment();
        });
    }

    /**
    * Handles the payment process when the payment button is clicked.
    * Displays a success message, retrieves user and flight information, stores the purchase
    * details in the purchase history table, removes the selected row from the table,
    * resets UI components, hides the price panel, and closes the database connection.
    */
    private void handlePayment() {
         // Display a success message for the payment
        JOptionPane.showMessageDialog(this, "Your Payment was successful", "Success", JOptionPane.INFORMATION_MESSAGE);

        // Get the user information and generate purchase details
        gui2 = new LoginGUI();
        String username = gui2.getCredentials();
        String purchaseID = generatePurchaseHistoryID();
        String flightID = flightNoTextField.getText();
        String customerId = null;
        int no_of_tickets = (int) noOfTicketsSpinner.getValue();
        String total = ticketPriceValueLabel.getText();
        String selectedClass2 = (String) classesComboBox.getSelectedItem();
        
        // Remove spaces from the selected class
        selectedClass2 = selectedClass2.replace(" ", "");

        try {
             // Get a connection from the DatabaseHandler
            Connection connection = DatabaseHandler.getConnection();

            // Retrieve CustomerID based on the username
            PreparedStatement statement = connection.prepareStatement("SELECT CustomerID FROM customer WHERE Username=?");
            statement.setString(1, username);
            ResultSet result_set2 = statement.executeQuery();

            if (result_set2.next()) {  
                // Get the customer ID from the result set
                customerId = result_set2.getString("CustomerID");
            }

            // Store the purchase details in the purchase history table
            storePurchaseHistory(connection, purchaseID, flightID, customerId, selectedClass2, no_of_tickets, total);
            
            // Update the available seats in the flights table
            updateAvailableSeats(connection, flightID, no_of_tickets);

            // Remove the selected row from the table
            removeSelectedRow();   
            
            // Reset UI components
            resetUIComponents();

            // Close the database connection using the DatabaseHandler
            DatabaseHandler.closeConnection(connection);

            // Hide the pricePanel
            pricePanel.setVisible(false);
        } catch (SQLException ex) {
            Logger.getLogger(AirlineReservation.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
    * Stores purchase details in the purchase history table.
    * @param connection The database connection.
    * @param purchaseID The generated purchase history ID.
    * @param flightID The flight ID.
    * @param customerId The customer ID.
    * @param selectedClass The selected class.
    * @param no_of_tickets The number of tickets.
    * @param total The total amount.
    * @throws SQLException If a SQL error occurs during database operations.
    */
    private void storePurchaseHistory(Connection connection, String purchaseID, String flightID, String customerId, String selectedClass, int no_of_tickets, String total) throws SQLException {
        // Prepare the SQL statement for inserting purchase details
        PreparedStatement purchaseStatement = connection.prepareStatement("INSERT INTO purchase_history (PurchaseID, FlightID, CustomerID, Class, NoOfTickets, TotalAmount) VALUES (?, ?, ?, ?, ?, ?)");
        purchaseStatement.setString(1, purchaseID);
        purchaseStatement.setString(2, flightID);
        purchaseStatement.setString(3, customerId);
        purchaseStatement.setString(4, selectedClass);
        purchaseStatement.setInt(5, no_of_tickets);

        // Remove the dollar sign and parse the integer value for the total amount
        int totalInt = Integer.parseInt(total.replace("$", ""));
        purchaseStatement.setInt(6, totalInt);

        // Execute the insert statement
        int rowsAffected = purchaseStatement.executeUpdate();

        if (rowsAffected > 0) {
            //System.out.println("Purchase history data inserted successfully.");
        } else {
            // Log an error if no rows were affected during insertion
            System.err.println("Error: No rows affected during purchase history insertion.");
        }
    }
    
    /**
    * Updates the number of available seats in the flights table after payment.
    * @param connection The database connection.
    * @param flightID The flight ID.
    * @param noOfTickets The number of tickets purchased.
    * @throws SQLException If a SQL error occurs during database operations.
    */
   private void updateAvailableSeats(Connection connection, String flightID, int noOfTickets) throws SQLException {
       // Retrieve the current number of available seats
       int currentAvailableSeats = getCurrentAvailableSeats(connection, flightID);

       // Calculate the new number of available seats
       int newAvailableSeats = currentAvailableSeats - noOfTickets;

       // Prepare the SQL statement for updating available seats
       PreparedStatement updateStatement = connection.prepareStatement("UPDATE flights SET NumberOfSeats = ? WHERE FlightID = ?");
       updateStatement.setInt(1, newAvailableSeats);
       updateStatement.setString(2, flightID);

       // Execute the update statement
       int rowsAffected = updateStatement.executeUpdate();

       if (rowsAffected > 0) {
           // System.out.println("Available seats updated successfully.");
       } else {
           // Log an error if no rows were affected during the update
           System.err.println("Error: No rows affected during available seats update.");
       }
   }

   /**
    * Retrieves the current number of available seats for a given flight ID.
    * @param connection The database connection.
    * @param flightID The flight ID.
    * @return The current number of available seats.
    * @throws SQLException If a SQL error occurs during database operations.
    */
   private int getCurrentAvailableSeats(Connection connection, String flightID) throws SQLException {
       int currentAvailableSeats = 0;

       // Prepare the SQL statement for retrieving current available seats
       PreparedStatement selectStatement = connection.prepareStatement("SELECT NumberOfSeats FROM flights WHERE FlightID = ?");
       selectStatement.setString(1, flightID);

       // Execute the select statement
       ResultSet resultSet = selectStatement.executeQuery();

       // Check if the result set has a valid row
       if (resultSet.next()) {
           currentAvailableSeats = resultSet.getInt("NumberOfSeats");
       }

       // Close the ResultSet and PreparedStatement
       resultSet.close();
       selectStatement.close();

       return currentAvailableSeats;
   }


    /**
    * Removes the selected row from the flight details table.
    * Updates the file after deleting the row.
    */
    private void removeSelectedRow() {
         // Get the selected row index from the table
        int selectedRow = reservedflightDetailsTable.getSelectedRow();
        // Check if a row is selected
        if (selectedRow != -1) {
            // Get the table model and remove the selected row
            DefaultTableModel tableModel = (DefaultTableModel) reservedflightDetailsTable.getModel();
            tableModel.removeRow(selectedRow);
            
        }
    }

    
    /**
     * Resets UI components to their default state.
     */
    private void resetUIComponents() {
        flightNoTextField.setText("");
        sourceTextField.setText("");
        destinationTextField.setText("");
        dateTextField.setText("");
        noOfTicketsSpinner.setValue(1);
        classesComboBox.setSelectedIndex(0);
    }
    
    private void checkPriceButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_checkPriceButtonMouseEntered
       //Changes the background color to indicate the button is being hovered over.
        checkPriceButton.setBackground(new Color(137,59,195));
    }//GEN-LAST:event_checkPriceButtonMouseEntered

    private void checkPriceButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_checkPriceButtonMouseExited
        //Restores the background color to its original state after the button is no longer being hovered over.
        checkPriceButton.setBackground(new Color(112,48,160));
    }//GEN-LAST:event_checkPriceButtonMouseExited


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel ReserveTicketPanel;
    private javax.swing.JButton cancelTicketButton;
    private javax.swing.JButton checkPriceButton;
    private javax.swing.JComboBox<String> classesComboBox;
    private javax.swing.JTextField dateTextField;
    private javax.swing.JLabel destinationLabel;
    private javax.swing.JTextField destinationTextField;
    private javax.swing.JButton exitButton;
    private javax.swing.JLabel flightDateLabel;
    private javax.swing.JLabel flightNoLabel;
    private javax.swing.JTextField flightNoTextField;
    private javax.swing.JButton goBackButton;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel logo;
    private javax.swing.JLabel noOfTicketsLabel;
    private javax.swing.JSpinner noOfTicketsSpinner;
    private javax.swing.JButton paymentButton;
    private javax.swing.JPanel pricePanel;
    private javax.swing.JLabel reservationLabel;
    public javax.swing.JTable reservedflightDetailsTable;
    private javax.swing.JLabel selectClassLabel;
    private javax.swing.JLabel sourceLabel;
    private javax.swing.JTextField sourceTextField;
    private javax.swing.JLabel ticketPriceLabel;
    private javax.swing.JLabel ticketPriceValueLabel;
    private javax.swing.JLabel totalPriceLabel;
    private javax.swing.JLabel totalPriceValueLabel;
    // End of variables declaration//GEN-END:variables
}
