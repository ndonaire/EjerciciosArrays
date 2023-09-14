package arrays;

public class Ejercicio01 {

	public static void main(String[] args) {
		int array[] = new int[] { 1, 2, 3, 4, -5 };
		int[][] arrayRes = ejercicio_01(array);
		for (int x = 0; x < arrayRes.length; x++) {
			for (int y = 0; y < arrayRes[x].length; y++) {
				System.out.print(arrayRes[x][y]);
				if (y != arrayRes[x].length - 1)
					System.out.print("   ");
			}
			System.out.print("\n");
		}

	}

	public static int[][] ejercicio_01(int[] args) {
		int arraySumandos[][] = new int[2][3];
		int sum1, sum2, sum3;
		int i, j, k, x = 0;
		for (i = 0; i < args.length; i++) {
			sum1 = args[i];
			for (j = i + 1; j < args.length; j++) {
				sum2 = args[j];
				for (k = j + 1; k < args.length; k++) {
					if ((sum1 + sum2 + args[k]) == 0) {
						sum3 = args[k];
						arraySumandos[x][0] = sum1;
						arraySumandos[x][1] = sum2;
						arraySumandos[x][2] = sum3;
						x++;
					}

				}
			}
		}
		return arraySumandos;
	}
}
