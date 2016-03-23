import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

class Main {

    private static void displayMenu(){
        System.out.println("Please choose an option from the menu below: \n" +
                "      1)Show balance \n" +
                "      2)Withdraw \n" +
                "      3)Deposit \n" +
                "      4)Cancel");
    }

    public static void main(String[] args) throws IOException {
        int numberOfPinTries = 5;

        checkPin c = new checkPin();
        int i;
        for (i = 1; i <= numberOfPinTries; i++){
            if(c.isPinCorrect()){
                System.out.println("Correct pin!");
                break;
            } else {
                System.out.println("Incorrect pin! \n" +
                        "You have " + (numberOfPinTries - i) + " attempts remaining");
            }
        }
        if (i > numberOfPinTries) System.exit(0);

        int menuChoice = 0;
        Scanner sb = new Scanner(System.in);
        balance b = new balance();
        withdrawCash w = new withdrawCash();

        do {
            if (menuChoice==0) displayMenu();
            try {
                menuChoice = sb.nextInt();
            } catch (InputMismatchException e){
                menuChoice = 5; // triggers the default in the case switch
            }
            switch (menuChoice) {
                case 1: {
                    System.out.println("Your balance is £" + b.getBalance());
                    displayMenu();
                    break;
                }
                case 2: {
                    w.withdraw(b.getBalance());
                    displayMenu();
                    break;
                }
                case 3: {

                }
                case 4: {

                }
                default: {
                    System.out.println("That is not a valid option, please try again");
                }
            }
        } while (menuChoice!=4);
    }
}
