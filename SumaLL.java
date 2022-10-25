public class SumaLL {
    static Scanner teclado = new Scanner(System.in);
    public static void main(String[] args) {
        int dato;
        LinkedList<Integer> l1 = new LinkedList<>();
        System.out.println("Ingresa la longitud de la primera lista");
        int len = teclado.nextInt();
        System.out.println("Ingresa los valores");
        for(int i = 0; i < len; i++){
            dato = teclado.nextInt();
            l1.insertarF(dato);
        }
        LinkedList<Integer> l2 = new LinkedList<>();
        System.out.println("Ingresa la longitud de la segunda lista");
        len = teclado.nextInt();
        System.out.println("Ingresa los valores");
        for(int i = 0; i < len; i++){
            dato = teclado.nextInt();
            l2.insertarF(dato);
        }
        int suma;
        if(l1.getLength()>=l2.getLength()){
            suma = calcularSuma(l1, l2);
        }else{
            suma = calcularSuma(l2, l1);
        }
        System.out.println(suma);
    }
    
    public static int calcularSuma(LinkedList<Integer>l1, LinkedList<Integer>l2){
        int sig = 0, aux;
        String res = "";
        while(l2.getLength()>0){
            aux = l1.getFV() + l2.getFV();
            if(sig>0){
                aux+=sig;
                sig = 0;
            }
            if(aux>9){
                sig = (int)aux/10;
                res += (int)aux%10;
            }else{
                res += aux;
            }
            l1.eliminarFinal();
            l2.eliminarFinal();
        }
        while(l1.getLength()>0){
            aux = l1.getFV();
            if(sig>0){
                aux += sig;
                sig = 0;
            }
            if(aux>9){
                sig = (int)aux/10;
                res += (int)aux%10;
            }else{
                res += aux;
            }
            l1.eliminarFinal();
        }
        if(sig>0){
            res+=sig;
        }
        char[] temp = res.toCharArray();
        res = "";
        for(int i = temp.length-1; i>=0; i--){
            res += Character.toString(temp[i]);
        }
        return Integer.parseInt(res);
    }
}
