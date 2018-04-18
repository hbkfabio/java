import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        GrupoDeTrabajo grupo_trabajo;
        Persona p, p1;
        ArrayList<Persona> miembros;

        grupo_trabajo = new GrupoDeTrabajo();
    

        p = new Persona("Pepito");
        grupo_trabajo.agregarMiembro(p);

        p1 = new Persona("Maria");
        grupo_trabajo.agregarMiembro(p1);

        miembros = grupo_trabajo.getMiembros();
        mostrarMiembros(miembros);
        //grupo_trabajo.mostrarMiembros();
    
        // Elimina el grupo de trabajo.
        System.out.println("Eliminando grupo de trabajo...");
        grupo_trabajo = null;
    
        // Las personas aun existen.
        System.out.println();
        System.out.println("Detalle, los objeto persona aun existen");
        System.out.println(p.getNombre());
        System.out.println(p1.getNombre());
    }
  
    public static void mostrarMiembros(ArrayList<Persona> miembros) {
        for (Persona miembro : miembros) {
            System.out.println(miembro.getNombre());
        }
    }
}
