class DiceRoll{
    public void updateState(int newState){
        if (newState=='1'){
            String[] one = { " _______________",
                           "  |               |",
                             "|               |",
                             "|               |",
                             "|       x       |",
                             "|               |",
                             "|               |",
                             "|_______________|"};
            System.out.print(one);
        } 
        if (newState=='2'){
            String[] two = { " _______________",
                           "  |               |",
                             "|   x           |",
                             "|               |",
                             "|               |",
                             "|               |",
                             "|           x   |",
                             "|_______________|"};
            System.out.print(two);
        } 
         if (newState=='3'){
            String[] three = {"_______________",
                           "  |               |",
                             "|   x           |",
                             "|               |",
                             "|       x       |",
                             "|               |",
                             "|           x   |",
                             "|_______________|"};
            System.out.print(three);
        } 
        if (newState=='4'){
            String[] four = {" _______________",
                           "  |               |",
                             "|   x       x   |",
                             "|               |",
                             "|               |",
                             "|               |",
                             "|   x       x   |",
                             "|_______________|"};
            System.out.print(four);
        } 
        if (newState=='5'){
            String[] five = {" _______________",
                           "  |               |",
                             "|   x       x   |",
                             "|               |",
                             "|       x       |",
                             "|               |",
                             "|   x       x   |",
                             "|_______________|"};
            System.out.print(five);
        } 
        if (newState=='6'){
            String[] six = {" _______________",
                           "  |               |",
                             "|   x       x   |",
                             "|               |",
                             "|   x       x   |",
                             "|               |",
                             "|   x       x   |",
                             "|_______________|"};
            System.out.print(six);
        } 
    }


}

public class Dice {
    public static void main (String[] args) throws Exception{
       DiceRoll randomdice = new DiceRoll();
       
       double i = Math.random();
       i=i*6+1;
       int r;
       r=(int)i;
       
       randomdice.updateState(r);


    }
    
}
