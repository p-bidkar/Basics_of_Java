import java.util.Scanner;
public class calc {
    public static void main(String[] args) {
        try {
            Scanner calnum = new Scanner(System.in);
            System.out.println("Please enter the first number");
            int i = calnum.nextInt();
            System.out.println("\nPlease enter the second number");
            int j = calnum.nextInt();
            int add = i + j;
            System.out.println("\nThe sum of the numbers is " + add);
            int sub = i - j;
            System.out.println("\nThe difference of the numbers is " + sub);
            int mul = i * j;
            System.out.println("\nThe product of the numbers is " + mul);
            int div = i / j;
            System.out.println("\nThe quotient of the numbers is " + div);
        }
        catch(Exception e) {
            System.out.println("Please enter valid numbers to avoid 'InputMismatchException' from occurring");
        }

    }
}
