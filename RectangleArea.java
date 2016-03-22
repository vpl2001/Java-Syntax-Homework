import java.util.Scanner;

/**
 * Created 17.3.2016 г..
 */

public class RectangleArea {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the sides of rectangle a and b: ");
        int a = input.nextInt();
        int b = input.nextInt();
        int areaRectangle = a * b;
        System.out.println(areaRectangle);
    }
}
