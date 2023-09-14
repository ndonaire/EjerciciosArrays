package arrays;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.fail;
import org.junit.Test;

public class arraysTests {


	//@Test 
	public void test() {
		fail("Not yet implemented");
	}
	
	@Test
	public void testEjercicio_01() {
		int[] arrayIn = new int [] {1, 2, 3, 4, -5};
		int[][] arrayOuts = new int [][] {{1,4,-5},{2, 3, -5}};
		
		assertArrayEquals(arrayOuts, Ejercicio01.ejercicio_01(arrayIn));
	}
	
	@Test
	public void testEjercicio_02() {
		int[] arrayIn = new int [] {24, 15, 36, 49, -50};
		int[][] arrayOuts = new int [][] {{24,36}};
		
		assertArrayEquals(arrayOuts, Ejercicio02.ejercicio_02(arrayIn));
	}
	
	@Test
	public void testEjercicio_03() {
		int[] arrayIn = new int [] { 24, 36, 45, 75, 91 };
		int[] arrayOuts = new int [] {45, 75};
		
		assertArrayEquals(arrayOuts, Ejercicio03.ejercicio_03(arrayIn));
	}
	
	
}
