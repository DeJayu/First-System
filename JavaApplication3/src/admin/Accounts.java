/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package admin;

import customGUI.MyTable;
import customGUI.MyTextField;
import customGUI.myPicture;

import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileFilter;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JPanel;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author Admin
 */
public class Accounts extends javax.swing.JPanel {

    /**
     * Creates new form dashboard
     */
    public Accounts() {
        initComponents();
        btnviewdata.setVisible(false);
        btnupdate.setVisible(false);
        btndelete.setVisible(false);
        btncancel.setVisible(false);
        datePicker1.getComponentDateTextField().setEnabled(false);
        
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
        txtsearch = new customGUI.MyTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        accountstable = new customGUI.MyTable();
        btnfilter = new customGUI.MyButton();
        jPanel2 = new javax.swing.JPanel();
        txtidnum = new customGUI.MyTextField();
        txtname = new customGUI.MyTextField();
        cbgender = new javax.swing.JComboBox<>();
        cbcourse = new javax.swing.JComboBox<>();
        cbyear = new javax.swing.JComboBox<>();
        filetext = new customGUI.MyTextField();
        myButton1 = new customGUI.MyButton();
        lblBOD = new javax.swing.JLabel();
        lbldesign1 = new javax.swing.JLabel();
        lbldesign3 = new javax.swing.JLabel();
        lbldesign4 = new javax.swing.JLabel();
        lbldesigncourse = new javax.swing.JLabel();
        lbldesignyear1 = new javax.swing.JLabel();
        lblBOD1 = new javax.swing.JLabel();
        datePicker1 = new com.github.lgooddatepicker.components.DatePicker();
        btnsearch1 = new customGUI.MyButton();
        studentpicture1 = new javax.swing.JLabel();
        myPicture2 = new customGUI.myPicture("girl.png");
        lbldesign5 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        EventName = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        btnadd = new customGUI.MyButton();
        btnupdate = new customGUI.MyButton();
        btndelete = new customGUI.MyButton();
        btnviewdata = new customGUI.MyButton();
        btncancel = new customGUI.MyButton();
        myPicture3 = new customGUI.myPicture("boy.png");
        lbldesign6 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        EventName1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(181, 181, 181));

        jPanel3.setBackground(new java.awt.Color(181, 181, 181));

        txtsearch.setText("Search");
        txtsearch.setBackground(java.awt.Color.white);
        txtsearch.setBorderColor(new java.awt.Color(181, 181, 181));
        txtsearch.setCustomIcon2(new javax.swing.ImageIcon(System.getProperty("user.dir")+"\\src\\image\\3741750_bussiness_ecommerce_marketplace_onlinestore_search_icon (1).png"));
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

        jScrollPane2.setBackground(new java.awt.Color(255, 153, 153));

        accountstable.setAutoCreateRowSorter(true);
        accountstable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "#", "IdNum", "Name", "Department", "Gender", "Year", "Username"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                true, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        accountstable.setBackground(new java.awt.Color(255, 255, 255));
        accountstable.setGridColor(new java.awt.Color(0, 0, 0));
        accountstable.setOpaque(false);
        accountstable.setRequestFocusEnabled(false);
        accountstable.setShowGrid(false);
        accountstable.getTableHeader().setReorderingAllowed(false);
        accountstable.setToolTipText("");
        accountstable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                accountstableMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(accountstable);

        btnfilter.setText("Filter");
        btnfilter.setRadius(30);
        btnfilter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnfilterActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel2.setLayout(null);

