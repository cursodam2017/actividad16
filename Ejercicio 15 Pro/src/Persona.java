


public class Persona {
	// Varibles
	private String nombre;
	private byte edad;
	private char sexo;
	private String dni;
	private boolean bCasado;

	// Constructores
	public Persona() {
		
		nombre = "Anonimo";
		edad = 18;
		sexo = 'h';
		dni = "06083045c";
		bCasado = false;
	}
	
	public Persona(Persona persona) {
		
		nombre = persona.getNombre();
		edad = persona.getEdad();
		sexo = persona.getSexo();
		dni = persona.getDni();
		bCasado = persona.isbCasado();
	}

	public Persona(String nombre, byte edad, char sexo, String dni, boolean bCasado) {
		
		super();
		this.nombre = nombre;
		this.edad = edad;
		this.sexo = sexo;
		this.dni = dni;
		this.bCasado = bCasado;
	}
	
	// Función pintar que imprime el toString
	public void pintar() {
		
		System.out.println(toString());
	}
	
	// Setters y Getters
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public byte getEdad() {
		return edad;
	}
	public void setEdad(byte edad) {
		this.edad = edad;
	}
	public char getSexo() {
		return sexo;
	}
	public void setSexo(char sexo) {
		this.sexo = sexo;
	}
	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}
	public boolean isbCasado() {
		return bCasado;
	}
	public void setbCasado(boolean bCasado) {
		this.bCasado = bCasado;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		//if (getClass() != obj.getClass())  /* He comentado estas líneas para tener alguna similitúd entre un empleado y 
			//return false;                   * una persona. Ya que siempre serían dieferentes al ser clases diferentes*/
		Persona other = (Persona) obj;
		if (bCasado != other.bCasado)
			return false;
		if (dni == null) {
			if (other.dni != null)
				return false;
		} else if (!dni.equals(other.dni))
			return false;
		if (edad != other.edad)
			return false;
		if (nombre == null) {
			if (other.nombre != null)
				return false;
		} else if (!nombre.equals(other.nombre))
			return false;
		if (sexo != other.sexo)
			return false;
		return true;
	}

	@Override
	public String toString() {
		
		String cadena = "Nombre: " + nombre + "  Edad: " + edad + "  Sexo: " + sexo + "  DNI: " + dni + "  Casado: " + bCasado;
		return cadena;
	}
	
}	

