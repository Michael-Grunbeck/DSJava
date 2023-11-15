class DiceRoll{
int value;  
    public void roll(){
       double i = Math.random();
       i=i*6+1;
       
       value=(int)i;
    }
    
    public void display(){
        if(value==1){
            System.out.println(" _______________");
            System.out.println("|               |");
            System.out.println("|               |");
            System.out.println("|               |");
            System.out.println("|       x       |");
            System.out.println("|               |");
            System.out.println("|               |");
            System.out.println("|_______________|");
        } 
        if (value==2){
            System.out.println(" _______________");
            System.out.println("|               |");
            System.out.println("|   x           |");
            System.out.println("|               |");
            System.out.println("|               |");
            System.out.println("|               |");
            System.out.println("|           x   |");
            System.out.println("|_______________|");
        } 
         if (value==3){
            System.out.println(" _______________");
            System.out.println("|               |");
            System.out.println("|   x           |");
            System.out.println("|               |");
            System.out.println("|       x       |");
            System.out.println("|               |");
            System.out.println("|           x   |");
            System.out.println("|_______________|");
        } 
        if (value==4){
            System.out.println(" _______________");
            System.out.println("|               |");
            System.out.println("|   x       x   |");
            System.out.println("|               |");
            System.out.println("|               |");
            System.out.println("|               |");
            System.out.println("|   x       x   |");
            System.out.println("|_______________|");
        } 
        if (value==5){
            System.out.println(" _______________");
            System.out.println("|               |");
            System.out.println("|   x       x   |");
            System.out.println("|               |");
            System.out.println("|       x       |");
            System.out.println("|               |");
            System.out.println("|   x       x   |");
            System.out.println("|_______________|");
        } 
        if (value==6){
            System.out.println(" _______________");
            System.out.println("|               |");
            System.out.println("|   x       x   |");
            System.out.println("|               |");
            System.out.println("|   x       x   |");
            System.out.println("|               |");
            System.out.println("|   x       x   |");
            System.out.println("|_______________|");
        } 
    }


}

public class Dice {
    public static void main (String[] args) throws Exception{
       DiceRoll randomdice = new DiceRoll();
       
       randomdice.roll();
       randomdice.display();
       randomdice.roll();
       randomdice.display();
       
       


    }
    
}
