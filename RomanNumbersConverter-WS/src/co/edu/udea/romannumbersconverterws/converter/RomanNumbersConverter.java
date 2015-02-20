package co.edu.udea.romannumbersconverterws.converter;

public class RomanNumbersConverter {

	public static String INVALID_NUMBER = "INVALID NUMBER";
	public static int ZERO_POSITION = 0;
	private String[] unitsNumbers = { "I", "II", "III", "IV", "V", "VI", "VII",
			"VIII", "IX" };
	private String[] tensNumbers = { "X", "XX", "XXX", "XL", "L", "LX", "LXX",
			"LXXX", "XC" };
	private String[] hundredsNumbers = { "C", "CC", "CCC", "CD", "D", "DC",
			"DCC", "DCCC", "CM" };
	private String[] thousandsNumbers = { "M", "MM", "MMM" };

	public RomanNumbersConverter() {
		super();
	}

	public String convertDecimalToRomanNumber(int number) {
		if (number <= 0 || number >= 4000) {

			return (INVALID_NUMBER);
		}

		StringBuilder romanNumber = new StringBuilder();

		if (number < 10) {

			romanNumber.append(unitsNumbers[number - 1]);
		} else {
			int units = number % 10;
			romanNumber.append(this.returnRomanUnits(units));
			int temp = number / 10;
			int tens;
			if (number < 100) {
				tens = temp;

				romanNumber.insert(ZERO_POSITION, tensNumbers[tens - 1]);
			} else {
				tens = temp % 10;
				romanNumber.insert(ZERO_POSITION, this.returnRomanTens(tens));
				temp = temp / 10;
				int hundreds;
				if (number < 1000) {
					hundreds = temp;

					romanNumber.insert(ZERO_POSITION,
							hundredsNumbers[hundreds - 1]);
				} else {
					hundreds = temp % 10;
					int thousands = temp / 10;

					romanNumber.insert(ZERO_POSITION,
							this.returnRomanHundreds(hundreds));
					romanNumber.insert(ZERO_POSITION,
							thousandsNumbers[thousands - 1]);
				}
			}
		}

		return (romanNumber.toString());
	}

	private String returnRomanUnits(int units) {
		if (units != 0) {

			return (unitsNumbers[units - 1]);
		}

		return ("");
	}

	private String returnRomanTens(int tens) {
		if (tens != 0) {

			return (tensNumbers[tens - 1]);
		}

		return ("");
	}

	private String returnRomanHundreds(int hundreds) {
		if (hundreds != 0) {

			return (hundredsNumbers[hundreds - 1]);
		}

		return ("");
	}
}
