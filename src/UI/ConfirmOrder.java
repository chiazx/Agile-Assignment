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
import UI.DisplayCatalog;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author boonk
 */
public class ConfirmOrder extends javax.swing.JFrame {
    static ListInterface<OrderList> orderList = new LList<>();
    static ListInterface<CatalogProduct> prodList = new LList<>();
    static ListInterface<CatalogProduct> allCatProdList = new LList<>();
    static ListInterface<CustomizedFloral> allCustProdList = new LList<>();
    static ListInterface<Order> allSalesOrderList = new LList<>();
    static ListInterface<OrderList> allOrderList = new LList<>();
    static ListInterface<ConsumerE> allConsumerList = new LList<>();
    static ListInterface<CooperateE> allCoopList = new LList<>();
    static ListInterface<Delivery> allDeliveryList = new LList<>();
    static ListInterface<Pickup> allPickupList = new LList<>();
    static ListInterface<Invoice> allInvoiceList = new LList<>();
    static Order order1=new Order();
    ListInterface<CooperateE> coopCustList = new LList<>();
    Order order = new Order();
    ListInterface<Delivery> deliveryList = new LList<>();
    ListInterface<Pickup> pickupList =new LList<>();
    ConsumerE consumer;
    CooperateE cooperate;
    String DateorPriority="";
    double extraFee=0.00;
    Double totalAmount=0.00;
    double monthlyCredit=0.00;
    /**
     * Creates new form ConfirmOrder
     */
    
    
    public ConfirmOrder(Order order1,ListInterface<OrderList> orderList,ListInterface<CatalogProduct> prodList,ListInterface<CatalogProduct> allCatProdList ,ListInterface<CustomizedFloral> allCustProdList ,ListInterface<Order> allSalesOrderList ,
         ListInterface<OrderList> allOrderList ,ListInterface<ConsumerE> allConsumerList ,ListInterface<CooperateE> allCoopList ,
         ListInterface<Delivery> allDeliveryList ,ListInterface<Pickup> allPickupList,ListInterface<Invoice> allInvoiceList) {
         this.allCatProdList=allCatProdList;
             this.allConsumerList=allConsumerList;
             this.allCoopList=allCoopList;
             this.allCustProdList =allCustProdList;
             this.allDeliveryList = allDeliveryList;
             this.allInvoiceList=allInvoiceList;
             this.allOrderList=allOrderList;
             this.allPickupList=allPickupList;
             this.allSalesOrderList=allSalesOrderList;
        this.order1=order1;
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
           System.out.println("yes");
           System.out.println(order1.getOrderID());
           if(orderList.getEntry(i+1).getOrder().getOrderID().equals(order1.getOrderID())){
                   totalAmount+=orderList.getEntry(i+1).getCatalogProduct().getProdPrice()*Integer.parseInt(orderList.getEntry(i+1).getQuantity());
                   model.addRow(new Object[]{orderList.getEntry(i+1).getCatalogProduct().getProdName(),orderList.getEntry(i+1).getQuantity(),orderList.getEntry(i+1).getCatalogProduct().getProdPrice()});
      
           }
       }
       if(!DateorPriority.equals("")){
           if(DateorPriority.equals("express")){
               extraFee=30.00;
                model.addRow(new Object[]{null,"Extra: Express Priority",extraFee});
                totalAmount+=extraFee;
           }else if(DateorPriority.equals("normal")){
               extraFee=15.00;
                model.addRow(new Object[]{null,"Extra: Normal Priority",extraFee});
                totalAmount+=extraFee;
           }else if(DateorPriority.equals("flexi")){
               extraFee=0.00;
                model.addRow(new Object[]{null,"No extra fee needed.",extraFee});
                totalAmount+=extraFee;
           }
           
       }
       
