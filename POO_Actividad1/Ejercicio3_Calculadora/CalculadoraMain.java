import java.util.Scanner;

/**
 * Clase principal del Ejercicio 3.
 * Permite al usuario ingresar los dos números y elegir la operación
 * a realizar con la clase Calculadora.
 */
public class CalculadoraMain {

    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\n===== CALCULADORA =====");
            System.out.println("1. Sumar");
            System.out.println("2. Restar");
            System.out.println("3. Multiplicar");
            System.out.println("4. Dividir");
            System.out.println("5. Salir");
            System.out.print("Elija una opcion: ");
            opcion = leerEntero(scanner);

            if (opcion >= 1 && opcion <= 4) {
                System.out.print("Ingrese el primer numero: ");
                double a = leerDouble(scanner);
                System.out.print("Ingrese el segundo numero: ");
                double b = leerDouble(scanner);

                switch (opcion) {
                    case 1:
                        calculadora.mostrarResultado("Suma", calculadora.sumar(a, b));
                        break;
                    case 2:
                        calculadora.mostrarResultado("Resta", calculadora.restar(a, b));
                        break;
                    case 3:
                        calculadora.mostrarResultado("Multiplicacion", calculadora.multiplicar(a, b));
                        break;
                    case 4:
                        calculadora.mostrarResultado("Division", calculadora.dividir(a, b));
                        break;
                }
            } else if (opcion != 5) {
                System.out.println("Opcion invalida. Intente de nuevo.");
            }

        } while (opcion != 5);

        System.out.println("Programa finalizado.");
        scanner.close();
    }

    // Valida que el usuario ingrese un numero entero
    private static int leerEntero(Scanner scanner) {
        while (!scanner.hasNextInt()) {
            System.out.print("Ingrese un numero entero valido: ");
            scanner.next();
        }
        return scanner.nextInt();
    }

    // Valida que el usuario ingrese un numero decimal
    private static double leerDouble(Scanner scanner) {
        while (!scanner.hasNextDouble()) {
            System.out.print("Ingrese un numero valido: ");
            scanner.next();
        }
        return scanner.nextDouble();
    }
}
