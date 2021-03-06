import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Created by ross on 3/22/16.
 * Should be used as part of bankingSystem
 */

class withdrawCash extends balance {
    private int amountToWithdraw;

    public withdrawCash(int balance){
        Scanner sb = new Scanner(System.in);

        System.out.println("How much would you like to withdraw?");

        try {
            amountToWithdraw = sb.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("That is not a valid amount, please enter a whole number e.g. 20");
        }

        if (balance - amountToWithdraw <= 0){
            System.out.println("You don't have enough cash pal, sod off");
            return;
        }

        balance -= amountToWithdraw;

        try {
            super.changeBalance(balance);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
