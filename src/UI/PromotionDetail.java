/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI;

import ADT.LList;
import ADT.ListInterface;
import Entity.*;
import java.awt.Component;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;
import javax.swing.RowFilter;
import javax.swing.event.TableModelEvent;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;
/**
 *
 * @author User
 */
public class PromotionDetail extends javax.swing.JFrame {

    
    /**
     * Creates new form PromotionDetail
     */
    public PromotionDetail() {
        initComponents();
        initialize();
    }

    public void initialize(){
        CatalogProduct cp = new CatalogProduct("FL001","Lily","Bouquet","Available","Funny",120.00,120);
        CatalogProduct cp1 = new CatalogProduct("FL002","Rose","Floral arrangement","Remaining Stock Rarely","Funny",120.00,30);
        CatalogProduct cp2 = new CatalogProduct("FL003","Carnation","Bouquet","Out-of-Stock","Funny",120.00,0);
        CatalogProduct cp3 = new CatalogProduct("FL004","Tuplis","Fresh Flower","Available","Funny",120.00,120); 
        productList.add(cp);
        productList.add(cp1);
        productList.add(cp2);
        productList.add(cp3); 
        refreshFlowerDDL();
        refreshsFlowerDDL();
       
       //promotionList.add(new Promotion("PR002","2018-10-01","2018-10-31","Winter Sales",20));
       //promotionList.add(new Promotion("PR003","2018-11-01","2018-12-1","Clear Stock Sales",30));
       //promotionList.add(new Promotion("PR004","2018-12-01","2018-12-31","No money",40));
       Promotion p = new Promotion("PR001","2018-09-01","2018-10-1","Summer Sales",10);
       promotionList.add(p);       
       
       PromotionList Pl = new PromotionList(cp,p,"PL001");
       promoList.add(Pl);
       
       DefaultTableModel model = (DefaultTableModel) Product.getModel();
        for(int i=0; i<productList.getNumberOfEntries(); i++){
            model.addRow(new Object[]{productList.getEntry(i+1).getProdID(),
                                      productList.getEntry(i+1).getProdName(),
                                      productList.getEntry(i+1).getProdType(),
                                      productList.getEntry(i+1).getProdPrice(),
                                      productList.getEntry(i+1).getProdQuantity(),
            });
        }
        
        DefaultTableModel model2 = (DefaultTableModel) PromotionDetails.getModel();
        for(int a=0; a<promotionList.getNumberOfEntries(); a++){
            for(int i=0; i<productList.getNumberOfEntries(); i++){
                model2.addRow(new Object[]{promotionList.getEntry(a+1).getPromotionID(),
                                           promotionList.getEntry(a+1).getPromotionTitle(),
                                           productList.getEntry(i+1).getProdName(),
                                           productList.getEntry(i+1).getProdType(),
                                           promotionList.getEntry(a+1).getDiscountRate(),
                                           productList.getEntry(i+1).getProdPrice(),
                                           promotionList.getEntry(a+1).getStartDate(),
                                           promotionList.getEntry(a+1).getEndDate()
                });
            }
        }
    }
    
    public void refreshFlowerDDL(){
        pType.removeAllItems();
            pType.addItem(" ");
                for(int i=0; i<productList.getNumberOfEntries(); i++){
                    pType.addItem(productList.getEntry(i+1).getProdType());
                }
    }
    
    public void refreshsFlowerDDL(){
        pType2.removeAllItems();
            pType2.addItem(" ");
                for(int i=0; i<productList.getNumberOfEntries(); i++){
                    pType2.addItem(productList.getEntry(i+1).getProdType());
                }
    }
        
