//Michael Grunbeck

import java.util.Scanner;

public class RomanNumeral {
    public static void main(String[] args) throws Exception {
        Scanner a = new Scanner (System.in);
        System.out.print("Enter a number from 1 to 3999: ");
        int number = a.nextInt();
        //Asks the user for a number
        String numeral = "The Roman numeral is ";
        //Declares and initializes the string numeral, which is added to through the while statements
        while (number>=1000){
            char Thousand = 'M';
            numeral=numeral+Thousand;
           // System.out.print(numeral); (test)
            number=number-1000;

        }
        while (number>=900){
            String Ninehundred = "CM";
            numeral=numeral+Ninehundred;
            number=number-900;
        }
        //System.out.print(numeral); (Test)
        while (number>=500){
            char d = 'D';
            numeral = numeral + d;
            number=number-500;
        }
        while (number>=400){
            String fourhundred = "CD";
            numeral = numeral+fourhundred;
            number=number-400;
        }
        while (number>=100){
            char c = 'C';
            numeral=numeral+c;
            number=number-100;
        }
        while (number>=90){
            String ninety= "XC";
            numeral=numeral+ninety;
            number=number-90;
        }
        while (number>=50){
            char L = 'L';
            numeral=numeral+L;
            number=number-50;

        }
        while (number>=40){
            String fourty = "XL";
            numeral=numeral+fourty;
            number=number-40;
        }
        while(number>=10){
            char x = 'X';
            numeral=numeral+x;
            number=number-10;
        }
        while(number>=9){
            String nine = "IX";
            numeral=numeral+nine;
            number=number-9;
        }
        while(number>=5){
            char v ='V';
            numeral=numeral+v;
            number=number-5;
        }
        while(number>=4){
            String four = "IV";
            numeral=numeral+four;
            number=number-4;
        }
        while(number>=1){
            char I ='I';
            numeral=numeral+I;
            number=number-1;
        }
        System.out.print(numeral);
        /*Each while statement checks on whether the number value is less than the next set of roman numerals
         * as each letter in a roman numeral coordinates to different values. While checking it adds
         * to the string that is "numeral". As it adds to the string it subtracts the value that it adds to the string
         * 
        */
    }
}
