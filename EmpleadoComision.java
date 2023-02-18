//Inicio de la clase EmpleadoComision que hereda de la clase Empleado
public class EmpleadoComision extends Empleado {

	//Declaración de los atributos propios esta clase
	private double ventasBrutas;
	private double tarifaComision;

	//Creación del constructor de la clase EmpleadoComisión con los atributos de la clase Empleado con ayuda del método super(), así como los propios de esta clase
	public EmpleadoComision(String primerNombre, String apellidoPaterno, String apellidoMaterno, String numSeguroSocial, double ventasBrutas, double tarifaComision) {
		super(primerNombre, apellidoPaterno, apellidoMaterno, numSeguroSocial);
		this.ventasBrutas = ventasBrutas;
		this.tarifaComision = tarifaComision;
	}

	//Sobreescritura del método ingresos() de la clase padre
	@Override
	public double ingresos() {
		return ventasBrutas * tarifaComision;
	}

	//Sobreescritura de método toString(), para imprimir los detalles de los empleados de esta clase
	@Override
	public String toString() {
		return "Empleado comision: " + this.getPrimerNombre() + " " + this.getApellidoPaterno() + " " + this.getApellidoMaterno() + "\n" + 
				"Numero de seguro social: " + this.getNumSeguroSocial() + "\n" + 
				"Salario Semanal: $" + ingresos() + "\n" + 
				"Ingresos: " + ingresos() + "\n";
	}

	//Setter, obtiene como parametro las ventas brutas y lo asigna al atributo de la clase declarado: ventasBrutas
	public void setVentasBrutas(double ventasBrutas) {
		this.ventasBrutas = ventasBrutas;
	}

	//Getter, devuelve un double almacenado en el atributo declarado al inicio de esta clase
	public double getVentasBrutas() {
		return ventasBrutas;
	}

	//Setter, obtiene como parametro la tarifa de la comision y la asgina al atributo de la clase declarado: tarifaComision
	public void setTarifaComision(double tarifaComision) {
		this.tarifaComision = tarifaComision;
	}

	//Getter, devuelve un double almacenado en el atributo delcarado al inicio de la clase
	public double getTarifaComision() {
		return tarifaComision;
	}

	//Fin de la clase
}