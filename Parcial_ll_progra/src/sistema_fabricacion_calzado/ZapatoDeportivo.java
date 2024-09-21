package sistema_fabricacion_calzado;

class ZapatoDeportivo implements Zapato {
    private String genero;
    private String materialSuela;
    private String tipoTejido;
    private String diseño;

    public ZapatoDeportivo(String genero, String materialSuela, String tipoTejido, String diseño) {
        this.genero = genero;
        this.materialSuela = materialSuela;
        this.tipoTejido = tipoTejido;
        this.diseño = diseño;
    }

    @Override
    public void crear() {
        System.out.println("Zapato deportivo " + genero + " creado con suela de " + materialSuela + ", tejido " + tipoTejido + " y diseño " + diseño + ".");
    }

    @Override
    public Zapato clonar() {
        return new ZapatoDeportivo(genero, materialSuela, tipoTejido, diseño);
    }
}
