import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Clase principal del Ejercicio 2.
 * Crea una lista de al menos 10 empleados (mezcla de tiempo completo y por horas)
 * de forma aleatoria y muestra el salario calculado de cada uno (Polimorfismo).
 */
public class EmpleadoMain {

    public static void main(String[] args) {
        List<Empleado> empleados = generarEmpleadosAleatorios(10);
        mostrarSalarios(empleados);
    }

    public static List<Empleado> generarEmpleadosAleatorios(int cantidad) {
        String[] nombres = {
                "Pepito Perez", "Laura Gomez", "Andres Ruiz", "Camila Rios", "Diego Torres",
                "Valentina Diaz", "Julian Castro", "Sofia Mora", "Mateo Vargas", "Isabella Leon"
        };

        Random random = new Random();
        List<Empleado> empleados = new ArrayList<>();

        for (int i = 0; i < cantidad; i++) {
            String nombre = nombres[random.nextInt(nombres.length)];

            if (random.nextBoolean()) {
                // Empleado de tiempo completo
                double salarioBase = 1000000 + random.nextInt(2000000);
                long bonificacion = 100000 + random.nextInt(400000);
                empleados.add(new EmpleadoTiempoCompleto(nombre, salarioBase, bonificacion));
            } else {
                // Empleado por horas
                int horasTrabajadas = 10 + random.nextInt(40); // entre 10 y 49 horas
                double valorHora = 60000;
                empleados.add(new EmpleadoPorHoras(nombre, 0, horasTrabajadas, valorHora));
            }
        }
        return empleados;
    }

    public static void mostrarSalarios(List<Empleado> empleados) {
        int contador = 1;
        for (Empleado empleado : empleados) {
            if (empleado instanceof EmpleadoPorHoras) {
                EmpleadoPorHoras e = (EmpleadoPorHoras) empleado;
                System.out.println("Empleado " + contador + ": \"" + e.getNombre() + "\", Salario Actual: \""
                        + String.format("%,.0f", e.calcularSalario()) + "\", Cantidad horas trabajadas: "
                        + e.getHorasTrabajadas() + ". Valor de la hora: " + (int) e.getValorHora());
            } else if (empleado instanceof EmpleadoTiempoCompleto) {
                EmpleadoTiempoCompleto e = (EmpleadoTiempoCompleto) empleado;
                System.out.println("Empleado " + contador + ": \"" + e.getNombre() + "\", Salario Actual: \""
                        + String.format("%,.0f", e.calcularSalario()) + "\" (Tiempo completo, bonificacion: "
                        + e.getBonificacion() + ")");
            }
            contador++;
        }
    }
}
