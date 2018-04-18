public class Main {

  public static void main(String[] args) {
    Cliente cliente;
    
    cliente = new Cliente();
    
    /* 
     * Asignar valor directamente al atributo nombre.
     * Al compilar arrojará un error por intentar manipular
     * directamente un atributo private.
     */
    
    //cliente.nombre = "Pepito";
    
    /*
     * La forma correcta es utilizar el método
     * implementado para tal comportamiento.
     */

    //cli1.setNombre("Fabio");
    
    /* 
     * Acceso directo a atributo email.
     */

    cliente.setNombre("pepito");

    cliente.email = "pepito@utalca.cl";
    
    /*
     * Mostrar valores de los atributos.
     */
     
    //System.out.println("Nombre: " + cliente.getNombre());
    //System.out.println("Email: " + cliente.email);
  }
}