        txtidnum.setText("Id Num#");
        txtidnum.setBackground(new java.awt.Color(0, 0, 0,0));
        txtidnum.setBorderColor(new java.awt.Color(230, 245, 241));
        txtidnum.setCustomIcon1(new javax.swing.ImageIcon(System.getProperty("user.dir")+"\\src\\image\\11185794_user_person_profile_avatar_people_icon (1).png"));
        txtidnum.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtidnumFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtidnumFocusLost(evt);
            }
        });
        jPanel2.add(txtidnum);
        txtidnum.setBounds(50, 20, 320, 40);

        txtname.setText("Student Name");
        txtname.setBackground(new java.awt.Color(0, 0, 0,0));
        txtname.setBorderColor(new java.awt.Color(230, 245, 241));
        txtname.setCustomIcon1(new javax.swing.ImageIcon(System.getProperty("user.dir")+"\\src\\image\\11185794_user_person_profile_avatar_people_icon (1).png"));
        txtname.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtnameFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtnameFocusLost(evt);
            }
        });
        jPanel2.add(txtname);
        txtname.setBounds(400, 20, 320, 40);

        cbgender.setBackground(new java.awt.Color(0,0,0,0));
        cbgender.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        cbgender.setForeground(new java.awt.Color(122, 140, 141));
        cbgender.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Gender", "Male", "Female", "Others" }));
        cbgender.setBorder(javax.swing.BorderFactory.createEmptyBorder());
        cbgender.setRequestFocusEnabled(false);
        jPanel2.add(cbgender);
        cbgender.setBounds(50, 80, 130, 40);

        cbcourse.setBackground(new java.awt.Color(0,0,0,0));
        cbcourse.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        cbcourse.setForeground(new java.awt.Color(122, 140, 141));
        cbcourse.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Course" }));
        jPanel2.add(cbcourse);
        cbcourse.setBounds(180, 80, 130, 40);

        cbyear.setBackground(new java.awt.Color(0,0,0,0));
        cbyear.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        cbyear.setForeground(new java.awt.Color(122, 140, 141));
        cbyear.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Year" }));
        jPanel2.add(cbyear);
        cbyear.setBounds(320, 80, 130, 40);

        filetext.setText("Student Photo");
        filetext.setBackground(new java.awt.Color(0, 0, 0,0));
        filetext.setBorderColor(new java.awt.Color(230, 245, 241));
        filetext.setCustomIcon1(new javax.swing.ImageIcon(System.getProperty("user.dir")+"\\src\\image\\11185794_user_person_profile_avatar_people_icon (1).png"));
        filetext.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                filetextFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                filetextFocusLost(evt);
            }
        });
        filetext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                filetextActionPerformed(evt);
            }
        });
        jPanel2.add(filetext);
        filetext.setBounds(50, 140, 580, 40);

        myButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/285633_image_icon (1).png"))); // NOI18N
        myButton1.setRadius(10);
        myButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                myButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(myButton1);
        myButton1.setBounds(640, 140, 42, 40);

        lblBOD.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblBOD.setForeground(java.awt.Color.black);
        lblBOD.setText("Student Photo:");
        jPanel2.add(lblBOD);
        lblBOD.setBounds(60, 120, 120, 16);

        lbldesign1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lbldesign1.setForeground(java.awt.Color.black);
        lbldesign1.setText("Id Number:");
        jPanel2.add(lbldesign1);
        lbldesign1.setBounds(50, 0, 80, 16);

        lbldesign3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lbldesign3.setForeground(java.awt.Color.black);
        lbldesign3.setText("Student Name:");
        jPanel2.add(lbldesign3);
        lbldesign3.setBounds(400, 0, 90, 16);

        lbldesign4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lbldesign4.setForeground(java.awt.Color.black);
        lbldesign4.setText("Gender:");
        jPanel2.add(lbldesign4);
        lbldesign4.setBounds(60, 60, 90, 16);

        lbldesigncourse.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lbldesigncourse.setForeground(java.awt.Color.black);
        lbldesigncourse.setText("Course:");
        jPanel2.add(lbldesigncourse);
        lbldesigncourse.setBounds(180, 60, 90, 16);

        lbldesignyear1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lbldesignyear1.setForeground(java.awt.Color.black);
        lbldesignyear1.setText("Year:");
        jPanel2.add(lbldesignyear1);
        lbldesignyear1.setBounds(330, 60, 90, 16);

        lblBOD1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblBOD1.setForeground(java.awt.Color.black);
        lblBOD1.setText("DOB(Date Of Birth):");
        jPanel2.add(lblBOD1);
        lblBOD1.setBounds(480, 60, 120, 16);
        jPanel2.add(datePicker1);
        datePicker1.setBounds(460, 80, 260, 40);

        btnsearch1.setText("Search");
        btnsearch1.setRadius(30);
        btnsearch1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsearch1ActionPerformed(evt);
            }
        });

        studentpicture1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        myPicture2.setBackground(new java.awt.Color(0, 0, 0,0));

        lbldesign5.setText("Girls:");
        lbldesign5.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        lbldesign5.setForeground(new java.awt.Color(255, 255, 255));

        jPanel4.setBackground(new java.awt.Color(0, 0, 0,0));

        EventName.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        EventName.setForeground(new java.awt.Color(255, 255, 255));
        EventName.setText("Numbers");
        jPanel4.add(EventName);

        javax.swing.GroupLayout myPicture2Layout = new javax.swing.GroupLayout(myPicture2);
        myPicture2.setLayout(myPicture2Layout);
        myPicture2Layout.setHorizontalGroup(
            myPicture2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(myPicture2Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(22, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, myPicture2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lbldesign5, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(85, 85, 85))
        );
        myPicture2Layout.setVerticalGroup(
            myPicture2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(myPicture2Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(lbldesign5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel1.setBackground(new java.awt.Color(0, 0, 0,0));

        btnadd.setText("Add");
        btnadd.setRadius(30);

        btnupdate.setText("Update");
        btnupdate.setRadius(30);

        btndelete.setText("Delete");
        btndelete.setRadius(30);

        btnviewdata.setText("View Student Data");
        btnviewdata.setRadius(30);

        btncancel.setText("Cancel");
        btncancel.setRadius(30);
        btncancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncancelActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(302, Short.MAX_VALUE)
                .addComponent(btncancel, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnviewdata, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btndelete, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnupdate, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnadd, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnadd, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnupdate, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btndelete, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnviewdata, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btncancel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 6, Short.MAX_VALUE))
        );

        myPicture3.setBackground(new java.awt.Color(0, 0, 0,0));

        lbldesign6.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        lbldesign6.setForeground(new java.awt.Color(255, 255, 255));
        lbldesign6.setText("Boys:");

        jPanel5.setBackground(new java.awt.Color(0, 0, 0,0));

        EventName1.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        EventName1.setForeground(new java.awt.Color(255, 255, 255));
        EventName1.setText("Numbers");
        jPanel5.add(EventName1);

        javax.swing.GroupLayout myPicture3Layout = new javax.swing.GroupLayout(myPicture3);
        myPicture3.setLayout(myPicture3Layout);
        myPicture3Layout.setHorizontalGroup(
            myPicture3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(myPicture3Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(22, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, myPicture3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lbldesign6, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(109, 109, 109))
        );
        myPicture3Layout.setVerticalGroup(
            myPicture3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(myPicture3Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(lbldesign6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(246, 246, 246))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(txtsearch, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(12, 12, 12)
                        .addComponent(btnsearch1, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(4, 4, 4)
                        .addComponent(btnfilter, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGap(136, 136, 136)
                        .addComponent(myPicture2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(myPicture3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(124, 124, 124)))
                .addGap(10, 10, 10))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(10, 10, 10)
                .addComponent(studentpicture1, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(myPicture2, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(myPicture3, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(8, 8, 8)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtsearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnsearch1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnfilter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(studentpicture1, javax.swing.GroupLayout.DEFAULT_SIZE, 220, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(9, 9, 9))
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
            .addGap(0, 672, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void myButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_myButton1ActionPerformed
      JFileChooser chooser = new JFileChooser();
      FileNameExtensionFilter filter =new FileNameExtensionFilter("studentImages",ImageIO.getReaderFileSuffixes());
        chooser.setFileFilter(filter);
        chooser.showOpenDialog(null);
        File f = chooser.getSelectedFile();
        new myPicture().rizelabel(f, studentpicture1);
        filetext.setText(f.getAbsolutePath());
    }//GEN-LAST:event_myButton1ActionPerformed

    private void accountstableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_accountstableMouseClicked
        int row = accountstable.getSelectedRow();
        txtidnum.setText(accountstable.getValueAt(row, 1).toString());
        txtname.setText(accountstable.getValueAt(row, 2).toString());
       
        
        
        btnviewdata.setVisible(true);
        btndelete.setVisible(true);
        btnupdate.setVisible(true);
        btncancel.setVisible(false);
    }//GEN-LAST:event_accountstableMouseClicked
    
    private void txtidnumFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtidnumFocusGained
      new MyTextField().focuseGained(txtidnum, "Id Num#");
    }//GEN-LAST:event_txtidnumFocusGained

    private void txtidnumFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtidnumFocusLost
     new MyTextField().focusLost(txtidnum, "Id Num#");
    }//GEN-LAST:event_txtidnumFocusLost

    private void txtnameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtnameFocusGained
      new MyTextField().focuseGained(txtname, "Username");
    }//GEN-LAST:event_txtnameFocusGained

    private void txtnameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtnameFocusLost
    new MyTextField().focusLost(txtname, "Username");
    }//GEN-LAST:event_txtnameFocusLost

    private void txtsearchFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtsearchFocusGained
        new MyTextField().focuseGained(txtsearch,"Search");
    }//GEN-LAST:event_txtsearchFocusGained

    private void txtsearchFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtsearchFocusLost
      new MyTextField().focusLost(txtsearch,"Search");
    }//GEN-LAST:event_txtsearchFocusLost

    private void btncancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncancelActionPerformed
    btnadd.setVisible(true);
    btnviewdata.setVisible(false);
    btndelete.setVisible(false);
    btnupdate.setVisible(false);
    btncancel.setVisible(false);
    }//GEN-LAST:event_btncancelActionPerformed

    private void btnfilterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnfilterActionPerformed

        
      
    
    }//GEN-LAST:event_btnfilterActionPerformed

    private void txtsearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtsearchActionPerformed
    new MyTable().searchTableFilter(accountstable,txtsearch.getText());
    }//GEN-LAST:event_txtsearchActionPerformed

    private void btnsearch1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsearch1ActionPerformed
      new MyTable().searchTableFilter(accountstable,txtsearch.getText());
    }//GEN-LAST:event_btnsearch1ActionPerformed

    private void filetextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_filetextActionPerformed
        File f = new File(filetext.getText());
        new myPicture().rizelabel(f, studentpicture1);
    }//GEN-LAST:event_filetextActionPerformed

    private void filetextFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_filetextFocusLost
        new MyTextField().focusLost(filetext,"Student Photo");
    }//GEN-LAST:event_filetextFocusLost

    private void filetextFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_filetextFocusGained
        new MyTextField().focuseGained(filetext, "Student Photo");
    }//GEN-LAST:event_filetextFocusGained
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel EventName;
    private javax.swing.JLabel EventName1;
    private customGUI.MyTable accountstable;
    private customGUI.MyButton btnadd;
    private customGUI.MyButton btncancel;
    private customGUI.MyButton btndelete;
    private customGUI.MyButton btnfilter;
    private customGUI.MyButton btnsearch1;
    private customGUI.MyButton btnupdate;
    private customGUI.MyButton btnviewdata;
    private javax.swing.JComboBox<String> cbcourse;
    private javax.swing.JComboBox<String> cbgender;
    private javax.swing.JComboBox<String> cbyear;
    private com.github.lgooddatepicker.components.DatePicker datePicker1;
    private customGUI.MyTextField filetext;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblBOD;
    private javax.swing.JLabel lblBOD1;
    private javax.swing.JLabel lbldesign1;
    private javax.swing.JLabel lbldesign3;
    private javax.swing.JLabel lbldesign4;
    private javax.swing.JLabel lbldesign5;
    private javax.swing.JLabel lbldesign6;
    private javax.swing.JLabel lbldesigncourse;
    private javax.swing.JLabel lbldesignyear1;
    private customGUI.MyButton myButton1;
    private customGUI.myPicture myPicture2;
    private customGUI.myPicture myPicture3;
    private javax.swing.JLabel studentpicture1;
    private customGUI.MyTextField txtidnum;
    private customGUI.MyTextField txtname;
    private customGUI.MyTextField txtsearch;
    // End of variables declaration//GEN-END:variables
  
}
