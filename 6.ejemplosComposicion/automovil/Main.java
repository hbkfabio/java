public class Main {

    public static void main(String[] args) {
        Automovil a;

        a = new Automovil();
        a.setMarca("Toyota");
        a.getRadio().setMarca("Pionner");
        a.getMotor().setCilindros(2000);

        System.out.println("Automovil marca: " + a.getMarca());
        System.out.println("Radio: " + a.getRadio().getMarca());
        System.out.println("Cilindrada: " + a.getMotor().getCilindros());

        // Elimina objeto automovil.
        System.out.println("Eliminado los objetos...");
        a = null;



        // Las partes no existen!
  }
}
