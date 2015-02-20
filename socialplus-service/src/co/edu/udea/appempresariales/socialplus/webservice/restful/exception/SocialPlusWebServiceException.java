package co.edu.udea.appempresariales.socialplus.webservice.restful.exception;

public class SocialPlusWebServiceException extends Exception {

	private static final long serialVersionUID = 7552892177204985425L;

	public SocialPlusWebServiceException() {
		super();
	}

	public SocialPlusWebServiceException(String message) {
		super(message);
	}

	public SocialPlusWebServiceException(Throwable cause) {
		super(cause);
	}

	public SocialPlusWebServiceException(String message, Throwable cause) {
		super(message, cause);
	}

	public SocialPlusWebServiceException(String message, Throwable cause,
			boolean enableSupression, boolean writableStackTrace) {
		super(message, cause, enableSupression, writableStackTrace);
	}
}