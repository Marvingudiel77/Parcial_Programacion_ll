package sistema_fabricacion_calzado;


class ZapatoBuilder {
    private String materialSuela;
    private String tipoTejido;
    private String diseño;

    public ZapatoBuilder setMaterialSuela(String materialSuela) {
        this.materialSuela = materialSuela;
        return this;
    }

    public ZapatoBuilder setTipoTejido(String tipoTejido) {
        this.tipoTejido = tipoTejido;
        return this;
    }

    public ZapatoBuilder setDiseño(String diseño) {
        this.diseño = diseño;
        return this;
    }

    public Zapato build(String tipo, String genero) {
        if (tipo.equals("deportivo")) {
            return new ZapatoDeportivo(genero, materialSuela, tipoTejido, diseño);
        } else if (tipo.equals("formal")) {
            return new ZapatoFormal(genero, materialSuela, tipoTejido, diseño);
        }
        return null;
    }
}
