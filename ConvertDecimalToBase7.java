import java.util.Locale;
import java.util.Scanner;

/**
 * Created 17.3.2016 г..
 */

public class ConvertDecimalToBase7 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.ROOT);
        System.out.println("Enter number: ");
        Scanner input = new Scanner(System.in);
        Integer numberToConvert = input.nextInt();
        System.out.println(Integer.toString(numberToConvert, 7));
        //using radix internet info
    }
}
