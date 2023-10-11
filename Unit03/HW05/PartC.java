
import javax.swing.JOptionPane;
public class PartB {
    public static void main(String[] args) throws Exception{
        String name = JOptionPane.showInputDialog("Enter your first name: ");
        String number1 = JOptionPane.showInputDialog("Please enter a number: ");
        int a= Integer.parseInt(number1);
        String number2 = JOptionPane.showInputDialog("Please enter another number: ");
        int b= Integer.parseInt(number2);

        
        System.out.println("Your name is"+name+". Your numbers added together equals"+(a+b));


    }
}
