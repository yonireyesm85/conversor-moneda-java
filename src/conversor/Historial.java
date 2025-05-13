package conversor;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Historial {

    private static final String ARCHIVO = "historial_conversiones.txt";

    public static void guardar(String linea) {
        try (PrintWriter escritor = new PrintWriter(new FileWriter(ARCHIVO, true))) {
            escritor.println(linea);
        } catch (IOException e) {
            System.out.println("Error al guardar en el historial: " + e.getMessage());
        }
    }
    public static void mostrarHistorial() {
        System.out.println("\n--- Historial de conversiones ---");
        try (BufferedReader lector = new BufferedReader(new java.io.FileReader(ARCHIVO))) {
            String linea;
            while ((linea = lector.readLine()) != null) {
                System.out.println(linea);
            }
        } catch (IOException e) {
            System.out.println("No se pudo leer el historial: " + e.getMessage());
        }
    }
    // Limpia el historial al iniciar una nueva sesión
    public static void limpiarHistorial() {
        try (PrintWriter escritor = new PrintWriter(new FileWriter(ARCHIVO))) {
            // Al no escribir nada, se limpia el archivo
        } catch (IOException e) {
            System.out.println("No se pudo limpiar el historial: " + e.getMessage());
        }
    }
}
