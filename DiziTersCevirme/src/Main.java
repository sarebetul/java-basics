public class Main {
    public static void main(String[] args) {
        int dizi[] = {1,2,3,4,5,6};
        for (int i=0; i<(dizi.length/2);i++){
            int temp= dizi[i];
            dizi[i]=dizi[dizi.length-1-i];
            dizi[dizi.length-1-i]=temp;
        }
        System.out.print("{");
        for (int i=0;i< dizi.length;i++){

            System.out.print( dizi[i]+" ");

        }
        System.out.print("}");


    }
}