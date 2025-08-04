package estructuraDeDatos;

import java.util.ArrayList;

public class ArraysStructure {
	private final int[] numbersPrimitive = new int[10_000_000];
	private final ArrayList<Integer> numbersDynamic = new ArrayList<Integer>();

	public void testPrimitivePerformance() {
		long start, end;

		start = System.nanoTime();
		fillArrayPrimitive();
		end = System.nanoTime();

		System.out.println("TEST: Primitive array write time: " + ( end - start ) / 1_000_000_000.0 + " seg");
	}

	public void testReadPrimitivePerformance() {
		long start, end;
		long sum = 0;

		start = System.nanoTime();
		for(int number: numbersPrimitive) {
			sum += number;
		}
		end = System.nanoTime();
		System.out.println("TEST: Primitive array read time: " + ( end - start ) / 1_000_000_000.0 + " seg");
	}
	public void testReadDynamicPerformance() {
		long start, end;
		long sum = 0;

		start = System.nanoTime();
		for(int number: numbersDynamic) {
			sum += number;
		}
		end = System.nanoTime();
		System.out.println("TEST: Dynamic array read time: " + ( end - start ) / 1_000_000_000.0 + " seg");
	}

	public void testDynamicPerformance() {
		long start, end;

		start = System.nanoTime();
		fillArrayDynamic();
		end = System.nanoTime();

		System.out.println("TEST: Dynamic array write time: " + ( end - start ) / 1_000_000_000.0 + " seg");
	}

	private void fillArrayDynamic() {
		for(int index = 0; index < 10_000_000; index++) {
			numbersDynamic.add(index);
		}
	}

	private void fillArrayPrimitive() {
		for(int index = 0; index < numbersPrimitive.length; index++) {
			numbersPrimitive[index] = index;
		}
	}

}
