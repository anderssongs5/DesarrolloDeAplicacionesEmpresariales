package co.edu.udea.appempresariales.socialplus.dao.exception;

public class SocialPlusDAOException extends Exception {

	private static final long serialVersionUID = 4620585232711010534L;

	public SocialPlusDAOException() {
		super();
	}

	public SocialPlusDAOException(String message) {
		super(message);
	}

	public SocialPlusDAOException(Throwable cause) {
		super(cause);
	}

	public SocialPlusDAOException(String message, Throwable cause) {
		super(message, cause);
	}

	public SocialPlusDAOException(String message, Throwable cause,
			boolean enableSupression, boolean writableStackTrace) {
		super(message, cause, enableSupression, writableStackTrace);
	}
}