public class Main {
    public static void main(String[] args) {
        // En main se debe usar ComisionEstandar por defecto
        Vendedor empleado = new Vendedor("Frery", 1000.0, new ComisionEstandar());
        empleado.mostrarDetalle();
    }
}