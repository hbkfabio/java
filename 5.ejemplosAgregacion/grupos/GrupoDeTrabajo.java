import java.util.ArrayList;

class GrupoDeTrabajo {

    private ArrayList<Persona> miembros = new ArrayList<Persona>();

    GrupoDeTrabajo () {}


    public void agregarMiembro(Persona persona) {

        miembros.add(persona);

    }
  

    public ArrayList<Persona> getMiembros() {

        return miembros;

    }
  
    /*
    public void mostrarMiembros() {
        for (int x=0; x<miembros.size(); x++) {
          System.out.println(miembros.get(x).getNombre());
        }

    }*/
}
