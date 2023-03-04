package nayzek.division;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class DivisionResultFormatterTest {

	DivisionResultFormatter testing = new DivisionResultFormatter();

	@Test
	void testRepeatWhitespacesFiveTimes() {
		assertEquals("     ", testing.repeatWhitespaces(5));
	}

	@Test
	void testRepeatWhitespacesZeroTimes() {
		assertEquals("", testing.repeatWhitespaces(0));
	}

	@Test
	void testRepeatWhitespacesOneTimes() {
		assertEquals(" ", testing.repeatWhitespaces(1));
	}

}
