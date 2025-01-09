import java.util.Scanner;
public class Fibo {
    public static void main(String[] args) {
        Scanner fibo_seriese = new Scanner(System.in);
        System.out.println("Please Enter the number of terms");
        int length = fibo_seriese.nextInt();
        int initial = 0, next = 1, third;
        for (int i = 0; i < length; i++) {
            System.out.print(initial + " ");
            third = initial + next;
            initial = next;
            next = third;
        }
    }
}
