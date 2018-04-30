public class Carrera {
    private Rana[] competidor = new Rana[2];
    private int longitud;
    private String colorGanador;

    Carrera (int longitud) {
        this.longitud = longitud;
    }

    public void setCompetidores (Rana rana, Rana rana2) {
        this.competidor[0] =  rana;
        this.competidor[1] =  rana2;
    }

    public void iniciar () {
        boolean termino = false;
        int indiceGanador = 0;

        while(!termino)
        {
            competidor[0].saltar();
            competidor[1].saltar();

            System.out.println("Rana1: " + competidor[0].getDistancia());
            System.out.println("Rana2: " + competidor[1].getDistancia());

            if (competidor[0].getDistancia() > this.longitud) {
                termino = true;
                indiceGanador = 0;
            } else if (competidor[1].getDistancia() > this.longitud) {
                termino = true;
                indiceGanador = 1;
            }

        }


        System.out.print("Gana la Rana: " + competidor[indiceGanador].getColor());
        System.out.print(" de " + competidor[indiceGanador].getPersona().getNombre());

    }
}
