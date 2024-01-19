//Michael Grunbeck
import java.util.Scanner;
class Board{
    char [] [] board ={
        {'*','*','*',},
        {'*','*','*',},
        {'*','*','*',}
    };

    public void displayBoard(){
        for (int row = 0; row < 3; row++){
            for(int col = 0; col<3; col++){
                System.out.print(board[row][col]);
            }
            System.out.println();
        }
    }

    public boolean placePiece(int row, int col, char key){
        if (row<0 || row>2){
            System.out.println("Out of range!");
            return false;
        }
        if (col<0 || col>2){
            System.out.println("Out of range!");
            return false;
        }

        if (board[row][col] == '*'){
            board[row][col] = key;
            return true;
        }
        return false;
    }
    public boolean bigWin(){
        for (int row=0; row<3; row++){
            if (board[row][0]== 'o' && board[row][1]=='o' && board[row][2] =='o'){
                System.out.print("Player 1 wins!");
                return true;
            }else if (board[row][0]== 'x' && board[row][1]=='x' && board[row][2] =='x'){
                System.out.print("Player 2 wins!");
                return true;
            }
        }

        for (int col=0; col<3; col++){
            if (board[col][0]== 'o' && board[col][1]=='o' && board[col][2] =='o'){
                System.out.print("Player 1 wins!");
                return true;
            }else if (board[col][0]== 'x' && board[col][1]=='x' && board[col][2] =='x'){
                System.out.print("Player 2 wins!");
                return true;
            }
        }
        if(board[0][0] == 'o' && board[1][1] == 'o' && board[2][2] == 'o'){
            System.out.print("Player 1 wins!");
                return true;
        }
        if(board[0][0] == 'x' && board[1][1] == 'x' && board[2][2] == 'x'){
            System.out.print("Player 2 wins!");
                return true;
        }
        if(board[0][2] == 'o' && board[1][1] == 'o' && board[2][0] == 'o'){
            System.out.print("Player 1 wins!");
                return true;
        }
        if(board[0][2] == 'x' && board[1][1] == 'x' && board[2][0] == 'x'){
            System.out.print("Player 1 wins!");
                return true;
        }
        return false;

    }
}

public class Project3{
    public static void clearScreen() {
        System.out.print("\033[H\033[2J");  
        System.out.flush();  
    }

    public static void main(String[] args){
        Scanner a = new Scanner(System.in);
        Board gameBoard = new Board();

        gameBoard.displayBoard();
        int row = 0;
        int col = 0;
        int currentplayer= 1;
        boolean ret = false;
        int count = 0;
        while(true){
            clearScreen();
            gameBoard.displayBoard();

            System.out.println("Enter row, col or q to quit");
            if(a.hasNext("q") || a.hasNext("Q")){
                a.next();
                System.out.print("Goodbye");
                break;
            }
            else{
                row = a.nextInt();
                col = a.nextInt(); 

                if(currentplayer ==1){
                    ret = gameBoard.placePiece(row, col, 'o');
                }else{
                    ret = gameBoard.placePiece(row, col, 'x');
                }
                if(ret == true){
                if(currentplayer==1){
                    currentplayer=2;
                }else{
                    currentplayer=1;
                }
                count = count+1;

                //check winners:
                if (gameBoard.bigWin()==true){
                    break;
                }

                //check count:

                if(count==9){
                    clearScreen();
                    gameBoard.displayBoard();
                    System.out.println("no more moves!");
                    break;
                }
            }else{
                System.out.println("Invalid Move!");
            }



            }
        }
    }


}