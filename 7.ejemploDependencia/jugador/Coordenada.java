public class Coordenada {

    private int x;
    private int y;

    Coordenada (int x, int y) {
        this.x = x;
        this.y = y;
        System.out.println("Se ha movido a la coordenada: " + this.x + ", " + this.y);
    }
  
    public int getX () {

        return x;
    }
  
    public int getY () {

        return y;
    }

}
