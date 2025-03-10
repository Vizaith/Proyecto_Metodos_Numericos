public class Material {
    private double conductividadTermica;
    private double densidad;
    private double calorEspecifico;

    public Material(double conductividadTermica, double densidad, double calorEspecifico) {
        this.conductividadTermica = conductividadTermica;
        this.densidad = densidad;
        this.calorEspecifico = calorEspecifico;
    }

    public double getConductividadTermica() {
        return conductividadTermica;
    }

    public double getDensidad() {
        return densidad;
    }

    public double getCalorEspecifico() {
        return calorEspecifico;
    }
}
