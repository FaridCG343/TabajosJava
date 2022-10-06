public class Pila {

    private int[] pila;
    private int tope;
    private int max;

    public Pila(int max) {
        this.max = max - 1;
        tope = -1;
        pila = new int[max];
    }

    public boolean isEmpty() {
        return tope == -1;
    }

    public boolean isFull() {
        return tope == max;
    }

    public void add(int dato) {
        if (isFull()) {
            System.out.println("Pila llena");
        } else {
            tope++;
            pila[tope] = dato;
        }
    }

    public void pop() {
        if (isEmpty()) {
            System.out.println("No se puede eliminar Pila vacia");
        } else {
            tope--;
        }
    }

    public int peek() {
        return pila[tope];
    }

    @Override
    public String toString() {
        String cad = "";
        if (!isEmpty()) {
            for (int i = 0; i<=tope; i++) {
                cad += pila[i] + " ";
            }
        }
        return "Elementos: " + cad;
    }

}
