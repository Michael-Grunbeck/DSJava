//Michael Grunbeck
//12/4

import java.util.Scanner;


public class PartC {
    public static boolean isvowel(char letter){
        if (letter == 'A' || letter == 'a'){
            return true;
        }
        else if (letter == 'E' || letter == 'e'){
            return true;
        }
        else if (letter == 'I' || letter == 'i'){
            return true;
        }
        else if (letter == 'O' || letter == 'o'){
            return true;
        }
        else if (letter == 'U' || letter == 'u'){
            return true;
        }else{
            return false;
        }
    }

    public static int vowels(String phrase){
        int counter = 0;
        for (int i=0; i<phrase.length();i++){
            boolean aeiou = isvowel(phrase.charAt(i));
            if (aeiou == true){
                counter = counter + 1;
            }
            
        }
        return counter;
    }

    public static void main(String[] args) throws Exception{
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter a word:");
        String word = input.nextLine();
        int answer = vowels(word);
        System.out.print("The number of vowels in your word is " + answer);

    }
    
}
