/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package student;

import admin.*;
import customGUI.MyTable;
import customGUI.MyTextField;


/**
 *
 * @author Admin
 */
public class dashboard extends javax.swing.JPanel {

    /**
     * Creates new form dashboard
     */
    
   
    
    public dashboard() {
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

        jPanel4 = new javax.swing.JPanel();
        txtsearch = new customGUI.MyTextField();
        Search = new customGUI.MyButton();
        btnadd = new customGUI.MyButton();
        btnprint1 = new customGUI.MyButton();
        btnprint = new customGUI.MyButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        dashboardtable = new customGUI.MyTable();
        myPicture1 = new customGUI.MyPanel("Students.png");
        lbldesign2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        totalstudents = new javax.swing.JLabel();
        myPicture2 = new customGUI.MyPanel("Event.png");
        lbldesign4 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        EventName = new javax.swing.JLabel();

        setBackground(new java.awt.Color(181, 181, 181));

        jPanel4.setBackground(new java.awt.Color(181, 181, 181));

        txtsearch.setBackground(new java.awt.Color(255, 255, 255));
        txtsearch.setText("Search");
        txtsearch.setBorderColor(new java.awt.Color(181, 181, 181));
        txtsearch.setCustomIcon2(new javax.swing.ImageIcon(System.getProperty("user.dir")+ "\\src\\image\\3741750_bussiness_ecommerce_marketplace_onlinestore_search_icon (1).png"));
        txtsearch.setRadius(30);
        txtsearch.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtsearchFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtsearchFocusLost(evt);
            }
        });
        txtsearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtsearchActionPerformed(evt);
            }
        });

        Search.setText("Search");
        Search.setRadius(30);
        Search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchActionPerformed(evt);
            }
        });

        btnadd.setText("Attend");
        btnadd.setRadius(30);
        btnadd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnaddActionPerformed(evt);
            }
        });

        btnprint1.setText("Export");
        btnprint1.setRadius(30);

        btnprint.setText("Print");
        btnprint.setRadius(30);

        jScrollPane2.setBackground(new java.awt.Color(255, 153, 153));

        dashboardtable.setBackground(new java.awt.Color(255, 255, 255));
        dashboardtable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Event", "Date", "Timein", "Timeout"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                true, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        dashboardtable.setGridColor(new java.awt.Color(0, 0, 0));
        dashboardtable.setOpaque(false);
        dashboardtable.setRequestFocusEnabled(false);
        dashboardtable.setShowGrid(false);
        dashboardtable.getTableHeader().setReorderingAllowed(false);
        jScrollPane2.setViewportView(dashboardtable);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(txtsearch, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Search, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnadd, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnprint1, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnprint, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(114, 114, 114))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 1116, Short.MAX_VALUE)
                        .addContainerGap())))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtsearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Search, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnadd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnprint1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnprint, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 543, Short.MAX_VALUE)
                .addContainerGap())
        );

        myPicture1.setBackground(new java.awt.Color(0, 0, 0,0));

        lbldesign2.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        lbldesign2.setForeground(new java.awt.Color(255, 255, 255));
        lbldesign2.setText("Total Event Attend:");

        jPanel1.setBackground(new java.awt.Color(0, 0, 0,0));

        totalstudents.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        totalstudents.setForeground(new java.awt.Color(255, 255, 255));
        totalstudents.setText("Name");
        jPanel1.add(totalstudents);

        javax.swing.GroupLayout myPicture1Layout = new javax.swing.GroupLayout(myPicture1);
        myPicture1.setLayout(myPicture1Layout);
        myPicture1Layout.setHorizontalGroup(
            myPicture1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(myPicture1Layout.createSequentialGroup()
                .addGroup(myPicture1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(myPicture1Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(myPicture1Layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(lbldesign2, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(25, Short.MAX_VALUE))
        );
        myPicture1Layout.setVerticalGroup(
            myPicture1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(myPicture1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(lbldesign2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        myPicture2.setBackground(new java.awt.Color(0, 0, 0,0));

        lbldesign4.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        lbldesign4.setForeground(new java.awt.Color(255, 255, 255));
        lbldesign4.setText("Event Held:");

        jPanel2.setBackground(new java.awt.Color(0, 0, 0,0));

        EventName.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        EventName.setForeground(new java.awt.Color(255, 255, 255));
        EventName.setText("Name");
        jPanel2.add(EventName);

        javax.swing.GroupLayout myPicture2Layout = new javax.swing.GroupLayout(myPicture2);
        myPicture2.setLayout(myPicture2Layout);
        myPicture2Layout.setHorizontalGroup(
            myPicture2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(myPicture2Layout.createSequentialGroup()
                .addGroup(myPicture2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(myPicture2Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(myPicture2Layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(lbldesign4, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(25, Short.MAX_VALUE))
        );
        myPicture2Layout.setVerticalGroup(
            myPicture2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(myPicture2Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(lbldesign4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addComponent(myPicture2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(430, 430, 430)
                .addComponent(myPicture1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(59, 59, 59))
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(myPicture2, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(myPicture1, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnaddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnaddActionPerformed
      
        new StudentAttend(null,true).setVisible(true);
      
    }//GEN-LAST:event_btnaddActionPerformed

    private void txtsearchFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtsearchFocusGained
      new MyTextField().focuseGained(txtsearch, "Search");
    }//GEN-LAST:event_txtsearchFocusGained

    private void txtsearchFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtsearchFocusLost
     new MyTextField().focusLost(txtsearch,"Search");
    }//GEN-LAST:event_txtsearchFocusLost

    private void txtsearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtsearchActionPerformed
   new MyTable().searchTableFilter(dashboardtable,txtsearch.getText());
    }//GEN-LAST:event_txtsearchActionPerformed

    private void SearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearchActionPerformed
        new MyTable().searchTableFilter(dashboardtable,txtsearch.getText());
    }//GEN-LAST:event_SearchActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JLabel EventName;
    private customGUI.MyButton Search;
    private customGUI.MyButton btnadd;
    private customGUI.MyButton btnprint;
    private customGUI.MyButton btnprint1;
    private customGUI.MyTable dashboardtable;
    private javax.swing.JPanel jPanel1;
    public javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lbldesign2;
    private javax.swing.JLabel lbldesign4;
    private customGUI.MyPanel myPicture1;
    private customGUI.MyPanel myPicture2;
    private javax.swing.JLabel totalstudents;
    private customGUI.MyTextField txtsearch;
    // End of variables declaration//GEN-END:variables
}
