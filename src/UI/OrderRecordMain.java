/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.qwerwqerqwerwqer
 */
package UI;

import ADT.LList;
import ADT.ListInterface;
import Entity.Pickup;
import Entity.Delivery;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import java.time.format.DateTimeFormatter;  
import java.time.LocalDateTime;
import java.util.Calendar;
import java.util.Date;




/**
 *
 * @author Si Wei
 */
public class OrderRecordMain extends javax.swing.JFrame {
private ListInterface<Pickup> pickupList =new LList<Pickup>();
private ListInterface<Delivery> deliveryList =new LList<Delivery>();
DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss"); 
LocalDateTime now = LocalDateTime.now(); 

    public OrderRecordMain() {
        initComponents();
         initialize();
         initialize1();
         refreshPickupTable();
         
    }
public void initialize(){
        pickupList.add(new Pickup("PU001","PU0001","12-12-2018","","Extreme","Not pickup"));
        pickupList.add(new Pickup("PU002","PU0002","12-12-2018","","Moderate","Not pickup"));
        pickupList.add(new Pickup("PU003","PU0003","12-12-2018","","Low","Not pickup"));
       //modify smth
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
      for(int i =0;i<pickupList.getNumberOfEntries();i++){
          model.addRow(new Object[]{pickupList.getEntry(i+1).getOrderID(),pickupList.getEntry(i+1).getPickupPriority(),pickupList.getEntry(i+1).getPickupTime(),pickupList.getEntry(i+1).getPickupStatus()});
        }
      
    /*jTable1.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
    jTable1.getSize();
    jTable1.getColumnModel().getColumn(0).setPreferredWidth((jTable1.getSize().width)/50*20);
    jTable1.getColumnModel().getColumn(1).setPreferredWidth((jTable1.getSize().width)/30*20);
    jTable1.getColumnModel().getColumn(2).setPreferredWidth((jTable1.getSize().width)/30*20);
    jTable1.getColumnModel().getColumn(3).setPreferredWidth((jTable1.getSize().width)/30*20);*/
    }
public void initialize1(){
        deliveryList.add(new Delivery("DL001","DM001","Muhamad","12-12-2018","Jalan Tunku Abdul Rahman","Royal Palace Hotel",""));
        deliveryList.add(new Delivery("DL002","DM002","Kong","12-12-2018","Subang SS15","SnowFlake",""));
        deliveryList.add(new Delivery("DL003","DM003","Low","12-12-2018","Jalan SS13","Rakuzan",""));
       
        DefaultTableModel model = (DefaultTableModel) jTable3.getModel();
      for(int i =0;i<deliveryList.getNumberOfEntries();i++){
          model.addRow(new Object[]{deliveryList.getEntry(i+1).getOrderID(),deliveryList.getEntry(i+1).getAddress(),deliveryList.getEntry(i+1).getDeliveryManName()});
        }
      
    jTable3.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
    jTable3.getSize();
    jTable3.getColumnModel().getColumn(0).setPreferredWidth((jTable3.getSize().width)/120*20);
    jTable3.getColumnModel().getColumn(1).setPreferredWidth((jTable3.getSize().width)/70*20);
    jTable3.getColumnModel().getColumn(2).setPreferredWidth((jTable3.getSize().width)/70*20);
    jTable3.getColumnModel().getColumn(3).setPreferredWidth((jTable3.getSize().width)/60*20);
    }
    public void refreshPickupTable(){
        
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        int rowCount = model.getRowCount();
      //  System.out.print(rowCount+"222");
        for (int i = rowCount - 1; i >= 0; i--) {
    model.removeRow(i);
}
      for(int i =0;i<pickupList.getNumberOfEntries();i++){
          model.addRow(new Object[]{pickupList.getEntry(i+1).getOrderID(),pickupList.getEntry(i+1).getPickupPriority(),pickupList.getEntry(i+1).getPickupTime(),pickupList.getEntry(i+1).getPickupStatus()});
        }
    }
public void refreshDeliveryTabe(){
        
        DefaultTableModel model = (DefaultTableModel) jTable3.getModel();
        int rowCount = model.getRowCount();
      //  System.out.print(rowCount+"222");
        for (int i = rowCount - 1; i >= 0; i--) {
    model.removeRow(i);
}
    
      for(int i =0;i<deliveryList.getNumberOfEntries();i++){
          model.addRow(new Object[]{deliveryList.getEntry(i+1).getOrderID(),deliveryList.getEntry(i+1).getAddress(),deliveryList.getEntry(i+1).getDeliveryManName(),deliveryList.getEntry(i+1).getDeliveredTime()});
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel8 = new javax.swing.JPanel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel10 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jPanel15 = new javax.swing.JPanel();
        jButton15 = new javax.swing.JButton();
        jButton16 = new javax.swing.JButton();
        jLabel27 = new javax.swing.JLabel();
        R_ID6 = new javax.swing.JTextField();
        jLabel28 = new javax.swing.JLabel();
        Ctype10 = new javax.swing.JComboBox<>();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        Ctype11 = new javax.swing.JComboBox<>();
        jPanel2 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel8.setBackground(new java.awt.Color(255, 255, 255));

        jTabbedPane1.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jTabbedPane1.setName("Delivery List"); // NOI18N
        jTabbedPane1.setOpaque(true);

        jPanel10.setBackground(new java.awt.Color(255, 255, 255));

        jTable1.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jTable1.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Pickup ID", "Priority", "Time ", "Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.setToolTipText("");
        jTable1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jLabel2.setText("*Please select the record to complete the order.");

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 607, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel10Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Pickup List", jPanel10);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        jTable3.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jTable3.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jTable3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Delivery ID", "Destination", "Delivery Man Name", "Delivered Time"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable3.setToolTipText("");
        jTable3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jTable3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable3MouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(jTable3);

        jLabel3.setText("*Please select the record to complete the order.");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jScrollPane3)
                        .addGap(33, 33, 33))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Delivery List", jPanel3);

