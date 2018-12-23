/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guis.customer;

import cm2100guicw.Drink;
import cm2100guicw.Drink.SortDrinksByName;
import cm2100guicw.Drink.SortDrinksByPrice;
import cm2100guicw.Menu;
import cm2100guicw.MenuItem;
import guis.CustomerOrderFrame;
import java.awt.KeyboardFocusManager;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import javax.swing.AbstractAction;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.KeyStroke;

/**
 *
 * @author Michal
 */
public class ChooseDrink extends javax.swing.JDialog {

    /**
     * Creates new form ChooseDrink
     */
    public ChooseDrink(java.awt.Frame parent, boolean modal, CustomerOrderFrame customer) {
        
        super(parent, modal);
        this.customer = customer;
        menu = new Menu("Menu");
        menu.readFromFile(new File("menu-test.csv"));
        drinksList = new ArrayList<>();
        initComponents();
        addKeyListeners();
        drink = new Drink("test", 10, false);
        loadDrinks();
        addDrinkButton.requestFocus();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        rbGroup = new javax.swing.ButtonGroup();
        nameLabel = new javax.swing.JLabel();
        drinksComboBox = new javax.swing.JComboBox<>();
        priceLabel = new javax.swing.JLabel();
        priceText = new javax.swing.JLabel();
        addDrinkButton = new javax.swing.JButton();
        cancelButton = new javax.swing.JButton();
        nameRadioButton = new javax.swing.JRadioButton();
        priceRadioButton = new javax.swing.JRadioButton();
        sortLabel = new javax.swing.JLabel();
        itemImage = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        nameLabel.setText("Name:");

        drinksComboBox.setModel(drinksComboBox.getModel());
        drinksComboBox.setNextFocusableComponent(addDrinkButton);
        drinksComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                drinksComboBoxActionPerformed(evt);
            }
        });

        priceLabel.setText("Price:");

        addDrinkButton.setText("Add Drink");
        addDrinkButton.setNextFocusableComponent(cancelButton);
        addDrinkButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addDrinkButtonActionPerformed(evt);
            }
        });

        cancelButton.setText("Cancel");
        cancelButton.setNextFocusableComponent(nameRadioButton);
        cancelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelButtonActionPerformed(evt);
            }
        });

        rbGroup.add(nameRadioButton);
        nameRadioButton.setSelected(true);
        nameRadioButton.setText("Name");
        nameRadioButton.setNextFocusableComponent(priceRadioButton);
        nameRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameRadioButtonActionPerformed(evt);
            }
        });

        rbGroup.add(priceRadioButton);
        priceRadioButton.setText("Price");
        priceRadioButton.setNextFocusableComponent(drinksComboBox);
        priceRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                priceRadioButtonActionPerformed(evt);
            }
        });

        sortLabel.setText("Sort By:");

        itemImage.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(itemImage, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(nameLabel)
                            .addComponent(priceLabel)
                            .addComponent(sortLabel))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(drinksComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(nameRadioButton)
                                .addGap(18, 18, 18)
                                .addComponent(priceRadioButton)
                                .addGap(0, 127, Short.MAX_VALUE))
                            .addComponent(priceText, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(addDrinkButton, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(97, 97, 97)
                .addComponent(cancelButton, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(priceRadioButton)
                    .addComponent(sortLabel)
                    .addComponent(nameRadioButton))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nameLabel)
                    .addComponent(drinksComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(priceLabel)
                    .addComponent(priceText, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(itemImage, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addDrinkButton)
                    .addComponent(cancelButton))
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void addDrinkButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addDrinkButtonActionPerformed
        
        if(drink.hasAlcohol()){
        
            int adult = JOptionPane.showConfirmDialog(this, "Are you 18 or above?", "Adult?", 2);
            
            if(adult == JOptionPane.YES_OPTION)
                customer.addDrink(drink);
            else
                JOptionPane.showMessageDialog(this, "Cannot sell you an alcohol.");
        
        }
        else{
            customer.addDrink(drink);
        }
        this.dispose();
        
    }//GEN-LAST:event_addDrinkButtonActionPerformed

    private void cancelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelButtonActionPerformed
        this.dispose();
    }//GEN-LAST:event_cancelButtonActionPerformed

    private void drinksComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_drinksComboBoxActionPerformed

        JComboBox cb = (JComboBox) evt.getSource();
        if(cb.getSelectedItem() != null){
        
            String name = cb.getSelectedItem().toString();
            for(Drink d: drinksList)
                if(d.getName().equals(name))
                    drink = d;
        
            formatPriceText();
            
            if(drink.hasAlcohol())
                priceText.setText(priceText.getText() + " [£1.00 cost of alcohol will be included]");
            
            itemImage.setIcon(new ImageIcon("images/drinks/" + drink.getImageFileName()));
            
        }
        
    }//GEN-LAST:event_drinksComboBoxActionPerformed

    private void nameRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameRadioButtonActionPerformed
        
        JRadioButton thisbtn = (JRadioButton) evt.getSource();
        if(thisbtn.isSelected())
            Collections.sort(drinksList, new SortDrinksByName());
        
        
        DefaultComboBoxModel m = (DefaultComboBoxModel) drinksComboBox.getModel();
        m.removeAllElements();
        
        for(Drink d: drinksList)
            m.addElement(d.getName());
        
    }//GEN-LAST:event_nameRadioButtonActionPerformed

    private void priceRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_priceRadioButtonActionPerformed
        
        JRadioButton thisbtn = (JRadioButton) evt.getSource();
        if(thisbtn.isSelected())
            Collections.sort(drinksList, new SortDrinksByPrice());
        
        DefaultComboBoxModel m = (DefaultComboBoxModel) drinksComboBox.getModel();
        m.removeAllElements();
        
        for(Drink d: drinksList)
            m.addElement(d.getName());
        
    }//GEN-LAST:event_priceRadioButtonActionPerformed

    
    private void loadDrinks(){
    
        DefaultComboBoxModel model = new DefaultComboBoxModel();
        drinksComboBox.setModel(model);
        
        for(MenuItem d: menu.getItems())
            if(d instanceof Drink)
                drinksList.add((Drink) d);
            
        
        Collections.sort(drinksList, new SortDrinksByName());
        
        for(Drink d: drinksList)
            model.addElement(d.getName());
    
    }
    
    private void formatPriceText(){
    
        int price = drink.getUnitCost();
        int pounds = price / 100;
        int pences = price - (price / 100) * 100;
        priceText.setText("£" + pounds + ".");
        if(pences == 0)
            priceText.setText(priceText.getText() + "00p");
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
            
                ChooseDrink.this.dispose();
            
            }
        });
        
        this.getRootPane().getActionMap().put("ENTER", new AbstractAction(){
        
            @Override
            public void actionPerformed(ActionEvent ae){
            
                JComponent source = (JComponent) KeyboardFocusManager.getCurrentKeyboardFocusManager().getFocusOwner();
                
                if(source instanceof JButton)
                    ((JButton) source).doClick();
                
                else if(source instanceof JRadioButton)
                    ((JRadioButton) source).doClick();
                
                else if(source instanceof JComboBox)
                    ((JComboBox) source).showPopup();
                
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
            java.util.logging.Logger.getLogger(ChooseDrink.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ChooseDrink.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ChooseDrink.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ChooseDrink.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                ChooseDrink dialog = new ChooseDrink(new javax.swing.JFrame(), 
                        true, new CustomerOrderFrame(new JFrame(), true, new Menu("Menu")));
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

    CustomerOrderFrame customer;
    Menu menu;
    Drink drink;
    ArrayList<Drink> drinksList;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addDrinkButton;
    private javax.swing.JButton cancelButton;
    private javax.swing.JComboBox<String> drinksComboBox;
    private javax.swing.JLabel itemImage;
    private javax.swing.JLabel nameLabel;
    private javax.swing.JRadioButton nameRadioButton;
    private javax.swing.JLabel priceLabel;
    private javax.swing.JRadioButton priceRadioButton;
    private javax.swing.JLabel priceText;
    private javax.swing.ButtonGroup rbGroup;
    private javax.swing.JLabel sortLabel;
    // End of variables declaration//GEN-END:variables
}