public class Main {

  public static void main(String[] args) {
    Cliente c;
    
    c = new Cliente();
    c.setNombre("Pepito");
    
    /*
     * Utilizando los métodos de la clase CtaCte
     * modifica el estado del saldo.
     */
    c.getCtaCte().setSaldo(100000);
    
    System.out.println("Cliente: " + c.getNombre());
    System.out.println("Saldo: " + c.getCtaCte().getSaldo());
  }
}
