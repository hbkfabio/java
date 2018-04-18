public class Main {

    public static void main(String[] args) {
        Automovil a;
        Radio r;
        Motor m;

        a = new Automovil();
        a.setMarca("Chevrolet");

        r = new Radio("Sony");
        m = new Motor(1600);

        a.ensamblar(r, m);

        System.out.println("Automovil marca: " + a.getMarca());
        System.out.println("Radio: " + a.getRadio().getMarca());
        System.out.println("Cilindrada: " + a.getMotor().getCilindros());

        // Elimina objeto automovil.
        System.out.println("Eliminando objeto automovil...");
        a = null;

        // Las partes aun existen.
        System.out.println();
        System.out.println("Los objetos que aun existen son:");
        System.out.println("Radio: " + r.getMarca());
        System.out.println("Cilindrada: " + m.getCilindros());
    }
}
