import java.util.Scanner;

public class Main {
  public static void main(String[] args) {

    Scanner input = new Scanner(System.in);
    int[] dizi = new int[10];

    System.out.println("Lütfen 10 tane sayı girin:");
    for (int i = 0; i < dizi.length; i++) {
      dizi[i] = input.nextInt();
    }

    System.out.println("Tekrar edenler:");

    for (int i = 0; i < dizi.length; i++) {

      // Daha önce yazdırıldı mı?
      boolean dahaOnceYazdirildi = false;
      for (int k = 0; k < i; k++) {
        if (dizi[i] == dizi[k]) {
          dahaOnceYazdirildi = true;
          break;
        }
      }
      if (dahaOnceYazdirildi) {
        continue;
      }

      // İleride tekrar ediyor mu?
      for (int j = i + 1; j < dizi.length; j++) {
        if (dizi[i] == dizi[j]) {
          System.out.print(dizi[i] + " ");
          break;
        }
      }
    }
  }
}