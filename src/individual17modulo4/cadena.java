package individual17modulo4;

	import java.util.Scanner;

	public class cadena {
	    public static void main(String[] args) {
	    	
	        Scanner scanner = new Scanner(System.in);
	        String input;

	        do {
	            System.out.print("Ingrese el texto que desea comprobar: ");
	            input = scanner.nextLine().trim();
	        } while (input.isEmpty());

	        scanner.close();

	        int vocales = 0;
	        int consonantes = 0;

	        for (int i = 0; i < input.length(); i++) {
	            char ch = Character.toLowerCase(input.charAt(i));
	            if (Character.isLetter(ch)) {
	                if (Vocales(ch)) {
	                    vocales++;
	                } else {
	                    consonantes++;
	                }
	            }
	        }

	        System.out.println("Cantidad de vocales: " + vocales);
	        System.out.println("Cantidad de consonantes: " + consonantes);
	    }

	    private static boolean Vocales(char ch) {
	        ch = Character.toLowerCase(ch);
	        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
	    }
	}
