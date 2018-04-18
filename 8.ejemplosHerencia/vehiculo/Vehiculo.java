class Vehiculo {

    int nPlazas;
    int carga;
  
    /**
    * Constructor con 2 parámetros.
    * @param nPlazas Número de plazas.
    * @param carga Carga del vehículo.
    */

    Vehiculo (int nPlazas, int carga) {
        this.nPlazas = nPlazas;
        this.carga = carga;
    }
  
    /**
    * Fija número de plazas del vehículo.
    * @param nPlazas Número de plazas.
    */
    void setnPlazas(int nPlazas) {

        this.nPlazas = nPlazas;
    }
  
    /**
    * Fija la carga máxima del vehículo.
    * @param carga Carga máxima.
    */
    void setCarga(int carga) {

        this.carga = carga;
    };
  
    /**
    * Devuelve el número de plazas.
    * @return el número de plazas.
    */
    int getnPlazas() {

        return nPlazas;
    }
  
    /**
    * Devuelve la carga máxima.
    * @return la carga máxima.
    */
    int getCarga() {

        return carga;
    };
}
