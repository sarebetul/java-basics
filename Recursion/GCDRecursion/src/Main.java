public class Main {
  public static int obeb(int a , int b){
    if(b==0) return a;
    else return obeb(b,a%b);
  }
  public static void main(String[] args){
    System.out.println(obeb(48,24));
  }
}
