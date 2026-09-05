/**
 * Empleado de tiempo completo: salario + bonificación
 */
public class EmpleadoTiempoCompleto extends Empleado {

    private long bonificacion;

    public EmpleadoTiempoCompleto(String nombre, double salario, long bonificacion) {
        super(nombre, salario);
        this.bonificacion = bonificacion;
    }

    public long getBonificacion() {
        return bonificacion;
    }

    public void setBonificacion(long bonificacion) {
        this.bonificacion = bonificacion;
    }

    // Sobreescritura del método calcularSalario()
    @Override
    public double calcularSalario() {
        return salario + bonificacion;
    }
}
