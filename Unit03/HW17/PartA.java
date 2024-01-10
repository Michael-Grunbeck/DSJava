//Michael Grunbeck

public class PartA {
    public static void main(String[] args) throws Exception {
    int[][] array1 = new int[4][3];
    int[][] array2 = new int[2][5];
    int[][] array3 = {
            {8, 6, 7}, 
            {5, 3, 0}
        };

    print(array1);
    print(array2);
    print(array3);
    }
    public static void print(int[][] value) {
        for (int i = 0; i < value.length; i++) {
            for (int j = 0; j < value[0].length; j++) {
                System.out.println(value[i][j]);
            }
        }
    }
}