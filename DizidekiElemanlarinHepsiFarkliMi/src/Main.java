import java.util.Scanner;
public class Main {
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    int[] dizi = new int[10];
    boolean FarkliMi= true;
    for(int i=0; i< dizi.length;i++){
      System.out.print(i + ". sayıyı girin: ");
      dizi[i] = input.nextInt();
    }
    for(int i=0; i<dizi.length;i++){
      for(int j=i+1; j<dizi.length; j++){
        if(dizi[i]==dizi[j]){
          FarkliMi=false;
          break;
        }else{
          FarkliMi=true;
          break;
        }
      }
    }
    if(FarkliMi==true){
      System.out.println("Dizideki elemanlar birbirinden farklı.");
    }else{
      System.out.println("Dizzideki elemanların hepsi farklı değil.");
    }
  }
}