import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int[] dizi = new int[10];

        System.out.println("Lütfen 10 tane sayı girin:");
        for (int i = 0; i < 10; i++) {
            dizi[i] = input.nextInt();
        }

        System.out.println("Tekrar edenler: ");
        for (int i = 0; i < dizi.length; i++) {
            for (int j = i + 1; j < dizi.length; j++) {
                if (dizi[i] == dizi[j]) {
                    System.out.print(dizi[i] + " ");
                    break;
                }
            }
        }
    }
}

