import java.io.FileWriter;
import java.io.IOException;

public class ExportadorCSV {
    public void exportar(double[] temperaturas, String nombreArchivo) {
        try (FileWriter writer = new FileWriter(nombreArchivo)) {
            writer.write("Nodo,Temperatura\n");
            for (int i = 0; i < temperaturas.length; i++) {
                writer.write(i + "," + temperaturas[i] + "\n");
            }
            System.out.println("Archivo guardado como: " + nombreArchivo);
        } catch (IOException e) {
            System.out.println("Error al guardar el archivo: " + e.getMessage());
        }
    }
}
