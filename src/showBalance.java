import java.io.FileInputStream;
import java.io.IOException;

/**
 * Created by ross on 3/22/16.
 */

public class showBalance {
    FileInputStream fi;
    String outputFromFile;
    int balance;


    public int balance() throws IOException {
        fi = new FileInputStream("file.txt");
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
}
