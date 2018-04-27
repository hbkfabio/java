package cl.f3r;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner sc = new Scanner(System.in);
        System.out.println("Bienvenido al taximetro");

        System.out.println("Ingrese la bajada de bandera: ");
        int bajada = sc.nextInt();

        Taximetro T = new Taximetro(bajada);

        System.out.println("Ingrese al velocidad por minuto [Km/min]: ");
        float velocidad = sc.nextFloat();

        int minutos = 1;
        System.out.println("Inicio del viaje, vamos a "+velocidad+ " kilometros cada "+minutos + " minuto");
        //T.estadoTaxi(0,0);

        String readString = sc.nextLine();

        //Para ir avanzando en el recorrido presionamos la tecla enter
        while(readString!=null && !readString.equalsIgnoreCase("f")) {
            //System.out.println(readString);
            //System.out.println("\nF para terminar el recorrido");

            if (readString.isEmpty()) {
                float result = T.getKms() + velocidad;
                T.estadoTaxi(result,T.getMinutos()+1);
            }
            System.out.println("Presione enter para avanzar, para terminar agregar una F");
            if (sc.hasNextLine()) {
                readString = sc.nextLine();
            } else {
                readString = null;
            }
        }

        T.terminarViaje();

    }
}
