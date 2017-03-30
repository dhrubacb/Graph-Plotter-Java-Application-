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
 * @author DELL
 */
public class LineGraph extends javax.swing.JFrame {
 public static int ind;
    /**
     * Creating LineGraph panel variable
     */
    public static javax.swing.JPanel jPanel2;
    public LineGraph() {
        initComponents();
        jPanel2 = jPanel1;
    }
    /**
     * count is the variable to count total data and Button is for identify users choice of attach or instant input
     */
    static int cnt,button1,button2;    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jTextField3 = new javax.swing.JTextField();
        jCheckBox1 = new javax.swing.JCheckBox();
        jCheckBox2 = new javax.swing.JCheckBox();
        jTextField4 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        Table = new javax.swing.JTable();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        num0 = new javax.swing.JButton();
        num3 = new javax.swing.JButton();
        num4 = new javax.swing.JButton();
        num5 = new javax.swing.JButton();
        num6 = new javax.swing.JButton();
        num7 = new javax.swing.JButton();
        num8 = new javax.swing.JButton();
        num9 = new javax.swing.JButton();
        num1 = new javax.swing.JButton();
        pnt = new javax.swing.JButton();
        jButton16 = new javax.swing.JButton();
        num2 = new javax.swing.JButton();
        se = new javax.swing.JButton();
        tan = new javax.swing.JButton();
        sin = new javax.swing.JButton();
        cos = new javax.swing.JButton();
        jButton23 = new javax.swing.JButton();
        power = new javax.swing.JButton();
        su = new javax.swing.JButton();
        vag = new javax.swing.JButton();
        plus = new javax.swing.JButton();
        minus = new javax.swing.JButton();
        into = new javax.swing.JButton();
        ee = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        e = new javax.swing.JButton();
        X = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        jPanel1.setLayout(null);
        jPanel1.add(jTextField1);
        jTextField1.setBounds(10, 60, 410, 60);
        jPanel1.add(jTextField2);
        jTextField2.setBounds(510, 80, 110, 30);

