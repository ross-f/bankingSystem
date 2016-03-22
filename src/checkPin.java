import java.util.Scanner;

/**
 * Created by ross on 3/22/16.
 */
public class checkPin {
    int pin = 1234;

    public boolean isPinCorrect(){
        System.out.println("Please enter a pin:");
        Scanner sb = new Scanner(System.in);
        int enteredPin = sb.nextInt();

        if (enteredPin == pin) {
            System.out.println("correct pin");
            return true;
        } else {
            System.out.println("Incorrect pin.");
            return false;
        }
    }
}
