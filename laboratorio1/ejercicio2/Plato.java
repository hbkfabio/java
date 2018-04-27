package cl.f3r;

import java.util.ArrayList;

public class Plato {

    private String nombre;
    private ArrayList<Ingrediente> listaIngredientesNecesarios;
    private String tipo_plato = null;
    private float calificacion = 0;
    private int cant_comensales = 0;

    // al momento de crear un plato se le asocia los ingredientes que esté necesita
    public Plato(String nombre, ArrayList<Ingrediente> listaIngredientesNecesarios, int cant_comensales) {
        this.nombre = nombre;
        this.listaIngredientesNecesarios = listaIngredientesNecesarios;
        this.cant_comensales = cant_comensales;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Ingrediente> getListaIngredientesNecesarios() {
        return listaIngredientesNecesarios;
    }

    public void setListaIngredientesNecesarios(ArrayList<Ingrediente> listaIngredientesNecesarios) {
        this.listaIngredientesNecesarios = listaIngredientesNecesarios;
    }

    public String getTipo_plato() {
        return tipo_plato;
    }

    public void setTipo_plato(String tipo_plato) {
        this.tipo_plato = tipo_plato;
    }

    public float getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(float calificacion) {
        this.calificacion = calificacion;
    }
}
