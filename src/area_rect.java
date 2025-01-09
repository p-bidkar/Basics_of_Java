import java.util.Scanner;
public class area_rect {
    public static void main(String[] args) {
        Scanner area = new Scanner(System.in);
        System.out.println("Please enter the lenght of the rectangle");
        float len = area.nextFloat();
        System.out.println("Please enter the breadth of the rectangle");
        float breadth = area.nextFloat();
        float Area = len * breadth;
        System.out.println("The total area of the rectangle is " + Area);
    }
}
