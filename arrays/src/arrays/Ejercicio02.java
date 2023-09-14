package arrays;

public class Ejercicio02 {

	public static void main(String[] args) {
		int array[] = new int[] {24, 15, 36, 49, -50};
		int[][] arrayRes = ejercicio_02(array);
		for (int x=0; x < arrayRes.length; x++) {
			  for (int y=0; y < arrayRes[x].length; y++) {
			    System.out.print (arrayRes[x][y]);
			    if (y!=arrayRes[x].length-1) System.out.print("\t");
			  }
			  System.out.print("\n");
			}
	}
	
	public static int[][] ejercicio_02(int[] args) {
		int arrayMCD[][] = new int[1][2];
		int num1,num2;
		int i, j, k = 0;
		for (i = 0; i < args.length; i++) {
			num1 = args[i];
			for (j = i + 1; j < args.length; j++) {
				num2 = args[j];
				if (!Utilitarias.esPrimo(Utilitarias.maximoComunDivisor(num1,num2))) {
					arrayMCD[k][0] = num1;
					arrayMCD[k][1] = num2;
					k++;
					}
				}
			}
		return arrayMCD;
	}
}
