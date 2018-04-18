import java.util.ArrayList;

public class Main {

    public static void main (String args[]) {
        Persona p;
        Mascota m;
        ArrayList<Mascota> mascotas = new ArrayList<Mascota>();
    
        p = new Persona("Pepito");
        m = new Mascota ("Killer");
    
        p.agregarMascota(m);
        p.agregarMascota(new Mascota("Lulu"));
        p.agregarMascota(new Mascota("Tobi"));
    
        mascotas = p.getMascotas();
    
        printMascotas(mascotas);
    }
  
    public static void printMascotas (ArrayList<Mascota> mascotas) {
    /*for (int x=0; x<mascotas.size(); x++) {
      System.out.println(mascotas.get(x).getNombre());
    }*/
    
        for (Mascota m: mascotas) {
            System.out.println(m.getNombre());
     }
    }
}

