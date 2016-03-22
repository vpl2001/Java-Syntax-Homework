import java.util.*;

/**
 * Created 18.3.2016 г..
 */
public class RandomizeNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int m = input.nextInt();
        int beginNumber = 0;
        int endNumber = 0;

        if (n > m) {
            beginNumber = m;
            endNumber = n;
        } else if (n < m) {
            beginNumber = n;
            endNumber = m;
        } else {
            System.out.println(n);
        }

        List<Integer> randArray = new ArrayList<>();

        for (int i = beginNumber; i <= endNumber; i++) {
            randArray.add(i);
        }
        Collections.shuffle(randArray);
        // info stackoverflow and others

        if (randArray.size()== 1){
            System.out.println();
        }
        else {
            for (int element : randArray) {
                System.out.print(element + " ");
            }
        }
        }
    }