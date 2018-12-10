/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.qwerwqerqwerwqer
 */
package UI;

import ADT.LList;
import ADT.ListInterface;
import Entity.*;
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

    private ListInterface<Pickup> pickupList = new LList<Pickup>();
    private ListInterface<Delivery> deliveryList = new LList<Delivery>();
    DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
    LocalDateTime now = LocalDateTime.now();
    
    static ListInterface<CatalogProduct> allCatProdList = new LList<>();
    static ListInterface<CustomizedFloral> allCustProdList = new LList<>();
    static ListInterface<Order> allSalesOrderList = new LList<>();
    static ListInterface<OrderList> allOrderList = new LList<>();
    static ListInterface<ConsumerE> allConsumerList = new LList<>();
    static ListInterface<CooperateE> allCoopList = new LList<>();
    static ListInterface<Delivery> allDeliveryList = new LList<>();
    static ListInterface<Pickup> allPickupList = new LList<>();
    static ListInterface<Invoice> allInvoiceList = new LList<>();

    public OrderRecordMain() {
        initComponents();
        initialize();
        initialize1();
        refreshPickupTable();
        jTable1.setAutoCreateRowSorter(true);
        jTable3.setAutoCreateRowSorter(true);
    }
     public OrderRecordMain(ListInterface<CatalogProduct> allCatProdList ,ListInterface<CustomizedFloral> allCustProdList ,ListInterface<Order> allSalesOrderList ,
         ListInterface<OrderList> allOrderList ,ListInterface<ConsumerE> allConsumerList ,ListInterface<CooperateE> allCoopList ,
         ListInterface<Delivery> allDeliveryList ,ListInterface<Pickup> allPickupList,ListInterface<Invoice> allInvoiceList){
             this.allCatProdList=allCatProdList;
             this.allConsumerList=allConsumerList;
             this.allCoopList=allCoopList;
             this.allCustProdList =allCustProdList;
             this.allDeliveryList = allDeliveryList;
             this.allInvoiceList=allInvoiceList;
             this.allOrderList=allOrderList;
             this.allPickupList=allPickupList;
             this.allSalesOrderList=allSalesOrderList;
             
             initComponents();
        initialize();
        initialize1();
        refreshPickupTable();
        jTable1.setAutoCreateRowSorter(true);
        jTable3.setAutoCreateRowSorter(true);
         }
    

    public void initialize() {
        pickupList=allPickupList;
        deliveryList=allDeliveryList;
        /*pickupList.add(new Pickup("PU001", "PU0001", "12-12-2018", "", "High", "Not pickup"));
        pickupList.add(new Pickup("PU002", "PU0002", "12-12-2018", "", "Low", "Not pickup"));
        pickupList.add(new Pickup("PU003", "PU0003", "12-12-2018", "", "Low", "Not pickup"));*/
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();

    }

    public void initialize1() {
        /*deliveryList.add(new Delivery("OR001", "DL001", "", "12-12-2018", "", "", ""));
        deliveryList.add(new Delivery("OR002", "DL002", "", "12-12-2018", " ", "", ""));
        deliveryList.add(new Delivery("OR003", "DL003", "", "12-12-2018", "", "", ""));
        deliveryList.add(new Delivery("OR004", "DL004", "", "12-12-2018", "", "", ""));*/

        DefaultTableModel model = (DefaultTableModel) jTable3.getModel();
        for (int i = 0; i < deliveryList.getNumberOfEntries(); i++) {
            model.addRow(new Object[]{deliveryList.getEntry(i + 1).getDeliveryID(), deliveryList.getEntry(i + 1).getAddress(), deliveryList.getEntry(i + 1).getDeliveryManName()});
        }

        jTable3.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        jTable3.getSize();
        jTable3.getColumnModel().getColumn(0).setPreferredWidth((jTable3.getSize().width) / 120 * 20);
        jTable3.getColumnModel().getColumn(1).setPreferredWidth((jTable3.getSize().width) / 70 * 20);
        jTable3.getColumnModel().getColumn(2).setPreferredWidth((jTable3.getSize().width) / 70 * 20);
        jTable3.getColumnModel().getColumn(3).setPreferredWidth((jTable3.getSize().width) / 60 * 20);

        Didddl.removeAllItems();
        Didddl.addItem("");

        //Hide all except DeliveryID
        DMddl.setVisible(false);
        DMLabel.setVisible(false);
        DMddl.addItem("");
        addddl.setVisible(false);
        AddLabel.setVisible(false);
        confirm.setVisible(false);

        
        for (int i = 0; i < deliveryList.getNumberOfEntries(); i++) {
            Didddl.addItem(deliveryList.getEntry(i+1).getDeliveryID().toString());
        }
    }

    public void refreshPickupTable() {

        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        int rowCount = model.getRowCount();
        //  System.out.print(rowCount+"222");
        for (int i = rowCount - 1; i >= 0; i--) {
            model.removeRow(i);
        }
        for (int i = 0; i < pickupList.getNumberOfEntries(); i++) {
            model.addRow(new Object[]{pickupList.getEntry(i + 1).getPickupID(), pickupList.getEntry(i + 1).getPickupPriority(), pickupList.getEntry(i + 1).getPickupTime(), pickupList.getEntry(i + 1).getPickupStatus()});
        }
    }

    public void refreshDeliveryTable() {

        DefaultTableModel model = (DefaultTableModel) jTable3.getModel();
        int rowCount = model.getRowCount();
        //  System.out.print(rowCount+"222");
        for (int i = rowCount - 1; i >= 0; i--) {
            model.removeRow(i);
        }

        for (int i = 0; i < deliveryList.getNumberOfEntries(); i++) {
            model.addRow(new Object[]{deliveryList.getEntry(i + 1).getOrderID(), deliveryList.getEntry(i + 1).getAddress(), deliveryList.getEntry(i + 1).getDeliveryManName(), deliveryList.getEntry(i + 1).getDeliveredTime()});
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
        confirm = new javax.swing.JButton();
        jButton16 = new javax.swing.JButton();
        DeliLabel = new javax.swing.JLabel();
        AddLabel = new javax.swing.JLabel();
        Didddl = new javax.swing.JComboBox<>();
        jLabel29 = new javax.swing.JLabel();
        DMLabel = new javax.swing.JLabel();
        addddl = new javax.swing.JComboBox<>();
        DMddl = new javax.swing.JComboBox<>();
        jPanel2 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jButton6 = new javax.swing.JButton();

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
        if (jTable3.getColumnModel().getColumnCount() > 0) {
            jTable3.getColumnModel().getColumn(2).setHeaderValue("Delivery Man Name");
        }

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

        confirm.setFont(new java.awt.Font("Microsoft Himalaya", 1, 24)); // NOI18N
        confirm.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ui/images/icons8_Checked_26px.png"))); // NOI18N
        confirm.setText("Confirm");
        confirm.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        confirm.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                confirmjButton1MouseClicked(evt);
            }
        });
        confirm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirmjButton1ActionPerformed(evt);
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

        DeliLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        DeliLabel.setText("Delivery ID :");

        AddLabel.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        AddLabel.setText("Destination Area :");

        Didddl.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        Didddl.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DidddlCtypeActionPerformed(evt);
            }
        });

        jLabel29.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel29.setText("Delivery man & route selection");

        DMLabel.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        DMLabel.setText("Delivery Man Name :");

        addddl.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        addddl.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addddlCtypeActionPerformed(evt);
            }
        });

        DMddl.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        DMddl.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DMddlCtypeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel15Layout = new javax.swing.GroupLayout(jPanel15);
        jPanel15.setLayout(jPanel15Layout);
        jPanel15Layout.setHorizontalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel15Layout.createSequentialGroup()
                        .addComponent(DMLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(DMddl, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(jPanel15Layout.createSequentialGroup()
                        .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(DeliLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(AddLabel))
                        .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel15Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton16, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(210, 210, 210))
                            .addGroup(jPanel15Layout.createSequentialGroup()
                                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel15Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(Didddl, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel15Layout.createSequentialGroup()
                                        .addGap(4, 4, 4)
                                        .addComponent(addddl, javax.swing.GroupLayout.PREFERRED_SIZE, 346, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addComponent(jLabel29, javax.swing.GroupLayout.PREFERRED_SIZE, 575, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(174, Short.MAX_VALUE))
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addGap(135, 135, 135)
                .addComponent(confirm, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel15Layout.setVerticalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel15Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel29, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48)
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(DeliLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Didddl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(DMLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(DMddl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AddLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(addddl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 74, Short.MAX_VALUE)
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(confirm, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton16, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(64, 64, 64))
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

        jButton6.setText("Back");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 352, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton6)
                .addGap(39, 39, 39))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton6))
                .addContainerGap(14, Short.MAX_VALUE))
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

    private void addddlCtypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addddlCtypeActionPerformed

        confirm.setVisible(true);
    }//GEN-LAST:event_addddlCtypeActionPerformed

    private void DidddlCtypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DidddlCtypeActionPerformed

        String D_ID = Didddl.getSelectedItem().toString();

        if (D_ID == "DL001") {
            DMddl.removeAllItems();
            DMddl.addItem("Kong");
            DMddl.addItem("Muhd");
            DMddl.addItem("Low");
            DMddl.addItem("Abu");
            DMLabel.setVisible(true);
            DMddl.setVisible(true);
        } else if (D_ID == "DL002") {
            DMddl.removeAllItems();
            DMddl.addItem("Kong");
            DMddl.addItem("Muhd");
            DMddl.addItem("Low");
            DMddl.addItem("Abu");
            DMLabel.setVisible(true);
            DMddl.setVisible(true);
        } else if (D_ID == "DL003") {
            DMddl.removeAllItems();
            DMddl.addItem("Kong");
            DMddl.addItem("Muhd");
            DMddl.addItem("Low");
            DMddl.addItem("Abu");
            DMLabel.setVisible(true);
            DMddl.setVisible(true);
        } else if (D_ID == "DL004") {
            DMddl.removeAllItems();
            DMddl.addItem("Kong");
            DMddl.addItem("Muhd");
            DMddl.addItem("Low");
            DMddl.addItem("Abu");
            DMLabel.setVisible(true);
            DMddl.setVisible(true);
        }
    }//GEN-LAST:event_DidddlCtypeActionPerformed

    private void jButton16jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton16jButton2ActionPerformed
        //what will change?
        // the table there add the sleected item
        // imean the value? which value ? ini ?
    }//GEN-LAST:event_jButton16jButton2ActionPerformed

    private void confirmjButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmjButton1ActionPerformed
        if (Didddl.getSelectedIndex() == 0) {
            JOptionPane.showMessageDialog(null, "Please select Delivery ID !");
        }
           else if (DMddl.getSelectedIndex() == 0) {
                JOptionPane.showMessageDialog(null, "Please select Delivery Man !");
           }
              else if (addddl.getSelectedIndex() == 0) {
                    JOptionPane.showMessageDialog(null, "Please select Destination Area !");
                } else {
                    for(int i=0;i<deliveryList.getNumberOfEntries();i++){
                        System.out.println(deliveryList.getEntry(i+1).getDeliveryID().equals(Didddl.getSelectedItem().toString()));
                      
                        if(deliveryList.getEntry(i+1).getDeliveryID().equals(Didddl.getSelectedItem().toString())){
                            deliveryList.getEntry(i+1).setDeliveryManName(DMddl.getSelectedItem().toString());
                            deliveryList.getEntry(i+1).setAddress(addddl.getSelectedItem().toString());
                            System.out.print(deliveryList.getEntry(i+1).getAddress());
                            
                        }
                    }
                    System.out.print("ok");
                    JOptionPane.showMessageDialog(null, "Delivery Man Assigned !");
                }
            

            
        
        refreshDeliveryTable();
        //deliveryList.add(new Delivery(DeliveryID.getSelectedItem().toString(),DeliveryManName.getSelectedItem(),address.getSelectedItem()));
    }//GEN-LAST:event_confirmjButton1ActionPerformed

    private void confirmjButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_confirmjButton1MouseClicked
        /* */
        String DID = "";
        for (int j = 0; j < deliveryList.getNumberOfEntries(); j++) {
            if (deliveryList.getEntry(j + 1).getDeliveryManName().equals(DMddl.getSelectedItem().toString())) {
                DID = deliveryList.getEntry(j+1).getDeliveryID();
            }

        }
        deliveryList.add(new Delivery(DID));
        refreshDeliveryTable();
    }//GEN-LAST:event_confirmjButton1MouseClicked

    private void jTable3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable3MouseClicked
        int rowSelected = jTable3.getSelectedRow();

        int yesno = JOptionPane.showConfirmDialog(null, "Confirm delivered?", "INFORMATION", JOptionPane.YES_NO_OPTION);

        if (yesno == 0) {
            deliveryList.getEntry(rowSelected + 1).setDeliveredTime(dtf.format(now));

            refreshDeliveryTable();
        }
    }//GEN-LAST:event_jTable3MouseClicked

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        int rowSelected = jTable1.getSelectedRow();

        int yesno = JOptionPane.showConfirmDialog(null, "Confirm picked up?", "INFORMATION", JOptionPane.YES_NO_OPTION);

        if (yesno == 0) {
            pickupList.getEntry(rowSelected + 1).setPickupTime(dtf.format(now));
            pickupList.getEntry(rowSelected + 1).setPickupStatus("Picked up");
            refreshPickupTable();
        }
    }//GEN-LAST:event_jTable1MouseClicked

    private void DMddlCtypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DMddlCtypeActionPerformed
        DMddl.addItem("");
        String Dmname = DMddl.getSelectedItem().toString();

        if (Dmname == "Kong") {
            addddl.removeAllItems();
            addddl.addItem("Setapak");
            addddl.addItem("Subang");
            addddl.addItem("Genting Kelang");
            addddl.addItem("Kepong");
            addddl.setVisible(true);
            AddLabel.setVisible(true);
        } else if (Dmname == "Muhd") {
            addddl.removeAllItems();
            addddl.addItem("Setapak");
            addddl.addItem("Subang");
            addddl.addItem("Genting Kelang");
            addddl.addItem("Kepong");
            addddl.setVisible(true);
            AddLabel.setVisible(true);
        } else if (Dmname == "Low") {
            addddl.removeAllItems();
            addddl.addItem("Setapak");
            addddl.addItem("Subang");
            addddl.addItem("Genting Kelang");
            addddl.addItem("Kepong");
            addddl.setVisible(true);
            AddLabel.setVisible(true);
        } else if (Dmname == "Abu") {
            addddl.removeAllItems();
            addddl.addItem("Setapak");
            addddl.addItem("Subang");
            addddl.addItem("Genting Kelang");
            addddl.addItem("Kepong");
            addddl.setVisible(true);
            AddLabel.setVisible(true);
            /*jsnshshshsh*/
        }


    }//GEN-LAST:event_DMddlCtypeActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
        allDeliveryList=deliveryList;
        allPickupList=pickupList;
        new Homepage(allCatProdList,allCustProdList,allSalesOrderList,allOrderList,allConsumerList,allCoopList,allDeliveryList,allPickupList,allInvoiceList).setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton6ActionPerformed

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
            java.util.logging.Logger.getLogger(OrderRecordMain.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(OrderRecordMain.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(OrderRecordMain.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(OrderRecordMain.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
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
    private javax.swing.JLabel AddLabel;
    private javax.swing.JLabel DMLabel;
    private javax.swing.JComboBox<String> DMddl;
    private javax.swing.JLabel DeliLabel;
    private javax.swing.JComboBox<String> Didddl;
    private javax.swing.JComboBox<String> addddl;
    private javax.swing.JButton confirm;
    private javax.swing.JButton jButton16;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
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
