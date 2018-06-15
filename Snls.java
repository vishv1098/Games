import java.util.Scanner;
public class Snls {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int ch;
        Player p1 = new Player();
        Player p2 = new Player();
        while (p1.endpoint() == false || p2.endpoint() == false) {
            System.out.println("Your turn player 1...Roll?(1)");
            ch = input.nextInt();

            if (ch == 1) {
                p1.position();
                if (p1.snakes() == true) {
                    System.out.print("That's some hard luck Player 1 ");
                    System.out.println("You've been bitten by a snake");
                    p1.snakes();
                    p1.currentposition();
                } else if (p1.ladders() == true) {
                    System.out.println("Up the ladder you go player 1");
                    p1.ladders();
                    p1.currentposition();
                } else {
                        System.out.print("Player 1 ");
                        p1.currentposition();
                }
            }
            if (p1.endpoint() == true) {
                System.out.println("Congratulations player 1 you've won.");
                break;
            }

            System.out.println("Your turn player 2...Roll?(2)");
            ch = input.nextInt();

            if (ch == 2) {
                p2.position();
                if (p2.snakes() == true) {
                    System.out.print("That's some hard luck player 2 ");
                    System.out.println("You've been bitten by a snake");
                    p2.snakes();
                    p2.currentposition();
                } else if (p2.ladders() == true) {
                    System.out.println("Up the ladder you go player 2");
                    p2.ladders();
                    p2.currentposition();
                } else {
                    System.out.print("Player 2 ");
                    p2.currentposition();
                }
            }
             if (p2.endpoint() == true) {
                System.out.println("Congratulations player 2 you've won.");
                break;
            }
        }
    }

}