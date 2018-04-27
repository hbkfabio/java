package com.company;

public class Candidato {
    private String nombre;
    private String apellido;
    private String lista;
    private int votos;

    Candidato(String nombre, String apellido, String lista){
        this.nombre = nombre;
        this.apellido = apellido;
        this.lista = lista;
        this.votos = 0;
    }

    public void sumarVoto(){
        this.votos += 1;
    }

    public String getNombre(){
        return this.nombre;
    }

    public String getApellido(){
        return this.apellido;
    }

    public String getLista(){
        return this.lista;
    }

    public int getVotos(){
        return this.votos;
    }

}
