import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int[] dizi= new int[10];
        for(int i=0; i< dizi.length;i++){
            System.out.print(i +". sayıyı gir:");
            dizi[i]=input.nextInt();
        }
        for(int i = 0; i < dizi.length; i++){
            System.out.print(dizi[i] + " ");
        }
    }
}