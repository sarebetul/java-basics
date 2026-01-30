import java.util.Scanner;
public class Main {
  public static void main(String[]args){
    Scanner scanner = new Scanner(System.in);
    System.out.print("Kaç elemanlı dizi gireceksiniz: ");
    int boyut= scanner.nextInt();
    int[] dizi = new int[boyut];
    for (int i = 0; i < boyut; i++) {
      System.out.print((i+1) + ". sayıyı girin: ");
      dizi[i] = scanner.nextInt();
    }
    System.out.print("Çift indexteki sayılar: ");
    for (int i = 0; i < boyut; i++) {
      if (i % 2 == 0) {
        System.out.print(dizi[i] + " ");
      }
    }
    System.out.print("\nTek indexteki sayılar: ");
    for (int i = 0; i < boyut; i++) {
      if (i % 2 != 0) {
        System.out.print(dizi[i] + " ");
      }


    }
  }
}
