

abstract class Empleado extends Persona {
	// Variables
	private String idepersonal;
	private float sueldo;
	
	// Constructures
	public Empleado() {
		super();
		idepersonal = "EmpleadoDefault";
		sueldo = 700;
	}
	
	public Empleado(Empleado empleado) {
		super(empleado);
		idepersonal = empleado.getIdepersonal();
		sueldo = empleado.getSueldo();
	}
		
	public Empleado(Persona persona, String idepersonal, float sueldo) {
		super(persona);
		this.idepersonal = idepersonal;
		this.sueldo = sueldo;
	}
	
	public Empleado(String nombre, byte edad, char sexo, String dni, boolean bCasado, String idepersonal, float sueldo) {
		super(nombre, edad, sexo, dni, bCasado);
		this.idepersonal = idepersonal;
		this.sueldo = sueldo;
	}

	// Funciones
	abstract float calcularAntigüedadMensual();
	
	abstract float calcularComplementosMensuales();
	
	
	
	@Override // Sobrescribo esta función porque en la clase padre también se encuentra.
	public void pintar() {
		System.out.println(toString());
	}
	
	// Getters y Setters
	public String getIdepersonal() {
		return idepersonal;
	}

	public void setIdepersonal(String idepersonal) {
		this.idepersonal = idepersonal;
	}

	public float getSueldo() {
		return sueldo;
	}

	public void setSueldo(float sueldo) {
		this.sueldo = sueldo;
	}

	// Se imprimen los elementos minimos de un objeto o lo que es lo mismo, las caracteristicas de la clase Empleado
	@Override
	public String toString() {
		String cadenaEmpleado = "  Id Empleado: " + idepersonal + "  Sueldo: " + sueldo; 
		return super.toString() + cadenaEmpleado; // Concateno con el toString del padre.
		
	}
		
	
}
