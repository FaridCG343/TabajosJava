import java.util.Scanner;
import java.util.Stack;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author farid
 */
public class ConvertirPosfija {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String exp = teclado.nextLine();
        char[] xd = exp.toCharArray();
        String posfija = "", aux = "";
        Stack<String> pila = new Stack<>();
        Pattern pattern = Pattern.compile("[a-zA-Z]");
        Matcher matcher;
        for (char x : xd) {
            if (Character.isDigit(x)) {
                aux += Character.toString(x);

            } else {
                matcher = pattern.matcher(Character.toString(x));
                if (matcher.find()) {
                    aux += Character.toString(x);
                } else {
                    switch (x) {
                        case '(' -> {
                            posfija += aux;
                            aux = "";
                            pila.add("(");
                        }
                        case ')' -> {
                            posfija += aux;
                            aux = "";
                            while (!pila.peek().equals("(")) {
                                posfija += pila.pop();
                            }
                            pila.pop();
                        }
                        case '*' -> {
                            posfija += aux;
                            aux = "";
                            if (pila.isEmpty()) {
                                pila.add("*");
                            } else {
                                if ("*".equals(pila.peek()) || "/".equals(pila.peek())) {
                                    posfija += pila.pop();
                                }
                                pila.add("*");

                            }
                        }
                        case '/' -> {
                            posfija += aux;
                            aux = "";
                            if (pila.isEmpty()) {
                                pila.add("/");
                            } else {
                                if ("*".equals(pila.peek()) || "/".equals(pila.peek())) {
                                    posfija += pila.pop();
                                }
                                pila.add("/");

                            }
                        }
                        case '+' -> {
                            posfija += aux;
                            aux = "";
                            if (pila.isEmpty()) {
                                pila.add("+");
                            } else {
                                if (!"(".equals(pila.peek())) {
                                    posfija += pila.pop();
                                }
                                pila.add("+");

                            }
                        }
                        case '-' -> {
                            posfija += aux;
                            aux = "";
                            if (pila.isEmpty()) {
                                pila.add("-");
                            } else {
                                if (!"(".equals(pila.peek())) {
                                    posfija += pila.pop();
                                }
                                pila.add("-");

                            }
                        }
                    }
                }
            }
            //System.out.println(x + " " + posfija + " " + pila.toString());
        }
        posfija+=aux;
        while (!pila.isEmpty()) {
            posfija += pila.pop();
        }
        System.out.println(posfija);
    }

}
