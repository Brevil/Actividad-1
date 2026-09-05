/**
 * Ejercicio 3: Clase Calculadora (paso de variables por métodos)
 */
public class Calculadora {

    public double sumar(double a, double b) {
        return a + b;
    }

    public double restar(double a, double b) {
        return a - b;
    }

    public double multiplicar(double a, double b) {
        return a * b;
    }

    public double dividir(double a, double b) {
        if (b == 0) {
            System.out.println("Error: no se puede dividir por cero.");
            return 0;
        }
        return a / b;
    }

    // Recibe la operación y el resultado y los muestra por pantalla
    public void mostrarResultado(String operacion, double resultado) {
        System.out.println(operacion + " = " + resultado);
    }
}
