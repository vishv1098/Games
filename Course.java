import java.util.Scanner;


public class Course {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char grade = 'A';
        String s = "M*0.3+P*0.3+E*0.4";
        String[] splitter = s.split("[+]");
        String[] splitter2 = {"0"};
        int X = 1;
        float total = 0;
        for(int i = 0 ; i<splitter.length;i++){
            splitter2 = splitter[i].split("[*]");
            System.out.println("Enter the value of " + splitter2[0]);
            X = input.nextInt();
            total = total + Float.parseFloat(splitter2[1])*X;
            }
        System.out.println("Your total is "+total);
        if (total >= 90) {
            grade = 'A';
        }else if (total >= 80 && total < 90) {
            grade = 'B';
        }else if (total >= 70 && total < 80) {
            grade = 'C';
        }else if (total >= 60 && total < 70) {
            grade = 'D';
        }else {
            grade = 'F';
        }
        System.out.println("Your grade is "+grade);
        }
    }
