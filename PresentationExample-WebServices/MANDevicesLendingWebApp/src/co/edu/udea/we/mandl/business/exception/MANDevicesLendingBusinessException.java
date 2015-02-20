package co.edu.udea.we.mandl.business.exception;

import org.apache.log4j.Logger;

/**
 * Clase que define una excepci&oacute;n gen&eacute;rica que ser&aacute; lanzada
 * en la capa de negocio de la aplicaci&oacute;n. Esta excepci&oacute;n
 * ser&aacute; lanzada por cada funci&oacute;n o m&eacute;todo que se implemente
 * en la l&oacute;gica del negocio, independientemente del proceso sobre las
 * entidades que se est&eacute; llevando a cabo.
 * <p>
 * La excepci&oacute;n se lanza para escalar los errores a las capas superiores
 * a la capa de l&oacute;gica del negocio, y de ese modo delegar a las capas
 * superiores el manejo de los errores y la informaci&oacute;n que estos
 * contengan.
 * 
 * @since JDK1.7
 * 
 * @version 1.0
 * 
 * @author Andersson Garc&iacute;a Sotelo
 * @author Miguel &Aacute;ngel Ossa Ruiz
 * @author Neiber Padierna P&eacute;rez
 */
public class MANDevicesLendingBusinessException extends Exception {

	/**
	 * Atributo constante para realizar la gesti&oacute;n de los errores a
	 * trav&eacute;s de un <b>LOG</b> gen&eacute;rico.
	 */
	private static final Logger LOG = Logger
			.getLogger(MANDevicesLendingBusinessException.class);

	/**
	 * Constante utilizada para realizar operaciones de serializaci&oacute;n y
	 * deserializaci&oacute;n de la instancia
	 * {@code MANDevicesLendingBusinessException}, e igualmente, de todos los
	 * atributos esta instancia agrupe.
	 */
	private static final long serialVersionUID = -2565347223495941248L;

	/**
	 * Constructor por defecto y sin par&aacute;metros para generar instancias
	 * de esta clase.
	 * <p>
	 * Este constructor realizar&aacute; una llamada expl&iacute;cita a su
	 * constructor padre. Por otra parte, el constructor est&aacute; en la
	 * capacidad de escribir en el archivo de LOG definido para la
	 * aplicaci&oacute;n.
	 */
	public MANDevicesLendingBusinessException() {
		super();
		LOG.error("MANDevicesLendingBusinessException: An error has happened during process.");
	}

	/**
	 * Constructor sobrecargado para generar instancias de esta clase utilizando
	 * un mensaje personalizado para la excepci&oacute;n a ser creada. Por otra
	 * parte, el constructor est&aacute; en la capacidad de escribir en el
	 * archivo de LOG definido para la aplicaci&oacute;n.
	 * 
	 * @param message
	 *            Instancia que representa el mensaje personalizado sobre el
	 *            error o excepci&oacute;n ocurrida.
	 */
	public MANDevicesLendingBusinessException(String message) {
		super(message);
		LOG.error("MANDevicesLendingBusinessException: An error has happened during process."
				+ message);
	}

	/**
	 * Constructor sobrecargado para generar instancias de esta clase utilizando
	 * una instancia {@code Throwable} personalizada para la excepci&oacute;n a
	 * ser creada. Por otra parte, el constructor est&aacute; en la capacidad de
	 * escribir en el archivo de LOG definido para la aplicaci&oacute;n.
	 * 
	 * @param cause
	 *            Instancia que representa la causa o raz&oacute;n del error a
	 *            ser lanzado.
	 */
	public MANDevicesLendingBusinessException(Throwable cause) {
		super(cause);
		LOG.error(
				"MANDevicesLendingBusinessException: An error has happened during process.",
				cause);
	}

	/**
	 * Constructor sobrecargado para generar instancias de esta clase utilizando
	 * un mensaje y una instancia {@code Throwable} personalizada para la
	 * excepci&oacute;n a ser creada. Por otra parte, el constructor est&aacute;
	 * en la capacidad de escribir en el archivo de LOG definido para la
	 * aplicaci&oacute;n.
	 * 
	 * @param message
	 *            Instancia que representa el mensaje personalizado sobre el
	 *            error o excepci&oacute;n ocurrida.
	 * @param cause
	 *            Instancia que representa la causa o raz&oacute;n del error a
	 *            ser lanzado.
	 */
	public MANDevicesLendingBusinessException(String message, Throwable cause) {
		super(message, cause);
		LOG.error(
				"MANDevicesLendingBusinessException: An error has happened during process.",
				cause);
	}

	/**
	 * Constructor sobrecargado para generar instancias de esta clase utilizando
	 * un mensaje y una instancia {@code Throwable} personalizada para la
	 * excepci&oacute;n a ser creada, junto con atributos para especificar la
	 * forma en la que los mensajes deben ser mostrados. Por otra parte, el
	 * constructor est&aacute; en la capacidad de escribir en el archivo de LOG
	 * definido para la aplicaci&oacute;n.
	 * 
	 * @param message
	 *            Instancia que representa el mensaje personalizado sobre el
	 *            error o excepci&oacute;n ocurrida.
	 * @param cause
	 *            Instancia que representa la causa o raz&oacute;n del error a
	 *            ser lanzado.
	 * @param enableSuppression
	 *            Indica si la supresi&oacute;n es activada o no.
	 * @param writableStackTrace
	 *            Indica si el mensaje debe ser mostrado en la pila de llamadas.
	 *            <code>true</code> indica que el mensaje ha de ser escrito en
	 *            la pila de llamadas.
	 */
	public MANDevicesLendingBusinessException(String message, Throwable cause,
			boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
		LOG.error(
				"MANDevicesLendingBusinessException: An error has happened during process.",
				cause);
	}
}