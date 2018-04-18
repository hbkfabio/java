class Cliente {

    private String nombre;
    private CtaCte cuenta;

    //constructor
    Cliente () {

        cuenta = new CtaCte();

    }

    public void setNombre (String nombre) {

        this.nombre = nombre;
    }

    public String getNombre () {

        return nombre;
    }

    public CtaCte getCtaCte () {

        return cuenta;
    }

}
