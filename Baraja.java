import java.util.Random;
/**
 *
 * @author uwu
 */
public class Baraja {
    public static void main(String[] args) {
        int[] xd = new int[10];
        Random uwu = new Random();
        for (int i = 0; i<xd.length; i++){
            xd[i] = uwu.nextInt(0, 100);
        }
        int[] ordenado = new int[xd.length];
        if(xd[0]<xd[1]){
            ordenado[0] = xd[0];
            ordenado[1] = xd[1];
        }else{
            ordenado[0] = xd[1];
            ordenado[1] = xd[0];
        }
        for(int i = 2; i< xd.length; i++){
            int aux = -1;
            for(int j = 0; j<i; j++){
                if(xd[i]<ordenado[j]){
                    aux = j;
                    break;
                }
            }
            if(aux == -1){
                ordenado[i] = xd[i];
            }else{
                for(int j = i; j>=aux+1; j--){
                    ordenado[j] = ordenado[j-1];
                }
                ordenado[aux] = xd[i];
            }
        }
        for(int i = 0; i<ordenado.length; i++){
            System.out.print(ordenado[i]+ "-");
        }
    }
}
