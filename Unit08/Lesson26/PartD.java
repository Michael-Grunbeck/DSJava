//Michael Grunbeck

import java.util.ArrayList;

public class PartD {

    public static void swap(ArrayList<Integer> list, int i, int j) {
        Integer temp = list.get(i);
        list.set(i, list.get(j));
        list.set(j, temp);
    }
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 1; i <= 10; i++) {
            list.add(i);
        }

        System.out.println("Before: " + list);
        swap(list, 2, 7);
        System.out.println("After:  " + list);
    }
}
