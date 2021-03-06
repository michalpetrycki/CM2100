/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guis;

import cm2100guicw.Drink;
import cm2100guicw.Menu;
import cm2100guicw.MenuItem;
import cm2100guicw.Order;
import cm2100guicw.Sandwich;
import cm2100guicw.Side;
import guis.customer.ChooseDrink;
import guis.customer.ChooseSandwich;
import guis.customer.ChooseSide;
import guis.edit.EditSandwichDialog;
import guis.edit.EditSideDialog;
import java.awt.KeyboardFocusManager;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import javax.swing.AbstractAction;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.KeyStroke;

/**
 *
 * @author Michal
 */
public class CustomerOrderFrame extends javax.swing.JDialog {

    /**
     * Creates new form MakeItemFrame
     */
    public CustomerOrderFrame(java.awt.Frame parent, boolean modal, Menu menu) {
        
        super(parent, modal);
        this.menu = menu;
        initComponents();
        addKeyListeners();
        total = 0;
        itemsList.setModel(new DefaultListModel());
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        bindingGroup = new org.jdesktop.beansbinding.BindingGroup();

        addDrinkButton = new javax.swing.JButton();
        addSandwichButton = new javax.swing.JButton();
        addSideButton = new javax.swing.JButton();
        priceText = new javax.swing.JLabel();
        welcomeLabel = new javax.swing.JLabel();
        checkoutButton = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        itemsList = new javax.swing.JList<>();
        doubleClickLabel = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        logoutMenu = new javax.swing.JMenu();
        logoutMenuItem = new javax.swing.JMenuItem();
        exitMenu = new javax.swing.JMenu();
        closeMenuItem = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        org.jdesktop.beansbinding.Binding binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, this, org.jdesktop.beansbinding.ELProperty.create("Customer Form"), this, org.jdesktop.beansbinding.BeanProperty.create("title"));
        bindingGroup.addBinding(binding);