       model.addRow(new Object[]{null,"TOTAL",totalAmount});
    }
    public void initialize(){
        lblCredit.setVisible(false);
        this.rbDelivery.setActionCommand("delivery");
        this.rbPickup.setActionCommand("pickup");
        this.rbConsumer.setActionCommand("Individual");
        this.rbCoop.setActionCommand("Coop");
        lblDisplayDate.setVisible(false);
        coopCustList.add(new CooperateE("CP1000","Meow Sdn Bd","017-9996666",1000.00,"Jalan Tak tau"));
        coopCustList.add(new CooperateE("CP1001","Wang Sdn Bd","017-3366666",2000.00,"Jalan Tak tau2"));
        coopCustList.add(new CooperateE("CP1002","Oh yeah Sdn Bd","017-5554444",1500.00,"Jalan Tak tau3"));
       refreshTable();
    }
    public void refreshCustomerDetails(){
        
    }
    public String showDateInputDialog(){
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
        pickupPriority= JOptionPane.showInputDialog("Please enter pickup Priority \n (express=2 working hours,RM 30.00\n normal=1 working day,RM15.00\n flexi= 3 working days )");
        
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
        watever = new javax.swing.ButtonGroup();
        jPanel10 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        rbConsumer = new javax.swing.JRadioButton();
        rbCoop = new javax.swing.JRadioButton();
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
        jLabel11 = new javax.swing.JLabel();
        lblCredit = new javax.swing.JLabel();

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

        watever.add(rbConsumer);
        rbConsumer.setSelected(true);
        rbConsumer.setText("Individual Consumer");

        watever.add(rbCoop);
        rbCoop.setText("Co-op Customer");
        rbCoop.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbCoopActionPerformed(evt);
            }
        });

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
        jLabel8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 51, 51)));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel9.setText(" Step 2 ");
        jLabel9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 51, 51)));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel10.setText(" Step 3 ");
        jLabel10.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 51, 51)));

        Cancel.setText("Cancel");
        Cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CancelActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Bookman Old Style", 1, 24)); // NOI18N
        jLabel11.setText("Order Confirmation");

        lblCredit.setText("jLabel12");

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addGap(91, 91, 91)
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel10Layout.createSequentialGroup()
                                .addComponent(Cancel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton1))
                            .addGroup(jPanel10Layout.createSequentialGroup()
                                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel2))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel5)
                                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 311, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblCredit))
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel10Layout.createSequentialGroup()
                                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel10Layout.createSequentialGroup()
                                        .addGap(88, 88, 88)
                                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(tfCustName)
                                            .addComponent(tfCustPhone)))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel6)
                                        .addGroup(jPanel10Layout.createSequentialGroup()
                                            .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jLabel1)
                                                .addComponent(jLabel8)
                                                .addComponent(jLabel10))
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(rbCoop)
                                                .addComponent(rbConsumer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel10Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(lblChooseFromList))
                                    .addGroup(jPanel10Layout.createSequentialGroup()
                                        .addGap(87, 87, 87)
                                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(lblDisplayDate)
                                            .addGroup(jPanel10Layout.createSequentialGroup()
                                                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jLabel7)
                                                    .addComponent(jLabel9))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(rbPickup)
                                                    .addComponent(rbDelivery)))))))
                            .addGroup(jPanel10Layout.createSequentialGroup()
                                .addGap(5, 5, 5)
                                .addComponent(jLabel11)))))
                .addGap(120, 234, Short.MAX_VALUE))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGap(89, 89, 89)
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6)
                .addGap(22, 22, 22)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(rbConsumer))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(rbCoop)
                        .addGap(36, 36, 36)
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblCredit))
                        .addGap(4, 4, 4)
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton1)
                            .addComponent(Cancel)))
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(rbDelivery))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(rbPickup)
                        .addGap(14, 14, 14)
                        .addComponent(lblDisplayDate)
                        .addGap(0, 0, Short.MAX_VALUE))))
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
            .addComponent(jPanel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
    public void changeAllListToConfirm(){
        for(int i=0;i<orderList.getNumberOfEntries();i++){
            orderList.getEntry(i+1).setOrder(order1);
        }
    }
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
                     }else if(totalAmount!=0.00){
                        
                         if(totalAmount>monthlyCredit){
                             
                             JOptionPane.showMessageDialog(null,"Monthly credit exceeded!!!", "WARNING",JOptionPane.ERROR_MESSAGE);
                         }else{
                             validate=true;
                         }
                         
                     }else{
                       
               validate=true;
          }
      
    }
