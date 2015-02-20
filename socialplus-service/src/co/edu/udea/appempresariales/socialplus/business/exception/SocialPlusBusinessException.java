package co.edu.udea.appempresariales.socialplus.business.exception;

public class SocialPlusBusinessException extends Exception {

	private static final long serialVersionUID = -6684575337900319987L;

	public SocialPlusBusinessException() {
		super();
	}

	public SocialPlusBusinessException(String message) {
		super(message);
	}

	public SocialPlusBusinessException(Throwable cause) {
		super(cause);
	}

	public SocialPlusBusinessException(String message, Throwable cause) {
		super(message, cause);
	}

	public SocialPlusBusinessException(String message, Throwable cause,
			boolean enableSupression, boolean writableStackTrace) {
		super(message, cause, enableSupression, writableStackTrace);
	}
}