import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        double F , C;
        System.out.print("Bir fahrenayt değeri girin: ");
        F = scanner.nextDouble();

        C = (5.0/9.0)*(F-32);
        System.out.print("Girilen fahrenayt değeri için celcius değeri: " + C);
    }
}