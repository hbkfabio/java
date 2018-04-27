package com.company;

import java.util.Scanner;

public class Jugador {

    private String nombre;
    private int numero;

    Jugador(String nombre){
        this.nombre = nombre;
    }

    public void adivinarNumero(){
        Scanner sc = new Scanner(System.in);
        int numero = -1;

        //Pedir numero, Pedir otra vez si el número estaba fuera de rango
        do{
            System.out.println(this.nombre+", ingresa un numero (0-9): ");
            numero = sc.nextInt();

            //Indicar al usuario en caso de que el número esté fuera de rango
            if(numero > 9 || numero < 0){
                System.out.println("El numero debe estar entre 0 y 9...");
            }

        }while(numero > 9 || numero < 0);

        this.numero = numero;
    }

    public String getNombre(){
        return this.nombre;
    }

    public int getNumero(){
        return this.numero;
    }


}
