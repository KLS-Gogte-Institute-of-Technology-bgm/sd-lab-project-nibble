

import java.awt.Color;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.border.Border;
import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author LENOVO
 */
public class Studentlogin  extends javax.swing.JFrame {

    /**
     * Creates new form NewJFrame
     */
    public Studentlogin() {
initComponents();
this.setLocationRelativeTo(null);
        Border jpanel_title_border = BorderFactory.createMatteBorder(0, 1, 1, 1, Color.yellow);
jPanel_title.setBorder(jpanel_title_border);

        Border jlabel_minimize = BorderFactory.createMatteBorder(1, 1, 1, 1, Color.black);
jLabel_minimize.setBorder(jlabel_minimize);

        Border jlabel_close = BorderFactory.createMatteBorder(1, 1, 1, 1, Color.black);
jLabel_close.setBorder(jlabel_close);

        Border jpanel_g = BorderFactory.createMatteBorder(7, 7, 7, 7, Color.orange);
jPanel_g.setBorder(jpanel_g);

        Border jfield =BorderFactory.createMatteBorder(1, 5, 1, 1, Color.white);
jTextField_un.setBorder(jfield);
jPasswordField_pass.setBorder(jfield);

        Border jlabel_closea = BorderFactory.createMatteBorder(0, 0, 1, 0, Color.lightGray);
jLabel_createacc.setBorder(jlabel_closea);
        int z=0;

    }
    Connection con;
PreparedStatement pst;
    public void Connect(){
        try {
Class.forName("com.mysql.jdbc.Driver");
            try {
                con = DriverManager.getConnection("jdbc:mysql://localhost/onlineexam1","root","");
            } catch (SQLException ex) {
Logger.getLogger(Studentlogin.class.getName()).log(Level.SEVERE, null, ex);
            }
        } catch (ClassNotFoundException ex) {
Logger.getLogger(Studentlogin.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">
    private void initComponents() {

jPanel_g = new javax.swing.JPanel();
jPanel_title = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
jLabel_minimize = new javax.swing.JLabel();
jLabel_close = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
jPasswordField_pass = new javax.swing.JPasswordField();
jTextField_un = new javax.swing.JTextField();
jButton_login = new javax.swing.JButton();
jLabel_createacc = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
setUndecorated(true);

jPanel_g.setBackground(new java.awt.Color(204, 204, 204));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jLabel1.setText("LOGIN");

javax.swing.GroupLayoutjPanel_titleLayout = new javax.swing.GroupLayout(jPanel_title);
jPanel_title.setLayout(jPanel_titleLayout);
jPanel_titleLayout.setHorizontalGroup(
            jPanel_titleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_titleLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
jPanel_titleLayout.setVerticalGroup(
            jPanel_titleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_titleLayout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(6, 6, 6))
        );

jLabel_minimize.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
jLabel_minimize.setText("  -");
jLabel_minimize.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
jLabel_minimize.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEventevt) {
jLabel_minimizeMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEventevt) {
jLabel_minimizeMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEventevt) {
jLabel_minimizeMouseExited(evt);
            }
        });

jLabel_close.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
jLabel_close.setText(" x");
jLabel_close.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
jLabel_close.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEventevt) {
jLabel_closeMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEventevt) {
jLabel_closeMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEventevt) {
jLabel_closeMouseExited(evt);
            }
        });

        //jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/imagesfr1.jpg")));

        //jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/downloadr1.png")));

jPasswordField_pass.setForeground(new java.awt.Color(153, 153, 153));
jPasswordField_pass.setText("password");
jPasswordField_pass.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEventevt) {
jPasswordField_passFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEventevt) {
jPasswordField_passFocusLost(evt);
            }
        });
jPasswordField_pass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEventevt) {
jPasswordField_passActionPerformed(evt);
            }
        });

jTextField_un.setForeground(new java.awt.Color(153, 153, 153));
jTextField_un.setText("username");
jTextField_un.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEventevt) {
jTextField_unFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEventevt) {
jTextField_unFocusLost(evt);
            }
        });

jButton_login.setBackground(new java.awt.Color(0, 84, 104));
jButton_login.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 24)); // NOI18N
jButton_login.setForeground(new java.awt.Color(255, 255, 255));
jButton_login.setText("Login");
jButton_login.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
jButton_login.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEventevt) {
jButton_loginMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEventevt) {
jButton_loginMouseExited(evt);
            }
        });
