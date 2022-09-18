public class Reloj {
    public static void main(String[] args) {
        horas(0);
    }
    
    public static void horas(int hora){
        if(hora == 24){
            return;
        }
        minutos(hora, 0);
    }
    
    public static void minutos(int hora, int minuto){
        if(minuto == 60){
            horas(hora+1);
            return;
        }
        if(hora<10){
            System.out.print("0"+hora+":");
        }else{
            System.out.print(hora+":");
        }
        if(minuto<10){
            System.out.println("0"+minuto);
        }else{
            System.out.println(minuto);
        }
        minutos(hora, minuto+1);
    }
    /*
    public static void minutos(int hora, int minuto){
        if(minuto == 60){
            horas(hora+1);
            return;
        }
        segundos(hora, minuto, 0);
    }
    
    public static void segundos(int hora, int minuto, int segundo){
        if(segundo == 60){
            minutos(hora, minuto+1);
            return;
        }
        System.out.println(hora+":"+minuto+":"+segundo);
        segundos(hora, minuto, segundo+1);
    }*/
}
