import java.io.File;
import java.io.PrintWriter;
public class Main{
    public static void main(String[] args)throws Exception{
        File dosya = new File("/Users/sarebetulyazar/Desktop/data.txt");
        PrintWriter output = new PrintWriter(dosya);
        output.print("Merhaba Dünya");
        output.close();
    }
}
