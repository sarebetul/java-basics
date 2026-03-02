public class Main {
    public static int[] count(int[] dizi, int index){
        if(index == dizi.length){
            return new int[]{0,0};
        }
        int[] kalan = count(dizi, index + 1);
        if(dizi[index] > 0){
            kalan[0]++;
        }
        if(dizi[index] < 0){
            kalan[1]++;
        }
        return kalan;
    }
    public static void main(String[] args){
        int[] dizi = {3, -1, 78, -4, -3};
        int[] sonuc = count(dizi, 0);
        System.out.println("Pozitif sayısı: " + sonuc[0]);
        System.out.println("Negatif sayısı: " + sonuc[1]);
    }
}
