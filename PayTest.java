import javax.swing.JOptionPane;
public class PayTest
{
   public static void main(String[] args)
   {
      String name;  
      int hours;     
      float payRate = 0.0F;   
      double grossPay=0.0, sum_grosspay=0.0, avg_grosspay=0.0;
      int count = 0;
      
      JOptionPane.showMessageDialog(null, "Welcome to the First JOption Pane program"); 
      name = JOptionPane.showInputDialog("What is your name? [Type end to stop]");
      
      while(!(name.equalsIgnoreCase("end")))
          
       {    
     String hours1 = JOptionPane.showInputDialog("How many hours did you work this week? ");
      hours = Integer.parseInt(hours1);
      
     String payRate1 = JOptionPane.showInputDialog("What is your hourly pay rate? ");
      payRate = Float.parseFloat(payRate1);
      
      grossPay = hours * payRate;
      
     count+=1;
     sum_grosspay += grossPay;
    
       JOptionPane.showMessageDialog(null,"Hello, " + name + "\nYour gross pay is " + String.format("$%,.2f",grossPay));
      
      name = JOptionPane.showInputDialog("What is your name? [Type end to stop]");
      
      }     
     avg_grosspay = sum_grosspay/count;
      
       JOptionPane.showMessageDialog(null,"Hello, " + "\nYour gross pay is " + String.format("%,.2f",grossPay) + "\n" +
                                    "The average gross pay "+ String.format("%,.2f",avg_grosspay));
                                    
      JOptionPane.showMessageDialog(null,"End of Program!");  
   }
}
/* 
   1. Add the documentation comment:
      This program demonstrates the Joption class.
   2. Add a while loop that allows users to enter 
      names, hours and pay rates until name equals
      end. The condition for the while should ignore 
      the case of  end. 
   3. After the end of the loop calculate the average 
      salary
   4. After the end of the loop write the message:
      End of Program!
*/