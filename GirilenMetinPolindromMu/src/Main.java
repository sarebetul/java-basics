import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.println("Lütfen bir kelime girin");
        String kelime= input.nextLine();
        for (int i = 0, j = kelime.length() - 1; i < j; i++, j--) {
            if (kelime.charAt(i) != kelime.charAt(j)) {
                System.out.println("Palindrom değil");
                return;
            }
        }
        System.out.println("polindrom");
    }
}