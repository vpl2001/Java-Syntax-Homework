import java.util.Scanner;
import  java.util.Locale;
/**
 * Created 17.3.2016 г..
 */

public class FormattingNumbers {
    public static void main(String[] args) {
        Locale.setDefault(Locale.ROOT);
        Scanner input = new Scanner(System.in);
        System.out.print("Enter one integer and two double numbers: ");
        int a = input.nextInt();
        double b = input.nextDouble();
        double c = input.nextDouble();
        String str = Integer.toBinaryString(a);

        System.out.printf("|%-10S|%010d|%10.2f|%-10.3f|", Integer.toHexString(a), Integer.parseInt(str), b, c);

    }
}
