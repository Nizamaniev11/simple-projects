package nayzek.division;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class LongDivisionerTest {
	
	LongDivisioner test = new LongDivisioner();

	@Test
	void testDivisorNotNull() {
		assertEquals(78945 / 4, test.divide(78945, 4).getQuotient());
	}

	@Test
	void testDivisorIsOne() {
		assertEquals(78945, test.divide(78945, 1).getQuotient());
	}

	@Test
	void testDivisorMoreThanDivided() {
		assertEquals(0, test.divide(78, 100).getQuotient());
	}

	@Test
	void testDivisorIsNull() {
		try {
			test.divide(78, 0);
			fail();
		} catch (Exception ex) {
			assertEquals("divisor can t be 0", ex.getMessage());
		}
	}

	@Test
	void testconvertIntegerToIntegerArray() {
		int[] arrayOfDigits = test.convertIntegerToIntegerArray(175);
		int summ = 0;
		for (int i = 0; i < arrayOfDigits.length; i++) {
			summ += arrayOfDigits[i];
		}
		assertEquals(1 + 7 + 5, summ);
	}

}
