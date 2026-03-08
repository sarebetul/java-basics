import java.util.Scanner;
import java.io.*;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String fileName = "ogrenci.txt";
        int secim;

        do{
            System.out.println("\n1- Öğrenci Ekle");
            System.out.println("2- Öğrencileri Listele");
            System.out.println("3- Geçen/Kalan Ayır");
            System.out.println("4- Çıkış");
            System.out.print("Seçiminiz: ");
            secim = scanner.nextInt();

            if(secim == 1){
                try{
                    FileWriter fw = new FileWriter(fileName,true);
                    PrintWriter pw = new PrintWriter(fw);

                    System.out.print("İsim: ");
                    String isim = scanner.next();

                    System.out.print("No: ");
                    int no = scanner.nextInt();

                    System.out.print("Vize: ");
                    int vize = scanner.nextInt();

                    System.out.print("Final: ");
                    int fin = scanner.nextInt();

                    pw.println(isim + " " + no + " " + vize + " " + fin);
                    pw.close();

                    System.out.println("Öğrenci eklendi.");
                }catch(Exception e){
                    System.out.println("Dosya hatası!");
                }
            }

            else if(secim == 2){
                try{
                    File file = new File(fileName);
                    Scanner reader = new Scanner(file);
                    while(reader.hasNext()){
                        System.out.println(reader.next() + " " + reader.nextInt() + " " +
                                reader.nextInt() + " " + reader.nextInt());
                    }
                    reader.close();
                }catch(Exception e){
                    System.out.println("Dosya okunamadı!");
                }
            }

            else if(secim == 3){
                try{
                    Scanner reader = new Scanner(new File(fileName));
                    PrintWriter gecen = new PrintWriter("gecen.txt");
                    PrintWriter kalan = new PrintWriter("kalan.txt");

                    while(reader.hasNext()){
                        String isim = reader.next();
                        int no = reader.nextInt();
                        int vize = reader.nextInt();
                        int fin = reader.nextInt();
                        double ort = vize*0.4 + fin*0.6;

                        if(ort >= 50){
                            gecen.println(isim + " " + no + " " + vize + " " + fin);
                        }else{
                            kalan.println(isim + " " + no + " " + vize + " " + fin);
                        }
                    }

                    reader.close();
                    gecen.close();
                    kalan.close();
                    System.out.println("Geçen ve kalan öğrenciler dosyaya yazıldı.");

                }catch(Exception e){
                    System.out.println("Hata oluştu!");
                }
            }

            else if(secim == 4){
                System.out.println("Çıkılıyor...");
            }

            else{
                System.out.println("Hatalı seçim!");
            }

        }while(secim != 4);

        scanner.close();
    }
}