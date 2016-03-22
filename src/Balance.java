import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * Created by ross on 3/22/16.
 */

public class Balance {
    FileInputStream fi;
    FileOutputStream fo;
    String outputFromFile;
    int balance;


    public int getBalance() throws IOException {
        fi = new FileInputStream("balance.txt");
        int c;
        char[] thing = new char[5];
        int i = 0;
        while ((c=fi.read())!=-1) {
            thing[i] = (char) c;
            i++;
        }

        outputFromFile = new String(thing);

        balance = Integer.parseInt(outputFromFile);

        return balance;
    }

    public void changeBalance(int balance) throws IOException{
        fo = new FileOutputStream("balance.txt");
        fo.write(balance);
    }
}
