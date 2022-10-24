public class LinkedList<E> {

    private Nodo i, f;
    private int length;

    public LinkedList() {
        this.i = null;
        this.f = null;
        this.length = 0;
    }

    public void insertarF(E dato) {
        Nodo q = new Nodo(dato);
        if (i == null) {
            i = q;
            f = q;
            length++;
        } else {
            if (i.siguiente == null) {
                i.siguiente = q;
                q.anterior = i;
                f = q;
                length++;
            } else {
                f.siguiente = q;
                q.anterior = f;
                f = q;
                length++;
            }
        }
    }

    public void insertarI(E dato) {
        Nodo q = new Nodo(dato);
        if (i == null) {
            i = q;
            f = q;
            length++;
        } else {
            i.anterior = q;
            q.siguiente = i;
            i = q;
            length++;
        }
    }

    public String recorrer() {
        String cadena = "";
        Nodo aux = i;
        while (aux != null) {
            cadena += aux.dato + " ";
            aux = aux.siguiente;
        }
        return cadena;
    }

    public String recorrerInv() {
        String cadena = "";
        Nodo aux = f;
        while (aux != null) {
            cadena += aux.dato + " ";
            aux = aux.anterior;
        }
        return cadena;
    }

    public void eliminarInicio() {
        if (i != null) {
            i = i.siguiente;
            length--;
        }
    }

    public void eliminarFinal() {
        if (length != 0) {
            f = f.anterior;
            f.siguiente = null;
            length--;
        }
    }

    public E getI() {
        return (E) i.dato;
    }

    public E getF() {
        return (E) f.dato;
    }

    public int getLength() {
        return length;
    }

    public E getAt(int posicion) {
        if (posicion < 0 || posicion > length) {
            return null;
        }
        Nodo aux = i;
        while (posicion != 1) {
            posicion--;
            aux = aux.siguiente;
        }
        return (E) aux.dato;
    }

    public void popAt(int posicion) {
        if (posicion < 0 || posicion > length) {
            return;
        }
        if(length==1){
            this.eliminarFinal();
            return;
        }
        if(posicion==length){
            this.eliminarFinal();
            return;
        }
        Nodo aux = i;
        while (posicion != 1) {
            posicion--;
            aux = aux.siguiente;
        }
        Nodo ant = aux.anterior;
        Nodo sig = aux.siguiente;
        ant.siguiente = sig;
        sig.anterior = ant;
        length--;
    }
}
