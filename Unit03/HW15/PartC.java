//Michael Grunbeck
import java.util.Random;
import java.util.Arrays;



public class PartC {
    public static int linearSearch(int[] array, int target) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == target) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int max = 10000;
        int[] array = new int[max];
        Random random = new Random();

        for (int i = 0; i < max; i++) {
            array[i] = random.nextInt(max) + 1;
        }

        Arrays.sort(array);

        for (int i = 0; i < 10; i++) {
            int target = random.nextInt(max) + 1;

            long startTime = System.currentTimeMillis();
            linearSearch(array, target);
            long endTime = System.currentTimeMillis();
            System.out.println("Linear search took " + (endTime - startTime) + " milliseconds.");
        }
    }
    
}

