/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI;

import ADT.*;
import Entity.CatalogProduct;
import Entity.ConsumerE;
import Entity.CooperateE;
import Entity.Order;
import Entity.OrderList;
import static UI.SalesOrder.salesOrderList;
import java.awt.Image;
import java.awt.Toolkit;
import java.net.URL;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author boonk
 */
public class DisplayCatalog extends javax.swing.JFrame {
 ListInterface<CatalogProduct> prodList = new LList();
 ListInterface<OrderList> orderList = new LList();
 ListInterface<Order> salesOrderList = new LList<>();
 ListInterface<OrderList> selectOrderList = new LList<>();
 double totalAmt=0.00;
 Order order = new Order();
 String orderID="";
    /**
     * Creates new form DisplayCatalog
     */
    public DisplayCatalog() {
        initComponents();
        initialize();
    }
    public DisplayCatalog(Order order1, ListInterface<OrderList> confirmOrderList){
     //class for receive from catalog order.
    
      salesOrderList.add(order1);
        for(int i =0;i<confirmOrderList.getNumberOfEntries();i++){

            orderList.add(confirmOrderList.getEntry(i+1));
        }
        initComponents();
        initialize();
         
    }
    public void getConfirmSales(Order order, ListInterface<OrderList> confirmOrderList){
        salesOrderList.add(order);
        for(int i =0;i<confirmOrderList.getNumberOfEntries();i++){
            orderList.add(confirmOrderList.getEntry(i+1));
        }
    }
public void initialize(){
    //initialize product details
   
   // CatalogProduct catalogProduct = new CatalogProduct();
   //fake order ID
   
   jLabel3.setVisible(false);
   //insert dummy flower data
   // for sales table use
   
    prodList.add(new CatalogProduct("CP001","Just For You","Roses","Available","Including lavish wrapping with luxurious paper, \n guaranteed to make the recipient smile.",120.00));
     prodList.add(new CatalogProduct("CP002","True Romance","Roses","Available","Including lavish wrapping with luxurious paper, \n guaranteed to make the recipient smile.",120.00));
      prodList.add(new CatalogProduct("CP003","Teddy Red","Roses","Available","Including lavish wrapping with luxurious paper, \n guaranteed to make the recipient smile.",120.00));
       prodList.add(new CatalogProduct("CP004","Queen","Roses","Available","Including lavish wrapping with luxurious paper, \n guaranteed to make the recipient smile.",120.00));
        prodList.add(new CatalogProduct("CP005","Pink Delight","Lilies","Available","Including lavish wrapping with luxurious paper, \n guaranteed to make the recipient smile.",100.00));
         prodList.add(new CatalogProduct("CP006","Lily Love","Lilies","Available","Including lavish wrapping with luxurious paper, \n guaranteed to make the recipient smile.",100.00));
          prodList.add(new CatalogProduct("CP007","Princess","Lilies","Available","Including lavish wrapping with luxurious paper, \n guaranteed to make the recipient smile.",100.00));
           prodList.add(new CatalogProduct("CP008","Montrex Tulips","Tulips","Available","Include red tulips, yellow tulips, purple tulips.",100.00));
            prodList.add(new CatalogProduct("CP009","Purple Tulips","Tulips","Available","Including lavish wrapping with luxurious paper, \n guaranteed to make the recipient smile.",100.00));
             prodList.add(new CatalogProduct("CP010","Over The Rainbow","Others","Available","Including lavish wrapping with luxurious paper, \n guaranteed to make the recipient smile.",100.00));
              prodList.add(new CatalogProduct("CP011","Sweet Admiration","Others","Available","Including lavish wrapping with luxurious paper, \n guaranteed to make the recipient smile.",100.00));
              //insert dummy order data
              ConsumerE consumer= new ConsumerE("CP1000","POPPY","017-99912345","Jalan Pokong \n 99999");
        CooperateE cooperate = new CooperateE("CO1000","MEOW Sdn Bhd","012-1231231",200.00,"Jalan Pokok \n 010100");
        salesOrderList.add(new Order(consumer,"OR0001","confirm","delivery",200.00));
        salesOrderList.add(new Order(cooperate,"OR0002","confirm","pickup",200.00));
        salesOrderList.add(new Order(consumer,"OR0003","confirm","delivery",200.00));
        
         orderList.add(new OrderList(prodList.getEntry(2),salesOrderList.getEntry(1),"OL0001","2"));
         orderList.add(new OrderList(prodList.getEntry(3),salesOrderList.getEntry(2),"OL0002","4"));
         orderList.add(new OrderList(prodList.getEntry(5),salesOrderList.getEntry(1),"OL0003","2"));
         orderList.add(new OrderList(prodList.getEntry(4),salesOrderList.getEntry(3),"OL0001","3"));
          order.setOrderID(GenerateNextORID());//everytime the class is called add new one.
   order.setOrderStatus("processing");
   /*orderList.add(new OrderList("OL0001","CP001","2","OR0001"));
      orderList.add(new OrderList("OL0002","CP002","1","OR0001"));
         orderList.add(new OrderList("OL0003","CP010","3","OR0001"));
            orderList.add(new OrderList("OL0004","CP003","1","OR0001"));*/
   
            //  System.out.print(prodList.getNumberOfEntries());
              //clear all the order item
              
              Flowerddl.removeAllItems(); // make sure nothing in ddl
              Flowerddl.addItem(" ");
    // initialize the flower type drop down list
    int containsInDDL = 0;
    for(int i=0 ;i<prodList.getNumberOfEntries();i++){
        containsInDDL =0;
        if(Flowerddl.getItemCount()>1){
            
            for(int j =0;j<Flowerddl.getItemCount();j++){
                
                if(prodList.getEntry(i+1).getProdType().equals(Flowerddl.getItemAt(j+1))){
                 //   System.out.println(prodList.getEntry(i+1).getProdType());
                    containsInDDL++;
                }
            }
             if(containsInDDL==0){
                    
                Flowerddl.addItem(prodList.getEntry(i+1).getProdType());
            //check if no such item contain in drop down
            
            }
    }else{
            //System.out.print(prodList.getEntry(i+1).getProdName());
            Flowerddl.addItem(prodList.getEntry(i+1).getProdType().toString()); // if no item, add it
        }
    }
    
    //close all the error message
    errorMsg.setVisible(false);
    errorMsg1.setVisible(false);
    errorMsg2.setVisible(false);
    // display order ini
    
        
        FlowerStyleddl.setVisible(false);
        flowerStyleLabel.setVisible(false);
        FlowerStyleddl.addItem(" ");
        FlowerImage.setText("");
        tfQuantity.setVisible(false);
        lblQuanity.setVisible(false);
        errorMsg.setVisible(false);
      
       // current order ini
        DefaultTableModel model = (DefaultTableModel) jTable2.getModel();
       for(int i=0;i<orderList.getNumberOfEntries();i++){
           for(int j=0;j<prodList.getNumberOfEntries();j++){
            //   System.out.println(prodList.getEntry(j+1).getProdName());
            
               if(orderList.getEntry(i+1).getCatalogProduct().getProdID().equals(prodList.getEntry(j+1).getProdID())){
                   model.addRow(new Object[]{prodList.getEntry(j+1).getProdName(),orderList.getEntry(i+1).getQuantity()});
           }
           
       }
       }
        refreshOrderTable();
        refreshSalesOrderTable();
     jTable2.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
     jTable2.getSize();
      jTable2.getColumnModel().getColumn(0).setPreferredWidth((jTable2.getSize().width)/100*70);
        jTable2.getColumnModel().getColumn(1).setPreferredWidth((jTable2.getSize().width)/100*30);
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
        jPanel7 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel9 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        flowerStyleLabel = new javax.swing.JLabel();
        Flowerddl = new javax.swing.JComboBox<>();
        FlowerStyleddl = new javax.swing.JComboBox<>();
        errorMsg = new javax.swing.JLabel();
        FlowerImage = new javax.swing.JLabel();
        imgDesclbl = new javax.swing.JLabel();
        lblQuanity = new javax.swing.JLabel();
        tfQuantity = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jPanel10 = new javax.swing.JPanel();
        jButton3 = new javax.swing.JButton();
        errorMsg1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        jPanel11 = new javax.swing.JPanel();
        jButton4 = new javax.swing.JButton();
        errorMsg2 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Daily sales order");

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
        jLabel9.setText("Product Order");

        jLabel2.setFont(new java.awt.Font("Berlin Sans FB Demi", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Order Catlog Product from here!");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 352, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel9.setBackground(new java.awt.Color(255, 255, 255));

        jButton2.setFont(new java.awt.Font("Microsoft Himalaya", 1, 24)); // NOI18N
        jButton2.setText("Add to current order");
        jButton2.setActionCommand("Add");
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel5.setText("Product Type :");

        flowerStyleLabel.setText("Please choose a product");

        Flowerddl.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Flowerddl.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FlowerddlActionPerformed(evt);
            }
        });

