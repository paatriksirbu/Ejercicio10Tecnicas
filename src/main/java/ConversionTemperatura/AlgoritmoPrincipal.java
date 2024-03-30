package ConversionTemperatura;
import java.util.Scanner;
import ConversionTemperatura.ConversorTemperatura;
import ConversionTemperatura.ExceptionTemperatura;

public class AlgoritmoPrincipal {
    public static void main(String[] args) {

        System.out.println("\nConversor de temperatura");   //Menu de opciones que nos da a elegir entre convertir de Celsius a Fahrenheit, de Fahrenheit a Celsius o salir del programa.
        System.out.println("1. Celsius a Fahrenheit");
        System.out.println("2. Fahrenheit a Celsius");
        System.out.println("3. Salir\n");

        Scanner scanner = new Scanner(System.in);
        int opcion;

        do{

            System.out.println("Seleccione una opción");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Introduzca la temperatura en Celsius");
                    double celsius = scanner.nextDouble();
                    try {
                        double fahrenheit = ConversorTemperatura.celsiusAFahrenheit(celsius);
                        System.out.println(celsius + "°C" + " = "  + fahrenheit + "°F");
                    } catch (ExceptionTemperatura e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 2:
                    System.out.println("Ingrese la temperatura en Fahrenheit");
                    double fahrenheit = scanner.nextDouble();
                    try {
                        celsius = ConversorTemperatura.fahrenheitACelsius(fahrenheit);
                        System.out.println(fahrenheit + "°F" + " = "  + celsius + "°C");
                    } catch (ExceptionTemperatura e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 3:
                    System.out.println("Saliendo del programa");
                    break;
                default:
                    System.out.println("Opción no válida");
            }
        } while (opcion != 3);
    }
}
