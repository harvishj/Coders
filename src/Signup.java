/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//package Coders;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

/**
 *
 * @author Namit
 */
public class Signup extends javax.swing.JPanel {

    /**
     * Creates new form Signup
     */
    public Signup() {
        initComponents();
        this.setSize(950,725);
        this.setVisible(true);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel10 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jPasswordField1 = new javax.swing.JPasswordField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jPasswordField2 = new javax.swing.JPasswordField();
        jButton1 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();

        jLabel10.setIcon(new javax.swing.ImageIcon("C:\\Users\\Namit\\Desktop\\Sem_2\\Object_Oriented_Programming\\OOP Final Project Files\\Images OOP Project\\newnwew.png")); // NOI18N

        setForeground(new java.awt.Color(255, 255, 255));
        setMinimumSize(new java.awt.Dimension(950, 725));
        setLayout(null);

        jLabel1.setFont(new java.awt.Font("Product Sans", 3, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Sign Up");
        add(jLabel1);
        jLabel1.setBounds(670, 50, 83, 30);

        jLabel2.setFont(new java.awt.Font("Product Sans", 3, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Date of Birth");
        add(jLabel2);
        jLabel2.setBounds(550, 430, 120, 23);

        jLabel3.setFont(new java.awt.Font("Product Sans", 3, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Type of User");
        add(jLabel3);
        jLabel3.setBounds(550, 510, 120, 23);

        jLabel4.setFont(new java.awt.Font("Product Sans", 3, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Email - ID");
        add(jLabel4);
        jLabel4.setBounds(550, 350, 79, 23);

        jLabel5.setFont(new java.awt.Font("Product Sans", 3, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Preferred Username");
        add(jLabel5);
        jLabel5.setBounds(550, 110, 168, 23);

        jLabel6.setFont(new java.awt.Font("Product Sans", 3, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Password");
        add(jLabel6);
        jLabel6.setBounds(550, 190, 81, 23);

        jLabel7.setFont(new java.awt.Font("Product Sans", 3, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Confirm Password");
        add(jLabel7);
        jLabel7.setBounds(550, 270, 153, 23);

        jTextField2.setFont(new java.awt.Font("Product Sans", 3, 14)); // NOI18N
        add(jTextField2);
        jTextField2.setBounds(550, 460, 306, 33);

        jPasswordField1.setFont(new java.awt.Font("Product Sans", 3, 14)); // NOI18N
        add(jPasswordField1);
        jPasswordField1.setBounds(550, 300, 306, 32);

        jTextField3.setFont(new java.awt.Font("Product Sans", 3, 14)); // NOI18N
        add(jTextField3);
        jTextField3.setBounds(550, 380, 306, 33);

        jTextField4.setFont(new java.awt.Font("Product Sans", 3, 14)); // NOI18N
        add(jTextField4);
        jTextField4.setBounds(550, 140, 306, 33);

        jTextField5.setFont(new java.awt.Font("Product Sans", 3, 14)); // NOI18N
        add(jTextField5);
        jTextField5.setBounds(550, 540, 306, 33);

        jPasswordField2.setFont(new java.awt.Font("Product Sans", 3, 14)); // NOI18N
        add(jPasswordField2);
        jPasswordField2.setBounds(550, 220, 306, 32);

        jButton1.setBackground(new java.awt.Color(51, 204, 255));
        jButton1.setFont(new java.awt.Font("Product Sans", 3, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("LETS CODE");
        jButton1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        add(jButton1);
        jButton1.setBounds(630, 610, 168, 42);

        jLabel8.setIcon(new javax.swing.ImageIcon("C:\\Users\\Namit\\Desktop\\Sem_2\\Object_Oriented_Programming\\OOP Final Project Files\\Images OOP Project\\color3.png")); // NOI18N
        jLabel8.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white));
        add(jLabel8);
        jLabel8.setBounds(500, 40, 410, 640);

        jLabel12.setIcon(new javax.swing.ImageIcon("C:\\Users\\Namit\\Desktop\\Sem_2\\Object_Oriented_Programming\\OOP Final Project Files\\Images OOP Project\\newnwew.png")); // NOI18N
        jLabel12.setText("jLabel12");
        add(jLabel12);
        jLabel12.setBounds(-830, -10, 1850, 750);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        Connection con = null;
	try
	{
		Class.forName("com.mysql.jdbc.Driver");
		con = DriverManager.getConnection(JDBC_Connection.connectionAddress,JDBC_Connection.userName,JDBC_Connection.password);
		//id1101599_db2         
		Statement stat = con.createStatement();
                
                String usname = jTextField4.getText();
                String passone = jPasswordField1.getText();
                String passtwo = jPasswordField2.getText();
                String email = jTextField3.getText();
                String bday = jTextField2.getText();
                String type = jTextField5.getText();
                String insertString="INSERT INTO user VALUES ('" + usname + "','" + passone + "','" + email + "','" + bday + "','" + type + "')";
		System.out.println(insertString);
		int i = stat.executeUpdate (insertString);
		System.out.println("Return value from executeUpdate" + i);
			
			//con.commit();
		stat.close();
		con.close();
		}catch (Exception e)
		{
			System.out.println("Exception caught --> " + e);
		}
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JPasswordField jPasswordField2;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    // End of variables declaration//GEN-END:variables
}