        FlowerStyleddl.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        FlowerStyleddl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                FlowerStyleddlMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                FlowerStyleddlMousePressed(evt);
            }
        });
        FlowerStyleddl.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FlowerStyleddlActionPerformed(evt);
            }
        });

        errorMsg.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        errorMsg.setForeground(new java.awt.Color(255, 51, 51));
        errorMsg.setText("ERROR");

        FlowerImage.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        FlowerImage.setToolTipText("");
        FlowerImage.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        FlowerImage.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        FlowerImage.setIconTextGap(2);
        FlowerImage.setName(""); // NOI18N

        imgDesclbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        imgDesclbl.setText("6");
        imgDesclbl.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        imgDesclbl.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        lblQuanity.setText("Quanity ");

        jLabel3.setText("Unit Price:");

        jLabel6.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 24)); // NOI18N
        jLabel6.setText("Product Catalogue");

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addComponent(errorMsg)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton2))
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel9Layout.createSequentialGroup()
                                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel9Layout.createSequentialGroup()
                                        .addComponent(jLabel5)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(Flowerddl, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(43, 43, 43)
                                        .addComponent(flowerStyleLabel))
                                    .addComponent(jLabel3)
                                    .addComponent(lblQuanity))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(FlowerStyleddl, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tfQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 25, Short.MAX_VALUE))
                            .addComponent(imgDesclbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap())))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(FlowerImage, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(160, 160, 160))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6)
                .addGap(24, 24, 24)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(Flowerddl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(FlowerStyleddl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(flowerStyleLabel))
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblQuanity))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 49, Short.MAX_VALUE)
                .addComponent(FlowerImage, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(imgDesclbl, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(errorMsg))
                .addContainerGap())
        );

        jTabbedPane1.addTab("Product Catalog", jPanel9);
        jPanel9.getAccessibleContext().setAccessibleName("");

        jPanel10.setBackground(new java.awt.Color(255, 255, 255));

        jButton3.setFont(new java.awt.Font("Microsoft Himalaya", 1, 24)); // NOI18N
        jButton3.setText("Confirm Order");
        jButton3.setActionCommand("Add");
        jButton3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        errorMsg1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        errorMsg1.setForeground(new java.awt.Color(255, 51, 51));
        errorMsg1.setText("ERROR");

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Product", "Quantity"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable2.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
        jTable2.setColumnSelectionAllowed(true);
        jTable2.setRowSelectionAllowed(false);
        jTable2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable2MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable2);

        jLabel4.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 24)); // NOI18N
        jLabel4.setText("Current order items");

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(errorMsg1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton3))
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 510, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 25, Short.MAX_VALUE))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel10Layout.createSequentialGroup()
                .addContainerGap(69, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addGap(24, 24, 24)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(77, 77, 77)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton3)
                    .addComponent(errorMsg1))
                .addContainerGap())
        );

        jTabbedPane1.addTab("Current Order", jPanel10);

        jPanel11.setBackground(new java.awt.Color(255, 255, 255));

        jButton4.setFont(new java.awt.Font("Microsoft Himalaya", 1, 24)); // NOI18N
        jButton4.setText("Next");
        jButton4.setActionCommand("Add");
        jButton4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        errorMsg2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        errorMsg2.setForeground(new java.awt.Color(255, 51, 51));
        errorMsg2.setText("ERROR");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Order ID", "Customer Name", "Total Amount"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
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
        jScrollPane2.setViewportView(jTable1);

        jLabel1.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 24)); // NOI18N
        jLabel1.setText("Today Sales");

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addComponent(errorMsg2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 443, Short.MAX_VALUE)
                        .addComponent(jButton4))
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 461, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel11Layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 136, Short.MAX_VALUE)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton4)
                    .addComponent(errorMsg2))
                .addContainerGap())
        );

        jTabbedPane1.addTab("Daily Sales Order", jPanel11);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)


            .addComponent(jTabbedPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 593, Short.MAX_VALUE)


            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)


                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 491, javax.swing.GroupLayout.PREFERRED_SIZE)

                .addContainerGap())

        );

        jTabbedPane1.getAccessibleContext().setAccessibleName("Catalog");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void refreshSalesOrderTable(){
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        int rowCount = model.getRowCount();
      //  System.out.print(rowCount+"222");
        for (int i = rowCount - 1; i >= 0; i--) {
    model.removeRow(i);
}
        
         for(int i=0;i<salesOrderList.getNumberOfEntries();i++){
               if(salesOrderList.getEntry(i+1).getOrderStatus().toLowerCase().equals("confirm")){
                    if(salesOrderList.getEntry(i+1).getConsumer()!=null){
                 model.addRow(new Object[]{salesOrderList.getEntry(i+1).getOrderID(),salesOrderList.getEntry(i+1).getConsumer().getCustName(),salesOrderList.getEntry(i+1).getTotalAmount()});
           }else if(salesOrderList.getEntry(i+1).getCooperate()!=null){
               model.addRow(new Object[]{salesOrderList.getEntry(i+1).getOrderID(),salesOrderList.getEntry(i+1).getCooperate().getCustName(),salesOrderList.getEntry(i+1).getTotalAmount()});
           }
                 
           }
       }
    }
    public void refreshOrderTable(){
        totalAmt=0.00;
        DefaultTableModel model = (DefaultTableModel) jTable2.getModel();
        int rowCount = model.getRowCount();
      //  System.out.print(rowCount+"222");
        for (int i = rowCount - 1; i >= 0; i--) {
    model.removeRow(i);
}

       for(int i=0;i<orderList.getNumberOfEntries();i++){
           if(!orderList.getEntry(i+1).getOrder().getOrderStatus().toLowerCase().equals("confirm")){
        model.addRow(new Object[]{orderList.getEntry(i+1).getCatalogProduct().getProdName(),orderList.getEntry(i+1).getQuantity()});
               totalAmt+=orderList.getEntry(i+1).getCatalogProduct().getProdPrice()*(Integer.parseInt(orderList.getEntry(i+1).getQuantity()));
           }
       }
    }
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
      // check whether item is slected
      //System.out.print(FlowerStyleddl.getItemCount()<3);
      CatalogProduct selectedProd = new CatalogProduct();
      if(Flowerddl.getSelectedIndex()==0){
          JOptionPane.showMessageDialog(null,"Please select product type!","Warning", JOptionPane.WARNING_MESSAGE);
      }else if(tfQuantity.getText().equals("")){
          //check if quantity is entered
           // check whether item is slected
      
          JOptionPane.showMessageDialog(null,"Please enter quantity!","Warning", JOptionPane.WARNING_MESSAGE);
      }else if (tfQuantity.getText()!=""){
          //check if quantity is number
          if(!tfQuantity.getText().matches("^[0-9]*$")){
          JOptionPane.showMessageDialog(null,"Quantity must be Integer! \n E.G(0-9)","Warning", JOptionPane.WARNING_MESSAGE);
      }else{
              //get the flower ID
              String prodID="";
              for(int j=0;j<prodList.getNumberOfEntries();j++){
            if(prodList.getEntry(j+1).getProdName().equals(FlowerStyleddl.getSelectedItem().toString())){
                prodID =prodList.getEntry(j+1).getProdID();
                selectedProd=prodList.getEntry(j+1);
            }
           }
           
               if(jTable2.getRowCount()==0){
                   order.setOrderStatus("processing");
                   salesOrderList.add(order);
               }
               
              orderList.add(new OrderList(selectedProd,order,GenerateNextOLID(),tfQuantity.getText()));
              refreshOrderTable();
          JOptionPane.showMessageDialog(null,"Item is successfully addedd to cart","Confirmation message", JOptionPane.INFORMATION_MESSAGE);
      }  
      }
        
    }//GEN-LAST:event_jButton2ActionPerformed

    
    

    public String GenerateNextOLID(){
        // read the last item and add to next
        String newID="";
        if(!orderList.isEmpty()){
          int lastOrderItemIndex = orderList.getNumberOfEntries();
          //update the last orderListID
          String lastOrderListID = orderList.getEntry(lastOrderItemIndex).getOLID();
          String prefix =lastOrderListID.substring(0, 2);
          int integer = Integer.parseInt(lastOrderListID.substring(2,6));
          integer +=1;
          
          newID=prefix+String.format("%04d", integer);
        }else{
            newID="OL0001";
        }
          
     return newID;
          
    }
    private void FlowerddlActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FlowerddlActionPerformed
      // Flowerddl.removeAllItems();
       
        
        String flower=Flowerddl.getSelectedItem().toString();
        
        if(flower =="Roses"){

            FlowerStyleddl.removeAllItems();
            FlowerStyleddl.addItem("Just For You");
            FlowerStyleddl.addItem("True Romance");
            FlowerStyleddl.addItem("Teddy Red");
            FlowerStyleddl.addItem("Queen");
            flowerStyleLabel.setVisible(true);
            FlowerStyleddl.setVisible(true);
            //FlowerStyleddl.setSelectedIndex(0);
        }else if(flower == "Lilies"){

            FlowerStyleddl.removeAllItems();
            FlowerStyleddl.addItem("Pink Delight");
            FlowerStyleddl.addItem("Lily Love");
            FlowerStyleddl.addItem("Princess");
            flowerStyleLabel.setVisible(true);
            FlowerStyleddl.setVisible(true);
            //FlowerStyleddl.setSelectedIndex(0);
        }else if(flower == "Tulips"){

            FlowerStyleddl.removeAllItems();
            FlowerStyleddl.addItem("Montrex Tulips");
            FlowerStyleddl.addItem("Purple Tulips in a Vase");
            flowerStyleLabel.setVisible(true);
            FlowerStyleddl.setVisible(true);
            //FlowerStyleddl.setSelectedIndex(0);
        }
        else if(flower =="Others"){

            FlowerStyleddl.removeAllItems();
            FlowerStyleddl.addItem("Over the Rainbow");
            FlowerStyleddl.addItem("Sweet Admiration");

            flowerStyleLabel.setVisible(true);
            FlowerStyleddl.setVisible(true);
            //FlowerStyleddl.setSelectedIndex(0);
        }
    }//GEN-LAST:event_FlowerddlActionPerformed

    private void FlowerStyleddlMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_FlowerStyleddlMouseExited

    }//GEN-LAST:event_FlowerStyleddlMouseExited

    private void FlowerStyleddlMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_FlowerStyleddlMousePressed

    }//GEN-LAST:event_FlowerStyleddlMousePressed

    private void FlowerStyleddlActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FlowerStyleddlActionPerformed
        String s="";
        String imgFile="";
        String imgDesc="";
       // jLabel3.setVisible(true);
        String price="Unit price: ";
        
        FlowerStyleddl.addItem(" ");
        // the image is show only when the flower styl drop down list is enable
        if(FlowerStyleddl.isShowing()){
        s = FlowerStyleddl.getSelectedItem().toString();
           /* for(int i=0; i<prodList.getNumberOfEntries();i++){
                if(s==prodList.getEntry(i+1).getProdName()){
                    
                }
            }*/
            //  FlowerStyleddl.setSelectedIndex(0);
            

            if(s=="Just For You"){
                imgFile="JustForYou.jpg";
                imgDesc="";
                price+= String.format("%.2f",120.00);
            }else if(s=="True Romance"){
                imgFile="TrueRomance.jpg";
                imgDesc="";
                price+= String.format("%.2f",120.00);
            }else if(s=="Teddy Red"){
                imgFile="TeddyRed.jpg";
                imgDesc="";price+= String.format("%.2f",110.00);
            }else if(s=="Queen"){
                imgFile="Queen.jpg";
                imgDesc="";price+= String.format("%.2f",120.00);
            }else if(s=="Pink Delight"){
                imgFile="PinkDelight.jpg";
                imgDesc="";price+= String.format("%.2f",100.00);
            }else if(s=="Lily Love"){
                imgFile="Lily Love.jpg";
                imgDesc="";price+= String.format("%.2f",100.00);
            }else if(s=="Princess"){
                imgFile="Princess.jpg";
                imgDesc="";price+= String.format("%.2f",100.00);
            }else if(s=="Over the Rainbow"){
                imgFile="OverTheRainbow.jpg";imgDesc="";price+= String.format("%.2f",100.00);
            }else if(s=="Sweet Admiration"){
                imgFile="SweetAdmiration.jpg";
                imgDesc="";price+= String.format("%.2f",100.00);
            }else if(s=="Montrex Tulips"){
                imgFile="MontrexTulips.jpg";
                imgDesc="";price+= String.format("%.2f",100.00);
            }else if(s=="Purple Tulips"){
                imgFile="PurpleTulips.jpg";
                imgDesc="";price+= String.format("%.2f",100.00);
            }
            ImageIcon imgIcon;
            
            imgIcon = new ImageIcon(getClass().getResource("../ui/images/"+imgFile));
            Image image = imgIcon.getImage();
            Image resize = image.getScaledInstance( 200, 150, java.awt.Image.SCALE_SMOOTH);
            imgIcon = new ImageIcon(resize);
            jLabel3.setText(price);
            jLabel3.setVisible(true);
            imgDesclbl.setText(imgDesc);

            FlowerImage.setIcon(imgIcon);
        }
        if(FlowerStyleddl.getSelectedIndex()!=0){
            lblQuanity.setVisible(true);
            tfQuantity.setVisible(true);
        }
    }//GEN-LAST:event_FlowerStyleddlActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        System.out.print(order.getOrderID());
        if(jTable2.getRowCount()!=0){
           new ConfirmOrder(order,orderList,prodList).setVisible(true);
     }else{
         JOptionPane.showMessageDialog(null, "Please choose at least one item or product! ","INFORMATION",JOptionPane.INFORMATION_MESSAGE);
     }
      
     
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jTable2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable2MouseClicked
        int selected = jTable2.getSelectedRow();
        String selectedItem = jTable2.getModel().getValueAt(selected, 0).toString();
        String updatedQuantity ="";
        String string="";
        do {
                 string= JOptionPane.showInputDialog("Quantity");
                if (string.matches("^[0-9]*$")) {
                    updatedQuantity = string;
                  
                } else {
                   JOptionPane.showMessageDialog(null, "Please enter a number");
                }
            } while (!string.matches("^[0-9]*$"));
        
        
        
        //String updatedQuantity =JOptionPane.showInputDialog(null,selectedItem+"\n Change Quantity: ","Edit Product Quantity",JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_jTable2MouseClicked

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
      int rowSelected = jTable1.getSelectedRow();
      Order order = new Order();//to get selected order order
     
      for(int i=0;i<orderList.getNumberOfEntries();i++){
          
         if(orderList.getEntry(i+1).getOrder().getOrderID().equals(jTable1.getModel().getValueAt(rowSelected, 0))) {
             selectOrderList.add(orderList.getEntry(i+1));
            
         }
      }
      for(int i=0;i<salesOrderList.getNumberOfEntries();i++){
          if(salesOrderList.getEntry(i+1).getOrderID().equals(jTable1.getModel().getValueAt(rowSelected, 0))){
              order = salesOrderList.getEntry(i+1);
          }
      }
      System.out.print(selectOrderList.getNumberOfEntries()+"NO");
      new SalesOrder(order,selectOrderList).setVisible(true);
    }//GEN-LAST:event_jTable1MouseClicked

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
            java.util.logging.Logger.getLogger(DisplayCatalog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DisplayCatalog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DisplayCatalog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DisplayCatalog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DisplayCatalog().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel FlowerImage;
    private javax.swing.JComboBox<String> FlowerStyleddl;
    private javax.swing.JComboBox<String> Flowerddl;
    private javax.swing.JLabel errorMsg;
    private javax.swing.JLabel errorMsg1;
    private javax.swing.JLabel errorMsg2;
    private javax.swing.JLabel flowerStyleLabel;
    private javax.swing.JLabel imgDesclbl;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JLabel lblQuanity;
    private javax.swing.JTextField tfQuantity;
    // End of variables declaration//GEN-END:variables
}
