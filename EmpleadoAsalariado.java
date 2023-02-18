//Inicio de la clase EmpleadoAsalariado que hereda de la clase Empleado
public class EmpleadoAsalariado extends Empleado {

	//Declaración de los atributos propios de esta clase
	private double salarioSemanal;

	//Creación del constructor de la clase EmpleadoAsalariado con los atributos de la clase Empleado con ayuda del método super(), así como los propios de esta clase
	public EmpleadoAsalariado(String primerNombre, String apellidoPaterno, String apellidoMaterno, String numSeguroSocial, double salarioSemanal) {
		super(primerNombre, apellidoPaterno, apellidoMaterno, numSeguroSocial);
		this.salarioSemanal = salarioSemanal;
	}

	//Sobreescritura del método ingresos() de la clase padre
	@Override
	public double ingresos() {
		return salarioSemanal;
	}

	//Sobreescritura de método toString(), para imprimir los detalles de los empleados de esta clase
	@Override
	public String toString() {
		return "Empleado asalariado: " + this.getPrimerNombre() + " " + this.getApellidoPaterno() + " " + this.getApellidoMaterno() + "\n" + 
				"Numero de seguro social: " + this.getNumSeguroSocial() + "\n" + 
				"Salario Semanal: $" + salarioSemanal + "\n" + 
				"Ingresos: " + ingresos() + "\n";
	}

	//Setter, obtiene como parametro el salario semanal y lo asigna al atributo de la clase salarioSemanal
	public void setSalarioSemanal(double salarioSemanal) {
		this.salarioSemanal = salarioSemanal;
	}

	//Getter, devuelve un double almacenado en el atributo declarado al inicio de esta clase
	public double getSalarioSemanal(){
		return salarioSemanal;
	}

	
}