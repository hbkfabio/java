import java.util.Scanner;

public class Main {
    public static void main (String[] args) {
        Carrera carrera;
        Scanner sc = new Scanner(System.in);
        Persona persona;
        Persona persona2;
        Rana rana;
        Rana rana2;

        System.out.print("Longitud (15/20/30): ");
        int longitud = sc.nextInt();

        /* Instanciamos la carrera */
        carrera = new Carrera(longitud);

        /* Primera Rana */
        System.out.print("Nombre del primer dueño: ");
        persona = new Persona(sc.next());

        System.out.print("Color primera rana: ");
        rana = new Rana (sc.next(), persona);

        /* Segunda Rana */
        System.out.print("Nombre del segundo dueño: ");
        persona2 = new Persona(sc.next());

        System.out.print("Color segunda rana: ");
        rana2 = new Rana (sc.next(), persona2);

        /* Asignar los competidores */
        carrera.setCompetidores(rana, rana2);

        /* Iniciamos la carrera */
        carrera.iniciar();
    }
}

