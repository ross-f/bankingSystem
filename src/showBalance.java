import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * Created by ross on 3/22/16.
 */

public class showBalance {
    FileInputStream fi;
    FileOutputStream fo;
    int balance;

    public int balance() throws IOException {
        fi = new FileInputStream("file.txt");
        fo = new FileOutputStream("file.txt");
        balance = fi.read();
        return balance;
    }
}
