import  java.util.Scanner;
public class Main {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int[] dizi = new int[10];

    System.out.println("Lütfen 10 tane sayı girin:");
    for (int i = 0; i < dizi.length; i++) {
      dizi[i] = input.nextInt();
    }
    for (int i = 0; i < dizi.length; i++) {
      boolean yazildiMi = false;
      for(int k = 0; k < i; k++){
        if(dizi[i] == dizi[k]){
          yazildiMi = true;
          break;
        }
      }
      if(yazildiMi){
        continue;
      }
      int tekrar = 1;
      for(int j = i+1; j< dizi.length;j++){
        if(dizi[i]==dizi[j]){
          tekrar++;
        }
      }
      if(tekrar > 1){
        System.out.println(dizi[i] + " sayısı " + tekrar + " kez tekrar ediyor.");
      }

    }

  }
}