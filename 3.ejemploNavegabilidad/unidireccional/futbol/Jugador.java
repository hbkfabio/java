class Jugador {

    private String nombre;
    private int edad;
    private Equipo equipo;
  
    Jugador (String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public void setNombre (String nombre) {

        this.nombre = nombre;
    }
  
    public String getNombre () {

        return nombre;
    }
  
    public void setEdad (int edad) {

        this.edad = edad;
    }
  
    public int getEdad() {

        return edad;
    }
  
    public void setEquipo (Equipo equipo) {

        this.equipo = equipo;
    }
  
    public Equipo getEquipo () {

        return equipo;
    }

}
