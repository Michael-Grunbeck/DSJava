//Michael Grunbeck
import java.util.ArrayList;
import java.util.Scanner;

public class PartC {
    public static void main(String[] args) throws Exception {
        ArrayList<Integer> temps = new ArrayList<Integer>();
        Scanner a = new Scanner(System.in);
        int lowtemp = 0;
        while (true) {
            System.out.print("Enter a temperature or type 'q' to quit: ");
            if (a.hasNext("q") || a.hasNext("Q")) {
                a.next();
                break;
            } else {
                int temp = a.nextInt();
                temps.add(temp);
                int size = temps.size();
                if (size == 1) {
                    lowtemp = temps.get(0);
                } else if (temps.get(size - 1) < lowtemp ) {
                lowtemp = temps.get(size - 1);
                }
            }
        }
        System.out.println("Temperatures that you entered:");
        for (Integer temp : temps) {
            System.out.print(temp);
            if (temp == lowtemp) {
                System.out.print(" <= lowest temperature");
            }
            System.out.println();
        }
        System.out.println("The Lowest Temperature is " + lowtemp);
    }
}
