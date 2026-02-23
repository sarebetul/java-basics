public class Main{
  public static int toplam(int sayı){
    if(sayı==0)
      return 0;

    else return sayı%10 + toplam(sayı/10);
  }
  public static void main(String[] args){
    System.out.println(toplam(325));
  }
}
