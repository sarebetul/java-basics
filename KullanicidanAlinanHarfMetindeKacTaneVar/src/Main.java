import java.util.Scanner;
public class Main {
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    System.out.println("Bir metin girin");
    String metin = input.nextLine();

    System.out.println("Aramak istediğiniz harfi girin: ");
    char harf= input.next().charAt(0);

    int sayac = 0;
    for(int i=0; i<metin.length(); i++){
      if(metin.charAt(i)==harf){
        sayac++;
      }
    }
    System.out.println("Aranan harf metinde " + sayac + " kez geçer.");
  }
}