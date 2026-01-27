import java.util.Scanner;
public class Main {
  public static void main(String[] args){
    Scanner input= new Scanner(System.in);
    System.out.println("Kaç boyutlu dizi istiyorsunuz?");
    int boyut = input.nextInt();
    int[] dizi = new int[boyut];
    for(int i=0; i<boyut; i++){
      System.out.print(i + ". sayıyı yazın: ");
      dizi[i]= input.nextInt();
    }
    for(int i=0; i<boyut; i++ ){
      for(int j=i+1; j<boyut; j++){
        if(dizi[i]>dizi[j]){
          int temp= dizi[i];
          dizi[i]=dizi[j];
          dizi[j]=temp;
        }
      }
    }
    System.out.print("Küçükten büyüğe sıralanmış dizi:{ ");
    for(int i=0;i<boyut;i++){
      System.out.print(dizi[i]+" ");
    }
    System.out.print("}");

  }
}