return validate;
}
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
      boolean valid= inputValidate();
      
      int selection=0;
      
       if(valid==true){
           selection=JOptionPane.showConfirmDialog(null,"Confirm and make order?","CONFIRMATION",JOptionPane.YES_NO_OPTION);
           
           if(selection==0){
               if(watever.getSelection().getActionCommand().toLowerCase().equals("individual")){
                   consumer.setCustID("CO"+consumer.getNumber());
                   consumer.setCustName(tfCustName.getText());
                   consumer.setCustPhone(tfCustPhone.getText());
                   consumer.setCustAddress(taAddress.getText());
                  
                   order1.setConsumer(consumer);
                   order1.setOrderType(DorP.getSelection().getActionCommand());
                   order1.setOrderStatus("confirm");
                   order1.setTotalAmount(totalAmount);
                   changeAllListToConfirm();
                   
               }else if(watever.getSelection().getActionCommand().toLowerCase().equals("coop")){
                    order1.setCooperate(cooperate);
                   order1.setOrderType(DorP.getSelection().getActionCommand());
                   order1.setOrderStatus("confirm");
                   order1.setTotalAmount(totalAmount);
                   changeAllListToConfirm();
                  
               }
               if(DorP.getSelection().getActionCommand().equals("delivery")){
                   deliveryList.add(new Delivery(order1,"D0001","Not assigned yet","","",DateorPriority,taAddress.getText()));
                   System.out.println(deliveryList);
               }else if(DorP.getSelection().getActionCommand().toLowerCase().equals("pickup")){
                   pickupList.add(new Pickup(order1,"P0001","","",DateorPriority.toLowerCase(),"Not yet pickup"));
                             
               }
               
               JOptionPane.showMessageDialog(null, "Order is sucessfully addedd");
               System.out.print(order);
              
               //pass back param
               new DisplayCatalog(order1,orderList,allCatProdList,allCustProdList,allSalesOrderList,allOrderList,allConsumerList,allCoopList,allDeliveryList,allPickupList,allInvoiceList).setVisible(true);
               
           this.setVisible(false);
           
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

    private void rbCoopActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbCoopActionPerformed
 //open a table of coop customer for select
    JFrame jframe = new JFrame();
    GridLayout layout = new GridLayout(1,1);
    jframe.setLayout(layout);
   //JButton jbt = new JButton("close");
  //  jbt.setSize(50, 25);
    //row data dummy
   
    JTable jtb = new JTable();
    //put cooerate customer into the table
      DefaultTableModel model = (DefaultTableModel) jtb.getModel();
      //intialize column
      model.addColumn("Customer ID");
      model.addColumn("Cooperate Customer");
      model.addColumn("Credit Left");
        int rowCount = model.getRowCount();
        for (int i = rowCount - 1; i >= 0; i--) {model.removeRow(i);}//make it is empty
         for(int i=0;i<coopCustList.getNumberOfEntries();i++){
             CooperateE c = coopCustList.getEntry(i+1);
              model.addRow(new Object[]{c.getCustID(),c.getCustName(),c.getCustLimit()});
       }
    jtb.setBounds(30, 40, 200, 300);
    //add table onclick listener
    jtb.addMouseListener(new java.awt.event.MouseAdapter(){
        public void mouseClicked(java.awt.event.MouseEvent e){
            for(int i=0;i<coopCustList.getNumberOfEntries();i++){
                if(coopCustList.getEntry(i+1).getCustID().equals(jtb.getModel().getValueAt(jtb.getSelectedRow(),0))){
                    tfCustName.setText(coopCustList.getEntry(i+1).getCustName());
                    tfCustPhone.setText(coopCustList.getEntry(i+1).getCustPhone());
                    taAddress.setText(coopCustList.getEntry(i+1).getCustAddress());
                    tfCustName.setEditable(false);
                    tfCustPhone.setEditable(false);
                    taAddress.setEditable(false);
                    monthlyCredit =coopCustList.getEntry(i+1).getCustLimit();
                    lblCredit.setText("Credit left: "+monthlyCredit);
                    lblCredit.setVisible(true);
                    cooperate=coopCustList.getEntry(i+1);
                }
            }
            jframe.setVisible(false);
        }
    });
    
    
    
    JScrollPane jsp = new JScrollPane(jtb);
    jsp.setSize(400,300);
    jsp.setBackground(Color.white);

    // button action listener for close this frame
   /* jbt.addActionListener(new ActionListener()
{public void actionPerformed(ActionEvent e)
  {jframe.setVisible(false);}});*/
    
    //initialize the frame componenet
    jframe.setSize(300, 300);
    jframe.add(jsp);
    jframe.setLocation(750, 500);
    jframe.setVisible(true);
    }//GEN-LAST:event_rbCoopActionPerformed

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
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ConfirmOrder(order1,orderList,prodList,allCatProdList,allCustProdList,allSalesOrderList,allOrderList,allConsumerList,allCoopList,allDeliveryList,allPickupList,allInvoiceList).setVisible(true);
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
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JLabel lblChooseFromList;
    private javax.swing.JLabel lblCredit;
    private javax.swing.JLabel lblDisplayDate;
    private javax.swing.JRadioButton rbConsumer;
    private javax.swing.JRadioButton rbCoop;
    private javax.swing.JRadioButton rbDelivery;
    private javax.swing.JRadioButton rbPickup;
    private javax.swing.JTextArea taAddress;
    private javax.swing.JTextField tfCustName;
    private javax.swing.JTextField tfCustPhone;
    private javax.swing.ButtonGroup watever;
    // End of variables declaration//GEN-END:variables

   
}
