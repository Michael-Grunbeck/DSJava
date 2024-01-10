//Michael Grunbeck
//Mr. Eng
//HW09

class DiceRoll{
    int value;  
        public void roll(){
           double i = Math.random();
           i=i*6+1;
           
           value=(int)i;
           //function that randomizes number 1-6
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
        //Makes the dice display for the roll, in a function display
    
    
    }
    
    public class AT08 {
        public static void main (String[] args) throws Exception{
           DiceRoll randomdice = new DiceRoll();
           
           randomdice.roll();
           randomdice.display();
           randomdice.roll();
           randomdice.display();
           //implements display and roll
           
    
    
        }
        
    }