    public void refreshPromotionTable(){
            DefaultTableModel model =(DefaultTableModel) PromotionDetails.getModel();
                int rowCount = model.getRowCount();
                    for(int i=rowCount-1 ; i>=0;i--){
                        model.removeRow(i);
                    }
        
        for(int a=0; a<promotionList.getNumberOfEntries(); a++){
            for(int i=0; i<productList.getNumberOfEntries(); i++){
                model.addRow(new Object[]{promotionList.getEntry(a+1).getPromotionID(),
                                           promotionList.getEntry(a+1).getPromotionTitle(),
                                           productList.getEntry(i+1).getProdName(),
                                           productList.getEntry(i+1).getProdType(),
                                           promotionList.getEntry(a+1).getDiscountRate(),
                                           productList.getEntry(i+1).getProdPrice(),
                                           promotionList.getEntry(a+1).getStartDate(),
                                           promotionList.getEntry(a+1).getEndDate()
                });
            }
        }
        PromotionDetails.setRowSelectionAllowed(true);
        PromotionDetails.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
        }
    
    public void refreshProductTable(){
        DefaultTableModel model = (DefaultTableModel) Product.getModel();
        Object[] rowData = new Object[5];
        for(int i=0; i< productList.getNumberOfEntries(); i++){
            rowData[0] = productList.getEntry(i+1).getProdID();
            rowData[1] = productList.getEntry(i+1).getProdName();
            rowData[2] = productList.getEntry(i+1).getProdType();
            rowData[3] = productList.getEntry(i+1).getProdPrice();
            rowData[4] = productList.getEntry(i+1).getProdQuantity();
            model.addRow(rowData);
        }
        Product.setRowSelectionAllowed(true);
        Product.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
    }
    ListInterface<Promotion> promotionList = new LList<>();
    ListInterface<CatalogProduct> productList = new LList<>();
    ListInterface<PromotionList> promoList = new LList<>(); 
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollBar1 = new javax.swing.JScrollBar();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        pType = new javax.swing.JComboBox<>();
        Create = new javax.swing.JButton();
        PromotionTitle = new javax.swing.JTextField();
        DiscountRate = new javax.swing.JTextField();
        StartDate = new com.toedter.calendar.JDateChooser();
        EndDate = new javax.swing.JTextField();
        Show = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        Product = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane7 = new javax.swing.JScrollPane();
        PromotionDetails = new javax.swing.JTable();
        pType2 = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(122, 72, 221));

        jLabel2.setBackground(new java.awt.Color(0, 0, 0));
        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Promotion");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addContainerGap(26, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        jLabel3.setText("Start date :");

        jLabel5.setText("End date :");

        jLabel6.setText("Discount rate :");

        jLabel9.setText("Promotion Title :");

        jLabel10.setText("Product Type :");

        pType.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pTypeActionPerformed(evt);
            }
        });

        Create.setText("Create");
        Create.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CreateActionPerformed(evt);
            }
        });

        EndDate.setEditable(false);

        Show.setText("Show");
        Show.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ShowActionPerformed(evt);
            }
        });

        Product.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Flower ID", "Name", "Type", "Price(RM)", "Quantity"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Double.class, java.lang.Integer.class
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
        jScrollPane4.setViewportView(Product);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel9)
                    .addComponent(jLabel3)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(PromotionTitle)
                    .addComponent(DiscountRate)
                    .addComponent(StartDate, javax.swing.GroupLayout.DEFAULT_SIZE, 279, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(EndDate, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Show)
                .addContainerGap(88, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addGap(18, 18, 18)
                        .addComponent(pType, javax.swing.GroupLayout.PREFERRED_SIZE, 329, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(Create))
                    .addComponent(jScrollPane4))
                .addGap(24, 24, 24))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel3)
                                .addComponent(jLabel5)
                                .addComponent(EndDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(Show))
                            .addComponent(StartDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(PromotionTitle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(DiscountRate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(57, 57, 57)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(pType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(331, 331, 331))
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 315, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(2, 2, 2)
                .addComponent(Create)
                .addContainerGap(73, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Create Promotion", jPanel3);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        PromotionDetails.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Promotion ID", "Title", "Flower Name", "Product Type", "Discount Rate(%)", "Price(Rm)", "Start Date", "End Date"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Double.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane7.setViewportView(PromotionDetails);

        pType2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pType2ActionPerformed(evt);
            }
        });

        jLabel1.setText("Product Type");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pType2, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(564, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane7))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(35, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(pType2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(128, 128, 128))
        );

        jTabbedPane1.addTab("Promotion Retrieve", jPanel1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jTabbedPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(jTabbedPane1))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
 
    private void CreateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CreateActionPerformed
    SimpleDateFormat as = new SimpleDateFormat("dd-MM-yyyy");
        if(DiscountRate.getText().matches("") || PromotionTitle.getText().matches("") ){
            JOptionPane.showMessageDialog(null, "Cannot leave blane", "Information", JOptionPane.INFORMATION_MESSAGE);
        }
        else if(StartDate.getDate() == null){
            JOptionPane.showMessageDialog(null, "Please choose a date","Information",JOptionPane.INFORMATION_MESSAGE);
        }
        else if(EndDate.getText().matches("")){
            JOptionPane.showMessageDialog(null, "Please click the 'show' button to show the end date","Information",JOptionPane.INFORMATION_MESSAGE);
        }
        else if(Product.getSelectedRowCount() == 0){
            JOptionPane.showMessageDialog(null,"Please choose the product to promotion","Information",JOptionPane.INFORMATION_MESSAGE);
        }
        else if(!DiscountRate.getText().matches("^[0-9]*$")){
            JOptionPane.showMessageDialog(null, "Discount Rate must be numeric", "Information", JOptionPane.INFORMATION_MESSAGE);
        }
        else if(!DiscountRate.getText().matches("(?:\\b|-)([1-9]{1,2}|100)\\b")){
            JOptionPane.showMessageDialog(null, "Number range is between 1-100 ","Information",JOptionPane.INFORMATION_MESSAGE);
        }
        else{
            int a = JOptionPane.showConfirmDialog(null,"Do you want to create promotion?", "Question", JOptionPane.YES_OPTION);
            if(a == 0){     
                
                JOptionPane.showMessageDialog(null,"Promotion create successful","Information", JOptionPane.INFORMATION_MESSAGE);
                //Promotion
                String title = PromotionTitle.getText();
                int disRate = Integer.parseInt(DiscountRate.getText());
                String sDate = as.format(StartDate.getDate());
                String eDate = EndDate.getText();   
                Promotion promotion = new Promotion(GenerateNextPromoID(),sDate,eDate,title,disRate);
                promotionList.add(promotion);
                //Flower 
                for(int i=0; i<Product.getSelectedRowCount();i++){               
                    String ID = Product.getValueAt(i, 0).toString();
                    String Name = Product.getValueAt(i, 1).toString();
                    String Type = Product.getValueAt(i, 2).toString();
                    Double price = Double.parseDouble(Product.getValueAt(i, 3).toString());
                    int quantity = Integer.parseInt(Product.getValueAt(i,4).toString());
                    CatalogProduct p = new CatalogProduct(Name,Type,ID,price,quantity);
                    productList.add(p);
                }    
                //Promotion List
                CatalogProduct cp = new CatalogProduct();
                PromotionList promo = new PromotionList(cp,promotion,GenerateNextPLID());
                promoList.add(promo);
                System.out.println(promoList);
                //-------------------------------------------------- refresh
                StartDate.setCalendar(null);
                EndDate.setText("");
                PromotionTitle.setText("");
                DiscountRate.setText("");
                refreshPromotionTable();
                 }
            else if(a ==1){
                JOptionPane.showMessageDialog(null,"Create promotion cancels","Information",JOptionPane.INFORMATION_MESSAGE);
                StartDate.setCalendar(null);
                EndDate.setText("");
                PromotionTitle.setText("");
                DiscountRate.setText("");
            }
        }
    }//GEN-LAST:event_CreateActionPerformed

    public String GenerateNextPromoID(){
    String newID = "";
        int lastPromoIndex = promotionList.getNumberOfEntries();
        //update last prmotion ID
        String lastPromoID = promotionList.getEntry(lastPromoIndex).getPromotionID();
        String prefix =lastPromoID.substring(0,2);
        int integer = Integer.parseInt(lastPromoID.substring(2,5));
        integer +=1;
                
        newID = prefix +String.format("%03d", integer);
        System.out.println(newID);
        System.out.println(lastPromoIndex);
    return newID;
    }
    
    public String GenerateNextPLID(){
    String newID = "";
        int lastPromoIndex = promoList.getNumberOfEntries();
        //update last prmotion ID
        String lastPromoID = promoList.getEntry(lastPromoIndex).getPromoListID();
        String prefix =lastPromoID.substring(0,2);
        int integer = Integer.parseInt(lastPromoID.substring(2,5));
        integer +=1;
                
        newID = prefix +String.format("%03d", integer);
        System.out.println(newID);
        System.out.println(lastPromoIndex);
    return newID;
    }
    
    private void pTypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pTypeActionPerformed
        DefaultTableModel dm = (DefaultTableModel) Product.getModel();
        TableRowSorter<DefaultTableModel> sorter = new TableRowSorter<DefaultTableModel>(dm);
        for(int i=0; i < productList.getNumberOfEntries(); i++){
            if(pType.getSelectedItem() == productList.getEntry(i+1).getProdType()){
                Product.setRowSorter(sorter);
                String text = pType.getSelectedItem().toString();
                sorter.setRowFilter(RowFilter.regexFilter(text));
            }
        }
    }//GEN-LAST:event_pTypeActionPerformed

    private void pType2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pType2ActionPerformed
      for(int i=0; i<productList.getNumberOfEntries(); i++){
            if(pType2.getSelectedItem() == productList.getEntry(i+1).getProdType()){
                DefaultTableModel dm = (DefaultTableModel) PromotionDetails.getModel();
                TableRowSorter<DefaultTableModel> sorter = new TableRowSorter<DefaultTableModel>(dm);
                PromotionDetails.setRowSorter(sorter);
                String text = pType2.getSelectedItem().toString();
                sorter.setRowFilter(RowFilter.regexFilter(text));
            }
        }
    }//GEN-LAST:event_pType2ActionPerformed

    private void ShowActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ShowActionPerformed
        if(StartDate.getDate() == null){
        JOptionPane.showMessageDialog(null, "Please choose a date before you click this button","Information",JOptionPane.INFORMATION_MESSAGE);
        }
        else{ 
        try {
            SimpleDateFormat df = new SimpleDateFormat("dd-MM-yyyy");
            String Adate = df.format(StartDate.getDate());
            Date date = df.parse(Adate);           
            Calendar cal = Calendar.getInstance();
            cal.setTime(date);
            cal.add(Calendar.DAY_OF_MONTH, 30);
            Date futureDate  =cal.getTime();
            EndDate.setText(df.format(futureDate));
        } catch (ParseException ex) {
            Logger.getLogger(PromotionDetail.class.getName()).log(Level.SEVERE, null, ex);
        }
        }
    }//GEN-LAST:event_ShowActionPerformed

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
            java.util.logging.Logger.getLogger(PromotionDetail.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PromotionDetail.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PromotionDetail.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PromotionDetail.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PromotionDetail().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Create;
    private javax.swing.JTextField DiscountRate;
    private javax.swing.JTextField EndDate;
    private javax.swing.JTable Product;
    private javax.swing.JTable PromotionDetails;
    private javax.swing.JTextField PromotionTitle;
    private javax.swing.JButton Show;
    private com.toedter.calendar.JDateChooser StartDate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollBar jScrollBar1;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JComboBox<String> pType;
    private javax.swing.JComboBox<String> pType2;
    // End of variables declaration//GEN-END:variables
}
