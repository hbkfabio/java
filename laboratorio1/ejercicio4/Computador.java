package com.company;

import java.util.Random;

public class Computador {
    private int numero;
    private Random rn;

    Computador(){
        this.rn = new Random();
    }

    public void generarNumero(){
        //Generar número entre 0 y 9
        this.numero = rn.nextInt(10);
    }

    public int getNumero(){
        return this.numero;
    }
}
