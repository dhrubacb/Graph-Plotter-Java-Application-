/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package graph.plotter;
import java.awt.*;
import javax.swing.*;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import static javax.swing.SpringLayout.SOUTH;
import javax.swing.table.DefaultTableModel;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartFrame;
import org.jfree.chart.ChartRenderingInfo;
import org.jfree.chart.ChartUtilities;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.entity.StandardEntityCollection;
import org.jfree.chart.plot.PiePlot;
import org.jfree.data.general.DefaultPieDataset;

/**
 *
 * @author DELL
 */
public class PieMenu extends javax.swing.JFrame {

    /**
     * Creates new form PieMenu
     */
    /**
     * Creating PieMenu panel variable
     */
    public static javax.swing.JPanel piePanel;
    public PieMenu() {
        initComponents();
        piePanel = jPanel1; /**Copying Panel*/
    }
    /**
     * count is the variable to count total data and Button is for identify users choice of attach or instant input
     */
    
    static int cnt=0,Button;
        
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jRadioButton1 = new javax.swing.JRadioButton();
        jTextField2 = new javax.swing.JTextField();
        jTextField1 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        Table = new javax.swing.JTable();
        jRadioButton2 = new javax.swing.JRadioButton();
        jTextField3 = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);
        setSize(new java.awt.Dimension(800, 650));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(800, 650));
        jPanel1.setLayout(null);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/graph/plotter/4.jpg"))); // NOI18N
        jPanel1.add(jLabel1);
        jLabel1.setBounds(0, 0, 470, 470);

        jLabel2.setText("Name");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(510, 40, 60, 20);

        jLabel3.setText("Amount");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(700, 40, 60, 20);

        jButton1.setText("Show in Pie Chart");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(540, 420, 150, 60);

        jButton2.setText("Back");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2);
        jButton2.setBounds(730, 430, 80, 40);

        buttonGroup1.add(jRadioButton1);
        jRadioButton1.setText("User Input");
        jRadioButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jRadioButton1);
        jRadioButton1.setBounds(480, 10, 110, 23);

        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField2);
        jTextField2.setBounds(690, 70, 120, 30);
        jPanel1.add(jTextField1);
        jTextField1.setBounds(500, 70, 160, 30);

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

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(500, 200, 310, 110);

        buttonGroup1.add(jRadioButton2);
        jRadioButton2.setText("Attach .csv File");
        jRadioButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jRadioButton2);
        jRadioButton2.setBounds(480, 320, 170, 23);

        jTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField3);
        jTextField3.setBounds(520, 350, 190, 40);

        jButton3.setText("Import");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3);
        jButton3.setBounds(740, 350, 70, 30);

        jButton4.setText("Add");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4);
        jButton4.setBounds(510, 110, 80, 30);

        jButton5.setText("Delete");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton5);
        jButton5.setBounds(510, 150, 80, 30);

        jLabel4.setText("[Blank Input is not Allowed!]");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(620, 120, 170, 20);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 838, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 530, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
