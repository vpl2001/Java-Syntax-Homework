import java.util.Scanner;

/**
 * Created 17.3.2016 г..
 */
public class ConvertBase7toDecimal {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Integer numberToConvert = input.nextInt();
        String newNumber = numberToConvert.toString();
        System.out.println(Integer.parseInt(newNumber, 7));
        //using radix internet info
    }
}
