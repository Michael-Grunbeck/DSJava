//Michael Grunbeck

 import java.io.File;
 import java.io.FileNotFoundException;
 import java.io.PrintWriter;
 import java.util.ArrayList;
 import java.util.Scanner;
 
 public class PartB {
     public static void main(String[] args) throws FileNotFoundException {
     ArrayList<Double> scorelist = new ArrayList<>();
     double total = 0;    
     File inputFile = new File("quizzes.txt");
     Scanner in = new Scanner(inputFile);
     PrintWriter out = new PrintWriter("quizzesOut.txt");
     while (in.hasNextDouble()) {
         double result = in.nextDouble();
         scorelist.add(result);
         total += result;
     }
     for (int i = 0; i < scorelist.size(); i++) {
             String formattedScore = String.format("Quiz %03d: %.2f", i, scorelist.get(i));
             out.println(formattedScore);
         }        
         double average = total / scorelist.size();
         out.println("----------------");
         out.printf("Average:   %.2f", average);
         in.close();
         out.close();
     }
 }