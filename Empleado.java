
//Inicio de la clase padre Empleado, declarada como abstracta para poder heredar los métodos correspondientes a las clases hijo
public abstract class Empleado {

	//Declaración de los atributos que serán utilizados en las clases hijo
	private String primerNombre;
	private String apellidoPaterno;
	private String apellidoMaterno;
	private String numSeguroSocial;

	//Creación del constructor de la clase Empleado
	public Empleado(String primerNombre, String apellidoPaterno, String apellidoMaterno, String numSeguroSocial) {
		this.primerNombre = primerNombre;
		this.apellidoPaterno = apellidoPaterno;
		this.apellidoMaterno = apellidoMaterno;
		this.numSeguroSocial = numSeguroSocial;
	}

	//Declaración del método abstracto ingresos() que devuelve los ingresos según el empleado
	public abstract double ingresos();

	//Setter, obtiene como parametro el primer nombre y lo asigna al atributo de la clase declarado: primerNombre
	public void setPrimerNombre(String primerNombre){
		this.primerNombre = primerNombre;
	}

	//Getter, devuelve una cadena con el primer nombre almacenado en los atributos declarados al inicio de esta clase
	public String getPrimerNombre(){
		return primerNombre;
	}

	//Setter, obtiene como parametro el apellido paterno y lo asigna al atributo de la clase declarado: apellidoPaterno
	public void setApellidoPaterno(String apellidoPaterno) {
		this.apellidoPaterno = apellidoPaterno;
	}

	//Getter, devuelve una cadena con el apellido paterno almacenado en los atributos declarados al inicio de esta clase
	public String getApellidoPaterno() {
		return apellidoPaterno;
	}

	//Setter, obtiene como paremetro el apellido materno y lo asigna al atributo de la clase declarado: apellidoMaterno
	public void setApellidoMaterno(String apellidoMaterno) {
		this.apellidoMaterno = apellidoMaterno;
	}

	//Getter, devuelve una cadena con el apellido materno almacenado en los atributos declarados al inicio de esta clase
	public String getApellidoMaterno() {
		return apellidoMaterno;
	}

	//Setter, obtiene como paremetro el num de seguro social y lo asigna al atributo de la clase declarado: numSeguroSocial
	public void setNumSeguroSocial(String numSeguroSocial) {
		this.numSeguroSocial = numSeguroSocial;
	}

	//Getter, devuelve una cadena con el num de seguro social almacenado en los atributos declarados al inicio de esta clase
	public String getNumSeguroSocial() {
		return numSeguroSocial;
	}

//Fin de la clase
}