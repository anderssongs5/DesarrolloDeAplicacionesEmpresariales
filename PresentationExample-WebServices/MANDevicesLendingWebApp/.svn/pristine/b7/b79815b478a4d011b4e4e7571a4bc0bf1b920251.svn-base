package co.edu.udea.we.mandl.business;

import java.util.List;

import co.edu.udea.we.mandl.business.exception.MANDevicesLendingBusinessException;
import co.edu.udea.we.mandl.model.dto.Device;

/**
 * Interfaz definida para establecer los m&eacute;todos que se podr&aacute;n
 * realizar sobre los procesos que involucran instancias pertenecientes a la
 * clase {@code Device}, y de ese modo, realizar la gesti&oacute;n de los
 * diversos datos sobre el contexto de persistencia definido para el aplicativo.
 * <p>
 * Esta interfaz define los m&eacute;todos o funciones que se deber&aacute;n
 * implementar para dar soporte a las operaciones requeridas por la
 * l&oacute;gica del negocio y que requieren acceso o interacci&oacute;n con la
 * capa encargada de brindar acceso a los datos de las entidades {@code Device}.
 * <p>
 * De es modo, esta interfaz debe ser implementada por aquella clase que defina
 * de una forma espec&iacute;fica todos los procesos del negocio referentes a
 * las entidades {@code Device}. En otras palabras, el objetivo primordial de
 * esta interfaz es definir las operaciones m&aacute;s b&aacute;sicas y
 * requeridas que se realizar&aacute;n sobre la l&oacute;fica del negocio y que
 * en su mayor&iacute;a, interactuar&aacute;n con la capa que define el contexto
 * de persistencia en la aplicaci&oacute;n con respecto a las instancias
 * {@code Device}.
 * 
 * @since JDK1.7
 * 
 * @version 1.0
 * 
 * @author Andersson Garc&iacute;a Sotelo
 * @author Miguel &Aacute;ngel Ossa Ruiz
 * @author Neiber Padierna P&eacute;rez
 */
public interface IDeviceBusiness {

	/**
	 * M&acute;todo que sirve para efectuar el proceso de negocio encargado de
	 * establecer un nuevo estado de disponibilidad a una instancia de la
	 * entidad {@code Device}.
	 * <p>
	 * Este m&eacute;todo realizar&aacute; una actualizaci&oacute;n con los
	 * par&aacute;metros adecuados hacia el contexto de persistencia, logrando
	 * de ese modo extraer los datos de la instancia {@code Device} que
	 * facilitar&aacute;n el apoyo a este proceso del negocio.
	 * 
	 * @param deviceId
	 *            Representa la clave primaria de la entidad {@code Device} a
	 *            actualizar.
	 * @param newAvailability
	 *            Nuevo estado de disponibilidad que se desea establecer. El
	 *            valor <code>true</code> indica que estar&aacute; disponible
	 *            desde el momento de la actualizaci&oacute;n.
	 * @return Un objeto que representa la instancia actualizada de la entidad
	 *         {@code Device} que se deseaba persistir en la capa de
	 *         persistencia.
	 * @throws MANDevicesLendingBusinessException
	 *             Excepci&oacute;n lanzada cuando alg&uacute;n error ha surgido
	 *             durante la ejecuci&oacute;n de alg&uacute;n proceso en el
	 *             l&oacute;gica del negocio.
	 */
	public Device changeAvailability(Long deviceId, Boolean newAvailability)
			throws MANDevicesLendingBusinessException;

	/**
	 * M&eacute;todo que sirve para ejecutar una consulta con el objetivo de
	 * extrear todos los datos o atributos pertenecientes a todas las instancias
	 * de la entidad {@code Device} que actualmente est&aacute;n disponibles.
	 * <p>
	 * En caso de no haber ninguna instancia con la condici&oacute;n previamente
	 * mencionada, la funci&oacute;n retornar&aacute; una instancia {@code List}
	 * vac&iacute;a.
	 * <p>
	 * 
	 * @return Un objeto tipo lista que contiene todos los registros consultados
	 *         y obtenidos de tipo {@code Device}.
	 * @throws MANDevicesLendingBusinessException
	 *             Excepci&oacute;n lanzada cuando alg&uacute;n error ha surgido
	 *             durante la ejecuci&oacute;n de alg&uacute;n proceso en el
	 *             l&oacute;gica del negocio.
	 */
	public List<Device> findAllAvailables()
			throws MANDevicesLendingBusinessException;

