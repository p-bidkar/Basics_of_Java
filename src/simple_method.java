import java.util.Scanner;
public class simple_method {
    public int addition(int a, int b){
        return a+b;
    }
    public static void main(String[] args) {
        Scanner method = new Scanner(System.in);
        System.out.println("please enter first number");
        int a = method.nextInt();
        System.out.println("please enter second number");
        int b = method.nextInt();
        int result = new simple_method().addition(a,b);
        System.out.println("\nThe method output is " + result);
    }
}
