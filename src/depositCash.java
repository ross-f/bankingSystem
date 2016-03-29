import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Created by ross on 3/29/16.
 * Should be used as part of bankingSystem
 */

class depositCash extends balance{
    private int amountToDeposit;

    public depositCash(int balance) {
        Scanner sb = new Scanner(System.in);

        System.out.println("How much cash would you like to deposit?");

        try {
            amountToDeposit = sb.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("That is not a valid amount, please enter a whole number e.g. 20");
        }

        balance += amountToDeposit;

        try {
            super.changeBalance(balance);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
