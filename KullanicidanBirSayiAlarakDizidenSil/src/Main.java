import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Dizi boyutunu girin: ");
        int boyut = input.nextInt();
        int[] dizi = new int[boyut];
        for (int i = 0; i < boyut; i++) {
            System.out.print(i + ". eleman: ");
            dizi[i] = input.nextInt();
        }
        System.out.print("Silinecek sayıyı girin: ");
        int silinecek = input.nextInt();
        int index = -1;
        for (int i = 0; i < boyut; i++) {
            if (dizi[i] == silinecek) {
                index = i;
                break;
            }
        }
        if (index != -1) {
            for (int i = index; i < boyut - 1; i++) {
                dizi[i] = dizi[i + 1];
            }
            dizi[boyut - 1] = 0;
        } else {
            System.out.println("Sayı dizide bulunamadı.");
        }
        System.out.println("Dizinin son hali:");
        for (int i = 0; i < boyut; i++) {
            System.out.print(dizi[i] + " ");
        }
    }
}