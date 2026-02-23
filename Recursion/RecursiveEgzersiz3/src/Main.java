public class Main {
  public static void yaz(String isim, int kez){
    if(kez<isim.length()){
      System.out.println(isim.charAt(kez));
      yaz(isim, kez +1);
    }
  }
  public static void main(String[] args){
    String isim = "Betul";
    yaz(isim, 0);
  }
}
