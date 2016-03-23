import java.util.Scanner;

/**
 * Created by ross on 3/22/16.
 * Should be used as part of fileStreams
 */
class checkPin {
    public boolean isPinCorrect(){
        System.out.println("Please enter a pin:");
        Scanner sb = new Scanner(System.in);
        int enteredPin = sb.nextInt();

        int pin = 1234;
        return enteredPin == pin;
    }
}
