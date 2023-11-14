
import java.util.Scanner;
public class PartB {
    public static void main(String[] args) throws Exception{
        Scanner input = new Scanner (System.in);
        System.out.print("Enter a word: ");
        String word = input.nextLine();
        int counter=0;
        int i;
       word = word.toLowerCase();
        for(i=0; i<word.length(); i++){
            if (word.charAt(i)=='e'){
                counter=counter+1;
            }
        }
    System.out.print("The word has "+counter+" e in it.");
    }
    
}
