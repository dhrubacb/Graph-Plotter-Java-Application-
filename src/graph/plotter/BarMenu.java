/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package graph.plotter;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import static java.lang.Math.pow;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartFrame;
import org.jfree.chart.ChartRenderingInfo;
import org.jfree.chart.ChartUtilities;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.entity.StandardEntityCollection;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;

/**
 *
 * @author Dhruba
 */
public class BarMenu extends javax.swing.JFrame {
           
    /**
     * Creates new form BarMenu
     */
    /**
     * Creating BarMenu reference and panel variable
     */
    public static BarMenu bm;
   public static javax.swing.JPanel baMenurPanel;
    public BarMenu() {
        initComponents();
        baMenurPanel = barPanel;
    }
    /**
     * count is the variable to count total data and Button is for identify users choice of attach or instant input
     */
    
   static int count=0,Button;
   
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton2 = new javax.swing.JButton();
        buttonGroup1 = new javax.swing.ButtonGroup();
        barPanel = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Table = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        addButton = new javax.swing.JButton();
        deleteButton = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jTextField3 = new javax.swing.JTextField();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jLabel4 = new javax.swing.JLabel();

        jButton2.setText("jButton2");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        barPanel.setBackground(new java.awt.Color(204, 204, 204));
        barPanel.setToolTipText("");
        barPanel.setPreferredSize(new java.awt.Dimension(858, 513));
        barPanel.setLayout(null);

        jButton1.setText("Show in Bar Chart");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        barPanel.add(jButton1);
        jButton1.setBounds(550, 400, 140, 48);

        jButton3.setText("BACK");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        barPanel.add(jButton3);
        jButton3.setBounds(710, 410, 100, 36);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/graph/plotter/Untitled.jpg"))); // NOI18N
        jLabel3.setText("jLabel3");
        barPanel.add(jLabel3);
        jLabel3.setBounds(0, 0, 490, 500);

