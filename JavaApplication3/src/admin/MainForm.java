/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package admin;

import javax.swing.DefaultComboBoxModel;
import login.SignIn;
import sqliteAdmin.event;



/**
 *
 * @author Admin
 */
public class MainForm extends javax.swing.JFrame {




  public String eventname;
    
    public MainForm() {
        System.out.print(eventname);
        initComponents();
         jScrollPane1.setViewportView(new dashboard());
       DefaultComboBoxModel<String> model = (DefaultComboBoxModel<String>) cbprofile.getModel();
       

      
         
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        drawerpanel = new javax.swing.JPanel();
        btndashboard = new customGUI.MyButton();
        btnaccounts = new customGUI.MyButton();
        btnInHistory = new customGUI.MyButton();
        btnmenu = new customGUI.MyButton();
        btnInHistory1 = new customGUI.MyButton();
        headerpanel = new javax.swing.JPanel();
        headerpanel1 = new javax.swing.JPanel();
        profilepicture = new javax.swing.JLabel();
        cbprofile = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(298, 750));
        setSize(new java.awt.Dimension(0, 0));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        drawerpanel.setBackground(new java.awt.Color(39, 159, 217));
        drawerpanel.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N

        btndashboard.setBackground(new java.awt.Color(39, 159, 217));
        btndashboard.setText("DashBoard");
        btndashboard.setBorderColor(new java.awt.Color(39, 159, 217));
        btndashboard.setColor(new java.awt.Color(39, 159, 217));
        btndashboard.setCustomIcon1(new javax.swing.ImageIcon(System.getProperty("user.dir") + "\\src\\image\\3669170_home_ic_icon.png"));
        btndashboard.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        btndashboard.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btndashboardActionPerformed(evt);
            }
        });

        btnaccounts.setBackground(new java.awt.Color(39, 159, 217));
        btnaccounts.setText("Accounts");
        btnaccounts.setBorderColor(new java.awt.Color(39, 159, 217));
        btnaccounts.setColor(new java.awt.Color(39, 159, 217));
        btnaccounts.setCustomIcon1(new javax.swing.ImageIcon(System.getProperty("user.dir")+"\\src\\image\\accounts.png"));
        btnaccounts.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        btnaccounts.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnaccountsActionPerformed(evt);
            }
        });

        btnInHistory.setBackground(new java.awt.Color(39, 159, 217));
        btnInHistory.setText("In/Out History");
        btnInHistory.setBorderColor(new java.awt.Color(39, 159, 217));
        btnInHistory.setColor(new java.awt.Color(39, 159, 217));
        btnInHistory.setCustomIcon1(new javax.swing.ImageIcon(System.getProperty("user.dir") + "\\src\\image\\8111410_history_time_clock_watch_timer_icon.png"));
        btnInHistory.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        btnInHistory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInHistoryActionPerformed(evt);
            }
        });

        btnmenu.setBackground(new java.awt.Color(39, 159, 217));
        btnmenu.setIcon(new javax.swing.ImageIcon(System.getProperty("user.dir")+"\\src\\image\\657904_hamburger_menu_move handle_order_icon.png"));
        btnmenu.setBorderColor(new java.awt.Color(39, 159, 217));
        btnmenu.setColor(new java.awt.Color(39, 159, 217));
        btnmenu.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N

        btnInHistory1.setBackground(new java.awt.Color(39, 159, 217));
        btnInHistory1.setText("Events");
        btnInHistory1.setBorderColor(new java.awt.Color(39, 159, 217));
        btnInHistory1.setColor(new java.awt.Color(39, 159, 217));
        btnInHistory1.setCustomIcon1(new javax.swing.ImageIcon(System.getProperty("user.dir") + "\\src\\image\\calendars.png"));
        btnInHistory1.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        btnInHistory1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInHistory1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout drawerpanelLayout = new javax.swing.GroupLayout(drawerpanel);
        drawerpanel.setLayout(drawerpanelLayout);
        drawerpanelLayout.setHorizontalGroup(
            drawerpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btndashboard, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnaccounts, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnInHistory, javax.swing.GroupLayout.DEFAULT_SIZE, 182, Short.MAX_VALUE)
            .addGroup(drawerpanelLayout.createSequentialGroup()
                .addComponent(btnmenu, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addComponent(btnInHistory1, javax.swing.GroupLayout.DEFAULT_SIZE, 182, Short.MAX_VALUE)
        );
        drawerpanelLayout.setVerticalGroup(
            drawerpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(drawerpanelLayout.createSequentialGroup()
                .addComponent(btnmenu, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addComponent(btndashboard, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnaccounts, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnInHistory, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnInHistory1, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        headerpanel.setBackground(java.awt.Color.white);

        headerpanel1.setBackground(java.awt.Color.white);
        java.awt.FlowLayout flowLayout2 = new java.awt.FlowLayout(java.awt.FlowLayout.TRAILING, 0, 0);
        flowLayout2.setAlignOnBaseline(true);
        headerpanel1.setLayout(flowLayout2);

        profilepicture.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        profilepicture.setMaximumSize(new java.awt.Dimension(40, 40));
        profilepicture.setMinimumSize(new java.awt.Dimension(40, 40));
        profilepicture.setPreferredSize(new java.awt.Dimension(40, 40));
        headerpanel1.add(profilepicture);

        cbprofile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbprofileActionPerformed(evt);
            }
        });
        headerpanel1.add(cbprofile);
        cbprofile.setBackground(new java.awt.Color(0,0,0,0));

        javax.swing.GroupLayout headerpanelLayout = new javax.swing.GroupLayout(headerpanel);
        headerpanel.setLayout(headerpanelLayout);
        headerpanelLayout.setHorizontalGroup(
            headerpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headerpanelLayout.createSequentialGroup()
                .addGap(982, 982, 982)
                .addComponent(headerpanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 147, Short.MAX_VALUE))
        );
        headerpanelLayout.setVerticalGroup(
            headerpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(headerpanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        jScrollPane1.setPreferredSize(new java.awt.Dimension(1106, 671));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(drawerpanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(headerpanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(drawerpanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(headerpanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 710, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btndashboardActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btndashboardActionPerformed
          jScrollPane1.setViewportView(new dashboard());
      

    }//GEN-LAST:event_btndashboardActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
   
    }//GEN-LAST:event_formWindowClosing

    private void btnaccountsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnaccountsActionPerformed
        jScrollPane1.setViewportView(new Accounts());
    }//GEN-LAST:event_btnaccountsActionPerformed

    private void btnInHistoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInHistoryActionPerformed
   jScrollPane1.setViewportView(new InOutAccounts());     
    }//GEN-LAST:event_btnInHistoryActionPerformed

    private void btnInHistory1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInHistory1ActionPerformed
   jScrollPane1.setViewportView(new Events());
    }//GEN-LAST:event_btnInHistory1ActionPerformed

    private void cbprofileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbprofileActionPerformed
          if(cbprofile.getSelectedItem() == "Logout"){
            dispose();
          new SignIn().setVisible(true);
           cbprofile.setSelectedIndex(0);
        }
        if(cbprofile.getSelectedItem() == "Setting"){
             String username = (String) cbprofile.getItemAt(0);
         new sqliteAdmin.accountsettings().fetchuserData(username);
           cbprofile.setSelectedIndex(0);
        }
    }//GEN-LAST:event_cbprofileActionPerformed

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
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private customGUI.MyButton btnInHistory;
    private customGUI.MyButton btnInHistory1;
    private customGUI.MyButton btnaccounts;
    private customGUI.MyButton btndashboard;
    private customGUI.MyButton btnmenu;
    public javax.swing.JComboBox<String> cbprofile;
    private javax.swing.JPanel drawerpanel;
    private javax.swing.JPanel headerpanel;
    private javax.swing.JPanel headerpanel1;
    public javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JLabel profilepicture;
    // End of variables declaration//GEN-END:variables
}
