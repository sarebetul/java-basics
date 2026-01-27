import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Kaç boyutlu dizi istiyorsun?");
        int boyut= input.nextInt();
        int[] dizi= new int[boyut];
        for(int i=0;i<boyut;i++){
            System.out.println(i +". sayıyı girin: ");
            dizi[i]= input.nextInt();
        }
        System.out.println("Aramak istediğiniz sayıyı girin: ");
        int aranan = input.nextInt();
        boolean VarMİ=false;
        int index=-1;
        for(int i=0;i<boyut;i++){
            if(dizi[i]==aranan) {
                VarMİ = true;
                index=i;
                break;
            }
        }
        if(VarMİ==true){
            System.out.println("Aranan sayı dizide var.İndex: "+index);
        }else {
            System.out.println("Aranan sayı dizide yok.");
        }
    }
}
