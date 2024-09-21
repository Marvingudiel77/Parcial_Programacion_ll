package sistema_fabricacion_calzado;

public class Ejecutar {
    public static void main(String[] args) {
        FabricaDeZapatos fabrica = new FabricaZapatos();

        Zapato zapatoHombreDeportivo = fabrica.crearZapato("deportivo", "hombre");
        zapatoHombreDeportivo.crear();

        Zapato zapatoMujerFormal = fabrica.crearZapato("formal", "mujer");
        zapatoMujerFormal.crear();

        // Uso de Singleton
        FabricaDeZapatosSingleton fabricaSingleton = FabricaDeZapatosSingleton.getInstancia();
        Zapato zapatoNinoDeportivo = fabricaSingleton.crearZapato("deportivo", "niño");
        zapatoNinoDeportivo.crear();
    }
}

