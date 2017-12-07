import java.util.Random;

public class ProgramaPersona {

	public static void main(String[] args) {
		
		Random generador = new Random();
		int aleatorio = (generador.nextInt(19)+1); // Se crea un generador Random y se le pide numeros del 1 al 20
		Persona listado [] = new Persona [aleatorio]; // Se crea un ArrayList de un tamaño igual al número aleatorio.
		
		for (int i = 0; i < aleatorio; i++) { // Se crea un FOR para crea aleatoriamente números del 1 al 3.
			int numero = generador.nextInt(3);
			
			switch (numero) { // Después de crear los números, dependiendo de cual sea se creará un objeto u otro y se guarda en "listado"
			case 0 : 
				Persona persona = new Persona();
				listado [i] = persona;
				break;
			case 1 :
				Persona obrero = new Obrero();
				listado [i] = obrero;
				break;
			case 2 :
				Persona tecnico = new Tecnico();
				listado [i] = tecnico;
				break;
			default :
				break;
			}
			
		}
		
		for (Persona cont : listado) { // Sale por pantalla todos los datos de cada objeto
			cont.pintar();
		}

		
	}

}
