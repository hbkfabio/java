class ProductoGranel extends Producto {

    double peso;
  
    ProductoGranel (int codigo, String descripcion, double precio, double peso) {
        super (codigo, descripcion, precio);
    
        this.peso = peso;
    }
  
    double obtenerPrecio() {

        return precio * peso;
    }
  

    double obtenerPeso() {

        return peso;
    }
}
