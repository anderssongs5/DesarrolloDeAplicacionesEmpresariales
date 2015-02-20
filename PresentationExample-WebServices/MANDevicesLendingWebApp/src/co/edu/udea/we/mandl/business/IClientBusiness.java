package co.edu.udea.we.mandl.business;

import co.edu.udea.we.mandl.business.exception.MANDevicesLendingBusinessException;
import co.edu.udea.we.mandl.model.dto.Client;

/**
 * Interfaz definida para establecer los m&eacute;todos que se podr&aacute;n
 * realizar sobre los procesos que involucran instancias pertenecientes a la
 * clase {@code Client}, y de ese modo, realizar la gesti&oacute;n de los
 * diversos datos sobre el contexto de persistencia definido para el aplicativo.
 * <p>
 * Esta interfaz define los m&eacute;todos o funciones que se deber&aacute;n
 * implementar para dar soporte a las operaciones requeridas por la
 * l&oacute;gica del negocio y que requieren acceso o interacci&oacute;n con la
 * capa encargada de brindar acceso a los datos de las entidades {@code Client}.
 * <p>
 * De es modo, esta interfaz debe ser implementada por aquella clase que defina
 * de una forma espec&iacute;fica todos los procesos del negocio referentes a
 * las entidades {@code Client}. En otras palabras, el objetivo primordial de
 * esta interfaz es definir las operaciones m&aacute;s b&aacute;sicas y
 * requeridas que se realizar&aacute;n sobre la l&oacute;fica del negocio y que
 * en su mayor&iacute;a, interactuar&aacute;n con la capa que define el contexto
 * de persistencia en la aplicaci&oacute;n con respecto a las instancias
 * {@code Client}.
 * 
 * @since JDK1.7
 * 
 * @version 1.0
 * 
 * @author Andersson Garc&iacute;a Sotelo
 * @author Miguel &Aacute;ngel Ossa Ruiz
 * @author Neiber Padierna P&eacute;rez
 */
public interface IClientBusiness {

	/**
	 * M&acute;todo que sirve para efectuar el proceso de negocio encargado de
	 * encontrar los datos correspondientes de la instancia tipo {@code Client}
	 * que desea iniciar sesi&oacute;n.
	 * <p>
	 * Este m&eacute;todo realizar&aacute; una consulta con los
	 * par&aacute;metros adecuados hacia el contexto de persistencia, logrando
	 * de ese modo extraer los datos de la instancia {@code Client} que
	 * facilitar&aacute;n el apoyo a este proceso del negocio.
	 * <p>
	 * 
	 * @param email
	 *            Representa el e-mail o nombre de usuario, que es a su vez la
	 *            clave primaria de la entidad {@code Client} que desea iniciar
	 *            sesi&oacute;n.
	 * @param password
	 *            Representa la contrase&ntilde;a de aquel que requiere iniciar
	 *            sesi&oacute;n.
	 * @return Un objeto que encapsula la informaci&oacute;n arrojada como
	 *         resultado de la ejecuci&oacute;n de este proceso de negocio.
	 * @throws MANDevicesLendingBusinessException
	 *             Excepci&oacute;n lanzada cuando alg&uacute;n error ha surgido
	 *             durante la ejecuci&oacute;n de alg&uacute;n proceso en el
	 *             l&oacute;gica del negocio.
	 */
	public Client findByLogin(String email, String password)
			throws MANDevicesLendingBusinessException;

