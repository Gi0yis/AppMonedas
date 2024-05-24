import java.util.Scanner;

public class ConvertirMoneda extends Moneda {
    private double monedaConvertida;
    private static final Scanner cantidadMoneda = new Scanner(System.in);

    public ConvertirMoneda(Moneda miMoneda) {
        super(miMoneda);
    }

    public void operarMultiplicar() {
        System.out.print("Ingrese la cantidad a convertir: ");
        setCantidad(cantidadMoneda.nextDouble());
        this.monedaConvertida = getCantidad() * getValor();
    }

    public double getMonedaConvertida() {
        return monedaConvertida;
    }

    public void setMonedaConvertida(double monedaConvertida) {
        this.monedaConvertida = monedaConvertida;
    }
}
