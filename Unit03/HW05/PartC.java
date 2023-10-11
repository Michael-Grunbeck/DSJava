//Michael Grunbeck
//HW05
import javax.swing.JOptionPane;
public class PartC {
    public static void main(String[] args) throws Exception{
        String name = JOptionPane.showInputDialog("Enter your first name: ");
        //This askes the user for there name using a dialog box
        String number1 = JOptionPane.showInputDialog("Please enter a number: ");
        int a= Integer.parseInt(number1);
        String number2 = JOptionPane.showInputDialog("Please enter another number: ");
        int b= Integer.parseInt(number2);
        //These two lines ask the user for input from a dialog box, asking them for numbers
        
        System.out.println("Your name is "+name+". Your numbers added together equals: "+(a+b));
        //This prints out their name which is gathered from the dialog box and an addition of the two numbers the user entered

    }
}
