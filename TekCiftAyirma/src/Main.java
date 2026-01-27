import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] sayilar = new int[10];
        System.out.println("Lütfen 10 tane sayı giriniz.");
        for(int i=0 ; i<10 ; i++){
            sayilar[i] = input.nextInt();
        }
        System.out.println("Çift sayılar: ");
        for(int i=0;i<10;i++){
            if(sayilar[i]%2==0){
                System.out.print(sayilar[i]+ " ");
            }
        }
        System.out.println("Tek sayılar: ");
        for(int i=0;i<10;i++){
            if(sayilar[i]%2!=0){
                System.out.print(sayilar[i]+ " ");
            }
        }

    }
}