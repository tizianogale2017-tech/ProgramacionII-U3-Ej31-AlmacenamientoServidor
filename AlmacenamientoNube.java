package Ejercicio31_almacenamientoServidor;

public class AlmacenamientoNube extends AlmacenamientoServidor {
    private double costoPorGbMensual;

    public AlmacenamientoNube(int capacidadGb, int tasaTransferenciaMb, String proveedor, double costoPorGbMensual) {
        super(capacidadGb, tasaTransferenciaMb, proveedor);
        this.costoPorGbMensual = costoPorGbMensual;
    }

    @Override
    public double calcularCostoMensual() {
        return capacidadGb * costoPorGbMensual;
    }
}
