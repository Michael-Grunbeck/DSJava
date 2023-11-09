public class Loop{
    public static void main(String[] args) throws Exception{
        int i = 2;
        int sum;
        sum = 0;
        //Initializes the variable sum and i to create the loop
    while (i<=100){
        sum=sum+i;
        i=i+2;
        //The while loop uses i to be the even integer, and sum is the running count of the total of the numbers
    }
    System.out.println(sum);
   // System.out.println(i);

    }
}