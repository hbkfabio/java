class Producto {
    /**
    * Código del producto.
    */
    int codigo;
    /**
    * Descripción del producto.
    */
    String descripcion;
    /**
    * Precio del producto.
    */
    double precio;
  
    /**
       * Constructor con 3 parámetros.
       * @param codigo Código del producto.
       * @param descripcion Descripción del producto.
       * @param precio Precio del producto.
     */

    Producto (int codigo, String descripcion, double precio) {
        this.codigo = codigo;
        this.descripcion = descripcion;
        this.precio = precio;
    }

    /**
       * Constructor con 2 parámetros.
       * @param codigo Código del producto.
       * @param descripcion Descripción del producto.
     */

    Producto (int codigo, String descripcion) {
        this.codigo = codigo;
        this.descripcion = descripcion;
    }
  
    /**
    * Fija el precio del producto.
    * @param precioNuevo Nuevo precio del producto.
    */
    void fijarPrecio(double precioNuevo) {

        precio = precioNuevo;
    }
  
    /**
    * Devuelve el precio del producto.
    * @return Devuelve el precio del producto.
    */
    double obtenerPrecio() {

        return precio;
    }
  
    /**
    * Devuelve la descripción del producto.
    * @return Devuelve la descripción del producto.
    */
    String obtenerDescripcion() {

        return descripcion;
    }
}