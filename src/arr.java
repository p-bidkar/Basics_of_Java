import java.util.Scanner;
import java.util.Arrays;

public class arr {
    public static void main(String[] args) {
        Scanner arrscan = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int size = arrscan.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter the elements of the array");
        for (int i = 0; i < size; i++) {
            arr[i] = arrscan.nextInt();
        }
        System.out.println("Array elements are :"+ Arrays.toString(arr));
        }
    }
