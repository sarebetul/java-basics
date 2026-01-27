public class Main {
    public static void main(String[] args) {
        int[] dizi= {12,5,8,21,3,17};
        int enbuyuk = dizi[0];
        int enkucuk =dizi[0] ;
        for(int i=0;i < dizi.length;i++){
            if(dizi[i]>enbuyuk){
                enbuyuk=dizi[i];

            }else{
                enbuyuk = enbuyuk;
            }
        }
        for(int i=0;i<dizi.length;i++) {
            if(dizi[i]<enkucuk){
                enkucuk= dizi[i];
            }else{
                enkucuk =enkucuk;
            }
        }
        System.out.println("En buyuk sayı: " + enbuyuk);
        System.out.println("En kuçuk sayı: " + enkucuk);

    }
}