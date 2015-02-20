package co.edu.udea.appempresariales.socialplus.util;

public final class TextUtil {

	private TextUtil() {
		super();
	}

	public static boolean isEmpty(String s) {

		return ((s == null) || (s.trim().isEmpty()));
	}
}