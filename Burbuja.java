import java.util.Random;

/**
 *
 * @author uwu
 */
public class Burbuja {
    public static void main(String[] args) {
        int aux; 
        boolean uwunt = true;
         int[] xd = new int[10];
        Random uwu = new Random();
        for (int i = 0; i<xd.length; i++){
            xd[i] = uwu.nextInt(0, 100);
        }
        while(uwunt){
            uwunt = false;
            for(int i = 0; i < xd.length-1; i++){
                if(xd[i] > xd[i+1]){
                    aux = xd[i];
                    xd[i] = xd[i+1];
                    xd[i+1] = aux;
                    uwunt = true;
                }
            }
        }
        for(int i = 0; i < xd.length; i++){
            System.out.print(xd[i]+"-");
        }
    }
    
}
