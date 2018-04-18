class VehiculoConMotor extends Vehiculo {

    int potencia;
    int consumo;

    VehiculoConMotor(int nPlazas, int carga, int potencia, int consumo) {
        super(nPlazas, carga);

        this.potencia = potencia;
        this.consumo = consumo;
    }

    int getPotencia() {
        return potencia;
    }
  
    int getConsumo() {
        return consumo;
    }
}