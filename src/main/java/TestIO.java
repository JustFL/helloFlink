
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class TestIO {
    public static void main(String[] args) throws IOException {


        File file = new File("abc.txt");
        FileReader fr = new FileReader(file);

        char[] chars = new char[(int)file.length()];
        fr.read(chars);

        System.out.println(new String(chars));
        System.out.println(chars);
        fr.close();


    }
}
