public class Main {
    public static void yaz(int n){
        if(n==0) return;
        System.out.println(n);
        yaz(n-1);
    }
    public static void main(String[] args){
        yaz(4);
    }
}