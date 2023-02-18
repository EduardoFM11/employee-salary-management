//Inicio de la clase EmpleadoHoras que hereda de la clase Empleado
public class EmpleadoHoras extends Empleado {

	//Declaración de los atributos propios de esta clase
	private double salarioPorHora;
	private int horas;

	//Creación del constructor de la clase EmpleadoHoras con los atributos de la clase Empleado con ayuda del método super(), así como los propios de esta clase
	public EmpleadoHoras(String primerNombre, String apellidoPaterno, String apellidoMaterno, String numSeguroSocial, double salarioPorHora, int horas) {
		super(primerNombre, apellidoPaterno, apellidoMaterno, numSeguroSocial);
		this.salarioPorHora = salarioPorHora;
		this.horas = horas;
	}

	//Sobreescritura del método ingresos() de la clase padre
	@Override
	public double ingresos() {
		if (horas > 40) {
			return 1.50 * (salarioPorHora * horas);	
		} else {
			return (salarioPorHora * horas);
		}
		
	}

	//Sobreescritura de método toString(), para imprimir los detalles de los empleados de esta clase
	@Override
	public String toString() {
		return "Empleado horas: " + this.getPrimerNombre() + " " + this.getApellidoPaterno() + " " + this.getApellidoMaterno() + "\n" + 
				"Numero de seguro social: " + this.getNumSeguroSocial() + "\n" + 
				"Salario Semanal: $" + ingresos() + "\n" + 
				"Ingresos: " + ingresos() + "\n";
	}	

	//Setter, obtiene como parametro el salario por hora y lo asigna al atributo de la clase declarado: salarioPorHora
	public void setSalarioPorHora(double salarioPorHora) {
		this.salarioPorHora = salarioPorHora;
	}

	//Getter, devuelve un double almacenado en el atributo declarado al inicio de esta clase
	public double getSalarioPorHora() {
		return salarioPorHora;
	}

	//Setter, obtiene como parametro las horas y las asigna al atributo de la clase declarado: horas
	public void setHoras(int horas) {
		this.horas = horas;
	}

	//Getter, devuelve un int almacenado en el atributo declarado al inicio de esta clase
	public int getHoras() {
		return horas;
	}

	//Fin de la clase
}