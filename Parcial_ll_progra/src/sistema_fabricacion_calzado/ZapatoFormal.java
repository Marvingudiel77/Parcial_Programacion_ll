package sistema_fabricacion_calzado;

class ZapatoFormal implements Zapato {
    private String genero;
    private String materialSuela;
    private String tipoTejido;
    private String diseño;

    public ZapatoFormal(String genero, String materialSuela, String tipoTejido, String diseño) {
        this.genero = genero;
        this.materialSuela = materialSuela;
        this.tipoTejido = tipoTejido;
        this.diseño = diseño;
    }

    @Override
    public void crear() {
        System.out.println("Zapato formal " + genero + " creado con suela de " + materialSuela + ", tejido " + tipoTejido + " y diseño " + diseño + ".");
    }

    @Override
    public Zapato clonar() {
        return new ZapatoFormal(genero, materialSuela, tipoTejido, diseño);
    }
}
