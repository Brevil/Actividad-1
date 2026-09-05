/**
 * Ejercicio 1: Clase Persona
 * Aplica el principio de Encapsulamiento (atributos privados + get/set)
 */
public class Persona {

    // Atributos privados (encapsulamiento)
    private String nombre;
    private int edad;
    private String documento;

    // Constructor que inicializa los tres atributos
    public Persona(String nombre, int edad, String documento) {
        this.nombre = nombre;
        this.edad = edad;
        this.documento = documento;
    }

    // Getters y Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    // Muestra la información cargada por el constructor o los setters
    public void mostrarInformacion() {
        System.out.println("Nombre: " + nombre + ", Edad: " + edad + ", Documento: " + documento);
    }

    // Determina si la persona es mayor de edad (> 18 años)
    public boolean esMayorDeEdad() {
        return edad > 18;
    }
}