        jPanel15.setBackground(new java.awt.Color(255, 255, 255));
        jPanel15.setVerifyInputWhenFocusTarget(false);

        jButton15.setFont(new java.awt.Font("Microsoft Himalaya", 1, 24)); // NOI18N
        jButton15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ui/images/icons8_Checked_26px.png"))); // NOI18N
        jButton15.setText("Confirm");
        jButton15.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton15.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton15jButton1MouseClicked(evt);
            }
        });
        jButton15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton15jButton1ActionPerformed(evt);
            }
        });

        jButton16.setFont(new java.awt.Font("Microsoft Himalaya", 1, 24)); // NOI18N
        jButton16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ui/images/icons8_Reset_24px_2.png"))); // NOI18N
        jButton16.setText("Reset");
        jButton16.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton16jButton2ActionPerformed(evt);
            }
        });

        jLabel27.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel27.setText("Order ID :");

        R_ID6.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        R_ID6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                R_ID6R_IDActionPerformed(evt);
            }
        });

        jLabel28.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel28.setText("Destination Area :");

        Ctype10.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        Ctype10.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Kong", "Muhd", "Low", "Kit", "Jason" }));
        Ctype10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Ctype10CtypeActionPerformed(evt);
            }
        });

        jLabel29.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel29.setText("Delivery man & route selection");

        jLabel30.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel30.setText("Delivery Man ID :");

        Ctype11.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        Ctype11.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Setapak", "Chow Kit", "KLCC", "Bangsar" }));
        Ctype11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Ctype11CtypeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel15Layout = new javax.swing.GroupLayout(jPanel15);
        jPanel15.setLayout(jPanel15Layout);
        jPanel15Layout.setHorizontalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel15Layout.createSequentialGroup()
                        .addGap(110, 110, 110)
                        .addComponent(jButton15, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(78, 78, 78)
                        .addComponent(jButton16, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel15Layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel15Layout.createSequentialGroup()
                                .addComponent(jLabel30, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(Ctype10, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel15Layout.createSequentialGroup()
                                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel28))
                                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel15Layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addComponent(R_ID6, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel15Layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addComponent(Ctype11, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addComponent(jLabel29, javax.swing.GroupLayout.PREFERRED_SIZE, 575, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel15Layout.setVerticalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel15Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel29, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49)
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(R_ID6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel30, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Ctype10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel15Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(jLabel28, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel15Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(Ctype11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton15, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton16, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(130, 130, 130))
        );

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Route Selection", jPanel4);

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 754, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        jTabbedPane1.getAccessibleContext().setAccessibleName("Order Info");

        jPanel2.setBackground(new java.awt.Color(122, 72, 221));

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jLabel9.setFont(new java.awt.Font("Berlin Sans FB Demi", 1, 36)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Order Info");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 352, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        int rowSelected=jTable1.getSelectedRow();

        int yesno = JOptionPane.showConfirmDialog(null,"Confirm picked up?", "INFORMATION",JOptionPane.YES_NO_OPTION);

        if(yesno==0){
            pickupList.getEntry(rowSelected+1).setPickupTime(dtf.format(now));
            pickupList.getEntry(rowSelected+1).setPickupStatus("Picked up");
            refreshPickupTable();
        }
    }//GEN-LAST:event_jTable1MouseClicked

    private void jTable3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable3MouseClicked
        int rowSelected=jTable3.getSelectedRow();

        int yesno = JOptionPane.showConfirmDialog(null,"Confirm delivered?", "INFORMATION",JOptionPane.YES_NO_OPTION);

        if(yesno==0){
            deliveryList.getEntry(rowSelected+1).setDeliveredTime(dtf.format(now));
            
            refreshDeliveryTabe();
        }
    }//GEN-LAST:event_jTable3MouseClicked

    private void jButton15jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton15jButton1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton15jButton1MouseClicked

    private void jButton15jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton15jButton1ActionPerformed
        if(!R_ID6.getText().isEmpty() && R_ID6.getText().length() == 5){
            if(R_ID6.getText().equals("DL001")||R_ID6.getText().equals("DL002")||R_ID6.getText().equals("DL003")){
                if(Ctype11.getSelectedIndex() == 0){
                    JOptionPane.showMessageDialog(null, "Delivery man & route selected !"
                        +"\nDestination Area : " + Ctype11.getSelectedItem().toString()
                        +"\nPlease proceed to Jalan Langkawi !"
                        +"\nOrder ID : " +R_ID6.getText()
                        +"\nDelivery man ID : " +Ctype10.getSelectedItem().toString()
                        +"\nCurrent Time : " +dtf.format(now)
                        +"\nETA arrived in : 45mins ");
                }
                else if( Ctype11.getSelectedIndex() == 1 ){
                    JOptionPane.showMessageDialog(null, "Delivery man & route selected !"
                        +"\nDestination Area : " + Ctype11.getSelectedItem().toString()
                        +"\nPlease proceed to Jalan Putra !"
                        +"\nOrder ID : " +R_ID6.getText()
                        +"\nDelivery man ID : "  +Ctype10.getSelectedItem().toString()
                        +"\nCurrent Time : " +dtf.format(now)
                        +"\nETA arrived in : 25mins ");
                }
                else if(Ctype11.getSelectedIndex() == 2){
                    JOptionPane.showMessageDialog(null, "Delivery man & route selected !"
                        +"\nDestination Area:" + Ctype11.getSelectedItem().toString()
                        +"\nPlease proceed to Jalan Tun Razak !"
                        +"\nOrder ID : " +R_ID6.getText()
                        +"\nDelivery man ID  : "  +Ctype10.getSelectedItem().toString()
                        +"\nCurrent Time  :" +dtf.format(now)
                        +"\nETA arrived in : 55mins ");
                }
                else if(Ctype11.getSelectedIndex() == 3){
                    JOptionPane.showMessageDialog(null, "Delivery man & route selected !"
                        +"\nDestination Area : " + Ctype11.getSelectedItem().toString()
                        +"\nPlease proceed to Jalan Bangsar !"
                        +"\nOrder ID : " +R_ID6.getText()
                        +"\nDelivery man ID  : "  +Ctype10.getSelectedItem().toString()
                        +"\nCurrent Time : " +dtf.format(now)
                        +"\nETA arrived in : 20mins ");
                }
                else{
                    JOptionPane.showMessageDialog(null, "Error occured !"
                        +"\nDlivery Man ID must be entered with 5 characters !");
                }
            }else{
                JOptionPane.showMessageDialog(null, "Order ID does not exist !");
            }
        }else
        JOptionPane.showMessageDialog(null, "Order ID or Delivery man ID must not leave empty !");
    }//GEN-LAST:event_jButton15jButton1ActionPerformed

    private void jButton16jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton16jButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton16jButton2ActionPerformed

    private void R_ID6R_IDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_R_ID6R_IDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_R_ID6R_IDActionPerformed

    private void Ctype10CtypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Ctype10CtypeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Ctype10CtypeActionPerformed

    private void Ctype11CtypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Ctype11CtypeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Ctype11CtypeActionPerformed

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
            java.util.logging.Logger.getLogger(OrderRecordMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(OrderRecordMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(OrderRecordMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(OrderRecordMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new OrderRecordMain().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> Ctype10;
    private javax.swing.JComboBox<String> Ctype11;
    private javax.swing.JTextField R_ID6;
    private javax.swing.JButton jButton15;
    private javax.swing.JButton jButton16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable3;
    // End of variables declaration//GEN-END:variables
}
