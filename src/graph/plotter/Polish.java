/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package graph.plotter;

import static java.lang.Math.pow;
import java.math.BigDecimal;
import java.util.Vector;

public class Polish {
    /***
     * declares expStrings,vectors
     */
  public  static String expString;
    public static String symbl;
    public static Vector<String> exp = new Vector<>();
    public static Vector<String> postfix = new Vector<String>();
    /***
     * 
     * @param in takes expression expString input from LineGraph
     */
    public Polish(String in) {
       Polish.expString =  in;
         
     }
    /***
     * main method but workless
     * @param args 
     */
     public static void main(String args[]){
         
         
     }
     /***
      * Creates the answer of expression
      * @return returns double type ans to called portion
      */
     public static  double Calculate(){
         String ans = "";
        OperationClass ob = new OperationClass();
         
        if(ob.refresh())
        { 
              ob.polisMeth();
             ans = ob.postfixToInfix();
              Polish.postfix.removeAllElements();
             //System.out.println("" + postfix.size());
            
//            for(int i = 0;i < postfix.size();++i)
//               //System.out.println(postfix.elementAt(i));
//            
        }
       double resultVal= Double.parseDouble(ans);
//       if(dou>10000)
//           LineGraph.ind=360;
        return resultVal;
    }
     
}
/***
 * This class holds refresh and Polish method
 * @author DELL
 */
class OperationClass{
    /***
     * filters the expString into necessary expression and operator.Also add elements to exp vector
     * @return 
     */
    public boolean  refresh(){
        String s = "";
        int len = Polish.expString.length();
        
        for(int i = 0;i < len;++i)
        {
            char ch = Polish.expString.charAt(i);
            
            if((ch >= '0' && ch <= '9') ||  (ch >= 'A' && ch <= 'Z') || ch == '.')
                s += (ch);
            else if(ch == '+' || ch == '-' || ch == '*' || ch == '/' || ch == '^' || ch == '(' || ch == ')' ||  ch == ' ' || ch == '~' || ch == '@' || ch == '#' || ch == 'Q' || ch == '&' || ch == 'r' || ch == 'w' || ch == 'y')
            {
                if(s.length() >= 1){
                    Polish.exp.addElement(s);
                    s = "";
                }
                
                if(ch != ' ')
                { 
                    s += ch;
                    Polish.exp.addElement(s);
                    s = "";
                }
            }
//           else
//               return false ;                   // Uncomplete . 5 +       -5
        }
         if(s.length() >= 1)
            Polish.exp.addElement(s);
          return true ;
    }
    /***
     * With Polish method parenthesis and operators are managed
     */
    public void polisMeth(){
    
        
        Polish.exp.addElement(")");
        int len = Polish.exp.size();
        Vector<String> stack = new Vector<String>();
        stack.ensureCapacity(100000);
        stack.addElement("(");
                
        for(int i  = 0; i < len;++i)
        {
            String s = Polish.exp.elementAt(i);
            
            if(s.equals("("))
            stack.addElement("(");
            else if(s.equals(")"))
            {    
                for(int j = stack.size() - 1;(j >= 0) ;--j)
                {
                    String x = stack.elementAt(j);
                    stack.removeElementAt(j);
                    
                    if(x.equals("(") == true)
                    break;
                    else
                    Polish.postfix.addElement(x);
                }
            }
            else if(s.equals("+") || s.equals("-") || s.equals("*") || s.equals("/") || s.equals("^") || s.equals("~") || s.equals("@") || s.equals("#") || s.equals("Q") || s.equals("&") || s.equals("r") || s.equals("w") || s.equals("y"))
            {
                int x = OperationClass.getValue(s);
                
                for(int j = stack.size() - 1;j >= 0;--j)
                {
                    String st = stack.elementAt(j);
                    int y = OperationClass.getValue(st);
                    
                    if(y >= x){
                        Polish.postfix.addElement(st);
                        stack.removeElementAt(j);
                   }
                    else
                        break;
               }
                
                stack.addElement(s);
           }
            else
                Polish.postfix.addElement(s);
        
       }
        
        stack.removeAllElements();
        Polish.exp.removeAllElements();
        
   } /************** End Polish Algorithm  *******************/
    
    
    /********** Start Of getValue Method **************/
    /***
     * determines the precedence of operators
     * @param s is operator
     * @return precedence
     */
    public static int getValue(String s)
    {
      if(s.equals("-") || s.equals("+")) 
        return 1;
       else if(s.equals("/") || s.equals("*"))
           return 2;
       else if(s.equals("^") || s.equals("~") || s.equals("@") || s.equals("#") || s.equals("Q") || s.equals("&") || s.equals("r") || s.equals("w") || s.equals("y"))
           return 3;
       else 
           return 0;
    }/****** End Of getValue *******************/
    
    
 //************* Start Of Addition   ************************//   
    
