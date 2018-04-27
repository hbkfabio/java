package com.company;

public class Main {

    public static void main(String[] args) {
        //Instanciar computador y generar número al azar
	    Computador pc = new Computador();
	    pc.generarNumero();

	    //Instanciar jugadores
	    Jugador j1 = new Jugador("J1");
        Jugador j2 = new Jugador("J2");
        Jugador j3 = new Jugador("J3");

        //Pedir números a cada jugador
        j1.adivinarNumero();
        j2.adivinarNumero();
        j3.adivinarNumero();

        //Determinar quién adivinó y quién no
        if(pc.getNumero() == j1.getNumero()){
            System.out.println("Felicidades, "+j1.getNombre()+", has adivinado el numero!");
        }else{
            System.out.println("Lo sentimos, "+j1.getNombre()+", no has adivinado!");
        }

        if(pc.getNumero() == j2.getNumero()){
            System.out.println("Felicidades, "+j2.getNombre()+", has adivinado el numero!");
        }else{
            System.out.println("Lo sentimos, "+j2.getNombre()+", no has adivinado!");
        }

        if(pc.getNumero() == j3.getNumero()){
            System.out.println("Felicidades, "+j3.getNombre()+", has adivinado el numero!");
        }else{
            System.out.println("Lo sentimos, "+j3.getNombre()+", no has adivinado!");
        }


        System.out.println("El numero generado era "+pc.getNumero());
    }
}
