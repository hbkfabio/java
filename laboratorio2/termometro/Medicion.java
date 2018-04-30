public class Medicion {
    private int medida_inicial;
    private int medida1;
    private int medida2;
    private double promedio;
    private Termometro termometro;

    Medicion () {
        termometro = new Termometro();
        //getMedidaInicial();
        //medida_inicial = termometro.getTemperatura();
    }

    public void realizarMediciones () {
        //metodo que reliza las mediciones
        //Primero se agita el termometro y setea en valor inicial
        getMedidaInicial();
        termometro.medir();
        medida1 = termometro.getTemperatura();
        System.out.println("Primera medicion: " + medida1);

        //Segundo paso se agita el termometro y setea en valor inicial
        getMedidaInicial();
        termometro.medir();
        medida2 = termometro.getTemperatura();
        System.out.println("Segunda medicion: " + medida2);
    }

    public void calcularPromedio () {
        promedio = (double)(this.medida1 + this.medida2)/2;
        System.out.println("El promedio de temperaturas es: " + promedio);
    }

    public double getPromedio () {
        return this.promedio;
    }

    public int getMedida1() {
        return this.medida1;
    }

    public int getMedida2() {
        return this.medida2;
    }

    public void getMedidaInicial() {
        //reinicia valor de temperatura del termometro
        termometro.agitar();
        medida_inicial = termometro.getTemperatura();
        System.out.println("Temperatura inicial: " + medida_inicial);

    }
}

