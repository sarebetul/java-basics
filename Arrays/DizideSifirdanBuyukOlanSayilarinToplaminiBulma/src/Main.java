import java.util.Scanner;
public class Main {
  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    System.out.println("Kaç elemanlı dizi gireceksiniz:");
    int boyut = scanner.nextInt();
    int[] dizi = new int[boyut];
    int toplam = 0;
    for(int i = 0; i < boyut; i++){
      System.out.print((i + 1) + ". sayıyı girin: ");
      dizi[i] = scanner.nextInt();
    }
    for(int i = 0; i < boyut; i++){
      if (dizi[i] > 0) {
        toplam = toplam + dizi[i];
      }
    }
    System.out.println("Sıfırdan büyük sayıların toplamı: " + toplam);
  }
}