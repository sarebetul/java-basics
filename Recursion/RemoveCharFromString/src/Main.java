public class Main {
    public static String removeChar(String txt,char ch){
        if(txt.isEmpty()) return " ";
        char first = txt.charAt(0);
        String rest = removeChar(txt.substring(1), ch);
        if(first==ch){
            return rest;
        }
        else{
            return first + rest;
        }
    }
    public static void main(String[] args){
        String txt = "Hello";
        char ch = 'l';
        System.out.println(removeChar(txt,ch));
    }
}
