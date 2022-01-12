package thesimpleems_16nov;

import com.formdev.flatlaf.*;
import thesimpleems_16nov.FTE;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author P0068839
 */
public class MainJFrame extends javax.swing.JFrame {
    
    // ATTRIBUTES
    public MyHashTable theHT;
    boolean light = false;
    
    
    // CONSTRUCTORS
    /**
     * Creates new form MainJFrame
     */
    public MainJFrame() {
        initComponents();
        
        theHT = new MyHashTable(10);
        System.out.println("Created HashTable");
        
        tempJButton1.setVisible(false);
        
        // Reading from database file
        try {
            Scanner sc = new Scanner(new FileReader("database.txt"));
            
            if(sc.hasNextLine()){
                String lightdark = sc.nextLine();
                if(lightdark.equals("Light")){
                    light = true;
                }else{
                    light = false;
                }
            }
            
            String line = null;
            String[] values;
            
            while(sc.hasNextLine()){
                line = sc.nextLine();
                System.out.println(line);
                values = line.split("\\|"); // splits with |
                for(int i=0; i<values.length; i++)  {
                    values[i] = values[i].replaceAll("!@!", "\\|");
                }
                try{
                    if(values[0].equals("FTE")){

                        int theEmpNum = Integer.parseInt(values[1]);
                        String theFirstName = values[2];
                        String theLastName = values[3];
                        int gender = Integer.parseInt(values[4]);
                        int workLoc = Integer.parseInt(values[5]);
                        
                        double deductRate = Double.parseDouble(values[6]);

                        FTE theFTE;

                        double yearlySalary = Double.parseDouble(values[7]);
                        theFTE = new FTE(theEmpNum, theFirstName, theLastName,
                                    gender, workLoc, deductRate, yearlySalary);
                        theHT.addEmployee(theFTE);

                    }else if(values[0].equals("PTE")){

                        int theEmpNum = Integer.parseInt(values[1]);
                        String theFirstName = values[2];
                        String theLastName = values[3];
                        int gender = Integer.parseInt(values[4]);
                        int workLoc = Integer.parseInt(values[5]);
                        
                        double deductRate = Double.parseDouble(values[6]);

                        PTE thePTE;

                        double hourlyWage = Double.parseDouble(values[7]);
                        double hoursPerWeek = Double.parseDouble(values[8]);
                        double weeksPerYear = Double.parseDouble(values[9]);

                        thePTE = new PTE(theEmpNum, theFirstName, theLastName, gender,
                        workLoc, deductRate, hourlyWage, hoursPerWeek, weeksPerYear);
                        theHT.addEmployee(thePTE);
                                                
                    }


                }catch(Exception e){
                    continue;
                }
            }
            
            sc.close();
        } catch (FileNotFoundException ex) {
            System.err.println("File Not Found!");
        }
        
        if(light){
            try {
                jToggleButton1.setText("Light");
                UIManager.setLookAndFeel(new FlatLightLaf());
                SwingUtilities.updateComponentTreeUI(this);
                this.pack();
            } catch (UnsupportedLookAndFeelException ex) {
                Logger.getLogger(MainJFrame.class.getName()).log(Level.SEVERE, null, ex);
            }
        }else{
            try {
                jToggleButton1.setText("Dark");
                UIManager.setLookAndFeel(new FlatDarkLaf());
                SwingUtilities.updateComponentTreeUI(this);
                this.pack();
            } catch (UnsupportedLookAndFeelException ex) {
                Logger.getLogger(MainJFrame.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
        
    }
    
    
    // METHODS   
    
    public MyHashTable getTheHT() {
        return theHT;
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
        tempJButton1 = new javax.swing.JButton();
        tempJButton2 = new javax.swing.JButton();
        tempJButton3 = new javax.swing.JButton();
        addEmpButton = new javax.swing.JButton();
        removeEmpButton = new javax.swing.JButton();
        getEmpInfoButton = new javax.swing.JButton();
        setEmpInfoButton = new javax.swing.JButton();
        jToggleButton1 = new javax.swing.JToggleButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        tempJButton1.setText("(Demo) Add 3 Example Employees");
        tempJButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tempJButton1ActionPerformed(evt);
            }
        });

        tempJButton2.setText("Clear Database");
        tempJButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tempJButton2ActionPerformed(evt);
            }
        });

        tempJButton3.setText("Display All Employees");
        tempJButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pressed_tempJButton3(evt);
            }
        });

        addEmpButton.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        addEmpButton.setText("Add Employee");
        addEmpButton.setToolTipText("Add a new Employee to the system");
        addEmpButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addEmpButtonActionPerformed(evt);
            }
        });

        removeEmpButton.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        removeEmpButton.setText("Remove Employee");
        removeEmpButton.setToolTipText("Remove an existing Employee");
        removeEmpButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeEmpButtonActionPerformed(evt);
            }
        });

        getEmpInfoButton.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        getEmpInfoButton.setText("Search Employee Information");
        getEmpInfoButton.setToolTipText("Get Information based on Employee Number");
        getEmpInfoButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                getEmpInfoButtonActionPerformed(evt);
            }
        });

        setEmpInfoButton.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        setEmpInfoButton.setText("Change Employee Information");
        setEmpInfoButton.setToolTipText("Change Employee number, name, work location, etc.");
        setEmpInfoButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                setEmpInfoButtonActionPerformed(evt);
            }
        });

        jToggleButton1.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        jToggleButton1.setSelected(true);
        jToggleButton1.setText("Dark");
        jToggleButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton1ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Trebuchet MS", 1, 28)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setLabelFor(this);
        jLabel1.setText("HR Employee Management System");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(tempJButton1)
                .addGap(41, 41, 41)
                .addComponent(jToggleButton1)
                .addGap(24, 24, 24))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(getEmpInfoButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(addEmpButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(setEmpInfoButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(removeEmpButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(tempJButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(tempJButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(14, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(addEmpButton, javax.swing.GroupLayout.DEFAULT_SIZE, 49, Short.MAX_VALUE)
                    .addComponent(removeEmpButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(setEmpInfoButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(getEmpInfoButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tempJButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tempJButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jToggleButton1)
                    .addComponent(tempJButton1))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tempJButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tempJButton1ActionPerformed
        // TODO add your handling code here:
        
       
        FTE theFTE;
        PTE thePTE;
        
        theFTE = new FTE(111111, "Elmer", "Fudd", 0, 3, 0.2, 80000.00);
        theHT.addEmployee(theFTE);
        System.out.println("Added the FTE to the hash table!");
                
        thePTE = new PTE(222222, "Daffy", "Duck", 0, 2, 0.22, 10.0, 20.0, 30.0);
        theHT.addEmployee(thePTE);
        System.out.println("Added the PTE to the hash table!");
                
        theFTE = new FTE(333333, "Lola", "Bunny", 1, 5, 0.17, 90000.00);
        theHT.addEmployee(theFTE);
        System.out.println("Added the FTE to the hash table!");

    }//GEN-LAST:event_tempJButton1ActionPerformed

    private void tempJButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tempJButton2ActionPerformed
        // TODO add your handling code here:
        PrintWriter out = null;
        try {
            out = new PrintWriter(new BufferedWriter(new FileWriter("database.txt")));
            if(light){
                out.println("Light");
            }else{
                out.println("Dark");
            }
        } catch (IOException ex) {
            Logger.getLogger(MainJFrame.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            out.close();
            System.exit(0);
        }
    }//GEN-LAST:event_tempJButton2ActionPerformed

    private void pressed_tempJButton3(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pressed_tempJButton3
        // TODO add your handling code here:
        DisplayEmployeeInfoJFrame newDEIJFrame = new DisplayEmployeeInfoJFrame();
        newDEIJFrame.setVisible(true);
        MyHashTable refVal = getTheHT();
        newDEIJFrame.setMainHT(refVal);
    }//GEN-LAST:event_pressed_tempJButton3

    private void removeEmpButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeEmpButtonActionPerformed
        // TODO add your handling code here:
        RemoveNewEmployeeJFrame newRNEJFrame = new RemoveNewEmployeeJFrame();
        newRNEJFrame.setVisible(true);
        MyHashTable refVal = getTheHT();
        newRNEJFrame.setMainHT(refVal);
    }//GEN-LAST:event_removeEmpButtonActionPerformed

    private void getEmpInfoButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_getEmpInfoButtonActionPerformed
        // TODO add your handling code here:
        LookupEmployeeInfoJFrame newLEIJFrame = new LookupEmployeeInfoJFrame();
        newLEIJFrame.setVisible(true);
        newLEIJFrame.setMainHT(theHT);
    }//GEN-LAST:event_getEmpInfoButtonActionPerformed

    private void addEmpButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addEmpButtonActionPerformed
        // TODO add your handling code here:
        AddNewEmployeeJFrame newANEJFrame = new AddNewEmployeeJFrame();
        newANEJFrame.setVisible(true);
        MyHashTable refVal = getTheHT();
        newANEJFrame.setMainHT(refVal);
    }//GEN-LAST:event_addEmpButtonActionPerformed

    private void setEmpInfoButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_setEmpInfoButtonActionPerformed
        // TODO add your handling code here:
        ChangeEmployeeInfoJFrame newCEIJFrame = new ChangeEmployeeInfoJFrame();
        newCEIJFrame.setVisible(true);
        MyHashTable refVal = getTheHT();
        newCEIJFrame.setMainHT(refVal);
    }//GEN-LAST:event_setEmpInfoButtonActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        // Writing to database file
        PrintWriter out = null;
        try {
            out = new PrintWriter(new BufferedWriter(new FileWriter("database.txt")));
            if(light){
                out.println("Light");
            }else{
                out.println("Dark");
            }
            for (int i = 0; i < theHT.buckets.length; i++) {
                for (int j = 0; j < theHT.buckets[i].size(); j++) {
                    EmployeeInfo emp = theHT.buckets[i].get(j);
                    
                    if(emp instanceof FTE){
                        emp.firstName = emp.firstName.replaceAll("\\|", "!@!");
                        emp.lastName = emp.lastName.replaceAll("\\|", "!@!");
                        out.println("FTE|" + emp.empNum + "|" + emp.firstName + "|" + emp.lastName + "|" +
                                emp.gender + "|" + emp.workLoc + "|" + emp.deductRate + "|" + ((FTE) emp).getYearlySalary());
                    }else if(emp instanceof PTE){
                        emp.firstName = emp.firstName.replaceAll("\\|", "!@!");
                        emp.lastName = emp.lastName.replaceAll("\\|", "!@!");
                        out.println("PTE|" + emp.empNum + "|" + emp.firstName + "|" + emp.lastName + "|" +
                                emp.gender + "|" + emp.workLoc + "|" + emp.deductRate + "|" + ((PTE) emp).getHourlyWage() +
                                "|" + ((PTE) emp).getHoursPerWeek() + "|" + ((PTE) emp).getWeeksPerYear());
                    }
                }
            }
            
        } catch (IOException ex) {
            Logger.getLogger(MainJFrame.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            out.close();
        }
    }//GEN-LAST:event_formWindowClosing

    private void jToggleButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton1ActionPerformed
        // TODO add your handling code here:
        if(light){
            try {
                jToggleButton1.setText("Dark");
                UIManager.setLookAndFeel(new FlatDarkLaf());
                SwingUtilities.updateComponentTreeUI(this);
                this.pack();
            } catch (UnsupportedLookAndFeelException ex) {
                Logger.getLogger(MainJFrame.class.getName()).log(Level.SEVERE, null, ex);
            }
        }else{
            try {
                jToggleButton1.setText("Light");
                UIManager.setLookAndFeel(new FlatLightLaf());
                SwingUtilities.updateComponentTreeUI(this);
                this.pack();
            } catch (UnsupportedLookAndFeelException ex) {
                Logger.getLogger(MainJFrame.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        light = !light;
    }//GEN-LAST:event_jToggleButton1ActionPerformed

    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
                
        try {
            UIManager.setLookAndFeel(new FlatDarkLaf());
        } catch (UnsupportedLookAndFeelException ex) {
            Logger.getLogger(MainJFrame.class.getName()).log(Level.SEVERE, null, ex);
        }

        
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addEmpButton;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton getEmpInfoButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JButton removeEmpButton;
    private javax.swing.JButton setEmpInfoButton;
    private javax.swing.JButton tempJButton1;
    private javax.swing.JButton tempJButton2;
    private javax.swing.JButton tempJButton3;
    // End of variables declaration//GEN-END:variables
}
