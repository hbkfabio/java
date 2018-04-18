public class Main {

    public static void mostrarPrecio(Producto p) {
      System.out.println(p.obtenerDescripcion() + " " + p.obtenerPrecio() + " pesos");
    }

    public static void main(String[] args) {
      Producto sal;
      ProductoGranel mango, salmon;

      // crea los productos.
      sal = new Producto(80005355, "Sal", 500);

      salmon = new ProductoGranel(80005373, "Salmón", 3500, 0.850);
      mango = new ProductoGranel(80005312, "Mango", 1200, 0.500);

      // Muestra el precio de los tres productos.
      mostrarPrecio(sal);
      //System.out.println(sal.obtenerDescripcion() + " " + sal.obtenerPrecio() + " pesos");

      // Para objetos de la clase ProductoGranel se usa el operador
      // de conversión (casting) para cambiar el tipo de una variable a otro
      // tipo compatible.
      mostrarPrecio((Producto) salmon);
      mostrarPrecio((Producto) mango);
      //System.out.println(salmon.obtenerDescripcion() + " " + salmon.obtenerPrecio() + " pesos");
      //System.out.println(mango.obtenerDescripcion() + " " + mango.obtenerPrecio() + " pesos");
    }
}
