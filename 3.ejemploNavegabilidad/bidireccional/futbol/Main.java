public class Main {

    public static void main(String[] args) {

        Jugador j;
        Equipo e;
    
        j = new Jugador("Alexis Sanchez", 24);
        e = new Equipo("Manchester");
    
        j.setEquipo(e);
        e.setJugador(j);
    
        System.out.println("Jugador: " + e.getJugador().getNombre());
        System.out.println("Edad: " + e.getJugador().getEdad());
        System.out.println("Equipo: " + j.getEquipo().getNombre());
    }
}
