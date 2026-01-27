import java.util.Scanner;
public class Main {
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    System.out.println("Kaç boyutlu dizi istiyorsunuz?");
    int boyut = input.nextInt();
    int[] dizi = new int[boyut];
    for(int i=0; i<boyut; i++){
      System.out.print(i + ". sayıyı girin:");
      dizi[i]= input.nextInt();
    }
  }

}
