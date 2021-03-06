/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.teketaximaven;

import java.awt.Dialog;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import org.springframework.security.crypto.bcrypt.BCrypt;

/**
 *
 * @author Riverbank
 */
public class Login extends javax.swing.JFrame {

    /**
     * Creates new form Login
     */
    public Login() {
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

        registerDialog = new javax.swing.JDialog();
        jLabel3 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        firstnameTextfield = new javax.swing.JTextField();
        lastnameTextField = new javax.swing.JTextField();
        usernameTextField = new javax.swing.JTextField();
        emailTextField = new javax.swing.JTextField();
        NumberTextField = new javax.swing.JTextField();
        passwordfield = new javax.swing.JPasswordField();
        CpasswordField = new javax.swing.JPasswordField();
        buttonRegister = new javax.swing.JButton();
        checkBoxShowPassword = new javax.swing.JCheckBox();
        buttonCancel = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        txtFldUsername = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        buttonLoginRegister = new javax.swing.JButton();
        buttonLogin = new javax.swing.JButton();
        txtFldPassword = new javax.swing.JPasswordField();

        jLabel3.setText("First Name");

        jLabel7.setText("Confirm Password");

        jLabel6.setText("Password");

        jLabel5.setText("Phone Number");

        jLabel4.setText("Email");

        jLabel8.setText("Username");

        jLabel9.setText("Last Name");

        lastnameTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lastnameTextFieldActionPerformed(evt);
            }
        });

        NumberTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NumberTextFieldActionPerformed(evt);
            }
        });

        CpasswordField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CpasswordFieldActionPerformed(evt);
            }
        });

        buttonRegister.setText("Register");
        buttonRegister.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonRegisterActionPerformed(evt);
            }
        });

        checkBoxShowPassword.setText("show password");
        checkBoxShowPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkBoxShowPasswordActionPerformed(evt);
            }
        });

        buttonCancel.setText("Cancel");
        buttonCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonCancelActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout registerDialogLayout = new javax.swing.GroupLayout(registerDialog.getContentPane());
        registerDialog.getContentPane().setLayout(registerDialogLayout);
        registerDialogLayout.setHorizontalGroup(
            registerDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, registerDialogLayout.createSequentialGroup()
                .addContainerGap(137, Short.MAX_VALUE)
                .addComponent(buttonCancel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(buttonRegister)
                .addGap(119, 119, 119))
            .addGroup(registerDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(registerDialogLayout.createSequentialGroup()
                    .addGap(28, 28, 28)
                    .addGroup(registerDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(registerDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(registerDialogLayout.createSequentialGroup()
                                .addGroup(registerDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(registerDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(usernameTextField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(emailTextField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, registerDialogLayout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lastnameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, registerDialogLayout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(firstnameTextfield, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, registerDialogLayout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(18, 18, 18)
                                .addComponent(NumberTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(registerDialogLayout.createSequentialGroup()
                            .addGroup(registerDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(registerDialogLayout.createSequentialGroup()
                                    .addComponent(jLabel6)
                                    .addGap(41, 41, 41)
                                    .addComponent(passwordfield))
                                .addGroup(registerDialogLayout.createSequentialGroup()
                                    .addComponent(jLabel7)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(CpasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(checkBoxShowPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGap(43, 43, 43)))
        );
        registerDialogLayout.setVerticalGroup(
            registerDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, registerDialogLayout.createSequentialGroup()
                .addContainerGap(221, Short.MAX_VALUE)
                .addGroup(registerDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonRegister)
                    .addComponent(buttonCancel))
                .addGap(60, 60, 60))
            .addGroup(registerDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(registerDialogLayout.createSequentialGroup()
                    .addGap(12, 12, 12)
                    .addGroup(registerDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel3)
                        .addComponent(firstnameTextfield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(registerDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel9)
                        .addComponent(lastnameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(9, 9, 9)
                    .addGroup(registerDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel8)
                        .addComponent(usernameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(registerDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(emailTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(registerDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel5)
                        .addComponent(NumberTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addGroup(registerDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(registerDialogLayout.createSequentialGroup()
                            .addGroup(registerDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel6)
                                .addComponent(passwordfield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(registerDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel7)
                                .addComponent(CpasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addComponent(checkBoxShowPassword, javax.swing.GroupLayout.Alignment.TRAILING))
                    .addContainerGap(103, Short.MAX_VALUE)))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Username:");

        txtFldUsername.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFldUsernameActionPerformed(evt);
            }
        });

        jLabel2.setText("Password:");

        buttonLoginRegister.setText("Register");
        buttonLoginRegister.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonLoginRegisterActionPerformed(evt);
            }
        });

        buttonLogin.setText("Login");
        buttonLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonLoginActionPerformed(evt);
            }
        });

        txtFldPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFldPasswordActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtFldUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(buttonLoginRegister)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(buttonLogin)
                                .addGap(12, 12, 12))
                            .addComponent(txtFldPassword))))
                .addContainerGap(174, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtFldUsername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(txtFldPassword, javax.swing.GroupLayout.DEFAULT_SIZE, 25, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonLoginRegister)
                    .addComponent(buttonLogin))
                .addGap(37, 37, 37))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtFldUsernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFldUsernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFldUsernameActionPerformed

    private void buttonLoginRegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonLoginRegisterActionPerformed
        // JOptionPane.showConfirmDialog(this, "Register clicked");
//        registerDialog.set
        registerDialog.pack();
        registerDialog.setModalityType(Dialog.ModalityType.APPLICATION_MODAL);
        registerDialog.setVisible(true);

    }//GEN-LAST:event_buttonLoginRegisterActionPerformed

    private void buttonLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonLoginActionPerformed
        try {
            //Connection connection = conn.getConnection();

            DbConnect dbConn = new DbConnect();
            Connection connection = dbConn.getConnection();
            String sql = "Select * from users where Username=? and Password=?";

            PreparedStatement pst = connection.prepareStatement(sql);
            pst.setString(1, txtFldUsername.getText());
            pst.setString(2, txtFldPassword.getText());
            ResultSet rs = pst.executeQuery();
            
            if (txtFldUsername.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "Add username");

            } else if (txtFldPassword.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "Add Password");

            } else if (rs.next()) {
//                JOptionPane.showMessageDialog(null, "username and password matched");
                //public void actionPerformed(ActionEvent arg0) {
                Welcome y = new Welcome(txtFldUsername.getText());

                y.setVisible(true);
                //};
            } else {
                JOptionPane.showMessageDialog(null, "username and password don't matched");
                txtFldUsername.setText("");
                txtFldPassword.setText("");
            }

            connection.close();

        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, e);

        }
    }//GEN-LAST:event_buttonLoginActionPerformed

    private void txtFldPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFldPasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFldPasswordActionPerformed

    private void lastnameTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lastnameTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lastnameTextFieldActionPerformed

    private void NumberTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NumberTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NumberTextFieldActionPerformed

    private void CpasswordFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CpasswordFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CpasswordFieldActionPerformed

    private void buttonRegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonRegisterActionPerformed
        // TODO add your handling code here:
        try {

            if (usernameTextField.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "Add A Username");
                usernameTextField.requestFocus();
                return;
            } else if (passwordfield.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "Add A Password");
                passwordfield.requestFocus();

                return;
            } else if (!passwordfield.getText().equals(CpasswordField.getText())) {
                JOptionPane.showMessageDialog(null, "Retype The Password Again");
                CpasswordField.requestFocus();
                return;

            } else if ((checkusername(usernameTextField.getText()))) {
                JOptionPane.showMessageDialog(null, "This Username Already Exist");
                return;
            } else {

                JOptionPane.showMessageDialog(null, "Register Successfully");

            }

            DbConnect dbConn = new DbConnect();
            Connection connection = dbConn.getConnection();
            String query = " insert ignore into users (password,username,email,firstname, lastname,phone_number)"
                    + " values (?, ?, ?, ?, ?, ?)";

            String hashedPassword = generateHash(new String(passwordfield.getPassword()));
            PreparedStatement pst = connection.prepareStatement(query);
            pst.setString(1, hashedPassword);
            pst.setString(2, usernameTextField.getText());
            
            pst.setString(3, emailTextField.getText());
            pst.setString(4, firstnameTextfield.getText());
            pst.setString(5, lastnameTextField.getText());
            pst.setString(6, NumberTextField.getText());
            //            pst.setString(7, confirmpassTextField.getText());
            pst.executeUpdate();
            Login s = new Login();
            s.setVisible(true);

        } catch (Exception ex) {
            ex.printStackTrace();

            JOptionPane.showMessageDialog(null, ex);

        }
    }//GEN-LAST:event_buttonRegisterActionPerformed

    private void checkBoxShowPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkBoxShowPasswordActionPerformed
        // TODO add your handling code here:
        if (checkBoxShowPassword.isSelected()) {
            passwordfield.setEchoChar((char) 0);
            CpasswordField.setEchoChar((char) 0);
        } else {
            passwordfield.setEchoChar('*');
            CpasswordField.setEchoChar('*');
        }
    }//GEN-LAST:event_checkBoxShowPasswordActionPerformed

    private void buttonCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonCancelActionPerformed
        // TODO add your handling code here:
        registerDialog.dispose();
    }//GEN-LAST:event_buttonCancelActionPerformed

    private boolean checkusername(String uname) {
        // TODO Auto-generated method stub
        return false;
    }

    private String generateHash(String password) {
        String generatedSecuredPasswordHash = BCrypt.hashpw(password, BCrypt.gensalt(12));

        return generatedSecuredPasswordHash;

    }

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPasswordField CpasswordField;
    private javax.swing.JTextField NumberTextField;
    private javax.swing.JButton buttonCancel;
    private javax.swing.JButton buttonLogin;
    private javax.swing.JButton buttonLoginRegister;
    private javax.swing.JButton buttonRegister;
    private javax.swing.JCheckBox checkBoxShowPassword;
    private javax.swing.JTextField emailTextField;
    private javax.swing.JTextField firstnameTextfield;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField lastnameTextField;
    private javax.swing.JPasswordField passwordfield;
    private javax.swing.JDialog registerDialog;
    private javax.swing.JPasswordField txtFldPassword;
    private javax.swing.JTextField txtFldUsername;
    private javax.swing.JTextField usernameTextField;
    // End of variables declaration//GEN-END:variables
}