        buttonGroup1.add(jRadioButton1);
        jRadioButton1.setText("Expression ");
        jRadioButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jRadioButton1);
        jRadioButton1.setBounds(20, 20, 130, 23);

        buttonGroup1.add(jRadioButton2);
        jRadioButton2.setText("Data");
        jRadioButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jRadioButton2);
        jRadioButton2.setBounds(490, 20, 93, 23);
        jPanel1.add(jTextField3);
        jTextField3.setBounds(650, 80, 80, 30);

        buttonGroup2.add(jCheckBox1);
        jCheckBox1.setText("User Input");
        jCheckBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox1ActionPerformed(evt);
            }
        });
        jPanel1.add(jCheckBox1);
        jCheckBox1.setBounds(500, 50, 77, 23);

        buttonGroup2.add(jCheckBox2);
        jCheckBox2.setText("Attach .csv File");
        jCheckBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox2ActionPerformed(evt);
            }
        });
        jPanel1.add(jCheckBox2);
        jCheckBox2.setBounds(510, 310, 120, 23);
        jPanel1.add(jTextField4);
        jTextField4.setBounds(540, 340, 130, 30);

        jButton1.setText("Import");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(700, 340, 70, 30);

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
        jScrollPane1.setBounds(500, 200, 310, 90);

        jButton2.setText("Add");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2);
        jButton2.setBounds(520, 120, 60, 30);

        jButton3.setText("Delete");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3);
        jButton3.setBounds(520, 160, 63, 30);

        jButton4.setText("Show in Line graph");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4);
        jButton4.setBounds(350, 410, 190, 40);

        jButton5.setText("Back");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton5);
        jButton5.setBounds(410, 460, 70, 30);

        num0.setText("0");
        num0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                num0ActionPerformed(evt);
            }
        });
        jPanel1.add(num0);
        num0.setBounds(160, 270, 50, 30);

        num3.setText("3");
        num3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                num3ActionPerformed(evt);
            }
        });
        jPanel1.add(num3);
        num3.setBounds(300, 150, 50, 30);

        num4.setText("4");
        num4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                num4ActionPerformed(evt);
            }
        });
        jPanel1.add(num4);
        num4.setBounds(160, 190, 50, 30);

        num5.setText("5");
        num5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                num5ActionPerformed(evt);
            }
        });
        jPanel1.add(num5);
        num5.setBounds(229, 190, 50, 30);

        num6.setText("6");
        num6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                num6ActionPerformed(evt);
            }
        });
        jPanel1.add(num6);
        num6.setBounds(300, 190, 50, 30);

        num7.setText("7");
        num7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                num7ActionPerformed(evt);
            }
        });
        jPanel1.add(num7);
        num7.setBounds(160, 230, 50, 30);

        num8.setText("8");
        num8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                num8ActionPerformed(evt);
            }
        });
        jPanel1.add(num8);
        num8.setBounds(230, 230, 50, 30);

        num9.setText("9");
        num9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                num9ActionPerformed(evt);
            }
        });
        jPanel1.add(num9);
        num9.setBounds(300, 230, 50, 30);

        num1.setText("1");
        num1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                num1ActionPerformed(evt);
            }
        });
        jPanel1.add(num1);
        num1.setBounds(160, 150, 50, 30);

        pnt.setText(".");
        pnt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pntActionPerformed(evt);
            }
        });
        jPanel1.add(pnt);
        pnt.setBounds(230, 270, 50, 30);

        jButton16.setText("<--");
        jButton16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton16ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton16);
        jButton16.setBounds(300, 270, 50, 30);

        num2.setText("2");
        num2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                num2ActionPerformed(evt);
            }
        });
        jPanel1.add(num2);
        num2.setBounds(230, 150, 50, 30);

        se.setText(")");
        se.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                seActionPerformed(evt);
            }
        });
        jPanel1.add(se);
        se.setBounds(100, 190, 40, 30);

        tan.setText("tan(");
        tan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tanActionPerformed(evt);
            }
        });
        jPanel1.add(tan);
        tan.setBounds(20, 230, 70, 30);

        sin.setText("sin(");
        sin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sinActionPerformed(evt);
            }
        });
        jPanel1.add(sin);
        sin.setBounds(20, 150, 70, 30);

        cos.setText("cos(");
        cos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cosActionPerformed(evt);
            }
        });
        jPanel1.add(cos);
        cos.setBounds(20, 190, 70, 30);

        jButton23.setText("cos(");
        jPanel1.add(jButton23);
        jButton23.setBounds(20, 190, 70, 30);

        power.setText("^");
        power.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                powerActionPerformed(evt);
            }
        });
        jPanel1.add(power);
        power.setBounds(100, 230, 40, 30);

        su.setText("(");
        su.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                suActionPerformed(evt);
            }
        });
        jPanel1.add(su);
        su.setBounds(100, 150, 40, 30);

        vag.setText("/");
        vag.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vagActionPerformed(evt);
            }
        });
        jPanel1.add(vag);
        vag.setBounds(360, 310, 60, 40);

        plus.setText("+");
        plus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                plusActionPerformed(evt);
            }
        });
        jPanel1.add(plus);
        plus.setBounds(360, 150, 60, 40);

        minus.setText("-");
        minus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                minusActionPerformed(evt);
            }
        });
        jPanel1.add(minus);
        minus.setBounds(360, 200, 60, 40);

        into.setText("*");
        into.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                intoActionPerformed(evt);
            }
        });
        jPanel1.add(into);
        into.setBounds(360, 250, 60, 40);

        ee.setText("log(");
        ee.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eeActionPerformed(evt);
            }
        });
        jPanel1.add(ee);
        ee.setBounds(20, 270, 70, 30);

        jLabel1.setFont(new java.awt.Font("Wide Latin", 3, 11)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/graph/plotter/kl.jpg"))); // NOI18N
        jPanel1.add(jLabel1);
        jLabel1.setBounds(440, 0, 50, 380);

        e.setText("e(");
        e.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eActionPerformed(evt);
            }
        });
        jPanel1.add(e);
        e.setBounds(100, 270, 50, 30);

        X.setText("X");
        X.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                XActionPerformed(evt);
            }
        });
        jPanel1.add(X);
        X.setBounds(20, 310, 330, 40);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 825, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 502, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jCheckBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox2ActionPerformed
        // TODO add your handling code here:
        button2=2;
        
    }//GEN-LAST:event_jCheckBox2ActionPerformed
