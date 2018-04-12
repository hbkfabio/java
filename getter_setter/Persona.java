/* Clase persona:
 * atributos publicos y privados
 *
 * Uso de metodos Setter y Getter
 *
 * Clase tiene dos constructores:
 *  Explicito: public Persona(String nombre)
 *  Por defecto: public Persona()
 *
 */

public class Persona {

    public int edad;
    public String nombre;
    private String apellido;


    public void setApellido(String apellido) {

        this.apellido = apellido;
    }

    public String getApellido() {

        return apellido;
    }

    public Persona() {

        this.edad = 30;
        this.nombre = "anonimo";

    }

    public Persona(String nombre){

        this.edad = 10;
        this.nombre = nombre;

    }
}
