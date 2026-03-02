public class Main {
    public static int digit(int n){
        if(n<10) return n;
        int top = 0;
        top = top + (n%10);
        return n%10 + digit(n/10);
    }
    public static void main(String[] args){
        int n = 35;
        System.out.println(digit(n));
    }
}