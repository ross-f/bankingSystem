import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * Created by ross on 3/22/16.
 */

public class showBalance {
    FileInputStream fi;
    int balance;

    public char balance() throws IOException {
        fi = new FileInputStream("file.txt");
        int c;
        char thing = 0;
        while ((c=fi.read())!=-1)
            thing = (char) c;

        return thing;
    }
}