/**
 * This is the main working button for this class... It creates pie chart analyZing whole data set
 * 
 * @param evt 
 */
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

       try{
        DefaultPieDataset pieDataset =new DefaultPieDataset();     /** Initializing pie dataset*/
        int i;
        i = 0;
        String genre="a";
        if(Button==1){  /** For User Input*/
        while(i<cnt){
            double aa= Double.parseDouble(Table.getModel().getValueAt(i,1).toString());
            String str=Table.getModel().getValueAt(i,0).toString();
            
            pieDataset.setValue(str,  new Double(aa));
            i++;
            genre+="a";
            
        }
        }
        else{
        try {
            BufferedReader br =new BufferedReader(new FileReader(jTextField3.getText()));
            String Line;
            while((Line=br.readLine())!=null){
                String[] value =Line.split(",");
                     double val= Double.parseDouble(value[1]);
                    pieDataset.setValue(value[0],  new Double(val));
//                dataset.setValue(new Double(val),genre,value[0]);
//                genre+="a";
                // (value[0]);
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(PieMenu.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(PieMenu.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        }
    
        JFreeChart chart = ChartFactory.createPieChart("Pie Chart", pieDataset,true,true, true);
        PiePlot P= (PiePlot)chart.getPlot();
        P.setLabelLinkPaint(Color.BLACK);
        P.setBackgroundPaint(Color.white);
        ChartFrame frame = new ChartFrame("PieChart",chart);
        jButto1 =new JButton("Save");
        
        frame.setLayout(new BorderLayout());
        
        JPanel panel = new JPanel();
        panel.setLayout(new GridBagLayout());
        
        GridBagConstraints gc = new GridBagConstraints();
        gc.gridx =1;
        gc.gridy =0;
        
        panel.add(jButto1, gc);
        
        frame.add(panel, BorderLayout.SOUTH);
        
        
         jButto1.addActionListener(new ActionListener(){
       public void actionPerformed(ActionEvent e){
           
           try{
            final ChartRenderingInfo info = new ChartRenderingInfo(new StandardEntityCollection());
            final File file1 = new File("Pie_Chart.png");
            ChartUtilities.saveChartAsPNG(file1, chart, 600, 400,info);
            }
        catch(Exception ex){
            
        }
           
       }
    });
        frame.setVisible(true);
        frame.setSize(858,512);
        
        try{
            final ChartRenderingInfo info = new ChartRenderingInfo(new StandardEntityCollection());
            final File file1 = new File("Pie_Chart.png");
            ChartUtilities.saveChartAsPNG(file1, chart, 600, 400,info);
            }
        catch(Exception e){
            
        }
        }
        catch(Exception ex){
            
        }
    }//GEN-LAST:event_jButton1ActionPerformed
 /**
 * Works for return to Menu
 * @param evt Action variable 
 */
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
  Menu menu =new Menu();
        Menu.M.getContentPane().removeAll();
        
        Menu.M.getContentPane().add(Menu.menuPanel);
        Menu.M.repaint();
        Menu.M.revalidate();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed
/**
   * This method works for showing clicked data in textFields 
   * @param evt 
   */
    private void TableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TableMouseClicked
       DefaultTableModel model =(DefaultTableModel) Table.getModel();
         jTextField1.setText(model.getValueAt(Table.getSelectedRow(), 0).toString());
          jTextField2.setText(model.getValueAt(Table.getSelectedRow(), 1).toString());
              }//GEN-LAST:event_TableMouseClicked
/**
 * This method works for adding new data entry
 * @param evt 
 */
    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
         DefaultTableModel model =(DefaultTableModel) Table.getModel();
         model.addRow(new Object[]{jTextField1.getText(),jTextField2.getText()});
        cnt++;
        
    }//GEN-LAST:event_jButton4ActionPerformed
/**
 * This method works for deleting a data entry
 * @param evt 
 */
    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
      DefaultTableModel model =(DefaultTableModel) Table.getModel();
        model.removeRow(Table.getSelectedRow());
        cnt--;
    }//GEN-LAST:event_jButton5ActionPerformed
/**
 * refers to instant input
 * @param evt 
 */
    private void jRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton1ActionPerformed
        // TODO add your handling code here:
        Button=1;
    }//GEN-LAST:event_jRadioButton1ActionPerformed
/**
 * refers to .csv input
 * @param evt 
 */
    private void jRadioButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton2ActionPerformed
        // TODO add your handling code here:
        Button=2;
    }//GEN-LAST:event_jRadioButton2ActionPerformed
/**
 * This method works for choosing file path
    
    */
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
         JFileChooser jf= new JFileChooser();
        jf.showOpenDialog(null);
        File file = jf.getSelectedFile();
        String f=file.getAbsolutePath();
        jTextField3.setText(f);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField3ActionPerformed
    
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
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PieMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new PieMenu().setVisible(true);
        });
    }
    private JButton jButto1;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable Table;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    // End of variables declaration//GEN-END:variables
}
