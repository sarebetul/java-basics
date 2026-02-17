public class Main {
    public static void yaz(int n){
        if(n==0) return;
        yaz(n-1);
        System.out.println(n);
    }
    public static void main(String[] args){
        yaz(4);
    }
}