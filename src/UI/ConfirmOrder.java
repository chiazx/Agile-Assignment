/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI;

import ADT.LList;
import ADT.ListInterface;
import java.awt.Color;
import Entity.*;
import javax.swing.ButtonGroup;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author boonk
 */
public class ConfirmOrder extends javax.swing.JFrame {
    static ListInterface<OrderList> orderList = new LList<>();
    static ListInterface<CatalogProduct> prodList = new LList<>();
    Order order = new Order();
    ListInterface<Delivery> deliveryList = new LList<>();
    ListInterface<Pickup> pickupList =new LList<>();
    String DateorPriority="";
    double extraFee=0.00;
    Double totalAmount=0.00;
    /**
     * Creates new form ConfirmOrder
     */
    
    
    public ConfirmOrder(ListInterface<OrderList> orderList,ListInterface<CatalogProduct> prodList) {
        this.prodList = prodList;
        this.orderList = orderList;
        initComponents();
        initialize();
    }
    public void refreshTable(){
        totalAmount=0.00;
         
        DefaultTableModel model = (DefaultTableModel) jTable2.getModel();
        int rowCount = model.getRowCount();
      //  System.out.print(rowCount+"222");
        for (int i = rowCount - 1; i >= 0; i--) {
    model.removeRow(i);
}
       for(int i=0;i<orderList.getNumberOfEntries();i++){
           for(int j=0;j<prodList.getNumberOfEntries();j++){
            //   System.out.println(prodList.getEntry(j+1).getProdName());
               if(orderList.getEntry(i+1).getProdID().equals(prodList.getEntry(j+1).getProdID())){
                   totalAmount+=prodList.getEntry(j+1).getProdPrice();
                   model.addRow(new Object[]{prodList.getEntry(j+1).getProdName(),orderList.getEntry(i+1).getQuantity(),prodList.getEntry(j+1).getProdPrice()});
           }
           
       }
       }
       if(!DateorPriority.equals("")){
           if(DateorPriority.equals("express")){
               extraFee=30.00;
                model.addRow(new Object[]{null,"Extra Fee",extraFee});
                totalAmount+=extraFee;
           }else if(DateorPriority.equals("normal")){
               extraFee=15.00;
                model.addRow(new Object[]{null,"Extra Fee",extraFee});
                totalAmount+=extraFee;
           }else if(DateorPriority.equals("normal")){
               extraFee=0.00;
                model.addRow(new Object[]{null,"Extra Fee",extraFee});
                totalAmount+=extraFee;
           }
           
       }
       
       model.addRow(new Object[]{null,"TOTAL",totalAmount});
    }
    public void initialize(){
        this.rbDelivery.setActionCommand("delivery");
        this.rbPickup.setActionCommand("pickup");
        lblDisplayDate.setVisible(false);
       refreshTable();
    }
    public String showDateInputDialog(){
        System.out.print("I Have commit something");
         String dateValue="";
        do{
        dateValue= JOptionPane.showInputDialog("Please enter a Date \n Formate(MM\\DD\\YYYY)");
        
        if(!dateValue.matches("((0?[13578]|10|12)(-|\\/)((0[0-9])|([12])([0-9]?)|(3[01]?))(-|\\/)((\\d{4})|(\\d{2}))|(0?[2469]|11)(-|\\/)((0[0-9])|([12])([0-9]?)|(3[0]?))(-|\\/)((\\d{4}|\\d{2})))")){
          JOptionPane.showMessageDialog(null, "Please enter correct date format!","WARNING",JOptionPane.ERROR_MESSAGE);
            dateValue = showDateInputDialog();
        }
        }while(!dateValue.matches("((0?[13578]|10|12)(-|\\/)((0[0-9])|([12])([0-9]?)|(3[01]?))(-|\\/)((\\d{4})|(\\d{2}))|(0?[2469]|11)(-|\\/)((0[0-9])|([12])([0-9]?)|(3[0]?))(-|\\/)((\\d{4}|\\d{2})))"));
        DateorPriority=dateValue;
        return dateValue;
    }
    public String showPickupPriority(){
        String pickupPriority="";
        do{
        pickupPriority= JOptionPane.showInputDialog("Please enter pickup Priority \n (express=2 working hours,\n normal=1 working day,\n flexi= 3 working days )");
        
        if(!pickupPriority.toLowerCase().matches("(express|flexi|normal)")){
          JOptionPane.showMessageDialog(null, "Please only enter express, flexi or normal!","WARNING",JOptionPane.ERROR_MESSAGE);
            
        }
        }while(!pickupPriority.toLowerCase().matches("(express|flexi|normal)"));
        DateorPriority=pickupPriority.toLowerCase();
        return pickupPriority;
    }
   
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        DorP = new javax.swing.ButtonGroup();
        jPanel10 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        tfCustName = new javax.swing.JTextField();
        tfCustPhone = new javax.swing.JTextField();
        lblChooseFromList = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        taAddress = new javax.swing.JTextArea();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        rbDelivery = new javax.swing.JRadioButton();
        rbPickup = new javax.swing.JRadioButton();
        lblDisplayDate = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        Cancel = new javax.swing.JButton();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel10.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setText("Customer Type:");

