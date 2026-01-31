import java.util.Scanner;
public class Main {
    public static void terstenYazdir(int[] dizi) {
        System.out.print("Dizinin tersten hali: ");
        for (int i = dizi.length - 1; i >= 0; i--) {
            System.out.print(dizi[i] + " ");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] dizi = new int[3];

        System.out.println("Lütfen 3 elemanlı diziyi giriniz:");
        for (int i = 0; i < dizi.length; i++) {
            System.out.print((i + 1) + ". sayıyı girin: ");
            dizi[i] = scanner.nextInt();
        }

        terstenYazdir(dizi);
    }
}
