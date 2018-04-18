class Automovil {

    private String marca;
    private Radio radio;
    private Motor motor;

    Automovil () {}

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
  
    public void ensamblar(Radio radio, Motor motor) {
        this.radio = radio;
        this.motor = motor;
    }

}
