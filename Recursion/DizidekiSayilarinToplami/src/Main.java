import java.util.Scanner;
public class Main {
    public static int Toplam(int[] dizi, int n){
        if(n==0) return 0;
        return dizi[n-1] + Toplam(dizi, n-1);
    }
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Kaç boyutlu dizi:");
        int n = scanner.nextInt();
        int[] dizi = new int[n];
        for(int i=0; i<n; i++){
            System.out.print((i+1) + ". sayıyı gir: ");
            dizi[i]= scanner.nextInt();
        }
        System.out.println(Toplam(dizi, n));
    }
}