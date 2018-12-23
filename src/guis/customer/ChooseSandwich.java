/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guis.customer;

import cm2100guicw.Bread;
import cm2100guicw.Menu;
import cm2100guicw.MenuItem;
import cm2100guicw.Sandwich;
import cm2100guicw.Sandwich.SortSandwichesByName;
import cm2100guicw.Sandwich.SortSandwichesByPrice;
import guis.CustomerOrderFrame;
import java.awt.Dimension;
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
import javax.swing.JRadioButton;
import javax.swing.KeyStroke;

/**
 *
 * @author Michal
 */
public class ChooseSandwich extends javax.swing.JDialog {

    /**
     * Creates new form ChooseSandwich
     */
    public ChooseSandwich(java.awt.Frame parent, boolean modal, CustomerOrderFrame customer) {
        
        super(parent, modal);
        this.customer = customer;
        menu = new Menu("menu");
        menu.readFromFile(new File("menu-test.csv"));
        sandwichesList = new ArrayList<>();
        initComponents();
        addKeyListeners();
        sandwich = new Sandwich("test", 10, "f", Bread.WHITE);
        loadSandwiches();
        addSandwichButton.requestFocus();
        
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
        priceLabel = new javax.swing.JLabel();
        sandwichesComboBox = new javax.swing.JComboBox<>();
        addSandwichButton = new javax.swing.JButton();
        cancelButton = new javax.swing.JButton();
        priceText = new javax.swing.JLabel();
        nameRadioButton = new javax.swing.JRadioButton();
        sortLabel = new javax.swing.JLabel();
        priceRadioButton = new javax.swing.JRadioButton();
        itemImage = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        nameLabel.setText("Name:");

        priceLabel.setText("Price:");

        sandwichesComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        sandwichesComboBox.setNextFocusableComponent(addSandwichButton);
        sandwichesComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sandwichesComboBoxActionPerformed(evt);
            }
        });

        addSandwichButton.setText("Add Sandwich");
        addSandwichButton.setNextFocusableComponent(cancelButton);
        addSandwichButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addSandwichButtonActionPerformed(evt);
            }
        });

        cancelButton.setText("Cancel");
        cancelButton.setNextFocusableComponent(nameRadioButton);
        cancelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelButtonActionPerformed(evt);
            }
        });

        priceText.setText("£0.00p");

        rbGroup.add(nameRadioButton);
        nameRadioButton.setSelected(true);
        nameRadioButton.setText("Name");
        nameRadioButton.setNextFocusableComponent(priceRadioButton);
        nameRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameRadioButtonActionPerformed(evt);
            }
        });

        sortLabel.setText("Sort by:");

        rbGroup.add(priceRadioButton);
        priceRadioButton.setText("Price");
        priceRadioButton.setNextFocusableComponent(sandwichesComboBox);
        priceRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                priceRadioButtonActionPerformed(evt);
            }
        });

        itemImage.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(nameLabel)
                                .addGap(18, 18, 18)
                                .addComponent(sandwichesComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(sortLabel)
                                        .addGap(136, 136, 136))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addGap(57, 57, 57)
                                        .addComponent(nameRadioButton)
                                        .addGap(16, 16, 16)
                                        .addComponent(priceRadioButton)))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(priceLabel)
                                .addGap(18, 18, 18)
                                .addComponent(priceText, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(itemImage, javax.swing.GroupLayout.PREFERRED_SIZE, 295, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(addSandwichButton, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(75, 75, 75)
                                .addComponent(cancelButton, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addComponent(sortLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 4, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(nameRadioButton)
                        .addComponent(priceRadioButton)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nameLabel)
                    .addComponent(sandwichesComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(priceLabel)
                    .addComponent(priceText))
                .addGap(18, 18, 18)
                .addComponent(itemImage, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addSandwichButton)
                    .addComponent(cancelButton))
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void addSandwichButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addSandwichButtonActionPerformed
        
        customer.addSandwich(sandwich);
        this.dispose();
        
    }//GEN-LAST:event_addSandwichButtonActionPerformed

    private void cancelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelButtonActionPerformed
        this.dispose();        
    }//GEN-LAST:event_cancelButtonActionPerformed

    private void sandwichesComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sandwichesComboBoxActionPerformed
        
        JComboBox cb = (JComboBox) evt.getSource();
        
        if(cb.getSelectedItem() != null){
        
            String name = cb.getSelectedItem().toString();
            name = name.substring(0, name.indexOf(" -"));
            for(Sandwich s: sandwichesList)
                if(s.getName().equals(name))
                    sandwich = s;

            formatPriceText();
            
            priceText.setText(priceText.getText() + " [£1.00 cost of bread will be included]");
        
            itemImage.setIcon(new ImageIcon("images/sandwiches/" + sandwich.getImageFileName()));
            
        }
        
    }//GEN-LAST:event_sandwichesComboBoxActionPerformed

    private void nameRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameRadioButtonActionPerformed
       
        JRadioButton rb = (JRadioButton) evt.getSource();
        if(rb.isSelected())
            Collections.sort(sandwichesList, new SortSandwichesByName());
        
        DefaultComboBoxModel m = (DefaultComboBoxModel) sandwichesComboBox.getModel();
        m.removeAllElements();
        
        for(Sandwich s: sandwichesList)
            m.addElement(s.getName() + " - " + 
                ((Sandwich) s).getFilling() + " - " + ((Sandwich) s).getBreadType() + 
                " bread");
        
    }//GEN-LAST:event_nameRadioButtonActionPerformed

    private void priceRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_priceRadioButtonActionPerformed
        
        JRadioButton rb = (JRadioButton) evt.getSource();
        if(rb.isSelected())
            Collections.sort(sandwichesList, new SortSandwichesByPrice());
        
        DefaultComboBoxModel m = (DefaultComboBoxModel) sandwichesComboBox.getModel();
        m.removeAllElements();
        
        for(Sandwich s: sandwichesList)
            m.addElement(s.getName() + " - " + 
                ((Sandwich) s).getFilling() + " - " + ((Sandwich) s).getBreadType() + 
                " bread");
        
    }//GEN-LAST:event_priceRadioButtonActionPerformed

    private void loadSandwiches(){
    
        DefaultComboBoxModel model = new DefaultComboBoxModel();
        sandwichesComboBox.setModel(model);
        
        for(MenuItem s: menu.getItems())
            if(s instanceof Sandwich)
                sandwichesList.add((Sandwich) s);
            
    
        Collections.sort(sandwichesList, new SortSandwichesByName());
        
        for(Sandwich s: sandwichesList)
            model.addElement(((Sandwich) s).getName() + " - " + 
                ((Sandwich) s).getFilling() + " - " + ((Sandwich) s).getBreadType() + 
                " bread");
        
    }
    
    private void formatPriceText(){
    
        int price = sandwich.getUnitCost();
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
            
                ChooseSandwich.this.dispose();
            
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
            java.util.logging.Logger.getLogger(ChooseSandwich.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ChooseSandwich.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ChooseSandwich.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ChooseSandwich.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                ChooseSandwich dialog = new ChooseSandwich(new javax.swing.JFrame(), true, 
                    new CustomerOrderFrame(new JFrame(), true, new Menu("Menu")));
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

    private CustomerOrderFrame customer;
    private Menu menu;
    private Sandwich sandwich;
    private ArrayList<Sandwich> sandwichesList;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addSandwichButton;
    private javax.swing.JButton cancelButton;
    private javax.swing.JLabel itemImage;
    private javax.swing.JLabel nameLabel;
    private javax.swing.JRadioButton nameRadioButton;
    private javax.swing.JLabel priceLabel;
    private javax.swing.JRadioButton priceRadioButton;
    private javax.swing.JLabel priceText;
    private javax.swing.ButtonGroup rbGroup;
    private javax.swing.JComboBox<String> sandwichesComboBox;
    private javax.swing.JLabel sortLabel;
    // End of variables declaration//GEN-END:variables
}
