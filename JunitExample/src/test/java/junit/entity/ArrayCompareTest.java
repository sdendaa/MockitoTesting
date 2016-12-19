package junit.entity;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.Test;

public class ArrayCompareTest {

	@Test
	public void testArraySort_RandomArray() {
		int[] number = { 12, 3, 1, 4 };
		int[] expected = { 1, 3, 4, 12 };
		Arrays.sort(number);
		assertArrayEquals(expected, number);
	}

	@Test(expected = NullPointerException.class)
	public void testArraySort_NullArray() {
		int[] number = null;

		Arrays.sort(number);

	}
	@Test(timeout =100)
	public void testArray_perfomance(){
		int array[] ={34,54,65};
		for(int i =0; i< 1000000; i++){
			array[0] =i;
			Arrays.sort(array);
			
		}
	}

}
