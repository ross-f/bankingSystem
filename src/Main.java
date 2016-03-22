import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
/*
        FileInputStream fi;
        FileOutputStream fo;

        fi = new FileInputStream("file.txt");
        fo = new FileOutputStream("file.txt");
*/

        checkPin c = new checkPin();
        while (!c.isPinCorrect());

        System.out.println("Please choose an option from the menu below: \n" +
                "      1)Show Balance \n" +
                "      2)Withdraw \n" +
                "      3)Deposit \n" +
                "      4)Cancel");

        int menuChoice;
        Scanner sb = new Scanner(System.in);
        menuChoice = sb.nextInt();
        showBalance bal = new showBalance();

        switch (menuChoice) {
            case 1:{
                System.out.println("Your balance is " + bal.balance());
            }
        }
    }
}