    /***
     * Executes all single calculations in it
     * @return result as String
     */
   public String postfixToInfix(){
       
   OperationClass ob1 = new OperationClass();
    String s,x,y,sign = "";
    
       
    for(int i = 0;i < Polish.postfix.size() ;++i)
    {
        s = Polish.postfix.elementAt(i);  
        
        
        if(s.equals("+") || s.equals("-") || s.equals("*") || s.equals("/") || s.equals("^")){
            
            
            x = Polish.postfix.elementAt(i - 2);
            //System.out.println(x);
            y = Polish.postfix.elementAt(i - 1);
          
            if(s.equals("+"))
                 s = ob1.Addition( x, y);
            else if(s.equals("-"))
                s = ob1.Subtraction(x, y);
            else if(s.equals("*"))
                s = ob1.Multiplication(x, y);
            else if(s.equals("/"))
                s = ob1.Divide(x, y);
            else if(s.equals("^"))
                s = ob1.Power(x, y);
           
            Polish.postfix.setElementAt(s, i);
            Polish.postfix.removeElementAt(i - 2);
            Polish.postfix.removeElementAt(i - 2);
            i = i - 2;
            
           
        }
        
       else if(s.equals("~") || s.equals("@") || s.equals("#") || s.equals("Q") || s.equals("&") || s.equals("r") || s.equals("w") || s.equals("y") ){
           
             //x = Polish.postfix.elementAt(i);
           x = Polish.postfix.elementAt(i - 1);
           
           
          //  x = ob1.Setup(x);
           // y = ob1.Setup(y);
            
             if(s.equals("@"))
                s = ob1.sine(x);
            else if(s.equals("#"))
                s = ob1.cosine(x);
            else if(s.equals("Q"))
                s = ob1.tangent(x);
            else if(s.equals("~"))
                s = ob1.logarithm(x);
             else if(s.equals("&"))
                s = ob1.ex(x);
//             else if(s.equals("r"))
//                s = ob1.cosecant(x);
//             else if(s.equals("w"))
//                s = ob1.cott(x);
//             else if(s.equals("y"))
//                s = ob1.secant(x);
            Polish.postfix.setElementAt(s, i);
            Polish.postfix.removeElementAt(i -1);
           // Polish.postfix.removeElementAt(i - 1);
            i = i - 1;
        }
    
       
    }
   
     
                  //System.out.println("Res " + Polish.postfix.elementAt(0));

          
          return Polish.postfix.elementAt(0);
          
        
  }//*********  End Of postfix Algorithm *************/ 
   
    /***
     * does summation
     * @param x prior value
     * @param y post value
     * @return summation as expString
     */
    public String Addition(String x,String y)
    {
       double  sum1 = Double.parseDouble(x);
        double  sum2 = Double.parseDouble(y);
        double sum =sum1+sum2;
       return Double.toString(sum);
       
    }  // ***************** End Of Addition ***************  //
    /***
     * does subtraction
     * @param x prior value
     * @param y post value
     * 
     * @return result as expString
     */
    public String Subtraction(String x,String y){
        
       double  sum1 = Double.parseDouble(x);
        double  sum2 = Double.parseDouble(y);
        double sum =sum1-sum2;
       return Double.toString(sum);
       
    }
    
    /***
     * does multiplication
     * @param x prior value
     * @param y post value
     * 
     * @return result as expString
     */
    public String Multiplication(String x, String y){
         
       double  sum1 = Double.parseDouble(x);
        double  sum2 = Double.parseDouble(y);
        double sum =sum1*sum2;
       return Double.toString(sum);
       
        
    }
    
    /***
     * does dividation
     * @param x prior value
     * @param y post value
     * 
     * @return result as expString
     */
    public String Divide(String x, String y){
        
       double  sum1 = Double.parseDouble(x);
        double  sum2 = Double.parseDouble(y);
        double sum =sum1/sum2;
       return Double.toString(sum);
       
    }
    
    /***
     * does power calculation
     * @param x prior value
     * @param y post value
     * 
     * @return result as expString
     */
    public String Power(String x , String y){
        
      double  sum1 = Double.parseDouble(x);
        double  sum2 = Double.parseDouble(y);
        double sum =pow(sum1,sum2);
       return Double.toString(sum);
       
    }
    /***
     * does sin(y)
     
     * @param y post value
     * 
     * @return result as expString
     */
    public String sine(String y){
        
       double  sum2 = Double.parseDouble(y);
        double sum =Math.sin(Math.toRadians(sum2)); 
       return Double.toString(sum);
       
    }
    
    /***
     * does cos(y)
     
     * @param y post value
     * 
     * @return result as expString
     */
   public String cosine(String y){
        
       double  sum2 = Double.parseDouble(y);
        double sum =Math.cos(Math.toRadians(sum2)); 
       return Double.toString(sum);
       
    }
   /***
     * does tan(y)
     
     * @param y post value
     * 
     * @return result as expString
     */
   public String tangent(String y){
        
       double  sum2 = Double.parseDouble(y);
       if((sum2%180)==90)
           return "124.0";
        double sum =Math.tan(Math.toRadians(sum2));
       return Double.toString(sum);
       
    }
   
   /***
     * does log(y)
     
     * @param y post value
     * 
     * @return result as expString
     */
    public String logarithm(String y){
        
       double  sum2 = Double.parseDouble(y);
       if(sum2==0)
           return "00.0";
        double sum =Math.log(sum2); 
       return Double.toString(sum);
    }
    
    /***
     * does e(x)
     
     * @param y post value
     * 
     * @return result as expString
     */
     public String ex(String y){
        
       double  sum2 = Double.parseDouble(y);
      
        double sum =Math.exp(sum2); 
       return Double.toString(sum);
    }
//    public String cosecant(String y){
//        
//       double  sum2 = Double.parseDouble(y);
//      if(sum2<10)
//          return "124.0";
//        double sum =Math.sin(Math.toRadians(sum2));
//       double sum3=1.0/sum;
//       return Double.toString(sum3);
//    }
//    public String secant(String y){
//       double  sum2 = Double.parseDouble(y);
//      
//        double sum =Math.cos(Math.toRadians(sum2));
//        double sum3=1.0/sum;
//       return Double.toString(sum3);
//    }
//    public String cott(String y){
//        
//        double  sum2 = Double.parseDouble(y);
//      
//        double sum =Math.tan(Math.toRadians(sum2));
//      double sum3=1.0/sum;
//       return Double.toString(sum3);
//    }
    
}