	/**
	 * M&eacute;todo que sirve para ejecutar una consulta con el objetivo de
	 * extrear todas las entidades tipo {@code Device} que cumplen con el
	 * criterio de filtrado a cabalidad, es decir, se realiza un filtrado por
	 * las caracter&iacute;sticas o tipos que puede tomar una instancia
	 * {@code Device} determinada.
	 * <p>
	 * En caso de no haber ninguna instancia con la condici&oacute;n previamente
	 * mencionada, la funci&oacute;n retornar&aacute; una instancia {@code List}
	 * vac&iacute;a.
	 * <p>
	 * 
	 * @param kindsNamesList
	 *            Listado que contiene los nombres de las caracter&iacute;sticas
	 *            por las cuales se realiza el filtrado.
	 * @return Un objeto tipo lista que contiene todos los registros consultados
	 *         y obtenidos de tipo {@code Device}.
	 * @throws MANDevicesLendingBusinessException
	 *             Excepci&oacute;n lanzada cuando alg&uacute;n error ha surgido
	 *             durante la ejecuci&oacute;n de alg&uacute;n proceso en el
	 *             l&oacute;gica del negocio.
	 */
	public List<Device> findByDevicesKindsNamesList(List<String> kindsNamesList)
			throws MANDevicesLendingBusinessException;

	/**
	 * M&eacute;todo que es usado para ejecutar una actualizaci&oacute;n sobre
	 * la capa de persistencia definida en la aplicaci&oacute;n, con el objetivo
	 * de guardar o salvar todos los datos o atributos pertenecientes a una
	 * entidad del tipo {@code Device} que se desea persistir
	 * f&iacute;sicamente.
	 * <p>
	 * Este m&eacute;todo realizar&aacute; un mapeo adecuado entre los atributos
	 * definidos en la entidad a ser guardada y los atributos o componentes
	 * definidos espec&iacute;ficamente en el contexto de persistencia.
	 * <p>
	 * Adem&aacute;s este m&eacute;todo ejecutar&aacute; todas las validaciones
	 * requeridas con respecto a las reglas de negocio exigidas para efectuar o
	 * llevar a cabo este proceso, y de ese modo, garantizar la integridad de
	 * los datos, y que los resultados del proceso sean los realmente adecuados
	 * y esperados.
	 * <p>
	 * 
	 * @param fullName
	 *            Representa el nombre completo de la nueva instancia de la
	 *            entidad {@code Device} que se quiere agregar al respositorio
	 *            de datos.
	 * @param isAvailable
	 *            Representa el estado de disponibilidad para la nueva
	 *            instancia. Si toma el valor <code>true</code>, indica que
	 *            estar&aacute; disponible desde ese momento.
	 * @param description
	 *            Atributo que representa una descripci&oacute;n que puede tener
	 *            la nueva instancia. No es un atributo obligatorio.
	 * @param photoImage
	 *            Atributo que representa la ruta o nombre del archivo en el
	 *            cual se podr&aacute; encontrar una imagen que describe la
	 *            nueva instancia de la entidad {@code Device}. No es un
	 *            atributo obligatorio.
	 * @param kindsNamesList
	 *            Objeto tipo lista que contiene las instancias de la entidad
	 *            {@code Kind} que lista los tipos que puede tener la entidad
	 *            {@code Device} que ser&aacute; persistida.
	 * @return Un objeto que representa la nueva instancia de la clase
	 *         {@code Device} que ha sido persistida en la capa de persistencia.
	 * @throws MANDevicesLendingBusinessException
	 *             Excepci&oacute;n lanzada cuando alg&uacute;n error ha surgido
	 *             durante la ejecuci&oacute;n de alg&uacute;n proceso en el
	 *             l&oacute;gica del negocio.
	 */
	public Device save(String fullName, Boolean isAvailable,
			String description, String photoImage, List<String> kindsNamesList)
			throws MANDevicesLendingBusinessException;
}