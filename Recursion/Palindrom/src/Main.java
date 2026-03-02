public class Main {
    public static Boolean palindrom(String str){
        if(str.length() <= 1){
            return true;
        }
        if(str.charAt(0) != str.charAt(str.length() - 1)){
            return false;
        }
        return palindrom(str.substring(1, str.length() - 1));
    }
    public static void main(String[] args){
        String str="kelebek";
        System.out.println(palindrom(str));
    }
}