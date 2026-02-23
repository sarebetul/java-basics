public class Main{
  public static void yaz(String isim, int kez){
    if(kez>=0){
      System.out.println(isim.charAt(kez));
      yaz(isim, kez -1);
    }
  }
  public static void main(String[] args){
    String isim = "Betul";
    yaz(isim, isim.length()-1);
  }
}