public class Sandwich {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de alumnos");
        int cant = teclado.nextInt();
        Stack<Integer> sandwich = new Stack<>();
        Fila alumnos = new Fila(cant);
        System.out.println("Ingrese la preferencia de los alumnos");
        int p;
        for (int i = 0; i < cant; i++) {
            p = teclado.nextInt();
            alumnos.add(p);
        }
        System.out.println("Ingrese el tipo de sandwich");
        for (int i = 0; i < cant; i++) {
            p = teclado.nextInt();
            sandwich.add(p);
        }
        int cont = 0;
        while (true) {
            if (sandwich.isEmpty()) {
                break;
            } else {
                if (alumnos.peek() == sandwich.peek()) {
                    alumnos.pop();
                    sandwich.pop();
                    cont = 0;
                } else {
                    if (cont == sandwich.size()) {
                        break;
                    }
                    int temp = alumnos.peek();
                    alumnos.pop();
                    alumnos.add(temp);
                    cont++;
                }
            }
        }
        System.out.println(sandwich.size());
    }
}