        addDrinkButton.setText("Add Drink");
        addDrinkButton.setNextFocusableComponent(addSandwichButton);
        addDrinkButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addDrinkButtonActionPerformed(evt);
            }
        });

        addSandwichButton.setText("Add Sandwich");
        addSandwichButton.setNextFocusableComponent(addSideButton);
        addSandwichButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addSandwichButtonActionPerformed(evt);
            }
        });

        addSideButton.setText("Add Side");
        addSideButton.setNextFocusableComponent(checkoutButton);
        addSideButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addSideButtonActionPerformed(evt);
            }
        });

        priceText.setBackground(new java.awt.Color(204, 204, 255));
        priceText.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        priceText.setForeground(new java.awt.Color(255, 0, 0));
        priceText.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        priceText.setText("£0.00");

        welcomeLabel.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 18)); // NOI18N
        welcomeLabel.setForeground(new java.awt.Color(255, 153, 51));
        welcomeLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        welcomeLabel.setText("Welcome");

        checkoutButton.setText("Checkout");
        checkoutButton.setNextFocusableComponent(addDrinkButton);
        checkoutButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkoutButtonActionPerformed(evt);
            }
        });

        itemsList.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        itemsList.setFocusable(false);
        itemsList.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                itemsListMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(itemsList);

        doubleClickLabel.setFont(new java.awt.Font("Yu Gothic UI", 0, 12)); // NOI18N
        doubleClickLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        doubleClickLabel.setText("Double click to edit item");

        logoutMenu.setText("Logout");

        logoutMenuItem.setText("Logout to main screen");
        logoutMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutMenuItemActionPerformed(evt);
            }
        });
        logoutMenu.add(logoutMenuItem);

        jMenuBar1.add(logoutMenu);

        exitMenu.setText("Exit");

        closeMenuItem.setText("Close the Application");
        closeMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                closeMenuItemActionPerformed(evt);
            }
        });
        exitMenu.add(closeMenuItem);

        jMenuBar1.add(exitMenu);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(checkoutButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(addDrinkButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(addSandwichButton, javax.swing.GroupLayout.DEFAULT_SIZE, 265, Short.MAX_VALUE)
                                    .addComponent(addSideButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(priceText, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(doubleClickLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(welcomeLabel)))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(welcomeLabel)
                    .addComponent(doubleClickLabel))
                .addGap(1, 1, 1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(addDrinkButton)
                        .addGap(18, 18, 18)
                        .addComponent(addSandwichButton)
                        .addGap(18, 18, 18)
                        .addComponent(addSideButton)
                        .addGap(18, 18, 18)
                        .addComponent(priceText, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane2))
                .addGap(18, 18, 18)
                .addComponent(checkoutButton)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        bindingGroup.bind();

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void closeMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closeMenuItemActionPerformed
        System.exit(0);
    }//GEN-LAST:event_closeMenuItemActionPerformed

    private void logoutMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutMenuItemActionPerformed
        
        order = null;
        this.dispose();
        
    }//GEN-LAST:event_logoutMenuItemActionPerformed

    private void addDrinkButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addDrinkButtonActionPerformed

        ChooseDrink dialog = new ChooseDrink((JFrame) this.getParent(), true, this);
        this.setVisible(false);
        dialog.setVisible(true);
        
        this.setVisible(true);

    }//GEN-LAST:event_addDrinkButtonActionPerformed

    private void addSandwichButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addSandwichButtonActionPerformed
        
        ChooseSandwich dialog = new ChooseSandwich((JFrame) this.getParent(), true, this);
        this.setVisible(false);
        dialog.setVisible(true);
        
        this.setVisible(true);
        
    }//GEN-LAST:event_addSandwichButtonActionPerformed

    private void addSideButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addSideButtonActionPerformed
        
        ChooseSide dialog = new ChooseSide((JFrame) this.getParent(), true, this);
        this.setVisible(false);
        dialog.setVisible(true);
        
        this.setVisible(true);
        
    }//GEN-LAST:event_addSideButtonActionPerformed

    private void checkoutButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkoutButtonActionPerformed
        
        CheckoutDialog dialog = new CheckoutDialog((JFrame) this.getParent(), true, order);
        this.setVisible(false);
        dialog.setVisible(true);
        
        this.dispose();
        
    }//GEN-LAST:event_checkoutButtonActionPerformed

    private void itemsListMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_itemsListMouseClicked

        JList list = (JList) evt.getSource();

        if(evt.getClickCount() == 2){

            int index = list.locationToIndex(evt.getPoint());
            MenuItem item = order.getItems().get(index);

            if(item instanceof Sandwich){

                DefaultListModel m = (DefaultListModel) itemsList.getModel();
                
                EditSandwichDialog dialog = new EditSandwichDialog((JFrame) this.getParent(), true, this, (Sandwich) item);
                
                this.setVisible(false);
                dialog.setVisible(true);
                
                m.setElementAt(item.getName() + " on " + ((Sandwich) item).getBreadType() + " bread", index);
                this.setVisible(true);
                
            }
            else if(item instanceof Side){
            
                DefaultListModel m = (DefaultListModel) itemsList.getModel();
                
                EditSideDialog dialog = new EditSideDialog((JFrame) this.getParent(), true, this, (Side) item);
                this.setVisible(false);
                dialog.setVisible(true);
                
                m.setElementAt(item.getName() + " with " + ((Side) item).getSauce(), index);
                this.setVisible(true);
            
            }

        }

    }//GEN-LAST:event_itemsListMouseClicked
    
    public void setCustomerName(String n){
        
        order = new Order(n);
        welcomeLabel.setText("Welcome " + order.getCustomer() + ", OrderID: " + order.getOrderID());
        
    }
    
    public boolean checkCustomer(){
    
        if(this.order != null){
        
            if(this.order.getCustomer() == null)
                return false;
        
            else return true;
            
        }
        
        return false;
        
    }
    
    public void addDrink(Drink d){
        
        order.addMenuItem(d);
        DefaultListModel m = (DefaultListModel) itemsList.getModel();
        m.addElement(d.getName());
        total += d.price();
        this.formatPriceText();
        System.out.println("Drink successfully added.");
        
    }
    
    public void addSandwich(Sandwich s){
    
        order.addMenuItem(s);
        DefaultListModel m = (DefaultListModel) itemsList.getModel();
        m.addElement(s.getName() + " on " + s.getBreadType() + " bread");
        total += s.price();
        this.formatPriceText();
        System.out.println("Sandwich succesfully added.");
        
    }
    
    public void addSide(Side s){
    
        order.addMenuItem(s);
        DefaultListModel m = (DefaultListModel) itemsList.getModel();
        m.addElement(s.getName() + " with " + s.getSauce());
        total += s.price();
        this.formatPriceText();
        System.out.println("Side succesfully added.");
    }
    
    private void formatPriceText(){
    
        int price = total;
        int pounds = price / 100;
        int pences = price - (price / 100) * 100;
        priceText.setText("£" + pounds + ".");
        if(pences == 0)
            priceText.setText(priceText.getText() + "00p");
        else if(pences < 10)
            priceText.setText(priceText.getText() + "0" + pences + "p");
        else 
            priceText.setText(priceText.getText() + pences + "p");
    
    }
    
    private void addKeyListeners(){
    
        this.getRootPane().getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW).put(
            KeyStroke.getKeyStroke(KeyEvent.VK_ESCAPE, 0), "EXIT");
        
        this.getRootPane().getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW).put(
            KeyStroke.getKeyStroke(KeyEvent.VK_ENTER, 0), "ENTER");
        
        this.getRootPane().getActionMap().put("EXIT", new AbstractAction(){
            
            @Override
            public void actionPerformed(ActionEvent ae){
            
                logoutMenu.doClick();
            
            }
        });
        
        this.getRootPane().getActionMap().put("ENTER", new AbstractAction(){
        
            @Override
            public void actionPerformed(ActionEvent ae){
            
                JButton source = (JButton) KeyboardFocusManager.getCurrentKeyboardFocusManager().getFocusOwner();
                source.doClick();
                
            }
        
        });
    
    }
    
    
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
            java.util.logging.Logger.getLogger(CustomerOrderFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CustomerOrderFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CustomerOrderFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CustomerOrderFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                CustomerOrderFrame dialog = new CustomerOrderFrame(new javax.swing.JFrame(), true, new Menu("Menu"));
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    private Menu menu;
    private Order order;
    private int total;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addDrinkButton;
    private javax.swing.JButton addSandwichButton;
    private javax.swing.JButton addSideButton;
    private javax.swing.JButton checkoutButton;
    private javax.swing.JMenuItem closeMenuItem;
    private javax.swing.JLabel doubleClickLabel;
    private javax.swing.JMenu exitMenu;
    private javax.swing.JList<String> itemsList;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JMenu logoutMenu;
    private javax.swing.JMenuItem logoutMenuItem;
    private javax.swing.JLabel priceText;
    private javax.swing.JLabel welcomeLabel;
    private org.jdesktop.beansbinding.BindingGroup bindingGroup;
    // End of variables declaration//GEN-END:variables
}
