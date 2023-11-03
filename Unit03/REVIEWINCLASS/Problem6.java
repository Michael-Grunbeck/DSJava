import java.util.Scanner;

public class Problem6{
    public static void main(String[] args) throws Exception{
        Scanner input = new Scanner (System.in);
        System.out.print("Input three integers: ");
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();
        if (a>b && b>c){
            System.out.println("The inputted numbers are in order "+a+" "+b+" "+c);
        }else if (a<b && b<c){
           System.out.println("The inputted numbers are in order "+a+" "+b+" "+c); 
        }else{
            System.out.println("The inputted numbers are not in order "+a+" "+b+" "+c);
        }


    }
}