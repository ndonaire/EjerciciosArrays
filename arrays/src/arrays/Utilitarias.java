package arrays;

public class Utilitarias {
	public static int maximoComunDivisor(int a, int b) {
		int temporal;
		while (b != 0) {
			temporal = b;
			b = a % b;
			a = temporal;
		}
		return a;
	}

	public static boolean esPrimo(int numero) {
		for (int x = 2; x < numero / 2; x++) {
			if (numero % x == 0)
				return false;
		}
		return true;
	}

	public static int combinatoriaSinRep(int a, int b) {

		return Utilitarias.factorial(a) / (Utilitarias.factorial(b) * Utilitarias.factorial(a - b));
	}

	public static int factorial(int numero) {
		if (numero == 0)
			return 1;
		else
			return numero * factorial(numero - 1);
	}

	public static int buscarPosMayor(int[] args) {
		int mayor = args[0];
		int posMayor = 0;
		for (int x = 1; x < args.length; x++) {
			if (args[x] > mayor) {
				mayor = args[x];
				posMayor = x;
			}
		}
		return posMayor;
	}
}