/**
 * This method works for adding new data entry
 * @param evt 
 */
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here
         DefaultTableModel model =(DefaultTableModel) Table.getModel();
         model.addRow(new Object[]{jTextField2.getText(),jTextField3.getText()});
        cnt++;
        
        
    }//GEN-LAST:event_jButton2ActionPerformed
/**
 * This method works for deleting a data entry
 * @param evt 
 */
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        DefaultTableModel model =(DefaultTableModel) Table.getModel();
        model.removeRow(Table.getSelectedRow());
        cnt--;
    }//GEN-LAST:event_jButton3ActionPerformed
/**
   * This method works for showing clicked data in textFields 
   * @param evt 
   */
    private void TableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TableMouseClicked
        // TODO add your handling code here:]
         DefaultTableModel model =(DefaultTableModel) Table.getModel();
         jTextField2.setText(model.getValueAt(Table.getSelectedRow(), 0).toString());
          jTextField3.setText(model.getValueAt(Table.getSelectedRow(), 1).toString());
    }//GEN-LAST:event_TableMouseClicked
/**
 * This method works for choosing file path
    
    */
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
          JFileChooser jf= new JFileChooser();
          jf.setBackground(Color.white);
        jf.showOpenDialog(null);
        File file = jf.getSelectedFile();
        String f=file.getAbsolutePath();
        jTextField4.setText(f);
    }//GEN-LAST:event_jButton1ActionPerformed
/**
 * refers to instant Expression input
 * @param evt 
 */
    private void jRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton1ActionPerformed
        // TODO add your handling code here:
        button1=1;
    }//GEN-LAST:event_jRadioButton1ActionPerformed
/**
 * refers to data input
 * @param evt 
 */
    private void jRadioButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton2ActionPerformed
        // TODO add your handling code here:
        button1=2;
    }//GEN-LAST:event_jRadioButton2ActionPerformed
/**
 * refers to instant data input
 * @param evt 
 */
    private void jCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox1ActionPerformed
        // TODO add your handling code here:
        button2=1;
    }//GEN-LAST:event_jCheckBox1ActionPerformed