        Table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Name", "Amount"
            }
        ));
        Table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(Table);

        barPanel.add(jScrollPane1);
        jScrollPane1.setBounds(490, 190, 360, 110);

        jLabel1.setText("  Name");
        barPanel.add(jLabel1);
        jLabel1.setBounds(520, 40, 130, 20);

        jLabel2.setText("Amount");
        barPanel.add(jLabel2);
        jLabel2.setBounds(720, 40, 150, 20);
        barPanel.add(jTextField1);
        jTextField1.setBounds(510, 70, 150, 30);

        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });
        barPanel.add(jTextField2);
        jTextField2.setBounds(710, 70, 120, 30);

        addButton.setText("Add");
        addButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addButtonActionPerformed(evt);
            }
        });
        barPanel.add(addButton);
        addButton.setBounds(540, 110, 80, 30);

        deleteButton.setText("Delete");
        deleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteButtonActionPerformed(evt);
            }
        });
        barPanel.add(deleteButton);
        deleteButton.setBounds(540, 150, 80, 30);

        jButton6.setText("Import");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        barPanel.add(jButton6);
        jButton6.setBounds(740, 350, 73, 30);
        barPanel.add(jTextField3);
        jTextField3.setBounds(540, 350, 190, 30);

        buttonGroup1.add(jRadioButton1);
        jRadioButton1.setText("User Input");
        jRadioButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton1ActionPerformed(evt);
            }
        });
        barPanel.add(jRadioButton1);
        jRadioButton1.setBounds(520, 20, 120, 23);

        buttonGroup1.add(jRadioButton2);
        jRadioButton2.setText("Attach .csv File");
        jRadioButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton2ActionPerformed(evt);
            }
        });
        barPanel.add(jRadioButton2);
        jRadioButton2.setBounds(520, 320, 170, 23);

        jLabel4.setText("[Blank Input is not Allowed!]");
        barPanel.add(jLabel4);
        jLabel4.setBounds(640, 110, 170, 30);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(barPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 967, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(barPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 506, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
/**
 * Works for return to Menu
 * @param evt Action variable 
 */
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:

        Menu menu =new Menu();

        Menu.M.getContentPane().removeAll();

        Menu.M.getContentPane().add(menu.menuPanel);
        Menu.M.repaint();
        Menu.M.revalidate();

    }//GEN-LAST:event_jButton3ActionPerformed
/**
 * This is the main working button for this class... It creates bar chart analyZing whole data set
 * 
 * @param evt 
 */
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        try{
        DefaultCategoryDataset dataset =new DefaultCategoryDataset();
        int i;
        i = 0;
        String genre=" ";
        if(Button==1)
        while(i<count){
            double amount= Double.parseDouble(Table.getModel().getValueAt(i,1).toString());
            String name=Table.getModel().getValueAt(i,0).toString();
            dataset.setValue(new Double(amount),genre,name);
            i++;
            genre+=" ";
            
        }
        else{
        try {
            BufferedReader br =new BufferedReader(new FileReader(jTextField3.getText()));
            String Line;
            while((Line=br.readLine())!=null){
                String[] value =Line.split(",");
                     double val= Double.parseDouble(value[1]);
                    
                dataset.setValue(new Double(val),genre,value[0]);
                genre+=" ";
                System.out.println(value[0]);
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(BarMenu.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(BarMenu.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        }
        
        JFreeChart chart = ChartFactory.createBarChart3D("Amount","Name","Amount", dataset, PlotOrientation.VERTICAL, false , true, false);
        CategoryPlot p =chart.getCategoryPlot();
        p.setRangeGridlinePaint(Color.white);
        p.setBackgroundPaint(Color.black);
        ChartFrame frame=new ChartFrame("Bar Chart",chart);
         saveButton =new JButton("Save image in Project Folder");
        
        frame.setLayout(new BorderLayout());
        
        JPanel panel = new JPanel();
        panel.setLayout(new GridBagLayout());
        
        GridBagConstraints gc = new GridBagConstraints();
        gc.gridx =1;
        gc.gridy =0;
        
        panel.add(saveButton, gc);
        
        frame.add(panel, BorderLayout.SOUTH);
        
        
         saveButton.addActionListener(new ActionListener(){
       public void actionPerformed(ActionEvent e){
           
           try{
            final ChartRenderingInfo info = new ChartRenderingInfo(new StandardEntityCollection());
            final File file1 = new File("Bar_Chart.png");
            ChartUtilities.saveChartAsPNG(file1, chart, 600, 400,info);
        }
        catch(Exception ex){

        }
           
       }
    });
        frame.setVisible(true);

        frame.setSize(858,513);
       }
        catch(Exception e){
            
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed
/**
 * This method works for adding new data entry
 * @param evt 
 */
    private void addButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addButtonActionPerformed
         DefaultTableModel model =(DefaultTableModel) Table.getModel();
         model.addRow(new Object[]{jTextField1.getText(),jTextField2.getText()});
        count++;
        
    }//GEN-LAST:event_addButtonActionPerformed
/**
 * This method works for deleting a data entry
 * @param evt 
 */
    private void deleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteButtonActionPerformed
        DefaultTableModel model =(DefaultTableModel) Table.getModel();
        model.removeRow(Table.getSelectedRow());
        count--;
    }//GEN-LAST:event_deleteButtonActionPerformed
  /**
   * This method works for showing clicked data in textFields 
   * @param evt 
   */
    private void TableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TableMouseClicked
        // TODO add your handling codejhkjnuk here:
        DefaultTableModel model =(DefaultTableModel) Table.getModel();
         jTextField1.setText(model.getValueAt(Table.getSelectedRow(), 0).toString());
          jTextField2.setText(model.getValueAt(Table.getSelectedRow(), 1).toString());
          
    }//GEN-LAST:event_TableMouseClicked
/**
 * This method works for choosing file path
    
    */
    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        JFileChooser jf= new JFileChooser();
        jf.showOpenDialog(null);
        File file = jf.getSelectedFile();
        String f=file.getAbsolutePath();
        jTextField3.setText(f);
     }//GEN-LAST:event_jButton6ActionPerformed
/**
 * refers to instant input
 * @param evt 
 */
    private void jRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton1ActionPerformed
        // TODO add your handling code here:
        Button=1;
    }//GEN-LAST:event_jRadioButton1ActionPerformed
/**
 * 
 * refers to attach input
 */
    private void jRadioButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton2ActionPerformed
        // TODO add your handling code here:
        Button=2;
    }//GEN-LAST:event_jRadioButton2ActionPerformed
    
    
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
            java.util.logging.Logger.getLogger(BarMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BarMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BarMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BarMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                 bm = new BarMenu();
                bm.setVisible(true);
            }
        });
    }
   private JButton saveButton;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable Table;
    private javax.swing.JButton addButton;
    private javax.swing.JPanel barPanel;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton deleteButton;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    // End of variables declaration//GEN-END:variables
}
