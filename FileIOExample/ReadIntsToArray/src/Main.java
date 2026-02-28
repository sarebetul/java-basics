import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class Main{
    public static void main(String[] args) {
        try {
            File file = new File("numbers.txt");
            Scanner input = new Scanner(file);
            int size = 5;
            int[] a = new int[size];
            int i = 0;
            while (input.hasNextInt() && i < size) {
                a[i++] = input.nextInt();
            }
            input.close();
            System.out.print("Read numbers: ");
            for (int j = 0; j < i; j++) {
                System.out.print(a[j] + " ");
            }

        } catch (FileNotFoundException e) {
            System.out.println("Dosya bulunamadı! Lütfen numbers.txt dosyasının doğru konumda olduğundan emin olun.");
        }
    }
}
