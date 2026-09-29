public static void main(String[] args) {
    Vendedor empleado = new Vendedor("Frery", 2000.0, new ComisionPersonalizada());
    empleado.mostrarDetalle();
}