package thesimpleems_16nov;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author P0068839
 */
public class AddNewEmployeeJFrame extends javax.swing.JFrame {
    
    
    private MyHashTable mainHT;  // This contains the ref value for theHT of MainJFrame.
    
    

    /**
     * Creates new form AddNewEmployeeJFrame
     */
    public AddNewEmployeeJFrame() {
        initComponents();
        
        
        // implements a listener that enables/disables the "add" button
        // based on if there is/isn't text in all 3 text fields
        jTextField1.getDocument().addDocumentListener(new DocumentListener() {
            public void changedUpdate(DocumentEvent e){
                changed();
            }
            public void removeUpdate(DocumentEvent e){
                changed();
            }
            public void insertUpdate(DocumentEvent e){
                changed();
            }
            public void changed() {
                boolean jTF1empty = jTextField1.getText().isEmpty();
                boolean jTF2empty = jTextField2.getText().isEmpty();
                boolean jTF3empty = jTextField3.getText().isEmpty();
                boolean jRBempty = !(genderMButton.isSelected() || genderFButton.isSelected() || genderOButton.isSelected());
                boolean jTF5empty = jTextField5.getText().isEmpty();
                if(jTF1empty || jTF2empty || jTF3empty ||jRBempty || jTF5empty){
                    jButton1.setEnabled(false);
                }else {
                    jButton1.setEnabled(true);
                }
            }
        });
        jTextField2.getDocument().addDocumentListener(new DocumentListener() {
            public void changedUpdate(DocumentEvent e){
                changed();
            }
            public void removeUpdate(DocumentEvent e){
                changed();
            }
            public void insertUpdate(DocumentEvent e){
                changed();
            }
            public void changed() {
                boolean jTF1empty = jTextField1.getText().isEmpty();
                boolean jTF2empty = jTextField2.getText().isEmpty();
                boolean jTF3empty = jTextField3.getText().isEmpty();
                boolean jRBempty = !(genderMButton.isSelected() || genderFButton.isSelected() || genderOButton.isSelected());
                boolean jTF5empty = jTextField5.getText().isEmpty();
                if(jTF1empty || jTF2empty || jTF3empty ||jRBempty || jTF5empty){
                    jButton1.setEnabled(false);
                }else {
                    jButton1.setEnabled(true);
                }
            }
        });
        jTextField3.getDocument().addDocumentListener(new DocumentListener() {
            public void changedUpdate(DocumentEvent e){
                changed();
            }
            public void removeUpdate(DocumentEvent e){
                changed();
            }
            public void insertUpdate(DocumentEvent e){
                changed();
            }
            public void changed() {
                boolean jTF1empty = jTextField1.getText().isEmpty();
                boolean jTF2empty = jTextField2.getText().isEmpty();
                boolean jTF3empty = jTextField3.getText().isEmpty();
                boolean jRBempty = !(genderMButton.isSelected() || genderFButton.isSelected() || genderOButton.isSelected());
                boolean jTF5empty = jTextField5.getText().isEmpty();
                if(jTF1empty || jTF2empty || jTF3empty ||jRBempty || jTF5empty){
                    jButton1.setEnabled(false);
                }else {
                    jButton1.setEnabled(true);
                }
            }
        });
        ActionListener listener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e){
                boolean jTF1empty = jTextField1.getText().isEmpty();
                boolean jTF2empty = jTextField2.getText().isEmpty();
                boolean jTF3empty = jTextField3.getText().isEmpty();
                boolean jRBempty = !(genderMButton.isSelected() || genderFButton.isSelected() || genderOButton.isSelected());
                boolean jTF5empty = jTextField5.getText().isEmpty();
                if(jTF1empty || jTF2empty || jTF3empty ||jRBempty || jTF5empty){
                    jButton1.setEnabled(false);
                }else {
                    jButton1.setEnabled(true);
                }
            }
        };
        genderMButton.addActionListener(listener);
        genderFButton.addActionListener(listener);
        genderOButton.addActionListener(listener);
        
        jTextField5.getDocument().addDocumentListener(new DocumentListener() {
            public void changedUpdate(DocumentEvent e){
                changed();
            }
            public void removeUpdate(DocumentEvent e){
                changed();
            }
            public void insertUpdate(DocumentEvent e){
                changed();
            }
            public void changed() {
                boolean jTF1empty = jTextField1.getText().isEmpty();
                boolean jTF2empty = jTextField2.getText().isEmpty();
                boolean jTF3empty = jTextField3.getText().isEmpty();
                boolean jRBempty = !(genderMButton.isSelected() || genderFButton.isSelected() || genderOButton.isSelected());
                boolean jTF5empty = jTextField5.getText().isEmpty();
                if(jTF1empty || jTF2empty || jTF3empty ||jRBempty || jTF5empty){
                    jButton1.setEnabled(false);
                }else {
                    jButton1.setEnabled(true);
                }
            }
        });
             
        jLabel4.setVisible(false); // Hide the Added new employee message
        jLabel9.setVisible(false);
        pack();
        
    }
    
    
    public void setMainHT(MyHashTable theRefVal) {
        mainHT = theRefVal;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        genderButtonGroup = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        genderMButton = new javax.swing.JRadioButton();
        genderFButton = new javax.swing.JRadioButton();
        genderOButton = new javax.swing.JRadioButton();
        jButton1 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setText("Employee Number");
        jLabel1.setToolTipText("Enter a six digit employee number (e.g. 123456)");

        jLabel2.setText("First Name");

        jLabel3.setText("Last Name");

        jTextField1.setToolTipText("Enter a six digit employee number (e.g. 123456)");
        jTextField1.setActionCommand("null");
        jTextField1.setMinimumSize(new java.awt.Dimension(60, 20));
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jTextField2.setMinimumSize(new java.awt.Dimension(60, 20));
        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });

        jTextField3.setMinimumSize(new java.awt.Dimension(60, 20));
        jTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3ActionPerformed(evt);
            }
        });

        jLabel6.setText("Gender");

        genderButtonGroup.add(genderMButton);
        genderMButton.setText("Male");
        genderMButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                genderMButtonActionPerformed(evt);
            }
        });

        genderButtonGroup.add(genderFButton);
        genderFButton.setText("Female");
        genderFButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                genderFButtonActionPerformed(evt);
            }
        });

        genderButtonGroup.add(genderOButton);
        genderOButton.setText("Other");
        genderOButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                genderOButtonActionPerformed(evt);
            }
        });

        jButton1.setText("Add");
        jButton1.setEnabled(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addTheNewEmployee(evt);
            }
        });

        jLabel4.setText("Employee added!");

        jButton2.setText("Exit");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitAddNewEmployee(evt);
            }
        });

        jLabel5.setText("Add New Employee");

        jLabel7.setText("Work Location");

        jLabel8.setText("Deduct Rate [0, 1]");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Mississauga", "Toronto", "Markham" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        jLabel9.setText("Employee Information");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(139, 139, 139)
                        .addComponent(jLabel5)
                        .addGap(17, 17, 17)
                        .addComponent(jButton2))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel8)))
                .addContainerGap(86, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel7))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(genderMButton)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(genderFButton)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(genderOButton, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(jTextField3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE)
                                        .addComponent(jTextField2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jTextField1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(2, 2, 2))
                    .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(genderFButton)
                    .addComponent(genderMButton)
                    .addComponent(genderOButton))
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel9)
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addContainerGap(37, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    private void addTheNewEmployee(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addTheNewEmployee
        // TODO add your handling code here:
        
        // try catches any error such as if you entered a string for theEmpNum
        try {
            int theEmpNum = Integer.parseInt(jTextField1.getText());
            String theFirstName = jTextField2.getText();
            String theLastName = jTextField3.getText();
            int gender; String genderOutput;
            if(genderMButton.isSelected()) {
                gender = 0; genderOutput = "Male";
            }
            else if(genderFButton.isSelected()) {
                 gender = 1; genderOutput = "Female";
            }
            else {
                gender = 2; genderOutput = "Other";
            }
            int workLoc = jComboBox1.getSelectedIndex();
            String workLocOutput = jComboBox1.getSelectedItem().toString();
            double deductRate = Double.parseDouble(jTextField5.getText());
            
            if(deductRate < 0 || deductRate > 1){
                throw new IOException("Invalid Deduct Rate!");
            }
        

            // prints information of employee recently added
            FTE theFTE = new FTE(theEmpNum, theFirstName, theLastName,
                            gender, workLoc, deductRate, 80000.00);
            mainHT.addEmployee(theFTE);
            jLabel4.setForeground(Color.BLACK);
            jLabel4.setText("Added new employee: " + jTextField1.getText() + " "
                            + theFirstName + " " + theLastName);
            jLabel9.setText("Gender: " + genderOutput + ", Work location: " + workLocOutput + ", Deduct Rate: " + deductRate * 100 + "%");
            jLabel4.setVisible(true);
            jLabel9.setVisible(true);
            
            // resets fields to add another employee
            jTextField1.setText("");
            jTextField2.setText("");
            jTextField3.setText("");
            genderMButton.setSelected(false);
            genderFButton.setSelected(false);
            genderOButton.setSelected(false);
            jComboBox1.setSelectedIndex(0);
            jTextField5.setText("");
        }catch(Exception e) {
            jLabel9.setVisible(false);
            jLabel4.setForeground(Color.RED);
            jLabel4.setText("Invalid information!");
            jLabel4.setVisible(true);
        }        
        
    }//GEN-LAST:event_addTheNewEmployee

    
    private void exitAddNewEmployee(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitAddNewEmployee
        // TODO add your handling code here:     
        this.dispose(); // Make this window disappear
    }//GEN-LAST:event_exitAddNewEmployee

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField3ActionPerformed

    private void genderMButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_genderMButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_genderMButtonActionPerformed

    private void genderOButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_genderOButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_genderOButtonActionPerformed

    private void genderFButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_genderFButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_genderFButtonActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed

    
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
            java.util.logging.Logger.getLogger(AddNewEmployeeJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddNewEmployeeJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddNewEmployeeJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddNewEmployeeJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddNewEmployeeJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup genderButtonGroup;
    private javax.swing.JRadioButton genderFButton;
    private javax.swing.JRadioButton genderMButton;
    private javax.swing.JRadioButton genderOButton;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField5;
    // End of variables declaration//GEN-END:variables
}
