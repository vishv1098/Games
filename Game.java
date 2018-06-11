import java.util.Scanner;
public class Game {
    public static void main(String[]    args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Tic Tac Toe");
        System.out.println("The board consists of 3 rows and 3 columns)");
        System.out.println("The rows are (0,1,2");
        System.out.println("The columns are (0,1,2)");
        Tictactoe p = new Tictactoe();
        System.out.println("Enter the Row coordinates:");
        int row = input.nextInt();
        System.out.println("Enter the Column coordinates:");
        int col = input.nextInt();
        p.playermoves(row, col);
        while (p.full() == false && p.Win() == false) {
            p.playermoves(row, col);
            if (p.full() == true) {
                System.out.println("Well Played!!! It's a draw.");
                p.displayboard();
                break;
            } else if (p.Win() == true) {
                p.winMessage();
                p.displayboard();
                break;
            }
            p.playerswitch();
            System.out.println("Enter the Row coordinates:");
            row = input.nextInt();
            System.out.println("Enter the Column coordinates:");
            col = input.nextInt();
            while (p.occupied(row, col) == true) {
                System.out.print("Either the coordinates are out of range ");
                System.out.println("or the place is already filled");
                System.out.println("Please enter your coordinates again.");
                System.out.println("Enter the Row coordinates:");
                row = input.nextInt();
                System.out.println("Enter the Column coordinates:");
                col = input.nextInt();
            }
        }






    }
}
