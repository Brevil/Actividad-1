/**
 * Ejercicio 2: Clase base Empleado (Herencia + Abstracción + Polimorfismo)
 */
public abstract class Empleado {

    protected String nombre;
    protected double salario;

    public Empleado(String nombre, double salario) {
        this.nombre = nombre;
        this.salario = salario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    // Método abstracto: cada tipo de empleado calcula su salario a su manera
    public abstract double calcularSalario();
}
