public class Main {
    public static void printChars(String text, int index){
        if(index < text.length()){
            System.out.println(text.charAt(index));
            printChars(text, index + 1);
        }
    }

    public static void main(String[] args){
        printChars("Betul", 0);
    }
}
