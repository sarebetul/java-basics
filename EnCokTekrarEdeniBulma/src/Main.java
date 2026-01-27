import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] dizi = new int[10];
        int maxTekrar = 1;
        int maxsayi = dizi[0];
        System.out.println(("Lütfen 10 tane sayı yazın: "));
        for (int i = 0; i < dizi.length; i++) {
            dizi[i] = input.nextInt();

        }
        for (int i = 0; i < dizi.length; i++) {
            boolean yazildiMi = false;
            for (int k = 0; k < i; k++) {
                if (dizi[i] == dizi[k]) {
                    yazildiMi = true;
                    break;
                }
            }
            if (yazildiMi) {
                continue;
            }
            int tekrar = 1;
            for (int j = i + 1; j < dizi.length; j++) {
                if (dizi[i] == dizi[j]) {
                    tekrar++;
                }
            }
            if (tekrar > maxTekrar) {
                maxTekrar = tekrar;
                maxsayi = dizi[i];
            }
        }
        System.out.println("En çok tekrar eden: " + maxsayi);
        System.out.println("Tekrar sayısı: " + maxTekrar);
    }
}