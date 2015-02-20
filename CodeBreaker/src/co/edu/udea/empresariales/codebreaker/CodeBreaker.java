package co.edu.udea.empresariales.codebreaker;

public class CodeBreaker {

	public static final String X = "X";
	public static final String HYPHEN = "-";
	public static final String QUESTION_MARK = "?";
	public static final int FULL_SIZE = 4;

	private String hidddenNumber;

	public CodeBreaker(String hidddenNumber) {
		this.hidddenNumber = hidddenNumber;
	}

	public String getHidddenNumber() {

		return hidddenNumber;
	}

	public void setHidddenNumber(String hidddenNumber) {
		this.hidddenNumber = hidddenNumber;
	}

	public String guessNumber(String supposedNumber) {
		if (this.validateLetters(supposedNumber)
				|| !this.validateSize(supposedNumber)) {

			return (QUESTION_MARK);
		}

		StringBuilder result = new StringBuilder();
		StringBuilder hiddenNumberCopy = new StringBuilder();

		boolean[] positions = new boolean[this.getHidddenNumber().length()];

		for (int position = 0; position < this.getHidddenNumber().length(); position++) {
			char firstChar = this.getHidddenNumber().charAt(position);
			char secondChar = supposedNumber.charAt(position);
			if (firstChar == secondChar) {
				result.append(X);

				positions[position] = true;
			} else {
				hiddenNumberCopy.append(firstChar);
			}
		}

		if (hiddenNumberCopy.length() != 0) {
			for (int position = 0; position < positions.length; position++) {
				if (!positions[position]) {
					String subString = supposedNumber.substring(position,
							position + 1);
					int temp = hiddenNumberCopy.indexOf(subString);
					if (temp != -1) {
						result.append(HYPHEN);
					}
				}
			}
		}

		return (result.toString());
	}

	private boolean validateSize(String hiddenNumber) {
		if (hiddenNumber != null && hiddenNumber.length() == FULL_SIZE) {

			return (true);
		}

		return (false);
	}

	private boolean validateLetters(String supposedNumber) {
		for (char c : supposedNumber.toCharArray()) {
			if (c < 48 || c > 57) {

				return (true);
			}
		}

		return (false);
	}
}