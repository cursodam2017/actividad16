
public class Tecnico extends Empleado {
	// Variables
	private byte quinquenio;
	private float complemento;
	
	// Constructores
	public Tecnico() {
		super();
		this.quinquenio = 1;
		this.complemento = 0;
		setIdepersonal("T�cnico");
	}
	
	public Tecnico(String nombre, byte edad, char sexo, String dni, boolean bCasado, String idepersonal, float sueldo,
			byte quinquenio , float complemento) {
		super(nombre, edad, sexo, dni, bCasado,idepersonal, sueldo);
		this.quinquenio = quinquenio;
		this.complemento = complemento;
		setIdepersonal("T�cnico");
	}
	
	// Funciones
	@Override
	float calcularAntig�edadMensual() {
		float porcentaje = quinquenio * 5; // Cada quinquenio se multiplica por 5 para identificar el porcentaje
		float complementoAntiguedad = getSueldo() * (porcentaje / 100); // Se calcula cual es el incremento en el sueldo
		
		return complementoAntiguedad;
	}

	@Override
	float calcularComplementosMensuales() {
		complemento = (getSueldo() * calcularAntig�edadMensual()) / 100; /* Se calcula la cent�sima parte de multiplicar 
																		  *sueldo por el incremento por quinquenio
																		  */
		return complemento;
	}

	// Se sobrescribe la funci�n toString con los nuevos parametros de esta clase
	@Override
	public String toString() {
		String cadenaTecnico = "  Porcentaje por quinquenio: " + calcularAntig�edadMensual() + "�" + "  Sueldo con complemento Mensual: " +
								calcularComplementosMensuales();
		return super.toString() + cadenaTecnico;
	}
	
	// Setters y Getters
	public byte getQuinquenio() {
		return quinquenio;
	}

	public void setQuinquenio(byte quinquenio) {
		this.quinquenio = quinquenio;
	}

	public float getComplemento() {
		return complemento;
	}

	public void setComplemento(float complemento) {
		this.complemento = complemento;
	}
}
