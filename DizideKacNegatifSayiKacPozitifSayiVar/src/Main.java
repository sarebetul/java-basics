import java.util.Scanner;
public class Main{
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);

        int negatif =0;
        int pozitif=0;

        System.out.println("Kaç boyutlu dizi gireceksiniz: ");
        int boyut= scanner.nextInt();

        int[] dizi = new int[boyut];

        for(int i=0;i<boyut;i++){
            System.out.print(i +". sayıyı girin:");
            dizi[i] = scanner.nextInt();
        }
        for(int i=0;i<boyut;i++){
            if(dizi[i]<0){
                negatif++;
            }else if(dizi[i]>0) {
                pozitif++;
            }
        }
        System.out.println(pozitif + " tane pozitif sayı vardır");
        System.out.println(negatif + " tane negatif sayı vardır");
    }
}
