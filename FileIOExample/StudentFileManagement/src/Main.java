import java.util.Scanner;
import java.io.*;
public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String fileName = "student.txt";
        int choice;
        do{
            System.out.println("\n1- Öğrenci Ekle");
            System.out.println("2- Öğrencileri Listele");
            System.out.println("3- Geçen/Kalan Ayır");
            System.out.println("4- Çıkış");
            System.out.print("Seçiminiz: ");
            choice = scanner.nextInt();
            if(choice == 1){
                try{
                    FileWriter fw = new FileWriter(fileName,true);
                    PrintWriter pw = new PrintWriter(fw);

                    System.out.print("İsim: ");
                    String name = scanner.next();

                    System.out.print("No: ");
                    int num = scanner.nextInt();

                    System.out.print("Vize: ");
                    int vize = scanner.nextInt();

                    System.out.print("Final: ");
                    int fin = scanner.nextInt();

                    pw.println(name + " " + num + " " + vize + " " + fin);
                    pw.close();
                    System.out.println("Öğrenci eklendi.");
                }catch(Exception e){
                    System.out.println("Dosya hatası!");
                }
            }
            else if(choice == 2){
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
            else if(choice == 3){
                try{
                    Scanner reader = new Scanner(new File(fileName));
                    PrintWriter pass = new PrintWriter("pass.txt");
                    PrintWriter fail = new PrintWriter("fail.txt");
                    while(reader.hasNext()){
                        String name = reader.next();
                        int num = reader.nextInt();
                        int vize = reader.nextInt();
                        int fin = reader.nextInt();
                        double ort = vize*0.4 + fin*0.6;
                        if(ort >= 50){
                            pass.println(name + " " + num + " " + vize + " " + fin);
                        }else{
                            fail.println(name + " " + num + " " + vize + " " + fin);
                        }
                    }
                    reader.close();
                    pass.close();
                    fail.close();
                    System.out.println("Geçen ve kalan öğrenciler dosyaya yazıldı.");
                }catch(Exception e){
                    System.out.println("Hata oluştu!");
                }
            }
            else if(choice == 4){
                System.out.println("Çıkılıyor");
            }
            else{
                System.out.println("Hatalı seçim!");
            }
        }while(choice != 4);
        scanner.close();
    }
}