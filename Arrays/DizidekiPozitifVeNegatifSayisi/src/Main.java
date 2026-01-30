import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Kaç boyutlu dizi gireceksiniz: ");
        int boyut = scanner.nextInt();

        int[] dizi = new int[boyut];

        for (int i = 0; i < boyut; i++) {
            System.out.print(i + ". sayıyı girin: ");
            dizi[i] = scanner.nextInt();
        }
        int negatifSayisi = 0;
        int pozitifSayisi = 0;

        for (int i = 0; i < dizi.length; i++) {
            if (dizi[i] < 0) {
                negatifSayisi++;
            } else if (dizi[i] > 0) {
                pozitifSayisi++;
            }
        }

        System.out.println("Negatif sayı adedi: " + negatifSayisi);
        System.out.println("Pozitif sayı adedi: " + pozitifSayisi);
    }
}
