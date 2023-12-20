//Michael Grunbeck
//12/20
//Mr. Eng

import java.util.Scanner;

public class Barcodes {



    public static String changetobar(int number){
    
       String result;
        if (number == 1) {
            result = ":::||";
        } 
        else if (number == 2) {
            result = "::|:|";
        } 
        else if (number == 3) {
            result = "::||:";
        } 
        else if (number == 4) {
            result = ":|::|";
        } 
        else if (number == 5) {
            result = ":|:|:";
        } 
        else if (number == 6) {
            result = ":||::";
        } 
        else if (number == 7) {
            result = "|:::|";
        } 
        else if (number == 8) {
            result = "|::|:";
        } 
        else if (number == 9) {
            result = "|:|::";
        } 
        else if (number == 0) {
            result = "||:::";
        } 
        else {
            result = "";
        }
        return result;
    } 


    public static int checkdigit(String code){
        
        int total = 0;
        char a;
        int value;
        
        
        for(int i = 0; i < 5; i++){
          
            a = code.charAt(i);

          
            value = Integer.valueOf(a);
            
            total = total + value;

        }
        
        
        int mod = total % 10;
        if (mod == 0) {
            return 0;
        } else {
            return 10 - total;
        }


    }
    public static String getbar(String code) {
        String result = "|";
        for (int i = 0; i < code.length(); i++) {
            int d = Integer.valueOf(code.substring(i, i + 1));
            result = result + changetobar(d);
        }
        
        
        result = result + changetobar(checkdigit(code));
        
        result = result + "|";

        return result;

    
    }
    public static void main(String[] args) throws Exception{
        
        Scanner input = new Scanner(System.in);

        
        System.out.print("Enter a zipcode: ");
        
        String zip = input.nextLine();
        
        System.out.println(getbar(zip));


    }




    
}

