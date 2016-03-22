import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created 18.3.2016 г..
 */

public class OddAndEvenPairs {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] elements = input.nextLine().split(" ");
        List<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < elements.length; i++) {
            numbers.add(Integer.parseInt(elements[i]));
        }

        if (numbers.size() % 2 != 0) {
            System.out.println("Invalid length");
        } else {
            for (int i = 0; i < numbers.size(); i = i + 2) {
                if (numbers.get(i) % 2 == 0 && numbers.get(i + 1) % 2 == 0) {
                    System.out.printf("%d, %d -> both are even", numbers.get(i), numbers.get(i+1));
                    System.out.println();
                } else if (numbers.get(i) % 2 != 0 && numbers.get(i + 1) % 2 != 0) {
                    System.out.printf("%d, %d -> both are odd", numbers.get(i), numbers.get(i+1));
                    System.out.println();
                } else {
                    System.out.printf("%d, %d -> different", numbers.get(i), numbers.get(i+1));
                    System.out.println();
                }
            }
        }
    }
}