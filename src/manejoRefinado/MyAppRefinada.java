package manejoRefinado;

public class MyAppRefinada {

	public static void main(String[] args) {
		
		int sum = 0;
		for(int i = 0; i < args.length; i++) {
			try {
				sum += Integer.parseInt(args [i]);
			}catch (NumberFormatException nfe) {
				System.err.println("Problemas en la linea de codigo" + "[" + args[i] + "] no es un entero");
			}
		}
		System.out.println("Sum: " + sum);

	}

}
