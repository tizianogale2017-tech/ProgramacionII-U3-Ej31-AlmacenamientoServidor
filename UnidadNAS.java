package Ejercicio31_almacenamientoServidor;

public class UnidadNAS extends AlmacenamientoServidor {
    private int bahiasDiscos;

    public UnidadNAS(int capacidadGb, int tasaTransferenciaMb, String proveedor, int bahiasDiscos) {
        super(capacidadGb, tasaTransferenciaMb, proveedor);
        this.bahiasDiscos = bahiasDiscos;
    }

    @Override
    public double calcularCostoMensual() {
        return bahiasDiscos * 6000.0;
    }
}
