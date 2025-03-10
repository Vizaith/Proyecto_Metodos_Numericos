public class Visualizador {
    public void mostrarGraficoASCII(double[] temperaturas) {
        System.out.println("\nDistribución de temperatura (gráfico ASCII):");
        for (double temp : temperaturas) {
            int escala = Math.min((int) temp / 10, 50); // Máximo 50 caracteres
            System.out.print("|");
            for (int i = 0; i < escala; i++) {
                System.out.print("=");
            }
            System.out.println(">");
        }
    }
}

