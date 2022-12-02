import java.util.Arrays;
import java.util.Random;

/**
 *
 * @author uwu
 */
public class QuickSort {
    public static void main(String[] args) {
        int[] uwu = new int[10];
        Random xd = new Random();
        for(int i = 0; i < uwu.length; i++){
            uwu[i] = xd.nextInt(0, 101);
        }
        System.out.println(Arrays.toString(uwu));
        QuickSort(uwu, 0, uwu.length-1);
        System.out.println(Arrays.toString(uwu));
    }
    
    public static void QuickSort(int uwu[], int min, int max){
        if(min<max){
            int pi = pivote(uwu,min,max);
            QuickSort(uwu, min, pi-1);
            QuickSort(uwu, pi + 1, max);
        }
    }
    
    public static int pivote(int uwu[], int min, int max){
        int p1 = min-1, p2 = uwu[max],aux;
        for(int i = min; i < max; i++){
            if(uwu[i]< p2){
                p1++;
                if(p1<i){
                    aux = uwu[i];
                    uwu[i] = uwu[p1];
                    uwu[p1] = aux;
                }
            }
        }
        p1++;
        uwu[max] = uwu[p1];
        uwu[p1] = p2;
        return p1;
    }
}
