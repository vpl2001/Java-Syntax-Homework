import com.sun.java.swing.plaf.windows.WindowsInternalFrameTitlePane;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created 20.3.2016 г..
 */

public class CharacterMultiplier {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String firstInput = input.next();
        String secondInput = input.next();

        int result = MultiplyMethod(firstInput, secondInput);
        System.out.println(result);
    }
    public static int MultiplyMethod(String first, String second){
        int sum = 0;
        if (first.length()>second.length()){
            for (int i = 0; i <second.length() ; i++) {
                sum = sum + first.charAt(i)*second.charAt(i);
            }
            for (int i = second.length(); i < first.length(); i++) {
                sum = sum + first.charAt(i);
            }
            return sum;
        }else if (first.length()<second.length()){
            for (int i = 0; i <first.length() ; i++) {
                sum = sum + first.charAt(i)*second.charAt(i);
            }
            for (int i = first.length(); i < second.length(); i++) {
                sum = sum + second.charAt(i);
            }
            return sum;
        }else {
            for (int i = 0; i <first.length() ; i++) {
                sum = sum + first.charAt(i)*second.charAt(i);
            }
            return sum;
        }
    }
}
