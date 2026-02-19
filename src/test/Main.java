import java.io.*;

class UpperFilterReader extends FilterReader {

    UpperFilterReader(Reader in) {
        super(in);
    }

    public int read() throws IOException {
        int ch = super.read(); // read from FileReader
        if (ch == -1) return ch;

        return Character.toUpperCase((char) ch);
    }
}

public class Main {
    public static void main(String[] args) throws Exception {

        Reader file = new FileReader("data.txt");

        UpperFilterReader filter = new UpperFilterReader(file);

        int ch;
        while ((ch = filter.read()) != -1) {
            System.out.print((char) ch);
        }

        filter.close();
    }
}
