class Main {

    public static void main (String [] args) {

        Documento documento = new Documento("Texto a Imprimir");
        Documento documento2 = new Documento("Texto a Imprimir Otro");

        Impresora impresora = new Impresora();

        impresora.imprimir(documento);
        impresora.imprimir(documento2);
        impresora.imprimir(new Documento("mas y mas"));
    }
}
