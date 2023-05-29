import Dates.Getdate;
import SQL_Connector.Connector;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.Random;
import javax.swing.JOptionPane;

public class RETURN_BOOKS extends javax.swing.JFrame {

    /**
     * Creates new form update_delete
     */
    int validate_veriable = 0;
    
    public RETURN_BOOKS() {
        initComponents();
        
        fine_panel.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        LMI = new javax.swing.JLabel();
        name = new javax.swing.JLabel();
        CA = new javax.swing.JLabel();
        arrear = new javax.swing.JLabel();
        LD = new javax.swing.JTextField();
        n = new javax.swing.JTextField();
        cardA = new javax.swing.JTextField();
        arr = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jDesktopPane1 = new javax.swing.JDesktopPane();
        jPanel3 = new javax.swing.JPanel();
        ID_member = new javax.swing.JLabel();
        name_member = new javax.swing.JLabel();
        current_book = new javax.swing.JLabel();
        availability = new javax.swing.JLabel();
        Imember = new javax.swing.JTextField();
        nmember = new javax.swing.JTextField();
        book_current = new javax.swing.JTextField();
        available = new javax.swing.JTextField();
        fine_panel = new javax.swing.JPanel();
        fine = new javax.swing.JLabel();
        fines = new javax.swing.JTextField();
        ok = new javax.swing.JButton();

        jPanel2.setBorder(new javax.swing.border.MatteBorder(null));

        LMI.setFont(new java.awt.Font("UD Digi Kyokasho NK-B", 1, 18)); // NOI18N
        LMI.setForeground(new java.awt.Color(0, 0, 153));
        LMI.setText("LIBRARY MEMBERSHIP ID");

        name.setFont(new java.awt.Font("UD Digi Kyokasho NK-B", 1, 18)); // NOI18N
        name.setForeground(new java.awt.Color(51, 0, 153));
        name.setText("NAME");

        CA.setFont(new java.awt.Font("UD Digi Kyokasho NK-B", 1, 18)); // NOI18N
        CA.setForeground(new java.awt.Color(51, 0, 153));
        CA.setText("CARD AVAILABILITY");

        arrear.setFont(new java.awt.Font("UD Digi Kyokasho NK-B", 1, 18)); // NOI18N
        arrear.setForeground(new java.awt.Color(0, 0, 153));
        arrear.setText("ARREARS");

        LD.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                LDKeyReleased(evt);
            }
        });

        n.setEditable(false);
        n.setBackground(new java.awt.Color(255, 255, 255));

        cardA.setEditable(false);
        cardA.setBackground(new java.awt.Color(255, 255, 255));
        cardA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cardAActionPerformed(evt);
            }
        });

        arr.setEditable(false);
        arr.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(68, 68, 68)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(LMI, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addComponent(LD, javax.swing.GroupLayout.DEFAULT_SIZE, 241, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(name, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(CA, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 255, Short.MAX_VALUE)
                            .addComponent(arrear, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(42, 42, 42)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(n, javax.swing.GroupLayout.DEFAULT_SIZE, 241, Short.MAX_VALUE)
                            .addComponent(cardA, javax.swing.GroupLayout.DEFAULT_SIZE, 241, Short.MAX_VALUE)
                            .addComponent(arr, javax.swing.GroupLayout.DEFAULT_SIZE, 241, Short.MAX_VALUE))))
                .addGap(202, 202, 202))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(LD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LMI))
                .addGap(10, 10, 10)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(name)
                    .addComponent(n, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CA)
                    .addComponent(cardA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(arr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(arrear))
                .addGap(20, 20, 20))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Yu Gothic Medium", 0, 18)); // NOI18N
        jLabel1.setText("RETURN BOOKS");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 20, 140, 30));

        jLabel9.setFont(new java.awt.Font("Yu Gothic Medium", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/sltc.PNG"))); // NOI18N
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -10, -1, 170));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(153, 255, 255));
        jLabel10.setText("LIBRARY MANAGEMENT SYSTEM");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 490, 400, 40));

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Capture_6.PNG"))); // NOI18N
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 150, 250, 280));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/minimalistic-wallpapers-collection-themefoxx (124).jpg"))); // NOI18N
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 450, 590));

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        getContentPane().add(jDesktopPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 260, -1, -1));

        jPanel3.setBorder(new javax.swing.border.MatteBorder(null));

        ID_member.setFont(new java.awt.Font("UD Digi Kyokasho NK-B", 1, 18)); // NOI18N
        ID_member.setForeground(new java.awt.Color(0, 0, 153));
        ID_member.setText("MEMBERSHIP ID");

        name_member.setFont(new java.awt.Font("UD Digi Kyokasho NK-B", 1, 18)); // NOI18N
        name_member.setForeground(new java.awt.Color(51, 0, 153));
        name_member.setText("NAME");

        current_book.setFont(new java.awt.Font("UD Digi Kyokasho NK-B", 1, 18)); // NOI18N
        current_book.setForeground(new java.awt.Color(51, 0, 153));
        current_book.setText("CURRENT BOOK");

        availability.setFont(new java.awt.Font("UD Digi Kyokasho NK-B", 1, 18)); // NOI18N
        availability.setForeground(new java.awt.Color(0, 0, 153));
        availability.setText("STATUS");

        Imember.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ImemberActionPerformed(evt);
            }
        });
        Imember.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                ImemberKeyReleased(evt);
            }
        });

        nmember.setEditable(false);
        nmember.setBackground(new java.awt.Color(255, 255, 255));

        book_current.setEditable(false);
        book_current.setBackground(new java.awt.Color(255, 255, 255));
        book_current.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                book_currentActionPerformed(evt);
            }
        });

        available.setEditable(false);
        available.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(name_member, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(current_book, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(availability, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(34, 34, 34)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(book_current, javax.swing.GroupLayout.DEFAULT_SIZE, 349, Short.MAX_VALUE)
                            .addComponent(nmember)
                            .addComponent(available)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(ID_member, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(Imember)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Imember, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ID_member))
                .addGap(11, 11, 11)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(name_member)
                    .addComponent(nmember, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(current_book)
                    .addComponent(book_current, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(7, 7, 7)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(available, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(availability))
                .addGap(21, 21, 21))
        );

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 100, 660, -1));

        fine_panel.setBorder(new javax.swing.border.MatteBorder(null));

        fine.setFont(new java.awt.Font("UD Digi Kyokasho NK-B", 1, 18)); // NOI18N
        fine.setForeground(new java.awt.Color(51, 0, 153));
        fine.setText("FINES");

        fines.setEditable(false);
        fines.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                finesActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout fine_panelLayout = new javax.swing.GroupLayout(fine_panel);
        fine_panel.setLayout(fine_panelLayout);
        fine_panelLayout.setHorizontalGroup(
            fine_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fine_panelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(fine, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(fines, javax.swing.GroupLayout.DEFAULT_SIZE, 348, Short.MAX_VALUE)
                .addContainerGap())
        );
        fine_panelLayout.setVerticalGroup(
            fine_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fine_panelLayout.createSequentialGroup()
                .addGap(0, 2, Short.MAX_VALUE)
                .addGroup(fine_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(fine)
                    .addGroup(fine_panelLayout.createSequentialGroup()
                        .addComponent(fines, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(1, 1, 1))))
        );

        getContentPane().add(fine_panel, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 330, 660, 30));

        ok.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        ok.setText("DONE");
        ok.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                okActionPerformed(evt);
            }
        });
        getContentPane().add(ok, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 460, -1, 50));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void LDKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_LDKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_LDKeyReleased

    private void cardAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cardAActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cardAActionPerformed

    private void ImemberKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ImemberKeyReleased
        // TODO add your handling code here:
        get_data(Imember.getText());
        get_l_details(Imember.getText());
    }//GEN-LAST:event_ImemberKeyReleased

    private void book_currentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_book_currentActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_book_currentActionPerformed

    private void finesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_finesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_finesActionPerformed

    private void ImemberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ImemberActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ImemberActionPerformed

    private void okActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_okActionPerformed
        // TODO add your handling code here:
        Return_Books();
    }//GEN-LAST:event_okActionPerformed

    public void get_data(String id)
    {
        Integer mid = Integer.valueOf(id);
        
        get_status(id);
        
        String SQL = "SELECT * FROM members WHERE Membership_ID = "+id+"";
        
         java.sql.Connection connection = Connector.connection();
         
         try
         {
            Statement stmt = connection.createStatement();
            
            ResultSet rs = stmt.executeQuery(SQL);
            
            while(rs.next())
            {
                nmember.setText(rs.getString("MEMBER_NAME"));
            }
         }
                
         catch(Exception ERROR)
         {
             System.out.println(ERROR);
         }
    
    }
    
    public void get_details(String id)
    {
        Integer mid = Integer.valueOf(id);
        
        String SQL = "SELECT * FROM lend_books WHERE Membership_ID = "+id+"";
        
         java.sql.Connection connection = Connector.connection();
         
         try
         {
            Statement stmt = connection.createStatement();
            
            ResultSet rs = stmt.executeQuery(SQL);
            
            while(rs.next())
            {
                nmember.setText(rs.getString("MEMBER_NAME"));
            }
         }
                
         catch(Exception ERROR)
         {
             System.out.println(ERROR);
         }
    
    }
    
    public void get_l_details(String id)
    {
        Integer mid = Integer.valueOf(id);
        
        String SQL = "SELECT * FROM lend_books WHERE Membership_ID = "+id+"";
        
         java.sql.Connection connection = Connector.connection();
         
         try
         {
            Statement stmt = connection.createStatement();
            
            ResultSet rs = stmt.executeQuery(SQL);
            
            while(rs.next())
            {
                book_current.setText(rs.getString("BOOK_NAME"));
            }
         }
                
         catch(Exception ERROR)
         {
             System.out.println(ERROR);
         }
    
    }
    
    public void Return_Books()
    {
        Random rand = new Random();
        
        int maxNumber = 100000;
        
        int randomNumber = rand.nextInt(maxNumber) + 1;

        String RID = String.valueOf(randomNumber);
                
        
        String membership_ID = Imember.getText();
        
        String book_name = book_current.getText();
        
        String return_date = Getdate.today();
        
        int status = validate_veriable;
        
        String Fine = fines.getText();
        
        
        
        java.sql.Connection connection = Connector.connection();
        
        String SQL = "INSERT INTO return_table VALUES ('"+RID+"','"+return_date+"','"+membership_ID+"','"+book_name+"',"+Fine+","+status+") ";
        
        String query = "DELETE FROM lend_books WHERE MEMBERSHIP_ID = "+Imember.getText()+";";
        
        System.out.println(SQL);
        
        
        try
        {
           PreparedStatement preparedStatement = connection.prepareStatement(SQL);

           preparedStatement.executeUpdate();
           
           PreparedStatement preparedStatement2 = connection.prepareStatement(query);

           preparedStatement2.executeUpdate();
           
           System.out.println("Data Insert Successfully !!");
           
           String message = "You Just Returned A Book : "+book_current.getText()+"<br><br> Notes : "+available.getText()+"<br><br> Fine : LKR "+fines.getText()+".";
           
           get_mail_address.extract_emails(membership_ID, "BOOK RETURNING NOTIFICATION", message);
           
           
           JOptionPane.showMessageDialog(null,"Book Returned Successfully !!! You can lend another book !!!!");

        }
        catch(Exception error)
        {
            System.out.println("ERROR CODE : "+error);
            
            JOptionPane.showMessageDialog(null,"Attempt Unsuccessful");
        }
           
    }
    
    public void get_status(String id)
    {
        int validator = date_validator.get_return_date(id);
        
        if(validator == 0)
        {
            available.setText("Today is the deadline!!!!");  
            
            validate_veriable = 0;
        }
        if(validator > 0)
        {
            available.setText(validator+" Days Remain");
            
            validate_veriable = 0;
        }
        else
        {
            int late_dates = Math.abs(validator);
            available.setText(late_dates+" Days Overdue!!!!");
            fine_panel.setVisible(true);
            
            fines.setText(String.valueOf(late_dates*50));
            
            validate_veriable = 1;
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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(RETURN_BOOKS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RETURN_BOOKS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RETURN_BOOKS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RETURN_BOOKS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RETURN_BOOKS().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel CA;
    private javax.swing.JLabel ID_member;
    private javax.swing.JTextField Imember;
    private javax.swing.JTextField LD;
    private javax.swing.JLabel LMI;
    private javax.swing.JTextField arr;
    private javax.swing.JLabel arrear;
    private javax.swing.JLabel availability;
    private javax.swing.JTextField available;
    private javax.swing.JTextField book_current;
    private javax.swing.JTextField cardA;
    private javax.swing.JLabel current_book;
    private javax.swing.JLabel fine;
    private javax.swing.JPanel fine_panel;
    private javax.swing.JTextField fines;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTextField n;
    private javax.swing.JLabel name;
    private javax.swing.JLabel name_member;
    private javax.swing.JTextField nmember;
    private javax.swing.JButton ok;
    // End of variables declaration//GEN-END:variables
}