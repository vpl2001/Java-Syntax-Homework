import java.util.Locale;
import java.util.Scanner;

/**
 * Created 17.3.2016 г..
 */

public class CalculateExpression {
    public static void main(String[] args) {
        Locale.setDefault(Locale.ROOT);
        Scanner input = new Scanner(System.in);
        double a = input.nextFloat();
        double b = input.nextFloat();
        double c = input.nextFloat();

        double firstBase = (a*a + b*b)/ (a*a - b*b);
        double secondBase = (a*a + b*b - c*c*c);
        double firstExponent = (a+b+c)/ Math.sqrt(c);
        double secondExponent = (a - b);

        double firstFormula = Math.pow(firstBase, firstExponent);
        double secondFormula = Math.pow(secondBase, secondExponent);

        double numbersAverage = (a+b+c)/3;
        double formulaAverage = (firstFormula+secondFormula)/2;

        System.out.printf("F1 result: %.2f; F2 result: %.2f; Diff: %.2f",
                firstFormula, secondFormula, Math.abs(numbersAverage-formulaAverage));
    }
}