	/**
	 * M&eacute;todo que es usado para ejecutar una actualizaci&oacute;n sobre
	 * la capa de persistencia definida en la aplicaci&oacute;n, con el objetivo
	 * de guardar o salvar todos los datos o atributos pertenecientes a una
	 * entidad del tipo {@code Client} que se desea persistir
	 * f&iacute;sicamente.
	 * <p>
	 * Este m&eacute;todo invocar&aacute; a las funciones del contexto de
	 * persistencia definido en la aplicaci&oacute;n para efectuar una
	 * actualizaci&oacute;n o registro de una nueva entidad {@code Client}.
	 * <p>
	 * Este m&eacute;todo ejecutar&aacute; todas las validaciones requeridas con
	 * respecto a las reglas de negocio exigidas para efectuar o llevar a cabo
	 * este proceso, y de ese modo, garantizar la integridad de los datos, y que
	 * los resultados del proceso sean los realmente adecuados y esperados.
	 * <p>
	 * 
	 * @param idNumber
	 *            N&uacute;mero de identificaci&oacute;n de la nueva instancia
	 *            de la entidad {@code Client} a registrar. Representa uno de
	 *            los componentes de la clave for&aacute;nea a la entidad
	 *            {@code Person}.
	 * @param documentType
	 *            Tipo de documento de identificaci&oacute;n de la nueva
	 *            instancia de la entidad {@code Client} a registrar. Representa
	 *            el otro componente de la clave for&aacute;nea a la entidad
	 *            {@code Person}.
	 * @param firstNames
	 *            Representa los nombres de la nueva instancia de la entidad
	 *            {@code Client} a registrar.
	 * @param lastNames
	 *            Representa los apellidos de la nueva instancia de la entidad
	 *            {@code Client} a registrar.
	 * @param email
	 *            Representa el Correo Electr&oacute;nico que servir&aacute; de
	 *            nombre de usuario.
	 * @param password
	 *            Representa la clave o contrase&ntilde; que ser&aacute;
	 *            asociada al nombre de usuario.
	 * @param profile
	 *            Es el perfil de la nueva instancia de la entidad
	 *            {@code Client} a registrar. Representa la clave for&aacute;nea
	 *            a la entidad {@code Profile}.
	 * @param mobilePhoneNumber
	 *            Representa el n&uacute;mero de tel&eacute;fono m&oacute;vil de
	 *            la nueva instancia de la entidad {@code Client} a registrar.
	 *            Es un valor no obligatorio, por lo que puede tener el valor
	 *            <code>null</code>.
	 * @param homePhoneNumber
	 *            Representa el n&uacute;mero de tel&eacute;fono fijo de la
	 *            nueva instancia de la entidad {@code Client} a registrar. Es
	 *            un valor no obligatorio, por lo que puede tener el valor
	 *            <code>null</code>.
	 * @return Un objeto que representa la nueva instancia de la clase
	 *         {@code Client} que ha sido persistida en la capa de persistencia.
	 * @throws MANDevicesLendingBusinessException
	 *             Excepci&oacute;n lanzada cuando alg&uacute;n error ha surgido
	 *             durante la ejecuci&oacute;n de alg&uacute;n proceso en el
	 *             l&oacute;gica del negocio.
	 */
	public Client save(String idNumber, String documentType, String firstNames,
			String lastNames, String email, String password, String profile,
			String mobilePhoneNumber, String homePhoneNumber)
			throws MANDevicesLendingBusinessException;

	/**
	 * M&acute;todo que sirve para efectuar el proceso de negocio encargado del
	 * cambio o actualizaci&oacute;n del perfil de la entidad {@code Client}.
	 * <p>
	 * Este m&eacute;todo realizar&aacute; una actualizaci&oacute;n con los
	 * par&aacute;metros adecuados hacia el contexto de persistencia, logrando
	 * de ese modo actualizar y extraer los datos de la instancia {@code Client}
	 * que facilitar&aacute;n el apoyo a este proceso del negocio.
	 * <p>
	 * 
	 * @param clientId
	 *            Represeta la clave primaria de la entidad {@code Client} que
	 *            se quiere actualizar; por lo tanto, representa el e-mail o
	 *            nombre de usuario.
	 * @param newProfile
	 *            Representa el nuevo perfil al que debe ser actualizado la
	 *            entidad {@code Client}.
	 * @return Un objeto de la entidad {@code Client} que encapsula toda la
	 *         informaci&oacute;n de la instancia actualizada.
	 * @throws MANDevicesLendingBusinessException
	 *             Excepci&oacute;n lanzada cuando alg&uacute;n error ha surgido
	 *             durante la ejecuci&oacute;n de alg&uacute;n proceso en el
	 *             l&oacute;gica del negocio.
	 */
	public Client changeProfile(String clientId, String newProfile)
			throws MANDevicesLendingBusinessException;
}