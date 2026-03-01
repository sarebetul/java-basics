public class Main {
    public static int search(int[] dizi,int aranan, int index){
        if(index==dizi.length) return -1;
        if (dizi[index]==aranan){
            return index;
        }
        else{
            return search(dizi,aranan,index+1);
        }
    }
    public static void main(String[] args){
        int[] dizi = {2, 4, 6, 8, 10};
        int aranan=6;
        int index=0;
        System.out.println("Aranan sayı " + search(dizi, aranan, index) + ". indexte bulundu.");
    }
}