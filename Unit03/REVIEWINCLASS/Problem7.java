import java.util.Scanner;

public class Problem7 {
    public static void main(String[] args) throws Exception{
        Scanner input = new Scanner (System.in);
        System.out.print("Enter a phrase:");
        String phrase = input.nextLine();
       // System.out.println(phrase);

        int number;
        number = phrase.length();
       System.out.println(number);
        int i=0;
        while(i<number){
            System.out.print(phrase.charAt(i));
            i=i+2;
        }
    }
    
}
