package cl.f3r;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
	// write your code here
        ArrayList<Ingrediente> list1 = new ArrayList<Ingrediente>();
        ArrayList<Ingrediente> list2 = new ArrayList<Ingrediente>();

        // Los ingredientes asociados a algun plato en particular
        list1.add(new Ingrediente("Aceituna",10, 1));
        list1.add(new Ingrediente("Papa",1000,2));
        list1.add(new Ingrediente("Chocolate",10,3));
        list1.add(new Ingrediente("Choclo",30,4));
        list1.add(new Ingrediente("Harina",800,5));

        Plato P1 = new Plato("Chilcolca",list1,10);

        list2.add(new Ingrediente("Mayonesa",30,6));
        list2.add(new Ingrediente("Vienesa",30,7));
        list2.add(new Ingrediente("Pan",20,8));
        list2.add(new Ingrediente("Palta",30,9));
        list2.add(new Ingrediente("Tomate",30,10));
        list2.add(new Ingrediente("Aceituna",10, 1));

        Plato P2 = new Plato("Completo",list2,1);

        ArrayList<Ingrediente> ingredientesDisponibles = new ArrayList<Ingrediente>();

        ingredientesDisponibles.add(new Ingrediente("Aceituna",100, 1));
        ingredientesDisponibles.add(new Ingrediente("Papa",10000,2));
        ingredientesDisponibles.add(new Ingrediente("Chocolate",10000,3));
        ingredientesDisponibles.add(new Ingrediente("Choclo",300,4));
        ingredientesDisponibles.add(new Ingrediente("Harina",8000,5));
        ingredientesDisponibles.add(new Ingrediente("Mayonesa",3000,6));
        ingredientesDisponibles.add(new Ingrediente("Vienesa",300,7));
        ingredientesDisponibles.add(new Ingrediente("Pan",200,8));
        ingredientesDisponibles.add(new Ingrediente("Palta",300,9));
        ingredientesDisponibles.add(new Ingrediente("Tomate",300,10));

        listarIngredientes(ingredientesDisponibles);

        prepararPlato(ingredientesDisponibles,P1);
        prepararPlato(ingredientesDisponibles,P2);



    }

    public static void prepararPlato(ArrayList<Ingrediente> ingredientes, Plato P){
        boolean flag = true;
        System.out.println("### Este plato {"+P.getNombre()+"} necesita los siguientes ingredientes ###");
        listarIngredientes(P.getListaIngredientesNecesarios());
        // Se evalua si tenemos los ingredientes necesarios
        for (int i =0;i<P.getListaIngredientesNecesarios().size();i++){
            for (int j=0;j<ingredientes.size();j++){
                if (P.getListaIngredientesNecesarios().get(i).getId() == ingredientes.get(j).getId()){
                    if (ingredientes.get(j).getCantidad() < P.getListaIngredientesNecesarios().get(i).getCantidad()){
                        System.out.println("Hay "+ingredientes.get(j).getCantidad()+ " gramos de "+ingredientes.get(j).getNombre()+ " y son necesarios "+P.getListaIngredientesNecesarios().get(i).getCantidad()+" gramos");
                        flag = false;
                    }
                }
            }
        }
        if (flag==false){
            System.out.println("Faltan ingredientes");
        }else{
            System.out.println("#####################################");
            System.out.println("PLATO "+P.getNombre()+" PREPARADO!!");
            System.out.println("#####################################");
            //Se restan los ingredientes utilizados para preparar el plato
            for (int i =0;i<P.getListaIngredientesNecesarios().size();i++) {
                for (int j = 0; j < ingredientes.size(); j++) {
                    Ingrediente I = ingredientes.get(j);
                    if (P.getListaIngredientesNecesarios().get(i).getId() == I.getId()){
                        I.setCantidad(I.getCantidad()-P.getListaIngredientesNecesarios().get(i).getCantidad());
                    }
                }
            }

            listarIngredientes(ingredientes);

        }
    }

    public static void listarIngredientes(ArrayList<Ingrediente> list){
        System.out.println("LISTA INGREDIENTES\n");
        for (int i =0;i<list.size();i++){
            System.out.println(list.get(i).getCantidad()+" g de "+list.get(i).getNombre());
        }
        System.out.println("FIN LISTA INGREDIENTES\n");
    }
}
