import java.util.Scanner;
public class Main{
    public static int saykarakter(String metin, char c){
        if(metin.length() == 0) return 0;

        if(metin.charAt(metin.length()-1) == c)
            return 1 + saykarakter(metin.substring(0, metin.length()-1), c);
        else
            return saykarakter(metin.substring(0, metin.length()-1), c);
    }
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Metin gir: ");
        String metin= scanner.nextLine();
        System.out.println("aranacak karakteri gir: ");
        char c = scanner.nextLine().charAt(0);
        System.out.println();
        System.out.println(saykarakter(metin,c));
    }
}