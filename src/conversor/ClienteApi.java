package conversor;

import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.net.HttpURLConnection;
import java.net.URL;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

public class ClienteApi {

    public JsonObject obtenerDatos() {
        String url = "https://v6.exchangerate-api.com/v6/6ff77ae2a5525fa61d609f35/latest/USD";

        try {
            HttpURLConnection conexion = (HttpURLConnection) new URL(url).openConnection();
            conexion.setRequestMethod("GET");

            BufferedReader reader = new BufferedReader(new InputStreamReader(conexion.getInputStream()));
            JsonObject json = JsonParser.parseReader(reader).getAsJsonObject();

            return json;
        } catch (Exception e) {
            System.out.println("Error al conectar con la API: 🦖" + e.getMessage());
            return null;
        }
    }
}
