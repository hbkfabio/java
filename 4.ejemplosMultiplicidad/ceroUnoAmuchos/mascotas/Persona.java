import java.util.ArrayList;

public class Persona {
    private String nombre;
    private ArrayList<Mascota> mascotas = new ArrayList<Mascota>();


    Persona (String nombre) {
        this.nombre = nombre;
    }
  

    void setNombre (String nombre) {

        this.nombre = nombre;
    }
  
    String getNombre () {

        return nombre;
    }
  
    void agregarMascota(Mascota mascota) {

        mascotas.add(mascota);
    }
  
    ArrayList<Mascota> getMascotas () {

        return mascotas;
    }
}
