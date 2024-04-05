/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UserInterface.admin;

import UserInterface.CustomComponents.MyTable;
import UserInterface.CustomComponents.MyTextField;
import java.util.ArrayList;
import java.util.Arrays;
import javax.swing.JOptionPane;
import Database.Admin.adminSqlite;
import Database.Admin.event;


/**
 *
 * @author Admin
 */
public class Events extends javax.swing.JPanel {

    /**
     * Creates new form dashboard
     */
    public Events() {
        initComponents();
     txtdate.getComponentDateTextField().setEnabled(false);
     txttimeout.getComponentTimeTextField().setEnabled(false);
     txttimein.getComponentTimeTextField().setEnabled(false);
     
     txttimeout.getComponentIncreaseSpinnerButton().setVisible(true);
     txttimeout.getComponentDecreaseSpinnerButton().setVisible(true);
     txttimeout.getComponentDecreaseSpinnerButton().setFocusable(false);
     txttimeout.getComponentIncreaseSpinnerButton().setFocusable(false);
     
     txttimein.getComponentIncreaseSpinnerButton().setVisible(true);
     txttimein.getComponentDecreaseSpinnerButton().setVisible(true);
     txttimein.getComponentDecreaseSpinnerButton().setFocusable(false);
     txttimein.getComponentIncreaseSpinnerButton().setFocusable(false);
     new event().displaydata(events);
     holder.setVisible(false);
     txtdate.getComponentPopupMenu();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        txteventname = new UserInterface.CustomComponents.MyTextField();
        lbldesign1 = new javax.swing.JLabel();
        lbldesignyear1 = new javax.swing.JLabel();
        lbldesignyear2 = new javax.swing.JLabel();
        lbldesignyear3 = new javax.swing.JLabel();
        txtdate = new com.github.lgooddatepicker.components.DatePicker();
        txttimeout = new com.github.lgooddatepicker.components.TimePicker();
        txttimein = new com.github.lgooddatepicker.components.TimePicker();
        btnadd = new UserInterface.CustomComponents.MyButton();
        btndelete = new UserInterface.CustomComponents.MyButton();
        holder = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        accounttable = new UserInterface.CustomComponents.MyTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        events = new UserInterface.CustomComponents.MyTable();

        setBackground(new java.awt.Color(181, 181, 181));

        jPanel3.setBackground(new java.awt.Color(181, 181, 181));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel2.setLayout(null);

        txteventname.setText("Event Name");
        txteventname.setBackground(new java.awt.Color(0, 0, 0,0));
        txteventname.setBorderColor(new java.awt.Color(230, 245, 241));
        txteventname.setCustomIcon1(new javax.swing.ImageIcon(System.getProperty("user.dir")+"\\src\\image\\11185794_user_person_profile_avatar_people_icon (1).png"));
        txteventname.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txteventnameFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txteventnameFocusLost(evt);
            }
        });
        jPanel2.add(txteventname);
        txteventname.setBounds(10, 20, 320, 40);

        lbldesign1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lbldesign1.setForeground(java.awt.Color.black);
        lbldesign1.setText("Event Name:");
        jPanel2.add(lbldesign1);
        lbldesign1.setBounds(10, 0, 80, 16);

        lbldesignyear1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lbldesignyear1.setForeground(java.awt.Color.black);
        lbldesignyear1.setText("Date");
        jPanel2.add(lbldesignyear1);
        lbldesignyear1.setBounds(10, 60, 40, 16);

        lbldesignyear2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lbldesignyear2.setForeground(java.awt.Color.black);
        lbldesignyear2.setText("Time in");
        jPanel2.add(lbldesignyear2);
        lbldesignyear2.setBounds(370, 0, 90, 16);

        lbldesignyear3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lbldesignyear3.setForeground(java.awt.Color.black);
        lbldesignyear3.setText("Time Out");
        jPanel2.add(lbldesignyear3);
        lbldesignyear3.setBounds(550, 0, 90, 16);
        jPanel2.add(txtdate);
        txtdate.setBounds(10, 80, 320, 40);
        jPanel2.add(txttimeout);
        txttimeout.setBounds(550, 20, 140, 40);
        jPanel2.add(txttimein);
        txttimein.setBounds(360, 20, 150, 40);

        btnadd.setText("ADD");
        btnadd.setRadius(30);
        btnadd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnaddActionPerformed(evt);
            }
        });
        jPanel2.add(btnadd);
        btnadd.setBounds(720, 110, 69, 26);

        btndelete.setText("DELETE");
        btndelete.setRadius(30);
        btndelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btndeleteActionPerformed(evt);
            }
        });
        jPanel2.add(btndelete);
        btndelete.setBounds(650, 110, 69, 26);
        jPanel2.add(holder);
        holder.setBounds(80, 0, 160, 20);

        accounttable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Id", "Student Id", "Name", "Department", "Year"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(accounttable);
        if (accounttable.getColumnModel().getColumnCount() > 0) {
            accounttable.getColumnModel().getColumn(0).setHeaderValue("Id");
            accounttable.getColumnModel().getColumn(1).setHeaderValue("Student Id");
            accounttable.getColumnModel().getColumn(4).setHeaderValue("Year");
        }

        events.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Event", "Date"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        events.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                eventsMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(events);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 850, Short.MAX_VALUE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(48, 48, 48)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 665, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1106, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 671, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txteventnameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txteventnameFocusGained
       new MyTextField().focuseGained(txteventname, "Event Name");
    }//GEN-LAST:event_txteventnameFocusGained

    private void txteventnameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txteventnameFocusLost
        new MyTextField().focusLost(txteventname, "Event Name");
    }//GEN-LAST:event_txteventnameFocusLost

    private void btnaddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnaddActionPerformed
      ArrayList<Object> addevents = new ArrayList<>();
      addevents.addAll(Arrays.asList(txtdate.getText(),txteventname.getText(),txttimein.getText().toUpperCase(),txttimeout.getText().toUpperCase()));
      
        new event().addevent(addevents,events);


    }//GEN-LAST:event_btnaddActionPerformed

    private void eventsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_eventsMouseClicked
       new event().getEventData(events, accounttable);
           String date =events.getModel().getValueAt(events.getSelectedRow(), 1).toString();    
           holder.setText(date);
           
           

    }//GEN-LAST:event_eventsMouseClicked

    private void btndeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btndeleteActionPerformed
        int choose = JOptionPane.showConfirmDialog(null,"ARE YOU SURE YOU WANT TO DELETE THE EVENT AND THE DATA OF IT?", "DELETED?",JOptionPane.YES_NO_OPTION);
        if(choose == JOptionPane.YES_OPTION){
            new event().Deleteevent(holder.getText());
            System.out.print(holder.getText());
            new event().displaydata(events);
            return;
        }
    }//GEN-LAST:event_btndeleteActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private UserInterface.CustomComponents.MyTable accounttable;
    private UserInterface.CustomComponents.MyButton btnadd;
    private UserInterface.CustomComponents.MyButton btndelete;
    private UserInterface.CustomComponents.MyTable events;
    public javax.swing.JLabel holder;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel lbldesign1;
    private javax.swing.JLabel lbldesignyear1;
    private javax.swing.JLabel lbldesignyear2;
    private javax.swing.JLabel lbldesignyear3;
    public com.github.lgooddatepicker.components.DatePicker txtdate;
    public UserInterface.CustomComponents.MyTextField txteventname;
    public com.github.lgooddatepicker.components.TimePicker txttimein;
    public com.github.lgooddatepicker.components.TimePicker txttimeout;
    // End of variables declaration//GEN-END:variables
  
}
