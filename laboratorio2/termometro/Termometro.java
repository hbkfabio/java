public class Termometro {
    private int temperatura;

    public Termometro() {
        this.temperatura = 0;
    }

    public void agitar() {
        // genera valor entre 0 y 10
        this.temperatura = (int)((Math.random() * 10) + 1);
    }

    public void medir() {
        // genera valor entre 35 y 40
        this.temperatura = (int) (Math.random() * (40 - 34)) + 35;
    }

    public int getTemperatura() {
        return temperatura;
    }
}
