import java.util.Scanner;

/**
 * Created 17.3.2016 г..
 */
public class TriangleArea {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter coordinates x and y of A: ");
        int aSideX = input.nextInt();
        int aSideY = input.nextInt();
        System.out.print("Enter coordinates x and y B: ");
        int bSideX = input.nextInt();
        int bSideY = input.nextInt();
        System.out.print("Enter coordinates x and y C: ");
        int cSideX = input.nextInt();
        int cSideY = input.nextInt();

        int areaTriangle = (aSideX*(bSideY - cSideY) + bSideX*(cSideY - aSideY) +
                cSideX*(aSideY - bSideY)) / 2;

        if (areaTriangle > 0){
            System.out.println("The area is " + areaTriangle);
        }
        else {
            areaTriangle = - areaTriangle;
            System.out.println("The area is " + areaTriangle);
        }
    }
}
