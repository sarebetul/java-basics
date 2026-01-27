import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);

        System.out.println("Lütfen bir metin girin:");
        String txt = input.nextLine();

        String[] kelimeler =txt.trim().split("\\s+");
        System.out.println("Kelime sayısı: " + kelimeler.length);
    }
}