public class Player {

    private int map1;
    private double dice;
    private int total1;
    public Player() {

        map1 = 1;
    }
    public int setTotal1() {
        dice = Math.random();
        if (dice <= 0.1) {
            total1 = 1;
        } else if (dice > 0.1 && dice <= 0.3) {
            total1 = 2;
        } else if (dice > 0.3 && dice <= 0.5) {
            total1 = 3;
        } else if (dice > 0.5 && dice <= 0.7) {
            total1 = 4;
        } else if (dice == 0.8) {
            total1 = 5;
        } else if (dice == 0.9) {
            total1 = 6;
        }
        return total1;
    }
    public int position() {
        map1 = map1 + setTotal1();
        return map1;
    }
    public boolean snakes() {
        boolean s = false;
        if (map1 == 25) {
            s = true;
            map1 = 5;
        } else if (map1 == 34) {
            s = true;
            map1 = 1;
        } else if (map1 == 47) {
            s = true;
            map1 = 19;
        } else if (map1 == 65) {
            s = true;
            map1 = 52;
        } else if (map1 == 87) {
            s = true;
            map1 = 57;
        } else if (map1 == 91) {
            s = true;
            map1 = 61;
        } else if (map1 == 99) {
            s = true;
            map1 = 69;
        }
        return s;

    }
    public boolean ladders() {
        boolean l = false;
        if (map1 == 3) {
            l = true;
            map1 = 51;
        } else if (map1 == 6) {
            l = true;
            map1 = 27;
        } else if (map1 == 20) {
            l = true;
            map1 = 70;
        } else if (map1 == 36) {
            l = true;
            map1 = 55;
        } else if (map1 == 63) {
            l = true;
            map1 = 95;
        } else if (map1 == 68) {
            l = true;
            map1 = 98;
        }
        return l;
    }
    public void currentposition() {
        System.out.println("Your current position is" + map1);

        }
        public boolean endpoint() {
        boolean ep = false;
        if (map1 >= 100) {
            ep = true;
        }
        return ep;
        }
}
