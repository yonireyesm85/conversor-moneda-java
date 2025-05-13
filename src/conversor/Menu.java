package conversor;

import java.util.Scanner;

public class Menu {

    private final ConversorMoneda conversor;

    public Menu(ConversorMoneda conversor) {
        this.conversor = conversor;
    }

    public void mostrar() {
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("""
                *************************************
                Sea bienvenido/a al Conversor de Moneda 🦖 =]

                1) Dólar => Peso argentino
                2) Peso argentino => Dólar
                3) Dólar => Real brasileño
                4) Real brasileño => Dólar
                5) Dólar => Peso colombiano
                6) Peso colombiano => Dólar
                7) Dólar => Peso mexicano
                8) Peso mexicano => Dólar
                9) Salir

                Elija una opción válida:
                *************************************
                """);

            opcion = scanner.nextInt();

            switch (opcion) {
                case 1 -> convertir("USD", "ARS", scanner);
                case 2 -> convertir("ARS", "USD", scanner);
                case 3 -> convertir("USD", "BRL", scanner);
                case 4 -> convertir("BRL", "USD", scanner);
                case 5 -> convertir("USD", "COP", scanner);
                case 6 -> convertir("COP", "USD", scanner);
                case 7 -> convertir("USD", "MXN", scanner);
                case 8 -> convertir("MXN", "USD", scanner);
                case 9 -> {
                    System.out.println("¡Gracias por usar el conversor! 🦖");
                    Historial.mostrarHistorial(); // Mostramos historial al salir
                }
                default -> System.out.println("Opción inválida 🦖");
            }

        } while (opcion != 9);
    }

    private void convertir(String de, String a, Scanner scanner) {
        System.out.println("Ingrese el valor que desea convertir: 🦖");
        double cantidad = scanner.nextDouble();
        double resultado = conversor.convertir(cantidad, de, a);
        System.out.printf("Resultado: %.2f %s = %.2f %s%n", cantidad, de, resultado, a);

        String registro = String.format("%.2f %s => %.2f %s", cantidad, de, resultado, a);
        Historial.guardar(registro);
    }
}
