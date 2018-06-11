import java.util.Arrays;

public class Tictactoe {
    private char[][] map;
    private char player;
    private double toss = Math.random();
    public Tictactoe() {
        map = new char[3][3];
        playerselect(toss);
    }
    public void displayboard() {
        System.out.println(Arrays.deepToString(map).replace("], ", "]\n"));
    }
    public void playerselect(double t) {
        if (t > 0.5) {
            player = 'x';
        } else {
            player = 'o';
        }
        System.out.println("The First player is : " + player);

    }
    public void playermoves(int x, int y) {
      if (map[x][y] == '\u0000') {
            map[x][y] = player;
        }
    }
    public boolean occupied(int x, int y) {
         boolean o = false;
        if (map[x][y] == 'x' || map[x][y] == 'o') {
            o = true;
        }
        return o;
    }
    public boolean full() {
        boolean trf = true;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (map[i][j] == '\u0000') {
                    trf = false;
                }
            }
            return trf;
        }
    }
    public boolean dWin() {
        boolean d = false;
        if ((map[0][0] != '\u0000' && map[1][1] != '\u0000' && map[2][2] != '\u0000' && map[0][0] == map[1][1] && map[1][1] == map[2][2]) || (map[0][2] != '\u0000' && map[1][1] != '\u0000' && map[2][0] != '\u0000' && map[0][2] == map[1][1] && map[1][1] == map[2][0])) {
            d = true;
        }
        return d;
    }
    public boolean rWin() {
        boolean r = false;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (map[i][0] != '\u0000' && map[i][1] != '\u0000' && map[i][2] != '\u0000' && map[i][0] == map[i][1] && map[i][1] == map[i][2]) {
                    r = true;
                }

            }
        }
        return r;
    }
    public boolean cWin() {
        boolean c = false;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (map[0][j] != '\u0000' && map[1][j] != '\u0000' && map[2][j] != '\u0000' && map[0][j] == map[1][j] && map[1][j] == map[2][j]) {
                    c = true;
                }
            }
        }
            return c;
    }
    public boolean Win() {
        return (dWin() || rWin() || cWin());
    }
    public void playerswitch() {
        if (player == 'x') {
            player = 'o';
            System.out.println("Now It's O's turn:");
        } else {
            player = 'x';
            System.out.println("Now It's X's turn:");
        }
        System.out.println(Arrays.deepToString(map).replace("], ", "]\n"));
    }
    public void winMessage() {
        System.out.println("Congrats player" + player + "you have won");
    }
}
