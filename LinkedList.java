public class LinkedList <E>{

    public Nodo i, f;

    public LinkedList() {
        this.i = null;
        this.f = null;
    }

    public void insertarF(E dato) {
        Nodo q = new Nodo(dato);
        if (i == null) {
            i = q;
            f = q;
        } else {
            if (i.siguiente == null) {
                i.siguiente = q;
                q.anterior = i;
                f = q;
            } else {
                f.siguiente = q;
                q.anterior = f;
                f = q;
            }
        }
    }

    public void insertarI(E dato){
        Nodo q = new Nodo(dato);
        if (i == null) {
            i = q;
            f = q;
        } else {
            i.anterior = q;
            q.siguiente = i;
            i = q;
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
    
    public void eliminarInicio(){
        i = i.siguiente;
    }
    
    public void eliminarFinal(){
        f = f.anterior;
        f.siguiente = null;
    }
    
}
