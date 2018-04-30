//clase con la responsabilidad de tener una coleccio de fichas
public class Contenedor {

    //atributos de la clase.
    private FichaPaciente [] Fichas;

    //constructor de la clase
    public Contenedor() {

        //instancia a la coleccion...
        this.Fichas = new FichaPaciente[20];
    }

    //metodo para buscar una ficha por nombre...
    public void BuscarPorNombre(FichaPaciente ficha){

        //para determinar si no se encontro ninguna ficha con el nombre dado
        int cont=0;

        //recorremos la coleccion
        for (FichaPaciente i: Fichas) {
            //evaluamos que la posicion no es vacia y comparamos los nombres
            // llamando al metodo que muestra la informacion
            if (i != null){
                if (i.getNombre().equalsIgnoreCase(ficha.getNombre())){
                    i.MostrarFicha();
                    cont=1;
                    break;
                }
            }

        }

        if (cont==0)
            System.out.println("No se ha encontrado ninguna ficha en el container con el nombre de " + ficha.getNombre());
    }

    //metodo para buscar por peso
    public void BuscarPorPeso(FichaPaciente ficha){

        //para determinar si no se encontro ninguna ficha con el nombre dado
        int cont=0;

        //recorremos la coleccion, no tiene break porque pueden haber
        // mas de una que cumpla con las caracteristicas
        for (FichaPaciente i: Fichas) {

            //evaluamos que la posicion no es vacia y comparamos los
            // pesos llamando al metodo que muestra la informacion
            if (i != null){
                if (i.getPeso()<= ficha.getPeso()){
                    i.MostrarFicha();
                    cont=1;
                }
            }
        }

        if (cont==0)
            System.out.println("No se ha encontrado ninguna ficha en el container con peso menor a " + ficha.getPeso());
    }

    //metodo para buscar por peso
    public void BuscarPorAltura(FichaPaciente ficha){

        //para determinar si no se encontro ninguna ficha con el nombre dado
        int cont=0;

        //recorremos la coleccion, no tiene break porque pueden haber mas de
        // una que cumpla con las caracteristicas
        for (FichaPaciente i: this.Fichas) {
            //evaluamos que la posicion no es vacia y comparamos las
            //alturas llamando al metodo que muestra la informacion
            if (i != null){
                if (i.getAltura()< ficha.getAltura()){
                    i.MostrarFicha();
                    cont=1;
                }
            }

        }

        if (cont==0)
            System.out.println("No se ha encontrado ninguna ficha en el container con altura menor a " + ficha.getAltura());
    }

    //metodo para ingresar una ficha, recibe una fecha, busca una
    // posicion vacia y lo ingresa, muestra mensaje en caso de estar
    // lleno el array
    public void IngresarFicha(FichaPaciente ficha){

        //para evaluar si esta lleno el array
        int cont=0;
        //for (FichaPaciente i : this.Fichas){
        for (int i=0; i<this.Fichas.length; i++){

            if (this.Fichas[i] == null){
                this.Fichas[i] = ficha;//asignacion
                cont=1;
                break;
            }
        }

        if (cont==0){
            System.out.println("Container lleno!!!");
        }
    }
}