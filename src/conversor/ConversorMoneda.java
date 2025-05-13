package conversor;

import com.google.gson.JsonObject;

public class ConversorMoneda {

    private JsonObject tasas;

    public ConversorMoneda(JsonObject tasas) {
        this.tasas = tasas.getAsJsonObject("conversion_rates");
    }

    public double convertir(double cantidad, String de, String a) {
        double tasaDe = tasas.get(de).getAsDouble();
        double tasaA = tasas.get(a).getAsDouble();
        return cantidad * (tasaA / tasaDe);
    }
}
