public class Main{
  public static String ters(String metin){
    if(metin.length()==0)
      return " ";
    else return ters(metin.substring(1))+ metin.charAt(0);
  }
  public static void main(String[] args){
    System.out.println(ters("bilgi"));
  }
}
