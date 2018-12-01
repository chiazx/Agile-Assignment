/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI;

import ADT.*;
import Entity.CatalogProduct;
import Entity.OrderList;
import java.awt.Image;
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
 String orderID="";
    /**
     * Creates new form DisplayCatalog
     */
    public DisplayCatalog() {
        initComponents();
        initialize();
       
    }
public void initialize(){
    //initialize product details
   
   // CatalogProduct catalogProduct = new CatalogProduct();
   //fake order ID
   orderID="OL0001";
   jLabel3.setVisible(false);
   //insert dummy flower data
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
   orderList.add(new OrderList("OL0001","CP001","2","OR0001"));
      orderList.add(new OrderList("OL0002","CP002","1","OR0001"));
         orderList.add(new OrderList("OL0003","CP010","3","OR0001"));
            orderList.add(new OrderList("OL0004","CP003","1","OR0001"));
   
            //  System.out.print(prodList.getNumberOfEntries());
              
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
            System.out.print(prodList.getEntry(i+1).getProdName());
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
               if(orderList.getEntry(i+1).getProdID().equals(prodList.getEntry(j+1).getProdID())){
                   model.addRow(new Object[]{prodList.getEntry(j+1).getProdName(),orderList.getEntry(i+1).getQuantity()});
           }
           
       }
       }
        
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
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
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
        jPanel10 = new javax.swing.JPanel();
        jButton3 = new javax.swing.JButton();
        errorMsg1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jPanel11 = new javax.swing.JPanel();
        jButton4 = new javax.swing.JButton();
        errorMsg2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(122, 72, 221));

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 738, Short.MAX_VALUE)
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 67, Short.MAX_VALUE)
        );

        jLabel9.setFont(new java.awt.Font("Berlin Sans FB Demi", 1, 36)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Product Order");

        jLabel2.setFont(new java.awt.Font("Berlin Sans FB Demi", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Order Catlog Product or Customize Product from here!");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 352, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addContainerGap(77, Short.MAX_VALUE))
        );

        jPanel1.setBackground(new java.awt.Color(54, 33, 89));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ui/images/icons8_Go_Back_35px.png"))); // NOI18N
        jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(225, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(80, 80, 80)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel8.setBackground(new java.awt.Color(255, 255, 255));

        jPanel9.setBackground(new java.awt.Color(255, 255, 255));

        jButton2.setFont(new java.awt.Font("Microsoft Himalaya", 1, 24)); // NOI18N
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ui/images/icons8_Add_28px.png"))); // NOI18N
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

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addComponent(errorMsg)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton2))
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel9Layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel9Layout.createSequentialGroup()
                                        .addComponent(Flowerddl, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(43, 43, 43)
                                        .addComponent(flowerStyleLabel))
                                    .addGroup(jPanel9Layout.createSequentialGroup()
                                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel3)
                                            .addComponent(lblQuanity))
                                        .addGap(8, 8, 8)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(FlowerStyleddl, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tfQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 76, Short.MAX_VALUE))
                            .addComponent(imgDesclbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap())
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGap(171, 171, 171)
                        .addComponent(FlowerImage, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(flowerStyleLabel)
                    .addComponent(Flowerddl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(FlowerStyleddl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblQuanity)
                    .addComponent(tfQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addComponent(FlowerImage, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
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
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ui/images/icons8_Checked_26px.png"))); // NOI18N
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
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 510, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 76, Short.MAX_VALUE))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel10Layout.createSequentialGroup()
                .addContainerGap(92, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(84, 84, 84)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton3)
                    .addComponent(errorMsg1))
                .addContainerGap())
        );

        jTabbedPane1.addTab("Current Order", jPanel10);

        jPanel11.setBackground(new java.awt.Color(255, 255, 255));

        jButton4.setFont(new java.awt.Font("Microsoft Himalaya", 1, 24)); // NOI18N
        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ui/images/icons8_Next_page_28px.png"))); // NOI18N
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

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(errorMsg2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 462, Short.MAX_VALUE)
                .addComponent(jButton4))
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel11Layout.createSequentialGroup()
                .addContainerGap(424, Short.MAX_VALUE)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton4)
                    .addComponent(errorMsg2))
                .addContainerGap())
        );

        jTabbedPane1.addTab("On-Hold Order", jPanel11);

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );

        jTabbedPane1.getAccessibleContext().setAccessibleName("Catalog");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void refreshOrderTable(){
        
        DefaultTableModel model = (DefaultTableModel) jTable2.getModel();
        int rowCount = model.getRowCount();
      //  System.out.print(rowCount+"222");
        for (int i = rowCount - 1; i >= 0; i--) {
    model.removeRow(i);
}
        
        System.out.print(orderList.getNumberOfEntries());
       for(int i=0;i<orderList.getNumberOfEntries();i++){
           for(int j=0;j<prodList.getNumberOfEntries();j++){
            //   System.out.println(prodList.getEntry(j+1).getProdName                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         
               if(orderList.getEntry(i+1).getProdID().equals(prodList.getEntry(j+1).getProdID())){
                   model.addRow(new Object[]{prodList.getEntry(j+1).getProdName(),orderList.getEntry(i+1).getQuantity()});
           }
           
       }
       }
    }
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
      // check whether item is slected
      //System.out.print(FlowerStyleddl.getItemCount()<3);
      
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
            }
           }
           
       
              orderList.add(new OrderList(GenerateNextOLID(),prodID,tfQuantity.getText(),"OR0001"));
              refreshOrderTable();
          JOptionPane.showMessageDialog(null,"Item is successfully addedd to cart","Confirmation message", JOptionPane.INFORMATION_MESSAGE);
      }  
      }
        
    }//GEN-LAST:event_jButton2ActionPerformed
    public String GenerateNextOLID(){
        // read the last item and add to next
        String newID="";
          int lastOrderItemIndex = orderList.getNumberOfEntries();
          //update the last orderListID
          String lastOrderListID = orderList.getEntry(lastOrderItemIndex).getOLID();
          String prefix =lastOrderListID.substring(0, 2);
          int integer = Integer.parseInt(lastOrderListID.substring(2,6));
          integer +=1;
          
          newID=prefix+String.format("%04d", integer);
          System.out.println(newID);
          System.out.println(lastOrderItemIndex);
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
        jLabel3.setVisible(true);
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
                imgDesc="";price+= String.format("%.2f",120.00);
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
            imgIcon = new ImageIcon(getClass().getResource("/ui/images/"+imgFile));
            Image image = imgIcon.getImage();
            Image resize = image.getScaledInstance( 200, 150, java.awt.Image.SCALE_SMOOTH);
            imgIcon = new ImageIcon(resize);
            jLabel3.setText(price);
            imgDesclbl.setText(imgDesc);

            FlowerImage.setIcon(imgIcon);
        }
        if(FlowerStyleddl.getSelectedIndex()!=0){
            lblQuanity.setVisible(true);
            tfQuantity.setVisible(true);
        }
    }//GEN-LAST:event_FlowerStyleddlActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
     new ConfirmOrder(orderList,prodList).setVisible(true);
     
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
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTable2;
    private javax.swing.JLabel lblQuanity;
    private javax.swing.JTextField tfQuantity;
    // End of variables declaration//GEN-END:variables
}
