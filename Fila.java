public class Fila {

    private int frente;
    private int finalF;
    private int[] fila;
    private int tam;

    public Fila(int tam) {
        this.tam = tam;
        fila = new int[tam];
        frente = -1;
        finalF = -1;
    }

    public void add(int num) {
        if (finalF == tam - 1) {
            if (frente == 0) {
                System.out.println("Fila llena");
            } else {
                finalF = 0;
                fila[finalF] = num;
            }
        } else {
            if (frente == -1) {
                frente = 0;
                finalF = 0;
                fila[finalF] = num;
                
            } else {
                if (finalF + 1 == frente) {
                    System.out.println("Fila llena");
                } else {
                    finalF++;
                    fila[finalF] = num;
                }
            }

        }

    }

    public void pop() {
        if (frente == -1) {
            System.out.println("No se puede eliminar, la fila esta vacia");
        } else {
            if (frente == finalF) {
                finalF = -1;
                frente = -1;
            } else {
                if (frente == tam - 1) {
                    frente = 0;
                } else {
                    frente++;
                }
            }
        }
    }

    public int peek() {
        return fila[frente];
    }

    @Override
    public String toString() {
        String cadena = "Elementos: ";
        if (frente != -1) {
            if (frente <= finalF) {
                for (int i = frente; i <= finalF; i++) {
                    cadena += fila[i] + " ";
                }
            } else {
                for (int i = frente; i < tam; i++) {
                    cadena += fila[i] + " ";
                }
                for (int i = 0; i <= finalF; i++) {
                    cadena += fila[i] + " ";
                }
            }
        }

        return cadena + " Frente: " + frente + " Final: " + finalF;
    }
}
