import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Kaç boyutlu dizi istiyorsunuz?");
        int boyut= input.nextInt();
        int[] dizi = new int[boyut];
        for(int i=0;  i< dizi.length; i++){
            System.out.println(i +". sayı girin: ");
            dizi[i]= input.nextInt();
        }
        int temp = dizi[dizi.length-1];
        for(int i= dizi.length-1; i>0; i--){
            dizi[i]=dizi[i-1];
        }
        dizi[0]=temp;
        for (int i=0; i< dizi.length;i++){
            System.out.print(dizi[i]+ " ");
        }
    }
}