package com.company;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        //Crear lista y agregar candidatos
        ArrayList<Candidato> candidatos = new ArrayList();

        candidatos.add(new Candidato("Simon", "Zuniga", "lista1"));
        candidatos.add(new Candidato("Fabio", "Duran", "lista2"));
        candidatos.add(new Candidato("Fabian", "Ramirez", "lista3"));


        //Leer votos mientras voto no sea F
        Scanner sc = new Scanner(System.in);

        char voto = 'F';

        do {
            System.out.println("INGRESE SU VOTO (A, B o C. F para salir)");
            System.out.println("[A] "+candidatos.get(0).getNombre()+" "+candidatos.get(0).getApellido()+" "+candidatos.get(0).getLista());
            System.out.println("[B] "+candidatos.get(1).getNombre()+" "+candidatos.get(1).getApellido()+" "+candidatos.get(1).getLista());
            System.out.println("[C] "+candidatos.get(2).getNombre()+" "+candidatos.get(2).getApellido()+" "+candidatos.get(2).getLista());

            //Leer primer caracter
            voto = sc.next().charAt(0);

            if(voto == 'A'){
                candidatos.get(0).sumarVoto();
            }else if(voto == 'B'){
                candidatos.get(1).sumarVoto();
            }else if(voto == 'C'){
                candidatos.get(2).sumarVoto();
            }else if(voto == 'F'){
                System.out.println("Saliendo...");
            }else{
                System.out.println("Opcion invalida");
            }

        }while(voto != 'F');

        //Obtener votos de cada candidato y sumarlos
        int votos1 = candidatos.get(0).getVotos();
        int votos2 = candidatos.get(1).getVotos();
        int votos3 = candidatos.get(2).getVotos();
        int totalVotos = votos1 + votos2 + votos3;

        //Definir ganador
        Candidato ganador = null;
        int maxVotos = 0;

        for(int i = 0; i < 3; i++){
            if(candidatos.get(i).getVotos() > maxVotos){
                ganador = candidatos.get(i);
                maxVotos = candidatos.get(i).getVotos();
            }
        }

        //Imprimir mensaje de felicitacion
        if(ganador == null){
            System.out.println("Los candidatos no tuvieron ningun voto");
        }else{
            System.out.println("Felicidades a "+ganador.getNombre()+" "+ganador.getApellido()+" de la lista "+ganador.getLista()+", quien gano con "+ganador.getVotos()+" voto(s) de un total de "+totalVotos+" voto(s)!");
        }


    }
}
