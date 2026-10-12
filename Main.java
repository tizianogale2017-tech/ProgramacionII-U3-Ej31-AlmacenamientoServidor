package Ejercicio31_almacenamientoServidor;

public class Main {
    public static void main(String[] args) {
        AlmacenamientoServidor[] equipos = {
            new UnidadNAS(8000, 110, "Synology", 4),
            new ArregloSAN(50000, 800, "Dell EMC", 2),
            new AlmacenamientoNube(10000, 200, "AWS", 25.0)
        };

        for (AlmacenamientoServidor e : equipos) {
            e.mostrarDetalle();
            System.out.printf("   Copiar 100 GB tarda %.1f segundos%n", e.calcularSegundosTransferencia(100));
        }
    }
}
