//Michael Grunbeck 
//1/17

 import java.util.Random;

 public class Project1 {
     public static void main(String[] args) throws Exception {

         //Setting up arrays
         int[] a = new int[10];

         //Random Numbers
         Random rand = new Random();

         for(int i = 0; i < a.length; i++) {
             a[i] = rand.nextInt(10);
         }
 
         //Printing out the numbers at the even index 
         System.out.println("Numbers at even indexes"); 
         for(int i = 0; i < a.length; i += 2) {
             System.out.print(a[i] + " ");
         }

         System.out.println();
 
         
         System.out.println("Even elements");
         for (int number : a) {
             if (number % 2 == 0) {
                 System.out.print(number + " ");
             }
         }

         System.out.println();
 
         // Print out the arrays elements in reverse order
         System.out.println("Elements in reverse order");
         for (int i = a.length - 1; i >= 0; i--) {
             System.out.print(a[i] + " ");
         }
         System.out.println();
 
         //These next four lines print out the first and last element

         System.out.println("First and last element");
         System.out.print(a[0] + " ");
         System.out.print(a[a.length - 1]);
         System.out.println();
     }
 }