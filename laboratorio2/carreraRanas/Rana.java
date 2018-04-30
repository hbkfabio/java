public class Rana {
    private String color;
    private int distancia;
    private Persona dueno;

    Rana (String color, Persona dueno) {
        this.color = color;
        this.dueno = dueno;
        this.distancia = 0;
    }

    public String getColor() {
        return this.color;
    }

    public int getDistancia () {
        return this.distancia;
    }

    public Persona getPersona () {
        return this.dueno;
    }

    public void saltar () {
        int salto = (int) (Math.random() * 3) + 1;
        this.distancia = this.distancia + salto;
    }
}
