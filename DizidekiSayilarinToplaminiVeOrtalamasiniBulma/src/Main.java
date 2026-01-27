import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int[] dizi = new int[10];
        int toplam = 0;
        double ort = toplam/ dizi.length;
        for(int i=0; i<dizi.length; i++){
            System.out.print(i +". sayiyi girin: ");
            dizi[i]=input.nextInt();
            toplam=toplam+dizi[i];
        }
        ort=(double) toplam/ dizi.length;
        System.out.println("Dizideki sayıların toplamı: " + toplam);
        System.out.print("Dizideki sayıların ortalaması: " + ort);
    }
}