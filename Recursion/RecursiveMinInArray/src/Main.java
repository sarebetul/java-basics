public class Main {
    public static int min(int n, int[] dizi){
        if(n==1) return dizi[0];
        int a = min(n-1,dizi);
        int b = dizi[n-1];
        if(a<b){
            return a;
        }
        else{
            return b;
        }
    }
    public static void main(String[] args){
        int[] dizi= {3, 8, 2, 10, 5};
        int n=dizi.length;
        System.out.println(min(n,dizi));
    }
}
