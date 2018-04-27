package cl.f3r;

public class Ingrediente {

    private String nombre=null;
    private int cantidad=0; // en gramos
    private int id;

    public Ingrediente(String nombre, int cantidad, int id) {
        this.nombre = nombre;
        this.cantidad = cantidad;
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
