import java.util.Arrays;
import java.util.Random;

/**
 *
 * @author uwunt
 */
public class Shell {

    public static void main(String[] args) {
        int uwunt, aux, i;
        boolean cambiesitos;
        int[] xd = new int[10];
        Random uwu = new Random();
        for (int j = 0; j < xd.length; j++) {
            xd[j] = uwu.nextInt(0, 100);
        }
        for (uwunt = xd.length / 2; uwunt != 0; uwunt /= 2) {
            cambiesitos = true;
            while (cambiesitos) {
                cambiesitos = false;
                for (i = uwunt; i < xd.length; i++) {
                    if (xd[i - uwunt] > xd[i]) {
                        aux = xd[i];
                        xd[i] = xd[i - uwunt];
                        xd[i - uwunt] = aux;
                        cambiesitos = true;

                    }
                    System.out.println(Arrays.toString(xd));
                }

            }
        }
        System.out.print(Arrays.toString(xd));
    }
}
