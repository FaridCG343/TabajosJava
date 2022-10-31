public class SumaLL {
    static Scanner teclado = new Scanner(System.in);
    public static void main(String[] args) {
        int dato;
        LinkedList<Integer> l1 = new LinkedList<>(), l2 = new LinkedList<>(), a1 = new LinkedList<>(), a2 = new LinkedList<>();
        System.out.println("Ingresa la longitud de la primera lista");
        int len = teclado.nextInt();
        System.out.println("Ingresa los valores");
        for(int i = 0; i < len; i++){
            dato = teclado.nextInt();
            l1.insertarI(dato);
            a1.insertarI(dato);
        }
        
        System.out.println("Ingresa la longitud de la segunda lista");
        len = teclado.nextInt();
        System.out.println("Ingresa los valores");
        for(int i = 0; i < len; i++){
            dato = teclado.nextInt();
            l2.insertarI(dato);
            a2.insertarI(dato);
        }
        int suma;
        LinkedList sum;
        
        if(l1.getLength()>=l2.getLength()){
            
            sum = sumaLL(a1, a2);
            suma = sumaint(l1, l2);
        }else{
            
            sum = sumaLL(a2, a1);
            suma = sumaint(l2, l1);
        }
        System.out.println(suma);
        System.out.println(sum.recorrer());
    }
    
    public static int sumaint(LinkedList<Integer>l1, LinkedList<Integer>l2){
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
    
    public static LinkedList<Integer> sumaLL(LinkedList<Integer>l1, LinkedList<Integer>l2){
        int sig = 0, aux;
        LinkedList<Integer> res = new LinkedList<>();
        while(l2.getLength()>0){
            aux = l1.getFV() + l2.getFV();
            if(sig>0){
                aux+=sig;
                sig = 0;
            }
            if(aux>9){
                sig = (int)aux/10;
                res.insertarF((int)aux%10);
            }else{
                res.insertarF(aux);
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
                res.insertarF((int)aux%10);
            }else{
                res.insertarF(aux);
            }
            l1.eliminarFinal();
        }
        if(sig>0){
            res.insertarF(sig);
        }
        System.out.println(res.recorrer());
        return res;
    }
}
