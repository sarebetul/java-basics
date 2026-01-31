import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Kaç boyutlu dizi gireceksiniz: ");
        int boyut = scanner.nextInt();
        int[] dizi = new int[boyut];

        for(int i=0; i<boyut;i++){
            System.out.print(i +". sayıyı girin: ");
            dizi[i]=scanner.nextInt();
        }

        int enbuyuk, ikincienbuyuk;
        if(dizi[0]>dizi[1]){
            enbuyuk = dizi[0];
            ikincienbuyuk = dizi[1];
        }else {
            enbuyuk = dizi[1];
            ikincienbuyuk = dizi[0];
        }

        for(int i=2; i<boyut; i++){
            if(dizi[i]>enbuyuk){
                ikincienbuyuk = enbuyuk;
                enbuyuk = ikincienbuyuk;
            }else if(dizi[i] > ikincienbuyuk && dizi[i] != enbuyuk){
                ikincienbuyuk = dizi[i];
            }
        }
        System.out.print("Dizideki en büyük ikinci sayı: " + ikincienbuyuk);
    }
}