public class Main {
    public static int say(String txt, int index){
        if(index >= txt.length()) return 0;
        if(txt.charAt(index)=='a'||txt.charAt(index)=='e'||txt.charAt(index)== 'i'|| txt.charAt(index)=='o'||txt.charAt(index)=='u' ) {
            return 1 + say(txt,index+1);
        }
        else{
            return say(txt,index+1);
        }
    }
    public static void main(String[] args){
        String  txt= "hello";
        int index = 0;
        System.out.println(say(txt, index));
    }
}
