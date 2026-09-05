/**
 * Empleado por horas: horasTrabajadas x valorHora
 */
public class EmpleadoPorHoras extends Empleado {

    private int horasTrabajadas;
    private double valorHora;

    public EmpleadoPorHoras(String nombre, double salario, int horasTrabajadas, double valorHora) {
        super(nombre, salario);
        this.horasTrabajadas = horasTrabajadas;
        this.valorHora = valorHora;
    }

    public int getHorasTrabajadas() {
        return horasTrabajadas;
    }

    public void setHorasTrabajadas(int horasTrabajadas) {
        this.horasTrabajadas = horasTrabajadas;
    }

    public double getValorHora() {
        return valorHora;
    }

    public void setValorHora(double valorHora) {
        this.valorHora = valorHora;
    }

    // Sobreescritura del método calcularSalario()
    @Override
    public double calcularSalario() {
        return horasTrabajadas * valorHora;
    }
}
