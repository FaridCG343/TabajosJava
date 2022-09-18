public class ValidarCitas {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingresa la hora de la cita");
        String hora = teclado.next();
        String[] xd = hora.split(":");
        if(ValidarCita(Integer.parseInt(xd[0]), Integer.parseInt(xd[0]), 8)){
            System.out.println("Su cita se ha registrado");
        }else{
            System.out.println("Hora no valida");
        }
    }
    
    public static Boolean ValidarCita(int horaV,int minuto ,int hora){
        if(minuto<0 || minuto>59){
            return false;
        }
        if(hora == 16){
            return hora == horaV;
        }
        if(hora == horaV){
            return true;
        }
        return ValidarCita(horaV, minuto, hora+1);
    }
}
