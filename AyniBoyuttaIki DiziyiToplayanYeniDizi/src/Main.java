import java.util.Scanner;
public class Main{
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        System.out.println("Kaç boyutlu dizi istiyorsunuz?");
        int boyut= input.nextInt();
        int[] dizi1 = new int[boyut];
        int[] dizi2 = new int[boyut];
        int[] dizi3 = new int[boyut];
        for(int i=0;  i< boyut; i++){
            System.out.println(i +". sayı girin: ");
            dizi1[i]= input.nextInt();
        }
        for(int i=0;  i< boyut; i++){
            System.out.println(i +". sayı girin: ");
            dizi2[i]= input.nextInt();
        }
        for(int i=0; i<boyut; i++){
            dizi3[i] = dizi1[i] + dizi2[i];
        }
        for(int i=0; i<boyut; i++){
            System.out.print(dizi3[i] + " ");
        }
    }
}