import java.util.Scanner;

public class Sort {
    public static void main(String[] args) throws Exception{
    Scanner a = new Scanner (System.in);
    System.out.print("Please enter three integers:");
    int one = a.nextInt();
    int two = a.nextInt();
    int three = a.nextInt();
    boolean flag = false;
    if (one<=two && two<=three && flag==false){
        System.out.println("The numbers in order are "+one+" "+two+" "+three);
        flag=true;
    } 
    if (one<=three && three <=two && flag==false){
        System.out.println("The numbers in order are " +one +" "+three+" " +two);
        flag=true;
    }
    if(two<=one && one<=three && flag==false){
        System.out.println("The numbers in order are " +two +" "+one+" "+three);
        flag=true;
    }
    if(two<=three && three<=one && flag==false){
        System.out.println("The numbers in order are " +two +" "+three+" "+one);
        flag=true;
    }
    if(three<=one && one<=two && flag==false){
        System.out.println("The numbers in order are " +three +" "+one+" "+two);
        flag=true;
    }
    if(three<=two && two<=one && flag==false){
        System.out.println("The numbers in order are " +three +" "+two+" "+one);
        flag=true;
    }
   


    }
    
}
