import java.util.ArrayList;

//clase que tiene la informacion de una ficha con los datos solicitados...
public class FichaPaciente {

    private String nombre;
    private double peso;
    private double altura;
    private double BMI;
    private String tipo_sangre;
    private ArrayList<Medico> medicos;

    //constructor de la clase...
    public FichaPaciente(String nombre,
                         double peso,
                         double altura,
                         String tipo_sangre,
                         ArrayList<Medico> medicos) {

        //asignacion de atributos...
        this.nombre = nombre;
        this.peso = peso;
        this.altura = altura;
        this.tipo_sangre = tipo_sangre;
        //obtenemos el valor del BMI
        this.BMI=this.CalculaBMI();
        //todos los medicos registrados
        this.medicos = medicos;
    }

    //metodo que permite mostrar los datos de la ficha...
    public void MostrarFicha(){

        System.out.println("-------------------------------------------");
        System.out.println("Ficha Paciente: " + this.nombre);
        System.out.println("Peso: " + this.peso);
        System.out.println("Altura: " + this.altura);
        System.out.println("BMI: " + this.BMI);
        System.out.println("Tipo de Sangre " + this.tipo_sangre);
        System.out.println("Medicos Tratantes: ");
        for (Medico i: medicos
             ) {
            System.out.println("\t * " + i.getNombre());
        }
        System.out.println("-------------------------------------------");
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getBMI() {
        return BMI;
    }

    public void setBMI(double bMI) {
        BMI = bMI;
    }

    public String getTipo_sangre() {
        return tipo_sangre;
    }

    public void setTipo_sangre(String tipo_sangre) {
        this.tipo_sangre = tipo_sangre;
    }

    //metodo que permite calcular el BMI...
    private double CalculaBMI(){
        double bmi = this.peso/(this.altura*this.altura);
        return bmi;
    }
}
