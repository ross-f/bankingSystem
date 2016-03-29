import java.util.Scanner;

/**
 * Created by ross on 3/22/16.
 * Should be used as part of fileStreams
 */
class checkPin {
    private boolean isPinCorrect(){
        System.out.println("Please enter a pin:");
        Scanner sb = new Scanner(System.in);
        int enteredPin = sb.nextInt();

        int pin = 1234;
        return enteredPin == pin;
    }

    checkPin(int numberOfPinTries) {
        int i;
        for (i = 1; i <= numberOfPinTries; i++){
            if(isPinCorrect()){
                System.out.println("Correct pin!");
                break;
            } else {
                System.out.println("Incorrect pin! \n" +
                        "You have " + (numberOfPinTries - i) + " attempts remaining");
            }
        }
        if (i > numberOfPinTries) System.exit(0);
    }
}
