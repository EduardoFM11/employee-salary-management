//Inicio de la clase EmpleadoBaseComision que hereda de la clase EmpleadoComision
public class EmpleadoBaseComision extends EmpleadoComision {

	//Declaración de los atributos propios de esta clase
	private double salarioBase;

	//Creación del constructor de la clase EmpleadoBaseComisioón con los atributos de la clase EmpleadoBaseComisión con ayuda del método super(), así como los propios de esta clase
	public EmpleadoBaseComision(String primerNombre, String apellidoPaterno, String apellidoMaterno, String numSeguroSocial, double ventasBrutas, double tarifaComision, double salarioBase) {
		super(primerNombre, apellidoPaterno, apellidoMaterno, numSeguroSocial, ventasBrutas, tarifaComision);
		this.salarioBase = salarioBase;
	}

	//Sobreescritura del método ingresos() de la clase padre Empleado
	@Override
	public double ingresos() {
		return (getVentasBrutas() * getTarifaComision()) + salarioBase;
	}

	//Sobreescritura de método toString(), para imprimir los detalles de los empleados de esta clase
	@Override
	public String toString() {
		return "Empleado base comision: " + this.getPrimerNombre() + " " + this.getApellidoPaterno() + " " + this.getApellidoMaterno() + "\n" + 
				"Numero de seguro social: " + this.getNumSeguroSocial() + "\n" + 
				"Salario Semanal: $" + ingresos() + "\n" + 
				"Ingresos: " + ingresos() + "\n";
	}

	//Setter, obtiene como parametro el salario base y lo asigna al atributo de la clase declarado: salarioBase
	public void setSalarioBase(double salarioBase) {
		this.salarioBase = salarioBase;
	}

	//Getter, devuelve un double almacenado en el atributo declarado al inicio de esta clase
	public double getSalarioBase() {
		return salarioBase;
	}

	//Fin de la clase
}