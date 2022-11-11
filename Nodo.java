public class Nodo <E>{
    public Nodo anterior,siguiente;
    public E dato;

    public Nodo(E dato) {
        this.anterior = null;
        this.siguiente = null;
        this.dato = dato;
    }
    
    
}

public class Nodo <E>{
    public E dato;
    public Nodo izq, der;

    public Nodo() {
        dato = null;
        izq = null;
        der = null;
    }

    public Nodo(E dato) {
        this.dato = dato;
        izq = null;
        der = null;
    }

    @Override
    public String toString() {
        return (String)dato;
    }
    
    
}
