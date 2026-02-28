import java.util.Scanner;
import java.io.File;
public class Main{
    public static void main(String[] args) throws Exception{
        File file = new File("matris.txt"); // dosya adını kendine göre ayarla
        Scanner input = new Scanner(file);
        final int Satir = 2;
        final int Sutun = 4;
        int[] a = new int [ Satir * Sutun];
        for(int i = 0; i < Satir * Sutun; i++){
            a[i] = input.nextInt();
        }
		for( int i =0; i<a.length; i++){
            System.out.print(a[i] + " ");
        }
		input.close();
    }
}
