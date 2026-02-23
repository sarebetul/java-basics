import java.util.Scanner;
public class Main{
  public static void yaz(String ad, int kez){
    if(kez>0){
      System.out.println(ad);
      yaz(ad,kez-1);
    }
  }
  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    System.out.println("Adınızı girin: ");
    String ad = scanner.nextLine();
    System.out.println("Kaç kez girilsin: ");
    int kez = scanner.nextInt();
    yaz(ad,kez);
  }
}