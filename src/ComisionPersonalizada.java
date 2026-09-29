public class ComisionPersonalizada implements EstrategiaComision {
    @Override
    public double calcularComision(double montoVenta) {
        // Frery tiene 5 letras. 5 + 5 = 10% (0.10)
        return montoVenta * 0.10;
    }
}