import java.io.IOException;
import java.util.Scanner;

/**
 * Created by ross on 3/22/16.
 * Should be used as part of fileStreams
 */
class withdrawCash extends balance {
    public void withdraw(int balance){
        int amountToWithdraw;
        System.out.println("How much would you like to withdraw?");

        Scanner sb = new Scanner(System.in);
        amountToWithdraw = sb.nextInt();

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
