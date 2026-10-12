package Ejercicio31_almacenamientoServidor;

public class ArregloSAN extends AlmacenamientoServidor {
    private int cantidadControladoras;

    public ArregloSAN(int capacidadGb, int tasaTransferenciaMb, String proveedor, int cantidadControladoras) {
        super(capacidadGb, tasaTransferenciaMb, proveedor);
        this.cantidadControladoras = cantidadControladoras;
    }

    @Override
    public double calcularCostoMensual() {
        return cantidadControladoras * 45000.0;
    }
}
