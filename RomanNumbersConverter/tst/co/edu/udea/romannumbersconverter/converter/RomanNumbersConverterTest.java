package co.edu.udea.romannumbersconverter.converter;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class RomanNumbersConverterTest {

	RomanNumbersConverter converter = new RomanNumbersConverter();

	@Test
	public void testConvertionInvalidNumberBottomLimit() {
		String result = this.converter.convertDecimalToRomanNumber(0);
		assertEquals("INVALID NUMBER", result);
	}

	@Test
	public void testConvertionInvalidNumberTopLimit() {
		String result = this.converter.convertDecimalToRomanNumber(4000);
		assertEquals("INVALID NUMBER", result);
	}

	@Test
	public void testConvertionValidNumberBottomLimit() {
		String result = this.converter.convertDecimalToRomanNumber(1);
		assertEquals("I", result);
	}

	@Test
	public void testConvertionValidNumberTopLimit() {
		String result = this.converter.convertDecimalToRomanNumber(3999);
		assertEquals("MMMCMXCIX", result);
	}

	@Test
	public void testConvertionLessThanTen() {
		String result = this.converter.convertDecimalToRomanNumber(5);
		assertEquals("V", result);
	}

	@Test
	public void testConvertionEqualToTen() {
		String result = this.converter.convertDecimalToRomanNumber(10);
		assertEquals("X", result);
	}

	@Test
	public void testConvertionGreaterThanTenAndLessThanOneHundread() {
		String result = this.converter.convertDecimalToRomanNumber(379);
		assertEquals("CCCLXXIX", result);
	}

	@Test
	public void testConvertionEqualToOneHundred() {
		String result = this.converter.convertDecimalToRomanNumber(100);
		assertEquals("C", result);
	}

	@Test
	public void testConvertionEqualToOneThousand() {
		String result = this.converter.convertDecimalToRomanNumber(1000);
		assertEquals("M", result);
	}

	@Test
	public void testConvertionGreaterThanOneHundreadAndLessThanThreeThousandThreeHundredAndNinetyNine() {
		String result = this.converter.convertDecimalToRomanNumber(2783);
		assertEquals("MMDCCLXXXIII", result);
	}
}