package RefinadoFinally;

public class AppRefinadaFinally {

	public static void main(String[] args) {
		int i = 0;
		String[] greetings = {
				"Hola mundo",
				"Si hola te dije!",
				"No me queres saludar?",
				"Pues vete a la ver..!"
		};
		
		try {
			while (i < 5) {
				System.out.println(greetings[i]);
				i++;
			}
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Revaluando el index");
			return;
		} finally {
			System.out.println("Elprograma termino con exito!");
		}
	}

}
