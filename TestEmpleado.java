import java.util.Scanner; //Importación del paquete para utilizar la entrada vía el teclado 
import java.util.ArrayList; //Importación del paquete para utilizar ArrayList

//Inicio de la clase TestEmpleado, desde donde ejecutaremos nuestro codigo, así como la lógica principal del programa
public class TestEmpleado {

		//Declaracion de los atributos propios de esta clase, estaticos para acceder a ellos en toda la ejecución del programa
		static String primerNombre;
		static String apellidoPaterno;
		static String apellidoMaterno;
		static String numSeguroSocial;

		static Scanner sc = new Scanner(System.in);
	//Inicio del metodo main
	public static void main(String[] args) {

		//Declaración de los atributos propios de la clase
		int menuPrincipalSeleccion;
		int menuAgregarSeleccion;
		int menuBuscarSeleccion;
		String entradaBusqueda;

		ArrayList<Empleado> empleadosArray = new ArrayList<Empleado>();
		double salarioSemanal; 
		
		double salarioPorHora;
		int horas;

		double ventasBrutas;
		double tarifaComision;

		double salarioBase;


		//Inicio del ciclo infinito do-while que imprimira el menu y las opciones a elegir por el usuario, hasta que el usuario elija terminar el programa
		do {

			//Imprime el mensaje de bienvenida, así como las opciones que tiene el usuario para ejecutar.
			System.out.println("***********************************\n" + 
							 "*BIENVENIDO A EL SISTEMA DE NOMINA*\n" +
							 "***********************************\n");
			System.out.println("Seleccione una opcion para continuar");
			System.out.print("1. Agregar Empleado\n2. Buscar Empleado\n3. Eliminar Empleado\n4. Listar Empleados\n5. Salir\n");
			System.out.print(">> ");

			//Asigna a la variable menuPrinicipalSelección, el número elegido por el usuario con ayuda del Scanner anteriormente instanciado
			menuPrincipalSeleccion = sc.nextInt();
			System.out.println();

			//Inicio de la sentencia switch, según el numero elegido se ejecutara cada caso
			switch (menuPrincipalSeleccion) {
				//AGREGAR EMPLEADO
				case 1:
					//Imprime mensaje para indicar al usuario que tipos de empleado puede agregar
					System.out.println("¿Cual tipo de empleado desea agregar?");
					System.out.print("1. Empleado Asalariado\n2. Empleado por horas\n3. Empleado por comision\n4. Empleado base mas comision\n");
					System.out.print(">> ");
					//Asigna a la variable menuAgregarSelección, el número elegido por el usuario con ayuda del Scanner anteriormente instanciado
					menuAgregarSeleccion = sc.nextInt();
					System.out.println();

					//Inicio de sentencia switch, según el tipo de empleado que deseo agregar
					switch(menuAgregarSeleccion) {
						case 1:
							//Método que sirve para imprimir y obtener los datos básicos de todos los empleados: primerNombre, apellidoPaterno, apellidoMaterno y num de seguro social
							imprimirIngreseDatosEmpleado();
							System.out.print("Ingrese el salario semanal: ");
							salarioSemanal = sc.nextDouble(); //Asigna a la variable salarioSemanal, la entrada del usuario.
							System.out.println();

							//Sentencia if-else para comprobar que el salario semanal ingresado sea mayor a cero
							if (salarioSemanal < 0) {
								//Si el salario es menor a cero, se imprime un mensaje avisando al usuario que su entrada debe ser mayor a cero.
								System.out.println("El salario debe ser mayor a 0");
								System.out.println();
							} else {
								//Si el salario fue mayor a cero, creamos un nuevo empleado de tipo asalariado
								EmpleadoAsalariado nuevoAsalariado = new EmpleadoAsalariado(primerNombre, apellidoPaterno, apellidoMaterno, numSeguroSocial, salarioSemanal);
								empleadosArray.add(nuevoAsalariado); //En el array list previamente instanciado, utilizamos el metodo add() para añadir el empleado creado al array
								imprimirAgregadoConExito(); //Método para imprimir que el empleado ha sido agregado con éxito.
							}
							break; //Termina el switch

						case 2:
							imprimirIngreseDatosEmpleado();
							System.out.print("Ingrese el salario por hora: "); 
							salarioPorHora = sc.nextDouble(); //Asigna a la variable salarioPorHora la entrada de usuario
							System.out.print("Ingrese las horas trabajadas: ");
							horas = sc.nextInt(); //Asigna a la variable horas la entrada del usuario
							System.out.println();

							//Sentencia if-else para comprobar que el salario por hora sea mayor a cero, las horas mayores a cero y menores de 168
							if (salarioPorHora < 0 || (horas < 0 || horas > 168)) {
								//Si alguna de las condiciones no se cumple imprime mensaje al usuario para que verifique su entrada
								System.out.println("El salario y horas deben ser mayores a 0 y las horas menor de 168");
								System.out.println();
							} else {
								//Si todas las condiciones son verdaderas, creamos un nuevo empleado de tipo por horas
								EmpleadoHoras nuevoEmpleadoHoras = new EmpleadoHoras(primerNombre, apellidoPaterno, apellidoMaterno, numSeguroSocial, salarioPorHora, horas);
								empleadosArray.add(nuevoEmpleadoHoras); //En el array list previamente instanciado, añadimos el empleado creado al array
								imprimirAgregadoConExito();
							}
							break; //Termina el switch

						case 3:
							imprimirIngreseDatosEmpleado();
							System.out.print("Ingrese las ventas brutas: ");
							ventasBrutas = sc.nextDouble(); //Asigna a la variable ventasBrutas la entrada del usuario
							System.out.print("Ingrese la tarifa comision: ");
							tarifaComision = sc.nextDouble(); //Asigna a la variable tarifaComisión la entrada del usuario
							System.out.println();

							//Sentencia if-else para comprobar que las ventas sean mayores a 0 y la tarifa este en un rango de 0 a 1
							if (ventasBrutas < 0 || (tarifaComision < 0 || tarifaComision > 1)) {
								//Si alguna de las condiciones no se cumple, imprime mensaje al usuairo para que verifique su entrada
								System.out.println("Las ventas y la tarifa deben ser mayores a 0 y la tarifa menor de 1");
								System.out.println();
							} else {
								//Si todas las condiciones son verdaderas, creamos un nuevo empleado de tipo comision
								EmpleadoComision nuevoEmpleadoComision = new EmpleadoComision(primerNombre, apellidoPaterno, apellidoMaterno, numSeguroSocial, ventasBrutas, tarifaComision);
								empleadosArray.add(nuevoEmpleadoComision); //En el array list previamente instanciado, añadimos el empleado creado al array
								imprimirAgregadoConExito();
							}	
						break; //Termina el switch

						case 4:
							imprimirIngreseDatosEmpleado();
							System.out.print("Ingrese el salario base: ");
							salarioBase = sc.nextDouble(); //Asigna a la variable salarioBase la entrada del usuario
							System.out.print("Ingrese las ventas brutas: ");
							ventasBrutas = sc.nextDouble(); //Asigna a la variable ventasBrutas la entrada del usuario
							System.out.print("Ingrese la tarifa comision: ");
							tarifaComision = sc.nextDouble(); //Asigna a la variable tarifaComision la entrada del usuairo
							System.out.println();

							//Sentencia if-else para comprobar que el salario y ventas sean mayores a cero y la tarifa este en un rango de 0 a 1
							if(salarioBase < 0 || ventasBrutas < 0 || (tarifaComision < 0 || tarifaComision > 1)) {
								//Si alguna de las condiciones no se cumple, imprime mensaje al usuario para que verifique su entrada
								System.out.println("El salario base, las ventas y la tarifa deben ser mayores a 0 y la tarifa menor que 1");
								System.out.println();
							} else {
								//Si todas las condiciones son verdaderas, creamos un nuevo empleado de tipo base comision
								EmpleadoBaseComision nuevoEmpleadoBaseComision = new EmpleadoBaseComision(primerNombre, apellidoPaterno, apellidoMaterno, numSeguroSocial, ventasBrutas, tarifaComision, salarioBase);
								empleadosArray.add(nuevoEmpleadoBaseComision);//En el array list previamente instanciado, añadimos el empleado creado al array
								imprimirAgregadoConExito();
							}
						break;

						default:
							//Si ninguno de los casos cumple con la entrada del usuario, imprimir mensaje de opción inválida
							System.out.println("Opcion seleccionada invalida");
							System.out.println();
					}
				break;

				//BUSCAR EMPLEADO
				case 2:

					//Sentencia if-else que comprueba si la lista de empleados esta vacia.
					if(empleadosArray.isEmpty()) {
						//Si la lista esta vacia imprime que no se han agregado empleados
						System.out.println("[-] No se han agregado empleados");
						System.out.println();
					} else {
						//Si la lista no esta vacia, imprime las opciones que tiene el usuario para buscar un empleado
						System.out.println("Buscar por:");
						System.out.print("1. Primer Nombre\n2. Numero de seguro social\n");
						System.out.print(">> ");
						menuBuscarSeleccion = sc.nextInt(); //Asigna a la variable menuBuscarSelección la entrada de usuario
						System.out.println();

						//Inicio de la sentencia switch, segun la opción elegida se ejecutara el caso correspondiente
						switch (menuBuscarSeleccion) {
							case 1: //Si el usuario eligió buscar empleado por primer nombre
								System.out.print("Ingrese el nombre a buscar: ");
								entradaBusqueda = sc.next(); //Asigna a la variable entradaBusqueda la entrada del usuario
								System.out.println();

								//Ciclo for-each para ciclar entre todos los empleados de la lista 
								for (Empleado empleado : empleadosArray) {
									if(empleado.getPrimerNombre().equals(entradaBusqueda)) {//Verifica si la entrada del usuario es igual al primer nombre del empleado
										System.out.println(empleado); //Imprime los detalles del empleado
										break;//Termina el ciclo
									} 

								}
							break; //Termina el switch

							case 2: //Si el usuario eligió buscar por num de seguro social
								System.out.print("Ingresa el numero social a buscar: ");
								entradaBusqueda = sc.next(); //Asigna a la variable entradaBusqueda la entrada del usuario
								System.out.println();

								//Ciclor for-each para ciclar entre todos los empleados de la lista
								for (Empleado empleado : empleadosArray) {
									if (empleado.getNumSeguroSocial().equals(entradaBusqueda)) { //Verifica si la entrada del usuario es igual al num de seguro social del empleado
										System.out.println(empleado); //Imprime los detalles del empleado
										break;//Termina el ciclo
									} 
								}
							break; //Termina el switch
						}
					}
					
				break; //Termina el switch

				//ELIMINAR EMPLEADO
				case 3:

					//Comprueba si la lista de empleados esta vacia
					if(empleadosArray.isEmpty()) {
						System.out.println("[-] No se han agregado empleados"); //Si esta vacia, muestra un mensaje al usuario
						System.out.println();
					} else {
						//Si la lista no esta vacia, pide al usuario ingrese el num de seguro social
						System.out.print("Ingrese el numero de seguro social: ");
						entradaBusqueda = sc.next(); //Asigna a la variable entradaBusqueda la entrada del usuario

						//Ciclo for-each para ciclar entre todos los empleados de la lista
						for(Empleado empleado : empleadosArray) {
							if(empleado.getNumSeguroSocial().equals(entradaBusqueda)) { //Verifica si la entrada del usuario es igual al num de seguro social del empleado
								empleadosArray.remove(empleado); //Remueve el usuario 
								System.out.println("[+] Se ha eliminado el empleado correctamente"); 
								System.out.println();
								break;
							} 
						}
					}
				break;

				//LISTAR EMPLEADOS
				case 4:

				//Comprueba si la lista de empleados esta vacia
				if (empleadosArray.isEmpty()) {
					System.out.println("La lista de empleados esta vacia"); // Si esta vacia, muestra un mensaje al usuario
					System.out.println();
				} else {
					//Si la lista no esta vacia, imprime los empleados que esten en la lista
					imprimirListaEmpleados(empleadosArray); //Metodo que obtiene como parametro un array list de tipo de empleado y los imprime
					System.out.println();
				}
				break; //Termina el switch

				//SALIR
				case 5:
				System.out.println("Ha salido del sistema");
				break;

				default:
				System.out.println("Opcion seleccionada invalida, intente de nuevo"); //Si ninguno de los casos cumple con la entrada del usuario, imprime un mensaje
			}

		} while (menuPrincipalSeleccion != 5); //El ciclo do-while termina hasta que la variable menuPrincipalSeleccion tenga un valor de 5
	}

	//Método estático que obtiene como parametro un array list de tipo Empleado
	public static void imprimirListaEmpleados(ArrayList<Empleado> empleados) {
		for (Empleado empleado : empleados) { //Utiliza un ciclo for-each para ciclar entre todos los empleados de la lista y a su vez imprimirlos
			System.out.println(empleado);
		} 
	}

	//Método estático que imprime al usuario ingrese los datos básicos de todos los empleados y los asigne a las variables correspondientes.
	public static void imprimirIngreseDatosEmpleado() {
		System.out.print("Ingrese el nombre: ");
		primerNombre = sc.next();
		System.out.print("Ingrese el apellido paterno: ");
		apellidoPaterno = sc.next();
		System.out.print("Ingrese el apellido materno: ");
		apellidoMaterno = sc.next();
		System.out.print("Ingrese el numero de seguro social: ");
		numSeguroSocial = sc.next();
	}

	//Método estático que imprime un mensaje al usuario
	public static void imprimirAgregadoConExito() {
		System.out.println("El empleado ha sido agregado con exito");
		System.out.println();
	}

	//Fin de la clase
}