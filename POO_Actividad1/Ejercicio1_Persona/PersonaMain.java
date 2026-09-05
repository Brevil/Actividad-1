import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Clase principal del Ejercicio 1.
 * Crea una lista de al menos 10 Personas con datos aleatorios
 * y muestra cuáles son mayores de edad.
 */
public class PersonaMain {

    public static void main(String[] args) {
        List<Persona> personas = generarPersonasAleatorias(10);
        imprimirMayoresDeEdad(personas);
    }

    // Genera una lista de personas con datos aleatorios
    public static List<Persona> generarPersonasAleatorias(int cantidad) {
        String[] nombres = {
                "Juan", "Maria", "Carlos", "Ana", "Pedro",
                "Laura", "Andres", "Camila", "Diego", "Valentina"
        };

        Random random = new Random();
        List<Persona> personas = new ArrayList<>();

        for (int i = 0; i < cantidad; i++) {
            String nombre = nombres[random.nextInt(nombres.length)];
            int edad = random.nextInt(60) + 1;          // edad entre 1 y 60
            String documento = String.valueOf(100000000 + random.nextInt(900000000));
            personas.add(new Persona(nombre, edad, documento));
        }
        return personas;
    }

    // Recorre la lista e imprime si cada persona es o no mayor de edad
    public static void imprimirMayoresDeEdad(List<Persona> personas) {
        for (Persona persona : personas) {
            if (persona.esMayorDeEdad()) {
                System.out.println("Nombre: " + persona.getNombre() + " Es mayor de edad");
            } else {
                System.out.println("Nombre: " + persona.getNombre() + " No es mayor de edad");
            }
        }
    }
}
