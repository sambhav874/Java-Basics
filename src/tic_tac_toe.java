import java.util.*;

public class tic_tac_toe {
    public static void main(String[] args){
        runGame();

    }

    public static void runGame() {
        String winner = "";
        boolean xTurn = true;
        int theRow = 0;
        int theCol = 0;
        String[][] gameBoard = new String[3][3];
        initializeGameBoard(gameBoard);

        printGameBoard(gameBoard);

        while (winner.equals("")) {
            if (xTurn) {
                System.out.println("It is X turn.");
            } else {
                System.out.println("It is O turn.");
            }

            getUserInput(xTurn, gameBoard);
            System.out.println();

            printGameBoard(gameBoard);
            winner = getWinner(gameBoard);
            xTurn = !xTurn;

            if (winner.equals("") && isBoardFull(gameBoard)) {
                winner = "C";
            }
        }
        System.out.println();

        if (winner.equals("C")) {
            System.out.println("It was a cat's game.So no winner!!");
        } else {
            System.out.println("The winner is " + winner);
        }
    }
    public static void initializeGameBoard(String[][] gameBoard){
        for(int i=0;i< gameBoard.length;i++){
            for(int j=0;j< gameBoard[i].length;j++){
                gameBoard[i][j]=" ";
            }
        }
    }
    public static void printGameBoard(String[][] gameBoard){
        for(int i=0;i< gameBoard.length;i++) {
            for (int j = 0; j < gameBoard[i].length; j++) {
                System.out.print(gameBoard[i][j]);
                if (j < 2) {
                    System.out.print(" | ");
                }
            }
            System.out.println();
            if (i < 2) {
                System.out.print("_ _ _ _ _");
                }
            System.out.println();
            
        }
    }


    public static void getUserInput(boolean xTurn, String[][] gameBoard){
        Scanner sc=new Scanner(System.in);

        int row=-1;
        int col=-1;
            boolean keepAsking= true;

            while(keepAsking){
                System.out.println("Please enter the row THEN "+"the column, each from 0 , 1 or 2, "+"seperated by a space");

                row=sc.nextInt();
                col=sc.nextInt();
                sc.nextLine();

                if(row>=0 && row<=2 && col>=0 && col<=2){
                    if(!cellAlreadyOccupied(row,col,gameBoard)){
                        keepAsking=false;
                    }
                    else{
                        System.out.println("That cell is already occupied.");
                    }
                }
            }
            if(xTurn){
                gameBoard[row][col]="X";
            }
            else{
                gameBoard[row][col]="O";
            }
        }

        public static boolean cellAlreadyOccupied(int row, int col,String[][] gameBoard){
            return !gameBoard[row][col].equals(" ");
        }

        public static String getWinner(String[][] gameBoard) {
            final int ROWS = gameBoard.length;
            final int COLS = gameBoard.length;

            for (int i = 0; i < ROWS; i++) {
                if (!gameBoard[i][0].equals("  ") && gameBoard[i][0].equals(gameBoard[i][1]) && gameBoard[i][1].equals(gameBoard[i][2])) {
                    return gameBoard[i][0];
                }
            }
            for (int i = 0; i < COLS; i++) {
                if (!gameBoard[0][i].equals("  ") && gameBoard[0][i].equals(gameBoard[1][i]) && gameBoard[1][i].equals(gameBoard[2][i])) {
                    return gameBoard[0][i];
                }
            }
        if(!gameBoard[0][0].equals("  ") && gameBoard[0][0].equals(gameBoard[1][1]) && gameBoard[1][1].equals(gameBoard[2][2])){
            return gameBoard[0][0];
        }

        if(!gameBoard[2][0].equals("  ") && gameBoard[2][0].equals(gameBoard[1][1]) && gameBoard[1][1].equals(gameBoard[0][2])){
            return gameBoard[2][0];
        }
        return "";
    }

    public static boolean isBoardFull(String [][] gameBoard){
        int countFill=0;
        for(int i=0;i<gameBoard.length;i++){
            for(int j=0;j< gameBoard.length;j++){
                if(!gameBoard[i][j].equals("  ")){
                    countFill++;
                }

            }

        }
        return  countFill==9;
    }
}
