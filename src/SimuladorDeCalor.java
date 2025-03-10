import java.util.Arrays;

public class SimuladorDeCalor {
    public double[] simular(Material material, CondicionesIniciales condiciones, int iteraciones, int numNodos, double deltaTiempo) {
        double[] temperaturas = new double[numNodos];
        Arrays.fill(temperaturas, condiciones.getTemperaturaInicial());
        temperaturas[0] = condiciones.getTemperaturaBordeIzquierdo();
        temperaturas[numNodos - 1] = condiciones.getTemperaturaBordeDerecho();

        double alpha = material.getConductividadTermica() / (material.getDensidad() * material.getCalorEspecifico());
        double deltaX = 1.0 / (numNodos - 1);

        for (int t = 0; t < iteraciones; t++) {
            double[] nuevasTemperaturas = temperaturas.clone();
            for (int i = 1; i < numNodos - 1; i++) {
                nuevasTemperaturas[i] = temperaturas[i]
                        + (alpha * deltaTiempo / (deltaX * deltaX)) * (temperaturas[i - 1] - 2 * temperaturas[i] + temperaturas[i + 1]);
            }
            temperaturas = nuevasTemperaturas;
        }

        return temperaturas;
    }
}

