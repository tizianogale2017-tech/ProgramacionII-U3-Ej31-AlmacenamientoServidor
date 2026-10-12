package Ejercicio31_almacenamientoServidor;

public class AlmacenamientoServidor {
    protected int capacidadGb;
    protected int tasaTransferenciaMb;
    protected String proveedor;

    public AlmacenamientoServidor(int capacidadGb, int tasaTransferenciaMb, String proveedor) {
        this.capacidadGb = capacidadGb;
        this.tasaTransferenciaMb = tasaTransferenciaMb;
        this.proveedor = proveedor;
    }

    public double calcularCostoMensual() {
        return 0;
    }

    public double calcularSegundosTransferencia(double gigas) {
        return gigas * 1024 / tasaTransferenciaMb;
    }

    public void mostrarDetalle() {
        System.out.println(getClass().getSimpleName() + " (" + proveedor + "): " + capacidadGb + " GB a "
                + tasaTransferenciaMb + " MB/s | costo mensual: " + calcularCostoMensual());
    }
}
