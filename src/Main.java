import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); 

        InterfazUsuario interfaz = new InterfazUsuario();
        Material material = interfaz.obtenerMaterial();
        CondicionesIniciales condiciones = interfaz.obtenerCondicionesIniciales();


        System.out.println("Ingrese el número de iteraciones:");
        int iteraciones = scanner.nextInt(); 

        System.out.println("Ingrese el número de nodos:");
        int numNodos = scanner.nextInt();

        System.out.println("Ingrese el delta de tiempo:");
        double deltaTiempo = scanner.nextDouble(); 

        SimuladorDeCalor simulador = new SimuladorDeCalor();
        double[] temperaturas = simulador.simular(material, condiciones, iteraciones, numNodos, deltaTiempo);

        System.out.println("\nResultados de la simulación:");
        System.out.println("Nodo\tTemperatura");
        for (int i = 0; i < temperaturas.length; i++) {
            System.out.printf("%d\t%.8f%n", i, temperaturas[i]);
        }

        scanner.close(); 
    }
}

/*
Datos de Prueba que use:

Conductividad térmica: 205.0 (W/m·K)
Densidad: 2700.0 (kg/m³)
Calor específico: 900.0 (J/kg·K)
Temperatura inicial: 50.0 (°C)
Temperatura en el borde izquierdo: 100.0 (°C)
Temperatura en el borde derecho: 20.0 (°C)
Iteraciones: 100
Nodos: 10
Delta de tiempo: 0.1 (s)


Resultados Esperados:

0   100.00000000
1   53.88876275
2   50.15804450
3   50.00429957
4   50.00008649
5   49.99994901
6   49.99742027
7   49.90517330
8   47.66674235
9   20.00000000
 */

//Proyecto similar de referencia: https://jeisson.ecci.ucr.ac.cr/concurrente/2021b/proyectos/heat/

/*Descripcion de Proyecto que le pedi a IA :b:
Título: Simulación de transferencia de calor en un material sólido utilizando métodos numéricos.

Descripción General: Este proyecto tiene como objetivo modelar cómo el calor se propaga a través de un material
sólido a lo largo del tiempo y el espacio. Utiliza la ecuación del calor, una ecuación diferencial parcial, para
describir este fenómeno físico. La solución se realiza mediante el método explícito de diferencias finitas, que 
discretiza el tiempo y el espacio en intervalos pequeños para calcular la temperatura en cada punto del material.
 */