import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.println("Lütfen bir metin girin.");
        String txt = input.nextLine();
        System.out.println("metinin karakter sayısı: " + txt.length() );
        System.out.println("metnin ilk harfi: " + txt.charAt(0));
        System.out.println("metinin son harfi: " + txt.charAt(txt.length()-1));
        System.out.println("mtnin küçük harfli yazımı: " + txt.toLowerCase());
        System.out.println("metinde 'a' harfi  var mı: " + txt.contains("a"));

    }
}