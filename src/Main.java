import java.util.Arrays;
public class Main {
    static boolean isFind(int[] arr, int value){
        for (int i : arr){
            if (i == value){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {

        int[] cift = {2,4,4,6,11,12,13,16,18,28};
        int[] ciftsayi = new int[cift.length];
        int ciftsayiolma = 0;
        for(int i = 0; i < cift.length; i++){
            if(cift[i] % 2 == 0){
                ciftsayi[ciftsayiolma++] = cift[i];
            }
        }
        for(int deger: ciftsayi){
            if(deger != 0){
                System.out.println(deger);
            }
        }
    }
}