import java.util.Scanner;
import java.io.*;
public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Klasör yolunu giriniz: ");
        File file = new File(scanner.nextLine());
        int dosya_sayisi = 0;
        int klasör_sayisi = 0;
        long boyut = 0;
        File[] list = file.listFiles();
        for(int i=0; i<list.length;i++ ){
            if(list[i].isFile()){
                dosya_sayisi ++;
                boyut = boyut + list[i].length();
            }else if(list[i].isDirectory()){
                klasör_sayisi ++;
            }
        }
        System.out.println("dosya sayısı: " + dosya_sayisi);
        System.out.println("Klasör sayısı: " + klasör_sayisi);
        System.out.println("Boyut: " + boyut);
    }
}