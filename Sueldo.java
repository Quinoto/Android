import java.util.Scanner;
// Scanner permite crear objeto para pedir input por teclado

public class Sueldo {
	private Scanner teclado;
	private String nombre;
	private String apellido;
	private int horas;

	// habitualmente esto se hace en el constructor, hoy lo 
	// hacemos acá
	
	// método crear
	
	public void crear() {
		teclado = new Scanner(System.in);
		System.out.println("Nombre: ");
		nombre = teclado.next();
		
		System.out.println("Apellido: ");
		apellido = teclado.next();
		
		System.out.println("Horas: ");
		horas = teclado.nextInt();
		
	}

	public void mostrar() {
		System.out.println("Nombre: "+nombre);
		System.out.println("Apellido: "+apellido);
		System.out.println("Horas: " +horas);
		
	}
	
	public void extras() {
		if( horas > 8 ) {
			System.out.println(nombre+" "+apellido+" Si debe cobrar extras");
		} else {
			System.out.println(nombre+" "+apellido+" No debe cobrar extras");

		}
	}
}
