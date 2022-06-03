package RefinadoMas;

public class AppRefinadaMas {
	
	public static void primero(String [] greetings) {
		segundo(greetings);
	}
	
	public static void segundo(String [] greetings) {
		int i = 0;
		while (i < 4) {
			try {
				System.out.println(greetings[i]);
			} catch (ArrayIndexOutOfBoundsException aiobe) {
				System.err.println("Fuera de los limites del arreglo");
			}
			i++;
		}
	}

	public static void main(String[] args) {
		String greetings [] = {
				"Hola Mundo",
				"No, aun no estoy listo",
				"Pero te digo que holaaa mundo!"
		};
		primero(greetings);
	}

}
