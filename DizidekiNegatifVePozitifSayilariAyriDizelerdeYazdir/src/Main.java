import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int negatifsayi = 0;
        int pozitifsayi = 0;

        System.out.println("Kaç boyutlu dizi gireceksiniz: ");
        int boyut = scanner.nextInt();
        int[] dizi = new int[boyut];

        for (int i = 0; i < boyut; i++) {
            System.out.print(i + ". sayıyı girin: ");
            dizi[i] = scanner.nextInt();
        }
        for (int i = 0; i < boyut; i++) {
            if (dizi[i] < 0) {
                negatifsayi++;
            } else if (dizi[i] > 0) {
                pozitifsayi++;
            }
        }

        int[] negatif = new int[negatifsayi];
        int[] pozitif = new int[pozitifsayi];

        int nIndex = 0;
        int pIndex = 0;

        for (int i = 0; i < boyut; i++) {
            if (dizi[i] < 0) {
                negatif[nIndex] = dizi[i];
                nIndex++;
            } else if (dizi[i] > 0) {
                pozitif[pIndex] = dizi[i];
                pIndex++;
            }
        }


        System.out.print("Negatif sayılar: ");
        for(int i=0;i<negatifsayi;i++){
            System.out.print(negatif[i] + " ");
        }

        System.out.print("Pozitif sayılar: ");
        for(int i=0;i<pozitifsayi;i++){
            System.out.print( pozitif[i] + " ");
        }
    }
}