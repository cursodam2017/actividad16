
public class Obrero extends Empleado {
	// Variables
	private byte trienio;
	private char turno;
	
	// Constructores
	public Obrero() {
		super();
		this.trienio = 1;
		this.turno = 'D';
		setIdepersonal("Obrero");
		
	}
	
	public Obrero(String nombre, byte edad, char sexo, String dni, boolean bCasado, String idepersonal, float sueldo,
			byte trienio , char turno) {
		super(nombre, edad, sexo, dni, bCasado,idepersonal, sueldo);
		this.trienio = trienio;
		this.turno = turno;
		setIdepersonal("Obrero");
	}
	
	// Funciones
	@Override
	float calcularAntigüedadMensual() { 
		float porcentaje = trienio * 3; // Cada trienio se multiplica por 3 para identificar el porcentaje  
		float complementoAntiguedad = getSueldo() * (porcentaje / 100); // Se calcula cual es el incremento en el sueldo
		
		return complementoAntiguedad;
	}

	@Override
	float calcularComplementosMensuales() {
		float complemento = 0;
		if (turno == 'N') { // Se comprueba si el turno es de Noche (N)
			complemento = (getSueldo() * 3) / 100; // Se calcula el complemento 
		}
		return complemento;
	}

	// Se sobrescribe la función toString con los nuevos parametros de esta clase
	@Override
	public String toString() {
		String cadenaObrero = "  Porcentaje por trienio: " + calcularAntigüedadMensual() + "€" + "  Complementos Mensuales: " +
								calcularComplementosMensuales();
		return super.toString() + cadenaObrero;
	}
	
	// Setters y Getters
	public byte getTrienio() {
		return trienio;
	}

	public void setTrienio(byte trienio) {
		this.trienio = trienio;
	}

	public char getTurno() {
		return turno;
	}

	public void setTurno(char turno) {
		this.turno = turno;
	}
}
