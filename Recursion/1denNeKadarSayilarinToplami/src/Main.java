public class Main {
    public static int toplam(int n){
        if(n==1) return 1;

        return n + toplam(n-1);
    }
    public static void main(String[] args){
        System.out.println(toplam(5));
    }
}