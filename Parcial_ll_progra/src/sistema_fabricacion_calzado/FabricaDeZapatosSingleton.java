package sistema_fabricacion_calzado;

class FabricaDeZapatosSingleton {
    private static FabricaDeZapatosSingleton instancia;

    private FabricaDeZapatosSingleton() {}

    public static FabricaDeZapatosSingleton getInstancia() {
        if (instancia == null) {
            instancia = new FabricaDeZapatosSingleton();
        }
        return instancia;
    }

    public Zapato crearZapato(String tipo, String genero) {

        ZapatoBuilder builder = new ZapatoBuilder();
        return builder.setMaterialSuela("Goma")
                .setTipoTejido("Malla")
                .setDiseño("Moderno")
                .build(tipo, genero);
    }
}

