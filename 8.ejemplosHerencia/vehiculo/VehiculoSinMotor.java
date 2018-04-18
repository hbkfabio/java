class VehiculoSinMotor extends Vehiculo {

    String tipoTraccion;

    VehiculoSinMotor(int nPlazas, int carga, String tipoTraccion) {
        super(nPlazas, carga);

        this.tipoTraccion = tipoTraccion;

    }
  

    String getTipoTraccion() {

        return tipoTraccion;

    }
}