jButton_login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEventevt) {
jButton_loginActionPerformed(evt);
            }
        });

jLabel_createacc.setForeground(new java.awt.Color(255, 51, 51));
jLabel_createacc.setText(">>No Account? Create One!");
jLabel_createacc.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
jLabel_createacc.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEventevt) {
jLabel_createaccMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEventevt) {
jLabel_createaccMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEventevt) {
jLabel_createaccMouseExited(evt);
            }
        });

javax.swing.GroupLayoutjPanel_gLayout = new javax.swing.GroupLayout(jPanel_g);
jPanel_g.setLayout(jPanel_gLayout);
jPanel_gLayout.setHorizontalGroup(
            jPanel_gLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_gLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(jPanel_gLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel_gLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel_gLayout.createSequentialGroup()
                        .addGap(0, 45, Short.MAX_VALUE)
                        .addComponent(jPanel_title, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(51, 51, 51)
                        .addComponent(jLabel_minimize, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel_close, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(9, 9, 9))
                    .addGroup(jPanel_gLayout.createSequentialGroup()
                        .addGroup(jPanel_gLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextField_un)
                            .addComponent(jPasswordField_pass)
                            .addComponent(jButton_login, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(jPanel_gLayout.createSequentialGroup()
                .addGroup(jPanel_gLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel_gLayout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addComponent(jLabel3))
                    .addGroup(jPanel_gLayout.createSequentialGroup()
                        .addGap(133, 133, 133)
                        .addComponent(jLabel_createacc)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
jPanel_gLayout.setVerticalGroup(
            jPanel_gLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_gLayout.createSequentialGroup()
                .addGroup(jPanel_gLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel_gLayout.createSequentialGroup()
                        .addGroup(jPanel_gLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel_title, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel_gLayout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel_gLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel_minimize, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel_close, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(16, 16, 16)
                        .addComponent(jTextField_un, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel_gLayout.createSequentialGroup()
                        .addGap(73, 73, 73)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(34, 34, 34)
                .addGroup(jPanel_gLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPasswordField_pass, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jButton_login, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel_createacc, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addContainerGap(27, Short.MAX_VALUE))
        );

javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
getContentPane().setLayout(layout);
layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel_g, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel_g, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>

    private void jLabel_minimizeMouseExited(java.awt.event.MouseEventevt) {                                            
        // TODO add your handling code here:
        Border jlabel_minimize = BorderFactory.createMatteBorder(1, 1, 1, 1, Color.black);
jLabel_minimize.setBorder(jlabel_minimize);
    }                                           

    private void jLabel_minimizeMouseEntered(java.awt.event.MouseEventevt) {                                             
        // TODO add your handling code here:
        Border jlabel_minimize = BorderFactory.createMatteBorder(1, 1, 1, 1, Color.yellow);
jLabel_minimize.setBorder(jlabel_minimize);
    }                                            

    private void jLabel_closeMouseEntered(java.awt.event.MouseEventevt) {                                          
        // TODO add your handling code here:
        Border jlabel_close = BorderFactory.createMatteBorder(1, 1, 1, 1, Color.yellow);
jLabel_close.setBorder(jlabel_close);
    }                                         

    private void jLabel_closeMouseExited(java.awt.event.MouseEventevt) {                                         
        // TODO add your handling code here:
        Border jlabel_close = BorderFactory.createMatteBorder(1, 1, 1, 1, Color.black);
jLabel_close.setBorder(jlabel_close);
    }                                        

    private void jTextField_unFocusGained(java.awt.event.FocusEventevt) {                                          
        // TODO add your handling code here:
        if(jTextField_un.getText().trim().toLowerCase().equals("username"))
        {
jTextField_un.setText("");
jTextField_un.setForeground(Color.black);
        }
    }                                         

    private void jTextField_unFocusLost(java.awt.event.FocusEventevt) {                                        
        // TODO add your handling code here:
        if(jTextField_un.getText().trim().equals("") || jTextField_un.getText().trim().equals("username"))
        {
jTextField_un.setText("username");
jTextField_un.setForeground(new Color(153,153,153));
        }
    }                                       

    private void jPasswordField_passFocusGained(java.awt.event.FocusEventevt) {                                                
        // TODO add your handling code here:
        String pass= String.valueOf(jPasswordField_pass.getPassword());
        if(pass.trim().toLowerCase().equals("password"))
        {
jPasswordField_pass.setText("");
jPasswordField_pass.setForeground(Color.black);
        }

    }                                               

    private void jPasswordField_passFocusLost(java.awt.event.FocusEventevt) {                                              
        // TODO add your handling code here:
        String pass= String.valueOf(jPasswordField_pass.getPassword());
        if(pass.trim().equals("") || pass.trim().equals("password"))
        {
jPasswordField_pass.setText("password");
jPasswordField_pass.setForeground(new Color(153,153,153));
        }
    }                                             

    private void jLabel_minimizeMouseClicked(java.awt.event.MouseEventevt) {                                             
        // TODO add your handling code here:
this.setState(JFrame.ICONIFIED);
    }                                            

    private void jLabel_closeMouseClicked(java.awt.event.MouseEventevt) {                                          
        // TODO add your handling code here:
System.exit(0);
    }                                         

    private void jButton_loginMouseEntered(java.awt.event.MouseEventevt) {                                           
        // TODO add your handling code here:
jButton_login.setBackground(new Color(0,101,150));
    }                                          

    private void jButton_loginMouseExited(java.awt.event.MouseEventevt) {                                          
        // TODO add your handling code here:
jButton_login.setBackground(new Color(0,84,104));
    }                                         

    private void jPasswordField_passActionPerformed(java.awt.event.ActionEventevt) {                                                    
        // TODO add your handling code here:
    }                                                   

    private void jButton_loginActionPerformed(java.awt.event.ActionEventevt) {                                              
        try {
            // TODO add your handling code here:
PreparedStatementst;
ResultSetrs;

            String username = jTextField_un.getText();
            String password = String.valueOf(jPasswordField_pass.getPassword());

            String query = "select id from users where username=\'"+username+"\' and password=\'"+password+"\'";



st = con.prepareStatement(query);

            //st.setString(1, username);
            //st.setString(2, password);
rs = st.executeQuery(query);

            if(rs.next())
            {
PreparedStatementstb;
ResultSetrsb;
                String qquery = "create table if not exists marks(qno char(100),marks int)";
stb = con.prepareStatement(qquery);
stb.executeUpdate();

PreparedStatementstc;
ResultSetrsc;
                String cquery = "create table if not exists usn(slno int primary key auto_increment,usn char(100))";
stc = con.prepareStatement(cquery);
stc.executeUpdate();

PreparedStatement std;
ResultSetrsd;
                String dquery = "insert into usn(usn) values (\'"+username+"\')";
                std = con.prepareStatement(dquery);
std.executeUpdate();

PreparedStatementstzx;
ResultSetrszx;
                String zxquery = "select usn from usn where usn=\'"+username+"\'";
stzx = con.prepareStatement(query);
rszx = st.executeQuery(zxquery);








            }                                             

        } catch (SQLException ex) {
Logger.getLogger(newframe.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void jLabel_createaccMouseEntered(java.awt.event.MouseEventevt) {                                              
        // TODO add your handling code here:
        Border jlabel_closea = BorderFactory.createMatteBorder(0, 0, 1, 0, Color.red);
jLabel_createacc.setBorder(jlabel_closea);
    }                                             

    private void jLabel_createaccMouseExited(java.awt.event.MouseEventevt) {                                             
        // TODO add your handling code here:
        Border jlabel_closea = BorderFactory.createMatteBorder(0, 0, 1, 0, Color.lightGray);
jLabel_createacc.setBorder(jlabel_closea);
    }                                            

    private void jLabel_createaccMouseClicked(java.awt.event.MouseEventevt) {                                              
        // TODO add your handling code here:
        register rf = new register();
rf.setVisible(true);
rf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
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
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new newframe().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JButtonjButton_login;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabeljLabel_close;
    private javax.swing.JLabeljLabel_createacc;
    private javax.swing.JLabeljLabel_minimize;
    private javax.swing.JPaneljPanel_g;
    private javax.swing.JPaneljPanel_title;
    private javax.swing.JPasswordFieldjPasswordField_pass;
    private javax.swing.JTextFieldjTextField_un;
    // End of variables declaration                   
}

