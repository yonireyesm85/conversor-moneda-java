package principal;

import conversor.*;

import com.google.gson.JsonObject;

public class Principal {
    public static void main(String[] args) {
        Historial.limpiarHistorial(); // Esto limpia el historial al iniciar
        ClienteApi cliente = new ClienteApi();
        JsonObject datos = cliente.obtenerDatos();

        if (datos != null) {
            ConversorMoneda conversor = new ConversorMoneda(datos);
            Menu menu = new Menu(conversor);
            menu.mostrar();
        } else {
            System.out.println("No se pudo obtener información para realizar conversiones. 🦖");
        }
    }
}
