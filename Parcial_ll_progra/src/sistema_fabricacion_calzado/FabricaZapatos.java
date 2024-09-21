package sistema_fabricacion_calzado;

class FabricaZapatos implements FabricaDeZapatos {
    @Override
    public Zapato crearZapato(String tipo, String genero) {
        ZapatoBuilder builder = new ZapatoBuilder();
        return builder.setMaterialSuela("Goma")
                .setTipoTejido("Malla")
                .setDiseño("Moderno")
                .build(tipo, genero);
    }
}

