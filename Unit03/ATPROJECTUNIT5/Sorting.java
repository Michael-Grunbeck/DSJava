//Michael Grunbeck
//12/20
//Mr. Eng

import java.util.Scanner;

public class Sorting{
    public static int leadingNumber(String section){
        int dotindex = section.indexOf('.');
        int value =-1;
        if (dotindex>=0){
            value=Integer.valueOf(section.substring(0, dotindex));
        }else {
            value=Integer.valueOf(section);
        }
        
        
        return value;
        

    }
    public static String seperate(String section){
        int dotindex = section.indexOf('.');
        if (dotindex>=0){
        section=section.substring((dotindex+1));
        }else{
            section="";
        }
        return section;
        
    }
    
    public static String whoisfirst(String section1, String section2){

       String work1 = section1;
       String work2 = section2;
       while(true){
        if (work1.isEmpty()){
            return section1;
        } else if (work2.isEmpty()) {
            return section2;
        }
       int uno = leadingNumber(work1);
       int duo = leadingNumber(work2);
       if(uno>duo){
        return section2;
       }
       if(uno<duo){
        return section1;
       }
       work1 = seperate(work1);
       work2 = seperate(work2);
    }
    }

    public static void main(String[] args) throws Exception{
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the first section: ");
        String section1 = input.nextLine();

        System.out.print("Enter the second section: ");
        String section2 = input.nextLine();

        String answer = whoisfirst(section1, section2);

        System.out.println("Result: " + answer);

    }
    }
