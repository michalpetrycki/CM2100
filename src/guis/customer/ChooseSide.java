/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guis.customer;

import cm2100guicw.Menu;
import cm2100guicw.MenuItem;
import cm2100guicw.Side;
import cm2100guicw.Side.SortSidesByName;
import cm2100guicw.Side.SortSidesByPrice;
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
import javax.swing.JRadioButton;
import javax.swing.KeyStroke;

/**
 *
 * @author Michal
 */
public class ChooseSide extends javax.swing.JDialog {

    /**
     * Creates new form ChooseSide
     */
    public ChooseSide(java.awt.Frame parent, boolean modal, CustomerOrderFrame customer) {
        
        super(parent, modal);
        this.customer = customer;
        menu = new Menu("menu");
        menu.readFromFile(new File("menu-test.csv"));
        sidesList = new ArrayList<>();
        initComponents();
        addKeyListeners();
        side = new Side("test", 10);
        loadSides();
        addSideButton.requestFocus();
        
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
        sidesComboBox = new javax.swing.JComboBox<>();
        priceText = new javax.swing.JLabel();
        addSideButton = new javax.swing.JButton();
        cancelButton = new javax.swing.JButton();
        sortLabel = new javax.swing.JLabel();
        nameRadioButton = new javax.swing.JRadioButton();
        priceRadioButton = new javax.swing.JRadioButton();
        itemImage = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        nameLabel.setText("Name:");

        priceLabel.setText("Price:");

        sidesComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        sidesComboBox.setNextFocusableComponent(addSideButton);
        sidesComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sidesComboBoxActionPerformed(evt);
            }
        });

        priceText.setText("£0.00p");

        addSideButton.setText("Add Side");
        addSideButton.setNextFocusableComponent(cancelButton);
        addSideButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addSideButtonActionPerformed(evt);
            }
        });

        cancelButton.setText("Cancel");
        cancelButton.setNextFocusableComponent(nameRadioButton);
        cancelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelButtonActionPerformed(evt);
            }
        });

        sortLabel.setText("Sort By:");

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
        priceRadioButton.setName(""); // NOI18N
        priceRadioButton.setNextFocusableComponent(sidesComboBox);
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
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(itemImage, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(sortLabel)
                        .addGap(18, 18, 18)
                        .addComponent(nameRadioButton)
                        .addGap(18, 18, 18)
                        .addComponent(priceRadioButton)
                        .addGap(0, 134, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(nameLabel)
                            .addComponent(priceLabel))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(priceText, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(sidesComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(addSideButton, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cancelButton, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sortLabel)
                    .addComponent(nameRadioButton)
                    .addComponent(priceRadioButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nameLabel)
                    .addComponent(sidesComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(priceLabel)
                    .addComponent(priceText))
                .addGap(18, 18, 18)
                .addComponent(itemImage, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addSideButton)
                    .addComponent(cancelButton))
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void addSideButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addSideButtonActionPerformed
        
        customer.addSide(side);
        this.dispose();
        
    }//GEN-LAST:event_addSideButtonActionPerformed

    private void cancelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelButtonActionPerformed
        this.dispose();
    }//GEN-LAST:event_cancelButtonActionPerformed

    private void sidesComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sidesComboBoxActionPerformed
        
        JComboBox cb = (JComboBox) evt.getSource();
        
        if(cb.getSelectedItem() != null){
        
            String name = cb.getSelectedItem().toString();
            
            for(Side s: sidesList)
                if((s.getName() + " with " + s.getSauce()).equals(name))
                    side = s;
        
            formatPriceText();
            
            if(!side.getSauce().equals("no sauce"))
                priceText.setText(priceText.getText() + " [£0.50 cost of sauce will be included]");
            
            itemImage.setIcon(new ImageIcon("images/sides/" + side.getImageFileName()));
        
        }
        
    }//GEN-LAST:event_sidesComboBoxActionPerformed

    private void nameRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameRadioButtonActionPerformed
        
        JRadioButton rb = (JRadioButton) evt.getSource();
        
        if(rb.isSelected())
            Collections.sort(sidesList, new SortSidesByName());
        
        DefaultComboBoxModel m = (DefaultComboBoxModel) sidesComboBox.getModel();
        m.removeAllElements();
        
        for(Side s: sidesList)
            m.addElement(s.getName() + " with " + s.getSauce());
        
    }//GEN-LAST:event_nameRadioButtonActionPerformed

    private void priceRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_priceRadioButtonActionPerformed
        
        JRadioButton rb = (JRadioButton) evt.getSource();
        
        if(rb.isSelected())
            Collections.sort(sidesList, new SortSidesByPrice());
        
        DefaultComboBoxModel m = (DefaultComboBoxModel) sidesComboBox.getModel();
        m.removeAllElements();
        
        for(Side s: sidesList)
            m.addElement(s.getName() + " with " + s.getSauce());
        
    }//GEN-LAST:event_priceRadioButtonActionPerformed

    private void loadSides(){
    
        DefaultComboBoxModel model = new DefaultComboBoxModel();
        sidesComboBox.setModel(model);
        
        for(MenuItem s: menu.getItems())
            if(s instanceof Side)
                sidesList.add((Side) s);
           
        Collections.sort(sidesList, new SortSidesByName());
        
        for(Side s: sidesList)
            model.addElement(s.getName() + " with " + s.getSauce());
            
    }
    
    private void formatPriceText(){
    
        int price = side.getUnitCost();
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
            
                ChooseSide.this.dispose();
            
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
            java.util.logging.Logger.getLogger(ChooseSide.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ChooseSide.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ChooseSide.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ChooseSide.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                ChooseSide dialog = new ChooseSide(new javax.swing.JFrame(), true,
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
    private Side side;
    private ArrayList<Side> sidesList;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addSideButton;
    private javax.swing.JButton cancelButton;
    private javax.swing.JLabel itemImage;
    private javax.swing.JLabel nameLabel;
    private javax.swing.JRadioButton nameRadioButton;
    private javax.swing.JLabel priceLabel;
    private javax.swing.JRadioButton priceRadioButton;
    private javax.swing.JLabel priceText;
    private javax.swing.ButtonGroup rbGroup;
    private javax.swing.JComboBox<String> sidesComboBox;
    private javax.swing.JLabel sortLabel;
    // End of variables declaration//GEN-END:variables
}
