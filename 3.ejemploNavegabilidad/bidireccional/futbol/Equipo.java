class Equipo {

    private String nombre;
    private Jugador jugador;
  
    Equipo (String nombre) {

        this.nombre = nombre;
    }

    public void setNombre (String nombre) {

        this.nombre = nombre;
    }
  
    public String getNombre () {

        return nombre;
    }
  
    public void setJugador (Jugador jugador) {

        this.jugador = jugador;
    }
  
    public Jugador getJugador () {

        return jugador;
    }
}
