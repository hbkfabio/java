public class Main {

    public static void main (String args[]) {
        VehiculoConMotor moto;
        VehiculoSinMotor mula;
    
        moto = new VehiculoConMotor(2, 150, 250, 25);
    
        // Para imprimir por la terminal.
        System.out.println("Número de plazas: " + moto.getnPlazas());
        System.out.println("Carga: " + moto.getCarga());
        System.out.println("Potencia: " + moto.getPotencia());
        System.out.println("Consumo: " + moto.getConsumo());
        System.out.println("------------------------------------");

        mula = new VehiculoSinMotor(2, 200, "Animal");
        System.out.println("Número de plazas: " + mula.getnPlazas());
        System.out.println("Carga: " + mula.getCarga());
        System.out.println("Tipo tracción: " + mula.getTipoTraccion());
    }
} 
