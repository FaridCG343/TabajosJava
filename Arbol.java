public class Arbol{
    private Nodo<String> R;
    private int altura;
    
    public Arbol(){
        R = null;
        altura = 0;
    }
    
    public Arbol(String dato){
        R = new Nodo<>(dato);
        altura = 1;
    }

    public int getAltura() {
        return altura;
    }
    
    public void insertar(String dato){
        if(R == null){
            R = new Nodo<>(dato);
            altura = 1;
            return;
        }
        insertarString(R, dato, 1);
    }
    
    private void insertarString(Nodo R, String dato, int a){
        a++;
        if(dato.compareToIgnoreCase(R.toString())==0){
            return;
        }
        System.out.println(a);
        if(dato.compareToIgnoreCase(R.toString())>0){ //Mayor
            if(R.der ==null){
                Nodo<String> Q = new Nodo<>(dato);
                R.der = Q;
                altura = a>altura?a:altura;
                return;
            }
            insertarString(R.der, dato, a);
        }else{ //Menor
            if(R.izq ==null){
                Nodo<String> Q = new Nodo<>(dato);
                R.izq = Q;
                altura = a>altura?a:altura;
                return;
            }
            insertarString(R.izq, dato, a);
        }
    }
    
    public void recorrerIn() {
        if(R==null)return;
        In(R);
    }
    
    public void recorrerPre(){
        if(R==null)return;
        Pre(R);
    }

    public void recorrerPos(){
        if(R==null)return;
        Pos(R);
    }
    
    private void In(Nodo Raiz) {
        if (Raiz.izq != null) {
            In(Raiz.izq);
        }
        System.out.print(Raiz + " ");
        if (Raiz.der != null) {
            In(Raiz.der);
        }
    }
    
    private void Pre(Nodo Raiz){
        System.out.print(Raiz + " ");
        if (Raiz.izq != null) {
            Pre(Raiz.izq);
        }
        if (Raiz.der != null) {
            Pre(Raiz.der);
        }
    }

    private void Pos(Nodo Raiz){
        if (Raiz.izq != null) {
            Pos(Raiz.izq);
        }
        if (Raiz.der != null) {
            Pos(Raiz.der);
        }
        System.out.print(Raiz + " ");
    }
}