/**
 * This is the main working button for this class... It creates Line Graph analyZing whole data set
 * 
 * @param evt 
 */
    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        try{
        DefaultCategoryDataset dataset =new DefaultCategoryDataset();
        int i;
        i = 0;
        String genre=" ";
        if(button1==2){
        if(button2==1)
        while(i<cnt){
            double aa= Double.parseDouble(Table.getModel().getValueAt(i,1).toString());
            String str=Table.getModel().getValueAt(i,0).toString();
            dataset.setValue(new Double(aa),genre,str);
            i++;
            //genre+=" ";
            
        }
        else{
        try {
            BufferedReader br =new BufferedReader(new FileReader(jTextField4.getText()));
            String Line;
            while((Line=br.readLine())!=null){
                String[] value =Line.split(",");
                     double val= Double.parseDouble(value[1]);
                    
                dataset.setValue(new Double(val),genre,value[0]);
             //   genre+=" ";
                ////System.out.println(value[0]);
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(LineGraph.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(LineGraph.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        }
        }
       else  if(button1==1){
           
           String input = jTextField1.getText();
           input =input.replaceAll("sin","@" );
           input=input.replaceAll("cos","#" );
           input=input.replaceAll("tan","Q" );
           input = input.replaceAll("log", "~");
           input = input.replaceAll("e", "&");
           input=input.replaceAll("cosec","r" );
           input=input.replaceAll("cot","w" );
           input=input.replaceAll("sec","y" );
           
            //System.out.println(input);
           int len;
            len = input.length();
            String so=".";
           
           for(ind =0;ind<360;ind++){
                String gini =input;
                    
                            String sa=Integer.toString(ind);
                           gini = gini.replaceAll("X",sa );
                           
                           Polish polish =new Polish(gini);
               double Calculate = Polish.Calculate();
               dataset.setValue(new Double(Calculate),".",sa);
            so+=".";       
            }
                            
                    }
       
        JFreeChart chart = ChartFactory.createLineChart("Line Graph","X - Axis","Y - Axis", dataset, PlotOrientation.VERTICAL, false , true, false);
        CategoryPlot p =chart.getCategoryPlot();
        p.setRangeGridlinePaint(Color.YELLOW);
        p.setBackgroundPaint(Color.BLACK);
        ChartFrame frame=new ChartFrame("Line Chart",chart);
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
            final File file1 = new File("Line_Chart.png");
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
    }//GEN-LAST:event_jButton4ActionPerformed
/**
 * Works for return to Menu
 * @param evt Action variable 
 */
    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        Menu.M.getContentPane().removeAll();
        Menu menu =new Menu();
        Menu.M.getContentPane().add(menu.menuPanel);
        Menu.M.repaint();
        Menu.M.revalidate();
    }//GEN-LAST:event_jButton5ActionPerformed
/***
 * These methods set clicked value in jTextField1 
 * @param evt 
 */
    private void num1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_num1ActionPerformed
        // TODO add your handling code here:
        jTextField1.setText(jTextField1.getText() + num1.getText());
    }//GEN-LAST:event_num1ActionPerformed

    private void num8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_num8ActionPerformed
        // TODO add your handling code here:
        jTextField1.setText(jTextField1.getText() + num8.getText());
    }//GEN-LAST:event_num8ActionPerformed

    private void num2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_num2ActionPerformed
        // TODO add your handling code here:
        jTextField1.setText(jTextField1.getText() + num2.getText());
    }//GEN-LAST:event_num2ActionPerformed

    private void num3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_num3ActionPerformed
        // TODO add your handling code here:
        jTextField1.setText(jTextField1.getText() + num3.getText());
    }//GEN-LAST:event_num3ActionPerformed

    private void num4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_num4ActionPerformed
        // TODO add your handling code here:
        jTextField1.setText(jTextField1.getText() + num4.getText());
    }//GEN-LAST:event_num4ActionPerformed

    private void num5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_num5ActionPerformed
        // TODO add your handling code here:
        jTextField1.setText(jTextField1.getText() + num5.getText());
    }//GEN-LAST:event_num5ActionPerformed

    private void num6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_num6ActionPerformed
        // TODO add your handling code here:
        jTextField1.setText(jTextField1.getText() + num6.getText());
    }//GEN-LAST:event_num6ActionPerformed

    private void num7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_num7ActionPerformed
        // TODO add your handling code here:
        jTextField1.setText(jTextField1.getText() + num7.getText());
    }//GEN-LAST:event_num7ActionPerformed

    private void num9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_num9ActionPerformed
        // TODO add your handling code here:
        jTextField1.setText(jTextField1.getText() + num9.getText());
    }//GEN-LAST:event_num9ActionPerformed

    private void num0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_num0ActionPerformed
        // TODO add your handling code here:
        jTextField1.setText(jTextField1.getText() + num0.getText());
    }//GEN-LAST:event_num0ActionPerformed

    private void pntActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pntActionPerformed
        // TODO add your handling code here:
        jTextField1.setText(jTextField1.getText() + pnt.getText());
    }//GEN-LAST:event_pntActionPerformed

    private void jButton16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton16ActionPerformed
        // TODO add your handling code here:
        jTextField1.setText(null);
    }//GEN-LAST:event_jButton16ActionPerformed

    private void sinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sinActionPerformed
        // TODO add your handling code here:
        jTextField1.setText(jTextField1.getText() + sin.getText());
    }//GEN-LAST:event_sinActionPerformed

    private void suActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_suActionPerformed
        // TODO add your handling code here:
        jTextField1.setText(jTextField1.getText() + su.getText());
    }//GEN-LAST:event_suActionPerformed

    private void cosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cosActionPerformed
        // TODO add your handling code here:
        jTextField1.setText(jTextField1.getText() + cos.getText());
    }//GEN-LAST:event_cosActionPerformed

    private void seActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_seActionPerformed
        // TODO add your handling code here:
        jTextField1.setText(jTextField1.getText() + se.getText());
    }//GEN-LAST:event_seActionPerformed

    private void tanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tanActionPerformed
        // TODO add your handling code here:
        jTextField1.setText(jTextField1.getText() + tan.getText());
    }//GEN-LAST:event_tanActionPerformed

    private void powerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_powerActionPerformed
        // TODO add your handling code here:
        jTextField1.setText(jTextField1.getText() + power.getText());
    }//GEN-LAST:event_powerActionPerformed

    private void eeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eeActionPerformed
        // TODO add your handling code here:
        jTextField1.setText(jTextField1.getText() + ee.getText());
    }//GEN-LAST:event_eeActionPerformed

    private void plusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_plusActionPerformed
        // TODO add your handling code here:
        jTextField1.setText(jTextField1.getText() + plus.getText());
    }//GEN-LAST:event_plusActionPerformed

    private void minusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_minusActionPerformed
        // TODO add your handling code here:
        
        jTextField1.setText(jTextField1.getText() + minus.getText());
    }//GEN-LAST:event_minusActionPerformed

    private void intoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_intoActionPerformed
        // TODO add your handling code here:
        jTextField1.setText(jTextField1.getText() + into.getText());
    }//GEN-LAST:event_intoActionPerformed

    private void vagActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vagActionPerformed
        // TODO add your handling code here:
        jTextField1.setText(jTextField1.getText() + vag.getText());
    }//GEN-LAST:event_vagActionPerformed

    private void eActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eActionPerformed
        // TODO add your handling code here:
        jTextField1.setText(jTextField1.getText() + e.getText());
    }//GEN-LAST:event_eActionPerformed

    private void XActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_XActionPerformed
        // TODO add your handling code here:
        jTextField1.setText(jTextField1.getText() + X.getText());
        
    }//GEN-LAST:event_XActionPerformed
/***
 * End of number input methods.
 */
    /**
     * main method which operates whole class
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
            java.util.logging.Logger.getLogger(LineGraph.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LineGraph.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LineGraph.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LineGraph.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LineGraph().setVisible(true);
            }
        });
    }
   private JButton jButto1;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable Table;
    private javax.swing.JButton X;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JButton cos;
    private javax.swing.JButton e;
    private javax.swing.JButton ee;
    private javax.swing.JButton into;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton16;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton23;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JCheckBox jCheckBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JButton minus;
    private javax.swing.JButton num0;
    private javax.swing.JButton num1;
    private javax.swing.JButton num2;
    private javax.swing.JButton num3;
    private javax.swing.JButton num4;
    private javax.swing.JButton num5;
    private javax.swing.JButton num6;
    private javax.swing.JButton num7;
    private javax.swing.JButton num8;
    private javax.swing.JButton num9;
    private javax.swing.JButton plus;
    private javax.swing.JButton pnt;
    private javax.swing.JButton power;
    private javax.swing.JButton se;
    private javax.swing.JButton sin;
    private javax.swing.JButton su;
    private javax.swing.JButton tan;
    private javax.swing.JButton vag;
    // End of variables declaration//GEN-END:variables
}
