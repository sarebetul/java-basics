import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
         int[] dizi = new int[10];
         for(int i=0; i< dizi.length; i++){
             System.out.print(i +". sayıyı yazın: ");
             dizi[i] = input.nextInt();
         }
         int enbuyuk = dizi[0];
         int enkucuk = dizi[0];
         for(int i=0; i< dizi.length; i++){
             if(enbuyuk<dizi[i]){
                 enbuyuk=dizi[i];
             }
             if(enkucuk>dizi[i]){
                 enkucuk=dizi[i];
             }
         }
         System.out.println("Dizideki en büyük sayı: " + enbuyuk);
         System.out.println("Dizideki en küçük sayı: " + enkucuk);
    }
}