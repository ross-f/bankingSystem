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

        int menuChoice;
        Scanner sb = new Scanner(System.in);
        balance b = new balance();

        do {
            displayMenu();
            try {
                menuChoice = sb.nextInt();
            } catch (InputMismatchException e){
                menuChoice = 5; // triggers the default in the case switch
            }
            switch (menuChoice) {
                case 1: {
                    System.out.println("Your balance is £" + b.getBalance());
                    break;
                }
                case 2: {
                    new withdrawCash(b.getBalance());
                    break;
                }
                case 3: {
                    // TODO - Fix overflow
                    new depositCash(b.getBalance());
                    break;
                }
                case 4: {
                    System.out.println("Are you sure you want to exit? (y/n)");
                    String input;
                    input = sb.next();

                    if (input.equals("y")) System.exit(0);

                    break;
                }
                default: {
                    System.out.println("That is not a valid option, please try again");
                }
            }
        } while (true);
    }
}
