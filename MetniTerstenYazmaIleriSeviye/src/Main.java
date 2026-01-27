import java.util.Scanner;
public class Main {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Lütfen bir metin girin.");
    String txt = input.nextLine();
    String ters = new StringBuilder(txt).reverse().toString();
    System.out.println(ters);
  }
}
