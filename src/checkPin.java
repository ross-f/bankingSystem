import java.util.Objects;
import java.util.Scanner;

/**
 * Created by ross on 3/22/16.
 * Should be used as part of fileStreams
 */

// The class is not public and can only be used locally in this package
class checkPin {
    // This method asks the user to enter a pin and returns either true or false if this pin matches
    private boolean isPinCorrect(){
        // The user is asked to enter a pin
        System.out.println("Please enter a pin:");
        // Object Scanner is initialised as sb to handle inputs
        Scanner sb = new Scanner(System.in);
        // User imputed pin is stored in the Integer of enteredPin
        String enteredPin = sb.nextLine();

        // This is where the pin is stored,
        String pin = "1234";
        // the enteredPin is compared to the pin and the result - either true or false - is returned
        return Objects.equals(enteredPin, pin);
    }

    /* The following method handles the number of times a pin can be entered.
       The max number of tries is passed through as a parameter, this
       allows the value to be set in the main
        */

    checkPin(int numberOfPinTries) {
        // The loop index of i is defined outside the for loop so that it can be used in the if
        int i;
        // loop for each number of tires
        for (i = 1; i <= numberOfPinTries; i++){
            // if the above method returns true tell the user the pin is correct and go back to the main
            if(isPinCorrect()){
                System.out.println("Correct pin!");
                break;
            } else {
                // if pin is incorrect then tell the user how many attempts they have left
                System.out.println("Incorrect pin! \n" +
                        "You have " + (numberOfPinTries - i) + " attempts remaining");
            }
        }
        // if the user has used all tries then exit the program
        if (i > numberOfPinTries) System.exit(0);
    }
}
