import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        FileInputStream fi;
        FileOutputStream fo;

        fi = new FileInputStream("file.txt");
        fo = new FileOutputStream("file2.txt");

        int c;
        while ((c=fi.read())!=-1){
            fo.write(c);
        }
    }
}
