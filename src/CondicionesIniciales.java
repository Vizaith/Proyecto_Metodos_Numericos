public class CondicionesIniciales {
    private double temperaturaInicial;
    private double temperaturaBordeIzquierdo;
    private double temperaturaBordeDerecho;

    public CondicionesIniciales(double temperaturaInicial, double temperaturaBordeIzquierdo, double temperaturaBordeDerecho) {
        this.temperaturaInicial = temperaturaInicial;
        this.temperaturaBordeIzquierdo = temperaturaBordeIzquierdo;
        this.temperaturaBordeDerecho = temperaturaBordeDerecho;
    }

    public double getTemperaturaInicial() {
        return temperaturaInicial;
    }

    public double getTemperaturaBordeIzquierdo() {
        return temperaturaBordeIzquierdo;
    }

    public double getTemperaturaBordeDerecho() {
        return temperaturaBordeDerecho;
    }
}
