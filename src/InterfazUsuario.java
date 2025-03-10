import java.util.Scanner;

public class InterfazUsuario {
    private Scanner scanner;

    public InterfazUsuario() {
        this.scanner = new Scanner(System.in);
    }

    public Material obtenerMaterial() {
        System.out.println("Ingrese la conductividad térmica del material:");
        double conductividad = scanner.nextDouble();
        System.out.println("Ingrese la densidad del material:");
        double densidad = scanner.nextDouble();
        System.out.println("Ingrese el calor específico del material:");
        double calorEspecifico = scanner.nextDouble();
        return new Material(conductividad, densidad, calorEspecifico);
    }

    public CondicionesIniciales obtenerCondicionesIniciales() {
        System.out.println("Ingrese la temperatura inicial del material:");
        double temperaturaInicial = scanner.nextDouble();
        System.out.println("Ingrese la temperatura en el borde izquierdo:");
        double temperaturaIzquierda = scanner.nextDouble();
        System.out.println("Ingrese la temperatura en el borde derecho:");
        double temperaturaDerecha = scanner.nextDouble();
        return new CondicionesIniciales(temperaturaInicial, temperaturaIzquierda, temperaturaDerecha);
    }
}
