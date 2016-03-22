import java.io.*;

/**
 * Created by ross on 3/22/16.
 */

public class manipulateBalance {
    FileInputStream fi;
    Writer wr;
    String stringFromFile;
    int balance;

    public int getBalance() throws IOException {
        fi = new FileInputStream("balance.txt");
        int c;
        char[] charsFromFile = new char[5];
        int i = 0;
        while ((c=fi.read())!=-1) {
            charsFromFile[i] = (char) c;
            i++;
        }

        stringFromFile = new String(charsFromFile);

        balance = Integer.parseInt(stringFromFile.trim());

        return balance;
    }

    public void changeBalance(int balance) throws IOException{
        wr = new FileWriter("balance.txt");
        String sbalance = Integer.toString(balance);
        wr.write(sbalance);
        wr.close();
    }
}
