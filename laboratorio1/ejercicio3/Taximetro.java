package cl.f3r;

public class Taximetro {

    private int monto_minimo;
    private float Kms;
    private int minutos;

    public Taximetro(int monto_minimo) {
        this.monto_minimo = monto_minimo;
    }

    public void estadoTaxi(float k, int m){ //muestra tiempo y distancia recorridos
        this.Kms = k;
        this.minutos = m;
        System.out.println("kilometros: "+this.Kms+"  Tiempo: "+minutos+" minutos");
    }

    public void terminarViaje(){
        float value = monto_minimo + (Kms*150) + (minutos*60);
        System.out.println("bandera: "+ monto_minimo+" + Kms*150: "+Kms*150+" + minutos*60: "+minutos*60);
        System.out.println("El viaje ha terminado, se deben pagar: " + value);
    }

    public int getMonto_minimo() {
        return monto_minimo;
    }

    public void setMonto_minimo(int monto_minimo) {
        this.monto_minimo = monto_minimo;
    }

    public float getKms() {
        return Kms;
    }

    public void setKms(int kms) {
        Kms = kms;
    }

    public int getMinutos() {
        return minutos;
    }

    public void setMinutos(int minutos) {
        this.minutos = minutos;
    }
}
