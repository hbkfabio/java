class Automovil {

    private String marca;
    private Radio radio;
    private Motor motor;

    Automovil () {
        radio = new Radio();
        motor = new Motor();
    }

    public Radio getRadio() {

        return radio;

    }

    public Motor getMotor() {

        return motor;
    }

    public String getMarca() {

        return marca;
    }
  

    public void setMarca(String marca) {

        this.marca = marca;
    }
}
