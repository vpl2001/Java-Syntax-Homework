import java.util.Scanner;

/**
 * Created 19.3.2016 г..
 */
public class GetFirstOddEvenElements {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String [] numbers = input.nextLine().split(" ");
        String get = input.next();
        int count = Integer.parseInt(input.next());
        String oddOrEven = input.next();
        int[] elements = new int[numbers.length];
        for (int i = 0; i < elements.length; i++) {
            elements[i] = Integer.parseInt(numbers[i]);
        }

        GetOddEvenElements(elements, count, oddOrEven);
    }

    public static void GetOddEvenElements(int[] elementList, int countOddOrEven, String oddOrEven) {
        int index = 1;
        if (oddOrEven.equals("odd")){
            for (int i = 0; i < elementList.length; i++) {
                if (elementList[i] %2 != 0 && index <=countOddOrEven){
                    System.out.print(elementList[i]);
                    System.out.print(" ");
                    index ++;
                }
            }
        }
        else {
            for (int i = 0; i < elementList.length; i++) {
                if (elementList[i] % 2 == 0 && index <= countOddOrEven) {
                    System.out.print(elementList[i]);
                    System.out.print(" ");
                    index++;
                }
            }
        }
    }
}
