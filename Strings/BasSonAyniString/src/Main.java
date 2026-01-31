import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Satır sayısı gir: ");
        int satir = scanner.nextInt();

        System.out.print("Sütun sayısı gir: ");
        int sutun = scanner.nextInt();
        scanner.nextLine();

        String[][] dizi = new String[satir][sutun];
        for(int i = 0; i < satir; i++){
            for(int j = 0; j < sutun; j++){
                System.out.print("Kelime giriniz: ");
                String kelime = scanner.nextLine();
                dizi[i][j] = kelime;
            }
        }

        int ayni = 0;
        for(int i = 0; i < satir; i++){
            for(int j = 0; j < sutun; j++){
                String k = dizi[i][j];
                if(k.charAt(0) == k.charAt(k.length()-1)){
                    ayni++;
                }
            }
        }

        String[] yeni = new String[ayni];
        int index = 0;
        for(int i = 0; i < satir; i++){
            for(int j = 0; j < sutun; j++){
                String k = dizi[i][j];
                if(k.charAt(0) == k.charAt(k.length()-1)){
                    yeni[index] = k;
                    index++;
                }
            }
        }

        System.out.println("Baş ve son harfi aynı olan kelimeler:");
        for(String s : yeni){
            System.out.print(s + " ");
        }
    }
}