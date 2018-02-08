/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package login;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Jarek
 */
public class RegisterForm extends javax.swing.JFrame {
    
    int xx;
    int yy;
    
    /**
     * Creates new form RegisterForm
     */
    public RegisterForm() {
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

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jTextField_uname = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel_Login = new javax.swing.JLabel();
        jButton_Register = new javax.swing.JButton();
        jPasswordField_Repass = new javax.swing.JPasswordField();
        jPasswordField_Pass = new javax.swing.JPasswordField();
        jCheckBox_ShowPass = new javax.swing.JCheckBox();
        jTextField_fname = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jTextField_lname = new javax.swing.JTextField();
        jTextField_email = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jTextField_age = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel_dragged = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Register form");
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        jPanel1.setPreferredSize(new java.awt.Dimension(525, 430));
        jPanel1.setLayout(null);

        jPanel2.setBackground(new java.awt.Color(0, 153, 153));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/register.png"))); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(28, Short.MAX_VALUE)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(160, 160, 160)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(168, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2);
        jPanel2.setBounds(0, 0, 240, 530);

        jLabel4.setFont(new java.awt.Font("Calibri", 0, 36)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 51, 51));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Register Form");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(270, 40, 230, 40);

        jPanel3.setBackground(new java.awt.Color(0, 153, 153));

