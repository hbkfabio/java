public class Main {

    public static void main (String args[]) {
        Persona p;
        Mascota m, m1;
    
        p = new Persona("Pepito");
        m = new Mascota("Killer");
        m1 = new Mascota("Lulu");

        p.agregarMascota(m);
        m.agregarPersona(p);

        p.agregarMascota(m1);
        m1.agregarPersona(p);

        System.out.println("Persona: " + p.getNombre());
        System.out.println("Sus mascotas: ");
        p.mostrarMascotas();

        System.out.println();
        System.out.println("Mascota: " + m.getNombre());
        System.out.println("Sus dueños: ");
        m.mostrarPersonas();

        System.out.println();
        System.out.println("Mascota: " + m1.getNombre());
        System.out.println("Sus dueños: ");
        m1.mostrarPersonas();
    }
}

