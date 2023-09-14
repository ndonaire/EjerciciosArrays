package arrays;

public class Ejercicio03 {

	public static void main(String[] args) {
		int array[] = new int[] { 24, 36, 45, 75, 91 };
		int[] arrayRes = ejercicio_03(array);
		for (int x = 0; x < arrayRes.length; x++) {
			System.out.print(arrayRes[x]);
			System.out.print("\t");
		}
	}

	public static int[] ejercicio_03(int[] args) {
		int arrayParejasMCD[][] = new int[Utilitarias.combinatoriaSinRep(args.length, 2)][2];
		int arrayMCD[] = new int[args.length];
		int mcd, posMayor;
		int num1, num2;
		int i, j, k = 0;
		for (i = 0; i < args.length; i++) {
			num1 = args[i];
			for (j = i + 1; j < args.length; j++) {
				num2 = args[j];
				if (!Utilitarias.esPrimo(mcd = Utilitarias.maximoComunDivisor(num1, num2))) {
					arrayParejasMCD[k][0] = num1;
					arrayParejasMCD[k][1] = num2;
					arrayMCD[k] = mcd;
					k++;
				}
			}
		}
		posMayor = Utilitarias.buscarPosMayor(arrayMCD);
		return arrayParejasMCD[posMayor];
	}
}
