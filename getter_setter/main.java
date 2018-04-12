/* Ejemplo de uso de Setter y Getter en Clase Persona
 * Instancia a dos clases creando dos objetos distintos
 */

public class main {

    public static void main(String args[] ){

        Persona p1 = new Persona();

        Persona p2 = new Persona("Pepito");

        System.out.println("Persona 2: " + p2.nombre);
        System.out.println("Edad: " + p1.edad);

        System.out.println("Persona 1: " + p1.nombre);
        System.out.println("Edad: " + p2.edad);

    }

}
