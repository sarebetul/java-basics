import java.util.Scanner;
public class Main{
    public static int Toplam(String metin){
        if(metin.length() == 0) return 0;
        int deger = 0 ;
        if(metin.charAt(0) >= '0' &&  metin.charAt(0)<= '9'){
            deger = metin.charAt(0) - '0';
        }
        String kalan = metin.substring(1);
        return deger + Toplam(kalan);
    }
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bir metin giriniz: ");
        String metin = scanner.nextLine();
        System.out.println("Metindeki sayıların toplamı: " + Toplam(metin));
    }
}