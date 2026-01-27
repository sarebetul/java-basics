import java.util.Scanner;
public class Main{
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    int[] dizi = new int[10];
    int tek = 0;
    int çift= 0;
    for(int i=0; i< dizi.length; i++){
      System.out.print(i + ". sayıyı yazın: ");
      dizi[i]=input.nextInt();
    }
    for(int i=0; i< dizi.length; i++){
      if(dizi[i]%2==0){
        çift++;
      }else if(dizi[i]%2!=0){
        tek++;
      }
    }
    System.out.println("Dizideki çift sayı sayısı: " + çift);
    System.out.println("Dizideki tek sayı sayısı: " +tek);
  }
}