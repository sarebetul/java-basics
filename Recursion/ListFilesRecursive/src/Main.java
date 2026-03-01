import java.io.File;
public class Main {
    public static void gez(File f) {
        if (f.isFile()) {
            System.out.println("Dosya: " + f.getName());
        }
        else if (f.isDirectory()) {
            System.out.println("Klasör: " + f.getName());
            File[] icindekiler = f.listFiles();
            if (icindekiler != null) {
                for (File dosya : icindekiler) {
                    gez(dosya);
                }
            }
        }
    }
    public static void main(String[] args) {
        File klasor = new File("/Users/sarebetulyazar/Desktop/JavaBaslangic");
        gez(klasor);
    }
}
