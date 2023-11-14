import java.util.Scanner;

public class PartA{
    public static void main(String[] args) throws Exception{
        System.out.println("When prompted, please enter your test scores. To get the average, enter a negative");
        
        Scanner input = new Scanner(System.in);
        double TestScore;
        double counter = 0;
        double runningAverage=0;
        double average;
        do{
            System.out.print("Enter your test scores:");
            TestScore = input.nextDouble();

            if (TestScore<0){
                break;
            }
            counter=counter+1;
            runningAverage=runningAverage+TestScore;

        }while(TestScore>=0);
        average=(runningAverage/counter);
        System.out.print("Your test average is " + String.format("%.2f", average));
    }
}