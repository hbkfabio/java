class Cliente {
    private String nombre;
    public String email;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;

        System.out.println("Estoy en setNombre");
        System.out.println(this.nombre);
    }


    /*
    public void setNombre (String nombre) {
      this.nombre = nombre;
    }

    public String getNombre () {
      return nombre;
    }
    */
}
