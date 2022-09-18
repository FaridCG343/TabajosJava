public class InsvertirStr {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingresa una cadena");
        String cadena = teclado.next();
        System.out.println("Cadena invertida: "+ invertir(cadena, cadena.length()));
    }
    
    public static String invertir(String cad, int len){
        if(len == 1){
            return Character.toString(cad.charAt(len-1));
        }
        return Character.toString(cad.charAt(len-1))+ invertir(cad, len-1);
    }
}
