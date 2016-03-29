import java.io.*;

/**
 * Created by ross on 3/22/16.
 * Should be used as part of fileStreams
 */

class balance {
    public int getBalance() throws IOException {
        FileInputStream fi = new FileInputStream("balance.txt");
        int c;
        char[] charsFromFile = new char[5];
        int i = 0;
        while ((c= fi.read())!=-1) {
            charsFromFile[i] = (char) c;
            i++;
        }

        String stringFromFile = new String(charsFromFile);

        return Integer.parseInt(stringFromFile.trim());
    }

    void changeBalance(int balance) throws IOException{
        Writer wr = new FileWriter("balance.txt");
        String balanceString = Integer.toString(balance);
        wr.write(balanceString);
        wr.close();
    }
}
