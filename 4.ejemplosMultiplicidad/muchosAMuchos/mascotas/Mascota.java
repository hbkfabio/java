import java.util.ArrayList;

public class Mascota {

    private String nombre;
    private ArrayList<Persona> personas = new ArrayList<Persona>();

    Mascota (String nombre) {

        this.nombre = nombre;
    }

    void mostrarPersonas () {

        for (Persona persona : personas) {

            System.out.println(persona.getNombre());
        }
    }

    void agregarPersona(Persona persona) {

        personas.add(persona);
    }


    void setNombre (String nombre) {

        this.nombre = nombre;
    }

    String getNombre () {

        return nombre;
    }
  




}
