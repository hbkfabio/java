import java.util.ArrayList;
import java.util.Scanner;

//clase que tiene la responsabilidad de controlar las acciones con respecto al Container...
public class Controlador {

    //para leer desde la entrada estandar...
    private  Scanner leer;
    ArrayList<Medico> medicos = new ArrayList<Medico>();

    public Controlador(){

        //instancia al lector...
        this.leer = new Scanner(System.in);
    }

    //muestra el menu y captura la opcion recogida desde la entrada estandar
    public int Menu(){

        int opcion=0;

        System.out.println("<1> Ingresar Ficha");
        System.out.println("<2> Buscar ficha por nombre de paciente");
        System.out.println("<3> Buscar ficha por peso de paciente");
        System.out.println("<4> Buscar ficha por altura de paciente");
        System.out.println("<5> Salir");
        opcion = this.leer.nextInt();
        return opcion;
    }

    //metodo que permite generar el control de las opciones...
    public void MenuOpciones(Contenedor contenedor){

        //ciclo infinito
        while (true){

            int option = this.Menu();

            switch (option){

                case 1:
                    //ingresamos una ficha...
                    System.out.println("Ingrese un nuevo Paciente: ");
                    contenedor.IngresarFicha(this.CrearFicha());
                    break;
                case 2:
                    //se busca una ficha por nombre...
                    System.out.println("Complete los datos de la ficha para buscar por nombre");
                    contenedor.BuscarPorNombre(this.CrearFichaBN());
                    break;
                case 3:
                    //se busca una ficha por peso...
                    System.out.println("Complete los datos de la ficha para buscar por peso");
                    contenedor.BuscarPorPeso(this.CrearFichaBP());
                    break;
                case 4:
                    //se busca una ficha por nombre...
                    System.out.println("Complete los datos de la ficha para buscar por altura");
                    contenedor.BuscarPorAltura(this.CrearFichaBA());
                    break;
                case 5:
                    System.out.println("Adios!!!");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Ingresa una opcion valida");
            }
        }
    }

    //metodo que permite crear una ficha...
    private FichaPaciente CrearFicha(){

        //solicitud de datos...

        System.out.print("Nombre del paciente: ");
        //Cuidado con este llamado
        //ref: https://stackoverflow.com/questions/13102045/scanner-is-skipping-nextline-after-using-next-or-nextfoo
        this.leer.nextLine();
        String nombre = this.leer.nextLine();
        System.out.print("Peso del paciente: ");
        double peso = this.leer.nextDouble();
        System.out.print("Altura del paciente: ");
        double altura = this.leer.nextDouble();
        System.out.print("Tipo de sangre: ");
        this.leer.nextLine();
        String tipo_sangre = this.leer.nextLine();

        System.out.println("Ingrese los medicos: ");
        crearMedico();

        //retornar una nueva ficha...
        return new FichaPaciente(nombre, peso, altura, tipo_sangre, this.medicos);
    }

    private void crearMedico(){

        boolean activo=true;
        while(activo) {
            System.out.print("Ingrese el medico tratante: ");
            String nombre = this.leer.nextLine();
            Medico m = new Medico(nombre);
            this.medicos.add(m);
            System.out.print("Ingrese N para finalizar el ingreso de Medico ");
            System.out.print("o presione enter para para continuar");
            String opcion = this.leer.nextLine();
            if (opcion.equalsIgnoreCase("n")){
                activo = false;
            }
        }


    }
    //metodo que permite crear una ficha...
    private FichaPaciente CrearFichaBP(){

        //solicitud de datos, solo el peso, el resto es vacio
        System.out.print("Ingrese peso del paciente: ");
        double peso = this.leer.nextDouble();

        //retornar una nueva ficha...
        return new FichaPaciente("", peso, 0, "", null);
    }

    //metodo que permite crear una ficha...
    private FichaPaciente CrearFichaBN(){

        //solicitud de datos, solo el peso, el resto es vacio
        System.out.print("Ingrese nombre del paciente: ");

        this.leer.nextLine();
        String nombre = this.leer.nextLine();

        System.out.print("NOMBRE: " + nombre);


        //retornar una nueva ficha...
        return new FichaPaciente(nombre, 0, 0, "", null);
    }
    //metodo que permite crear una ficha...
    private FichaPaciente CrearFichaBA(){

        //solicitud de datos, solo la altura, el resto es vacio...
        System.out.print("Ingrese altura del paciente: ");
        double altura = this.leer.nextDouble();

        //retornar una nueva ficha...
        return new FichaPaciente("", 0, altura, "", null);
    }
}
