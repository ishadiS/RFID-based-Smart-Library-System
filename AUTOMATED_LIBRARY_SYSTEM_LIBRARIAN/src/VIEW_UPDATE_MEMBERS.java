

import Dates.Getdate;
import SQL_Connector.Connector;
import java.awt.Toolkit;
import java.awt.event.WindowEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author user
 */
public class VIEW_UPDATE_MEMBERS extends javax.swing.JFrame {

    /**
     * Creates new form ab
     */
    public VIEW_UPDATE_MEMBERS() 
    {
        initComponents();
        
        get_Table();
        
        fine_panel.setVisible(false);
    }
    
    
    
    
    public void get_Table()
    {
        java.sql.Connection connection = Connector.connection();
        
        String SQL = "SELECT * FROM members";
        
        try
        {
            Statement stmt = connection.createStatement();
            
            ResultSet rs = stmt.executeQuery(SQL);
            
            jTable1.setModel(DbUtils.resultSetToTableModel(rs));
        }
        catch(SQLException ERROR)
        {
            System.out.println(ERROR);
        }
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        search = new javax.swing.JLabel();
        s = new javax.swing.JTextField();
        jComboBox1 = new javax.swing.JComboBox<>();
        fine_panel = new javax.swing.JPanel();
        tax = new javax.swing.JLabel();
        arrear = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        membership = new javax.swing.JLabel();
        member_ID = new javax.swing.JTextField();
        sltc_index = new javax.swing.JLabel();
        SI = new javax.swing.JTextField();
        member_name = new javax.swing.JLabel();
        name = new javax.swing.JTextField();
        contact_number = new javax.swing.JLabel();
        number = new javax.swing.JTextField();
        email_address = new javax.swing.JLabel();
        email = new javax.swing.JTextField();
        card = new javax.swing.JLabel();
        available = new javax.swing.JTextField();
        NIC_num = new javax.swing.JLabel();
        NICN = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        up = new javax.swing.JButton();
        done = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/sltc.PNG"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 299, 139));

        jLabel2.setFont(new java.awt.Font("Trebuchet MS", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("VIEW & UPDATE MEMBERS");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(404, 0, -1, 61));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/V_MEM.PNG"))); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(555, 67, 161, -1));

        search.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        search.setForeground(new java.awt.Color(204, 204, 204));
        search.setText("SEARCH");
        getContentPane().add(search, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 167, 150, -1));

        s.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sActionPerformed(evt);
            }
        });
        s.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                sKeyReleased(evt);
            }
        });
        getContentPane().add(s, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 170, 261, -1));

        jComboBox1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Search by Membership ID", "Search by SLTC Index", "Search by Name" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });
        getContentPane().add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 160, 150, 35));

        tax.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        tax.setText("FINES");

        arrear.setEditable(false);

        javax.swing.GroupLayout fine_panelLayout = new javax.swing.GroupLayout(fine_panel);
        fine_panel.setLayout(fine_panelLayout);
        fine_panelLayout.setHorizontalGroup(
            fine_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fine_panelLayout.createSequentialGroup()
                .addComponent(tax, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                .addComponent(arrear, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        fine_panelLayout.setVerticalGroup(
            fine_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fine_panelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(fine_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(arrear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tax))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(fine_panel, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 450, 460, 40));

        membership.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        membership.setText("MEMBERSHIP ID");

        member_ID.setEditable(false);
        member_ID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                member_IDActionPerformed(evt);
            }
        });

        sltc_index.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        sltc_index.setText("SLTC INDEX");

        SI.setEditable(false);

        member_name.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        member_name.setText("NAME");

        name.setEditable(false);
        name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameActionPerformed(evt);
            }
        });

        contact_number.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        contact_number.setText("CONTACT NUMBER");

        email_address.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        email_address.setText("EMAIL ADDRESS");

        card.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        card.setText("CARD AVAILABILITY");

        available.setEditable(false);

        NIC_num.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        NIC_num.setText("NIC NUMBER");

        NICN.setEditable(false);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(membership, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31)
                        .addComponent(member_ID, javax.swing.GroupLayout.DEFAULT_SIZE, 267, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(sltc_index, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31)
                        .addComponent(SI))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(member_name, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31)
                        .addComponent(name))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(card, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31)
                        .addComponent(available))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(email_address, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31)
                        .addComponent(email))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(contact_number, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31)
                        .addComponent(number)))
                .addGap(10, 10, 10))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(NIC_num, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(NICN)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(membership, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(member_ID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SI, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sltc_index, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(member_name, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NIC_num, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(NICN, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(number, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(contact_number, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(email, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(email_address, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(card, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(available, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 213, 460, 230));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Membership  ID", "SLTC Index", "Name", "Email Address"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 150, -1, -1));

        up.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        up.setForeground(new java.awt.Color(0, 102, 102));
        up.setText("UPDATE");
        up.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                upActionPerformed(evt);
            }
        });
        getContentPane().add(up, new org.netbeans.lib.awtextra.AbsoluteConstraints(47, 541, 120, 33));

        done.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        done.setForeground(new java.awt.Color(0, 102, 102));
        done.setText("DONE");
        done.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                doneActionPerformed(evt);
            }
        });
        getContentPane().add(done, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 541, 95, 33));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(153, 255, 255));
        jLabel6.setText("LIBRARY MANAGEMENT SYSTEM");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(24, 606, 468, 51));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/minimalistic-wallpapers-collection-themefoxx (124).jpg"))); // NOI18N
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1080, 660));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void member_IDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_member_IDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_member_IDActionPerformed

    private void nameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nameActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void doneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_doneActionPerformed
        // TODO add your handling code here:
        close_window();  
    }//GEN-LAST:event_doneActionPerformed

    private void upActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_upActionPerformed
        // TODO add your handling code here:
        Update_data();
        new HOME_PAGE().setVisible(true);
    }//GEN-LAST:event_upActionPerformed

    private void sKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_sKeyReleased
        // TODO add your handling code here:
         get_data(s.getText());
         
    }//GEN-LAST:event_sKeyReleased

    private void sActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_sActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here:
        int row = jTable1.getSelectedRow();
        
        String ID = jTable1.getValueAt(row,0).toString();
        
        System.out.println(ID);
        
        s.setText(ID);
        
        
        get_data(ID);  
    }//GEN-LAST:event_jTable1MouseClicked
    public void close_window()
    {
        WindowEvent new_event;
        
        new_event = new WindowEvent(this,WindowEvent.WINDOW_CLOSING);
        
        Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(new_event);
    }
    
    public void get_data(String id)
    {
        Integer mid = Integer.valueOf(id);
        
        get_status(id);
        
        fine_handler(id);
                
        String SQL = "SELECT * FROM members WHERE Membership_ID = "+id+"";
        
         java.sql.Connection connection = Connector.connection();
         
         try
         {
            Statement stmt = connection.createStatement();
            
            ResultSet rs = stmt.executeQuery(SQL);
            
            while(rs.next())
            {
                member_ID.setText(rs.getString("Membership_ID"));
                
                SI.setText(rs.getString("SLTC_INDEX"));
            
                name.setText(rs.getString("MEMBER_NAME"));
                
                NICN.setText(rs.getString("NIC_NUMBER"));
                
                number.setText(rs.getString("CONTACT_NUMBER"));
                
                email.setText(rs.getString("EMAIL_ADDRESS"));
                      
            }
            
           
         }
         catch(Exception ERROR)
         {
             System.out.println(ERROR);
         }
    
    }
    
   
    public void Update_data()
    {
        
        String contact_number = number.getText();
        
        String email_address = email.getText();
        
        java.sql.Connection connection = Connector.connection();
        
        String SQL = "UPDATE members SET CONTACT_NUMBER = '"+contact_number+"',  EMAIL_ADDRESS = '"+email_address+"' WHERE MEMBERSHIP_ID = "+Integer.valueOf(member_ID.getText())+" ";
        
        
        try
        {
           PreparedStatement preparedStatement = connection.prepareStatement(SQL);

           preparedStatement.executeUpdate(SQL);
           
           System.out.println("Data Updated Successfully !!");
           
           JOptionPane.showMessageDialog(null,"Updated Member Details Successfully !!");

        }
        catch(Exception error)
        {
            System.out.println("ERROR CODE : "+error);
            
            JOptionPane.showMessageDialog(null,"ERROR CODE : "+error);
        }
       
        
        
        
    }
    
    
    public void get_status(String id)
    {
        int validator = date_validator.get_return_date(id);
        
        if(validator == 0)
        {
           
         
          
           
        }
        if(validator > 0)
        {
           
           
            
        }
        else
        {
            int late_dates = Math.abs(validator);
            
          
             
            arrear.setText(String.valueOf(late_dates*50));
            
            
        }
        
    }
   
    public void fine_handler(String card_ID)
    {
        Integer card_holder = Integer.valueOf(card_ID);
        
        int return_value = book_valid.validation_lending(card_holder);
        
        
        if(return_value == 0)
        {
            fine_panel.setVisible(false);
            available.setText("Card Available");  
        }
        else
        {
            fine_panel.setVisible(true);
            available.setText("Card Unvailable");  
        }
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
            java.util.logging.Logger.getLogger(VIEW_UPDATE_MEMBERS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VIEW_UPDATE_MEMBERS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VIEW_UPDATE_MEMBERS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VIEW_UPDATE_MEMBERS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VIEW_UPDATE_MEMBERS().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField NICN;
    private javax.swing.JLabel NIC_num;
    private javax.swing.JTextField SI;
    private javax.swing.JTextField arrear;
    private javax.swing.JTextField available;
    private javax.swing.JLabel card;
    private javax.swing.JLabel contact_number;
    private javax.swing.JButton done;
    private javax.swing.JTextField email;
    private javax.swing.JLabel email_address;
    private javax.swing.JPanel fine_panel;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField member_ID;
    private javax.swing.JLabel member_name;
    private javax.swing.JLabel membership;
    private javax.swing.JTextField name;
    private javax.swing.JTextField number;
    private javax.swing.JTextField s;
    private javax.swing.JLabel search;
    private javax.swing.JLabel sltc_index;
    private javax.swing.JLabel tax;
    private javax.swing.JButton up;
    // End of variables declaration//GEN-END:variables
}
