import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {

        checkPin c = new checkPin();
        while (!c.isPinCorrect());

        int menuChoice;
        Scanner sb = new Scanner(System.in);
        manipulateBalance b = new manipulateBalance();
        withdrawCash w = new withdrawCash();

        do {
            System.out.println("Please choose an option from the menu below: \n" +
                    "      1)Show manipulateBalance \n" +
                    "      2)Withdraw \n" +
                    "      3)Deposit \n" +
                    "      4)Cancel");
            // TODO - fix input mismatch 
            menuChoice = sb.nextInt();
            switch (menuChoice) {
                case 1: {
                    System.out.println("Your balance is £" + b.getBalance());
                    break;
                }
                case 2: {
                    w.withdraw(b.getBalance());
                    break;
                }
                case 3: {

                }
                default: {
                    break;
                }
            }
        } while (menuChoice!=4);
    }
}
