import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.File;
public class Main{
    public static void main(String[] args) throws FileNotFoundException {
        File inputFile= new File("virgul.txt");
        Scanner input = new Scanner(inputFile);
        String birSatir;
        input.useDelimiter(",");
        while(input.hasNext()){
            birSatir = input.next();
            System.out.println(birSatir);
        }
        input.close();
    }
}


