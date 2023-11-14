public class PartC {
    public static void main (String[] args) throws Exception{
       int r;
       double i; 

       int counter;
       int times=0;
       int runningTotal=0;
       for (counter=0; counter<=1000; counter++){
        i= Math.random();
        i=(i*10+1);
        r=(int)i;
        times=times+1;
        runningTotal=r+runningTotal;
       }
       int average;
       average=runningTotal/times;
       System.out.print("The average is " + average);

    }
    //The average does make sense because it should be 5 as that is the middle of the range so that makes sense
    
}