        jLabel1.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("X");
        jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 44, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 44, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel3);
        jPanel3.setBounds(481, 0, 44, 44);

        jLabel2.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 51, 51));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("-");
        jLabel2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel2);
        jLabel2.setBounds(460, 0, 20, 40);

        jLabel8.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(51, 51, 51));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel8.setText("Username:");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(290, 80, 80, 16);

        jTextField_uname.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jTextField_uname.setForeground(new java.awt.Color(51, 51, 51));
        jTextField_uname.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField_uname.setToolTipText("Type your username");
        jTextField_uname.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 51)));
        jPanel1.add(jTextField_uname);
        jTextField_uname.setBounds(290, 100, 190, 30);

        jLabel9.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(51, 51, 51));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel9.setText("Password:");
        jPanel1.add(jLabel9);
        jLabel9.setBounds(290, 130, 80, 16);

        jLabel10.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(51, 51, 51));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel10.setText("Retype password:");
        jPanel1.add(jLabel10);
        jLabel10.setBounds(290, 180, 110, 16);

        jLabel_Login.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        jLabel_Login.setForeground(new java.awt.Color(0, 153, 153));
        jLabel_Login.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_Login.setText("Click Here to Login");
        jLabel_Login.setToolTipText("");
        jLabel_Login.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel_Login.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_LoginMouseClicked(evt);
            }
        });
        jPanel1.add(jLabel_Login);
        jLabel_Login.setBounds(290, 500, 190, 20);

        jButton_Register.setBackground(new java.awt.Color(0, 153, 153));
        jButton_Register.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jButton_Register.setForeground(new java.awt.Color(255, 255, 255));
        jButton_Register.setText("Register");
        jButton_Register.setToolTipText("Click to register");
        jButton_Register.setBorder(null);
        jButton_Register.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton_Register.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_RegisterActionPerformed(evt);
            }
        });
        jPanel1.add(jButton_Register);
        jButton_Register.setBounds(340, 470, 90, 30);

        jPasswordField_Repass.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jPasswordField_Repass.setForeground(new java.awt.Color(51, 51, 51));
        jPasswordField_Repass.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPasswordField_Repass.setToolTipText("Retype your password");
        jPasswordField_Repass.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 51)));
        jPanel1.add(jPasswordField_Repass);
        jPasswordField_Repass.setBounds(290, 200, 190, 30);

        jPasswordField_Pass.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jPasswordField_Pass.setForeground(new java.awt.Color(51, 51, 51));
        jPasswordField_Pass.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPasswordField_Pass.setToolTipText("Type your password");
        jPasswordField_Pass.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 51)));
        jPanel1.add(jPasswordField_Pass);
        jPasswordField_Pass.setBounds(290, 150, 190, 30);

        jCheckBox_ShowPass.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox_ShowPass.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        jCheckBox_ShowPass.setText("Show password");
        jCheckBox_ShowPass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox_ShowPassActionPerformed(evt);
            }
        });
        jPanel1.add(jCheckBox_ShowPass);
        jCheckBox_ShowPass.setBounds(290, 230, 110, 25);

        jTextField_fname.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jTextField_fname.setForeground(new java.awt.Color(51, 51, 51));
        jTextField_fname.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField_fname.setToolTipText("Type your first name");
        jTextField_fname.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 51)));
        jPanel1.add(jTextField_fname);
        jTextField_fname.setBounds(290, 280, 190, 30);

        jLabel6.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(51, 51, 51));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel6.setText("First Name:");
        jLabel6.setToolTipText("");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(290, 260, 80, 16);

        jLabel7.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(51, 51, 51));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel7.setText("Last Name:");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(290, 310, 80, 16);

        jTextField_lname.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jTextField_lname.setForeground(new java.awt.Color(51, 51, 51));
        jTextField_lname.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField_lname.setToolTipText("Type your last name");
        jTextField_lname.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 51)));
        jPanel1.add(jTextField_lname);
        jTextField_lname.setBounds(290, 330, 190, 30);

        jTextField_email.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jTextField_email.setForeground(new java.awt.Color(51, 51, 51));
        jTextField_email.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField_email.setToolTipText("Type your email address");
        jTextField_email.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 51)));
        jPanel1.add(jTextField_email);
        jTextField_email.setBounds(290, 380, 190, 30);

        jLabel11.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(51, 51, 51));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel11.setText("E-mail address:");
        jPanel1.add(jLabel11);
        jLabel11.setBounds(290, 360, 100, 16);

        jTextField_age.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jTextField_age.setForeground(new java.awt.Color(51, 51, 51));
        jTextField_age.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField_age.setToolTipText("Type your age");
        jTextField_age.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 51)));
        jPanel1.add(jTextField_age);
        jTextField_age.setBounds(290, 430, 50, 30);

        jLabel12.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(51, 51, 51));
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel12.setText("Age:");
        jPanel1.add(jLabel12);
        jLabel12.setBounds(290, 410, 100, 16);

        jLabel_dragged.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jLabel_draggedMouseDragged(evt);
            }
        });
        jLabel_dragged.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel_draggedMousePressed(evt);
            }
        });
        jPanel1.add(jLabel_dragged);
        jLabel_dragged.setBounds(0, 4, 520, 40);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 530, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(525, 530));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        // Zamknięcie okna
        dispose();
    }//GEN-LAST:event_jLabel1MouseClicked

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        // Minimalizacja okna
        this.setState(JFrame.ICONIFIED);
    }//GEN-LAST:event_jLabel2MouseClicked

    private void jLabel_LoginMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_LoginMouseClicked
        // Opening LoginForm
        showLoginForm();
    }//GEN-LAST:event_jLabel_LoginMouseClicked

    private void jButton_RegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_RegisterActionPerformed
        
        // Sprawdzenie czy password i repassword są identyczne
        if (!jPasswordField_Pass.getText().equals(jPasswordField_Repass.getText()))
        {
            JOptionPane.showMessageDialog(this, "Password and repassword are not the same. Type again.");
        } else
        {
        // Wpisanie nowego użytkownika do bazy
            try {
                // Username veryfication
                Class.forName("com.mysql.jdbc.Driver");
                Connection con = DriverManager.getConnection("jdbc:mysql://localhost/login", "root", "");
                Statement st = con.createStatement();
                String sqlUsernameCheck =  "SELECT `username` FROM `dane` WHERE `username`='"+jTextField_uname.getText()+"'";
                ResultSet rs = st.executeQuery(sqlUsernameCheck);
                
                int count = 0;
                
                while(rs.next())
                {
                    count += 1;
                }
                
                if(count == 1)
                {
                    JOptionPane.showMessageDialog(this, "This Username exist try with another");
                } else if(count > 1)
                {
                    JOptionPane.showMessageDialog(this, "Dupliccate Username, acces denied.");
                }
                else
                {
                    getConnection("INSERT INTO `dane`(`username`, `password`, `firstname`, `lastname`, `email`, `age`) VALUES ('"+jTextField_uname.getText()+"','"+jPasswordField_Pass.getText()+"','"+jTextField_fname.getText()+"','"+jTextField_lname.getText()+"','"+jTextField_email.getText()+"',"+jTextField_age.getText()+")");
                    JOptionPane.showMessageDialog(null, "New user added successfully");
                    showLoginForm();
                }
                
       
                
            } catch (Exception e) {
                System.out.println("Błąd dodania do bazy"+e);
            }
        }
    }//GEN-LAST:event_jButton_RegisterActionPerformed

    private void jCheckBox_ShowPassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox_ShowPassActionPerformed
        if(jCheckBox_ShowPass.isSelected())
        {
            jPasswordField_Pass.setEchoChar((char)0);
            jPasswordField_Repass.setEchoChar((char)0);
        } else
        {
            jPasswordField_Pass.setEchoChar('*');
            jPasswordField_Repass.setEchoChar('*');
        }
    }//GEN-LAST:event_jCheckBox_ShowPassActionPerformed

    private void jLabel_draggedMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_draggedMousePressed
        // reading coordination of pressed poin
        xx = evt.getX();
        yy = evt.getY();
    }//GEN-LAST:event_jLabel_draggedMousePressed

    private void jLabel_draggedMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_draggedMouseDragged
        // moving form 
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xx, y - yy);
    }//GEN-LAST:event_jLabel_draggedMouseDragged

    public void getConnection(String query)
    {
        Connection con;
        Statement st;
        try {
            con = DriverManager.getConnection("jdbc:mysql://localhost/login","root","");
            st = con.createStatement();
            st.executeUpdate(query);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
    
    public void showLoginForm()
    {
        LoginForm lfm = new LoginForm();
        lfm.setVisible(true);
        lfm.pack();
        lfm.setLocationRelativeTo(null);
        lfm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();    
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
            java.util.logging.Logger.getLogger(RegisterForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegisterForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegisterForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegisterForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegisterForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_Register;
    private javax.swing.JCheckBox jCheckBox_ShowPass;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabel_Login;
    private javax.swing.JLabel jLabel_dragged;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPasswordField jPasswordField_Pass;
    private javax.swing.JPasswordField jPasswordField_Repass;
    private javax.swing.JTextField jTextField_age;
    private javax.swing.JTextField jTextField_email;
    private javax.swing.JTextField jTextField_fname;
    private javax.swing.JTextField jTextField_lname;
    private javax.swing.JTextField jTextField_uname;
    // End of variables declaration//GEN-END:variables
}
