/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package designform;

/**
 *
 * @author dinhhang
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JOptionPane;
import java.awt.List;
import java.awt.event.ActionEvent;
import java.util.Random;
import java.util.ArrayList; 
import java.util.Collections; 
import java.util.Random;
import java.util.Vector;
import javax.swing.table.DefaultTableModel;
public class AddProduct extends javax.swing.JFrame {

String driver= "com.microsoft.sqlserver.jdbo.SQLServerDriver";
String url= "jdbo:sqlserver://localhost:1433:databaseName='Ecommerce";
String user="sa";
String password= "sa";
Statement st;
ResultSet rs;

    /**
     * Creates new form AddProduct
     */
    public AddProduct() {
        initComponents();
    
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDialog1 = new javax.swing.JDialog();
        JPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jTxtName = new javax.swing.JTextField();
        jTxtQuantity = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        AddButton = new javax.swing.JButton();
        RemoveButton = new javax.swing.JButton();

        javax.swing.GroupLayout jDialog1Layout = new javax.swing.GroupLayout(jDialog1.getContentPane());
        jDialog1.getContentPane().setLayout(jDialog1Layout);
        jDialog1Layout.setHorizontalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jDialog1Layout.setVerticalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("ADD PRODUCT");

        JPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 153, 204));
        jLabel1.setText("SHOPPING CART");

        jTable1.setBackground(new java.awt.Color(255, 153, 204));
        jTable1.setForeground(new java.awt.Color(255, 153, 204));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "ProductID", "PName", "Price", "Quantity"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane2.setViewportView(jTable1);

        jTxtName.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTxtName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTxtNameActionPerformed(evt);
            }
        });

        jTxtQuantity.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTxtQuantity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTxtQuantityActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 153, 204));
        jLabel2.setText("Quantity");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 153, 204));
        jLabel3.setText("Product Name");

        AddButton.setBackground(new java.awt.Color(255, 153, 204));
        AddButton.setForeground(new java.awt.Color(255, 255, 255));
        AddButton.setText("ADD");
        AddButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddButtonActionPerformed(evt);
            }
        });

        RemoveButton.setBackground(new java.awt.Color(255, 153, 204));
        RemoveButton.setForeground(new java.awt.Color(255, 255, 255));
        RemoveButton.setText("REMOVE");
        RemoveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RemoveButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout JPanel1Layout = new javax.swing.GroupLayout(JPanel1);
        JPanel1.setLayout(JPanel1Layout);
        JPanel1Layout.setHorizontalGroup(
            JPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 476, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(69, 69, 69)
                .addGroup(JPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTxtName, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2)
                    .addComponent(jTxtQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(JPanel1Layout.createSequentialGroup()
                        .addComponent(AddButton, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                        .addComponent(RemoveButton, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, JPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 332, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32))
        );
        JPanel1Layout.setVerticalGroup(
            JPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPanel1Layout.createSequentialGroup()
                .addGap(86, 86, 86)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(JPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(JPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jTxtName, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(36, 36, 36)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addComponent(jTxtQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                        .addGroup(JPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(AddButton, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(RemoveButton, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(119, 119, 119))
                    .addGroup(JPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 338, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(JPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(JPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTxtNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTxtNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTxtNameActionPerformed

    private void jTxtQuantityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTxtQuantityActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTxtQuantityActionPerformed

    private void AddButtonActionPerformed(ActionEvent evt, DefaultTableModel model) {
        // Check if the input fields are empty
        if (jTxtName.getText().isEmpty() || jTxtQuantity.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please Enter Product Name and Quantity");
            return;
        }

        String name = jTxtName.getText();
        int quantity;
        try {
            quantity = Integer.parseInt(jTxtQuantity.getText());
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Invalid Quantity. Please enter a number.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        try {
            // Load the database driver
            Class.forName("com.mysql.cj.jdbc.Driver"); // Ensure you are using the correct driver
            // Establish the connection
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/your_database", "your_username", "your_password");

            // Prepare the SQL select statement
            String sql = "SELECT ProductID, PName, Price FROM products WHERE PName = ?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, name);

            // Execute the select statement
            ResultSet rs = ps.executeQuery();

            // Check if any results were returned
            if (rs.next()) {
                int productID = rs.getInt("ProductID");
                String productName = rs.getString("PName");
                double price = rs.getDouble("Price");

                // Check if the product already exists in the table
                int rowIndex = findProductIndex(model, productID);
                if (rowIndex != -1) {
                    // Update quantity and total price if product already exists
                    int currentQuantity = (int) model.getValueAt(rowIndex, 3);
                    model.setValueAt(currentQuantity + quantity, rowIndex, 3); // Update quantity
                    model.setValueAt((price * (currentQuantity + quantity)), rowIndex, 2); // Update total price
                } else {
                    // Add new product to the table
                    model.addRow(new Object[]{productID, productName, price * quantity, quantity});
                }
            } else {
                JOptionPane.showMessageDialog(this, "Product Not Found");
            }

            // Close the ResultSet, statement, and connection
            rs.close();
            ps.close();
            con.close();
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Error: " + e.getMessage());
        }
    }

    // Method to find the index of a product in the table model
    private int findProductIndex(DefaultTableModel model, int productID) {
        for (int i = 0; i < model.getRowCount(); i++) {
            if ((int) model.getValueAt(i, 0) == productID) {
                return i;
            }
        }
        return -1; // Product not found
    }                                         

    private void RemoveButtonActionPerformed(ActionEvent evt, DefaultTableModel model) {
        // Get the name and quantity of the product to remove
        String name = jTxtName.getText();
        int quantityToRemove;
        try {
            quantityToRemove = Integer.parseInt(jTxtQuantity.getText());
            if (quantityToRemove <= 0) {
                JOptionPane.showMessageDialog(this, "Quantity to remove must be a positive number");
                return;
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Invalid Quantity to remove. Please enter a number.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
    
        int rowIndex = findProductRowIndexByName(model, name);
        if (rowIndex != -1) {
            int currentQuantity = (int) model.getValueAt(rowIndex, 3);
            if (currentQuantity >= quantityToRemove) {
                int newQuantity = currentQuantity - quantityToRemove;
                if (newQuantity == 0) {
                    // If quantity becomes zero, remove the entire row
                    model.removeRow(rowIndex);
                } else {
                    // Update the quantity
                    model.setValueAt(newQuantity, rowIndex, 3);
                }
            } else {
                JOptionPane.showMessageDialog(this, "Quantity to remove exceeds current quantity of the product");
            }
        } else {
            JOptionPane.showMessageDialog(this, "Product Not Found in the Table");
        }
    }
    
    // Method to find the index of a product by name in the table model
    private int findProductRowIndexByName(DefaultTableModel model, String name) {
        for (int i = 0; i < model.getRowCount(); i++) {
            if (model.getValueAt(i, 1).equals(name)) { // Check product name at column index 1
                return i;
            }
        }
        return -1; // Product not found
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(AddProduct.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddProduct.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddProduct.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddProduct.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddProduct().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddButton;
    private javax.swing.JPanel JPanel1;
    private javax.swing.JButton RemoveButton;
    private javax.swing.JDialog jDialog1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTxtName;
    private javax.swing.JTextField jTxtQuantity;
    // End of variables declaration//GEN-END:variables
}
