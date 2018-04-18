public class Main {

  public static void main(String[] args) {
    Jugador j;
    Equipo e;
    
    j = new Jugador("Pepito", 33);
    e = new Equipo("Universidad de Chile");
    j.setEquipo(e);

    System.out.println("Jugador: " + j.getNombre());
    System.out.println("Edad: " + j.getEdad());
    System.out.println("Equipo: " + j.getEquipo().getNombre());
  }
}
