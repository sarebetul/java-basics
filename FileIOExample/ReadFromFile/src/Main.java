import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class Main{
    public static void main(String[] args) throws FileNotFoundException {
        Scanner input = new Scanner(new File("data.txt"));
        String line;
        while(input.hasNext()){
            line= input.nextLine();
            System.out.println(line);
        }
        input.close();
    }
}