        buttonGroup1.add(jRadioButton1);
        jRadioButton1.setSelected(true);
        jRadioButton1.setText("Individual Consumer");

        buttonGroup1.add(jRadioButton2);
        jRadioButton2.setText("Co-op Customer");

        jLabel2.setText("Name");

        jLabel3.setText("Phone");

        jLabel4.setText("Address");

        lblChooseFromList.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblChooseFromList.setForeground(new java.awt.Color(102, 102, 102));
        lblChooseFromList.setText("*Choose from registered customer");
        lblChooseFromList.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblChooseFromList.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblChooseFromListMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblChooseFromListMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblChooseFromListMouseExited(evt);
            }
        });

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Product Name", "Quantity", "Unit Price(RM)"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(jTable2);

        jLabel5.setText("Order Summary");

        jButton1.setText("Confirm Order");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        taAddress.setColumns(20);
        taAddress.setRows(5);
        jScrollPane3.setViewportView(taAddress);

        jLabel6.setText("Please Enter the details");

        jLabel7.setText("Choose One:");

        DorP.add(rbDelivery);
        rbDelivery.setText("Delivery");
        rbDelivery.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbDeliveryActionPerformed(evt);
            }
        });

        DorP.add(rbPickup);
        rbPickup.setText("Pickup");
        rbPickup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbPickupActionPerformed(evt);
            }
        });

        lblDisplayDate.setText("jLabel8");

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel8.setText("Step 1 ");
        jLabel8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel9.setText(" Step 2 ");
        jLabel9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel10.setText(" Step 3 ");
        jLabel10.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        Cancel.setText("Cancel");
        Cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CancelActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanel10Layout.createSequentialGroup()
                            .addComponent(Cancel)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jButton1))
                        .addGroup(jPanel10Layout.createSequentialGroup()
                            .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel8)
                                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel10Layout.createSequentialGroup()
                                        .addGap(38, 38, 38)
                                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel4)
                                            .addComponent(jLabel3)
                                            .addComponent(jLabel2)
                                            .addComponent(jLabel10)))
                                    .addComponent(jLabel1)))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel5)
                                .addGroup(jPanel10Layout.createSequentialGroup()
                                    .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jRadioButton2)
                                        .addComponent(jRadioButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(tfCustName)
                                        .addComponent(tfCustPhone))
                                    .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel10Layout.createSequentialGroup()
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(lblChooseFromList))
                                        .addGroup(jPanel10Layout.createSequentialGroup()
                                            .addGap(90, 90, 90)
                                            .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(lblDisplayDate)
                                                .addGroup(jPanel10Layout.createSequentialGroup()
                                                    .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                        .addComponent(jLabel9)
                                                        .addComponent(jLabel7))
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                    .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(rbPickup)
                                                        .addComponent(rbDelivery)))))))
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 311, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(227, Short.MAX_VALUE))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel6)
                .addGap(12, 12, 12)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9))
                .addGap(18, 18, 18)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(rbDelivery))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(rbPickup))
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(jRadioButton1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jRadioButton2)))
                .addGap(14, 14, 14)
                .addComponent(lblDisplayDate)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfCustName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(lblChooseFromList))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfCustPhone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addGap(6, 6, 6)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(Cancel)))
        );

        tfCustName.getAccessibleContext().setAccessibleName("tfCustName");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void lblChooseFromListMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblChooseFromListMouseEntered
       lblChooseFromList.setForeground(Color.red);
    }//GEN-LAST:event_lblChooseFromListMouseEntered

    private void lblChooseFromListMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblChooseFromListMouseExited
        lblChooseFromList.setForeground(Color.DARK_GRAY);
    }//GEN-LAST:event_lblChooseFromListMouseExited

    private void lblChooseFromListMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblChooseFromListMouseClicked
       JOptionPane.showMessageDialog(null, "Function Not Available yet.","WARNING",JOptionPane.ERROR_MESSAGE);
    
    }//GEN-LAST:event_lblChooseFromListMouseClicked

    private void rbPickupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbPickupActionPerformed
      lblDisplayDate.setText("Pickup Priority:"+showPickupPriority());
      lblDisplayDate.setVisible(true);
      refreshTable();
    }//GEN-LAST:event_rbPickupActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
      boolean valid= inputValidate();
      int selection=0;
       if(valid==true){
           selection=JOptionPane.showConfirmDialog(null,"Confirm and make order?","CONFIRMATION",JOptionPane.YES_NO_OPTION);
           
           if(selection==0){
               if(DorP.getSelection().getActionCommand().equals("delivery")){
                   deliveryList.add(new Delivery("OR0001","D0001","Not assigned yet",DateorPriority,taAddress.getText()));
                   System.out.println(deliveryList);
               }else if(DorP.getSelection().getActionCommand().toLowerCase().equals("pickup")){
                   pickupList.add(new Pickup("OR0001","P0001",DateorPriority.toLowerCase()));
                             System.out.println(pickupList.getEntry(1));
               }
               order = new Order("OR0001","Confimed",DorP.getSelection().getActionCommand(),totalAmount,"CR0001");
               JOptionPane.showMessageDialog(null, "Order is sucessfully addedd");
               System.out.print(order);
           this.setVisible(false);
           new DisplayCatalog();
           }
       }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void rbDeliveryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbDeliveryActionPerformed
      lblDisplayDate.setText("DeliveryDate: "+showDateInputDialog());
      lblDisplayDate.setVisible(true);
      refreshTable();
    }//GEN-LAST:event_rbDeliveryActionPerformed

    private void CancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CancelActionPerformed
    System.out.print("cancel1");
        this.setVisible(false);
    }//GEN-LAST:event_CancelActionPerformed

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
            java.util.logging.Logger.getLogger(ConfirmOrder.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ConfirmOrder.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ConfirmOrder.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ConfirmOrder.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ConfirmOrder(orderList,prodList).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Cancel;
    private javax.swing.ButtonGroup DorP;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JLabel lblChooseFromList;
    private javax.swing.JLabel lblDisplayDate;
    private javax.swing.JRadioButton rbDelivery;
    private javax.swing.JRadioButton rbPickup;
    private javax.swing.JTextArea taAddress;
    private javax.swing.JTextField tfCustName;
    private javax.swing.JTextField tfCustPhone;
    // End of variables declaration//GEN-END:variables

    private boolean inputValidate() {
      //validate name
      String name="";
      boolean validate = false;
      if(tfCustName.getText().isEmpty()||tfCustPhone.getText().isEmpty()||taAddress.getText().isEmpty()){
          JOptionPane.showMessageDialog(null,"All input field should not leave blank", "WARNING",JOptionPane.ERROR_MESSAGE);
          
              
          }
      else{
      name = tfCustName.getText();
          
          if( !name.matches("^(([A-Z]|[a-z]|\\s){1,30})*$")){
              JOptionPane.showMessageDialog(null,"Name should not include number or exceed 30 words", "WARNING",JOptionPane.ERROR_MESSAGE);
              
                     }else if(!tfCustPhone.getText().matches("^(01[0-9][-])+([0-9]{7,8})*$")){
                           JOptionPane.showMessageDialog(null,"Phone number format error. \n E.g 012-1234567", "WARNING",JOptionPane.ERROR_MESSAGE);
                     }else if(taAddress.getText().length()>100){
                          JOptionPane.showMessageDialog(null,"Address should not exceed 100 words", "WARNING",JOptionPane.ERROR_MESSAGE);
                     }else{
               validate=true;

          }
      
    }
return validate;
}
}
