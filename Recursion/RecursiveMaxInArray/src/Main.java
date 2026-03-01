public class Main{
    public static int max (int n, int[] dizi){
        if(n==1) return dizi[0];
        int a = max(n-1, dizi);
        int b = dizi[n-1];
        if(a>b){
            return a;
        }
        else{
            return b;
        }
    }
    static void main(String[] args){
        int[] dizi = {3, 8, 2, 10, 5};
        System.out.println(max(dizi.length, dizi));
    }
}