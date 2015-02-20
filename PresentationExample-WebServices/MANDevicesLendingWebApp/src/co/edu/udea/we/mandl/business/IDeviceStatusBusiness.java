package co.edu.udea.we.mandl.business;

import java.util.List;

import co.edu.udea.we.mandl.business.exception.MANDevicesLendingBusinessException;
import co.edu.udea.we.mandl.model.dto.DeviceStatus;

/**
 * Interfaz definida para establecer los m&eacute;todos que se podr&aacute;n
 * realizar sobre los procesos que involucran instancias pertenecientes a la
 * clase {@code DeviceStatus}, y de ese modo, realizar la gesti&oacute;n de los
 * diversos datos sobre el contexto de persistencia definido para el aplicativo.
 * <p>
 * Esta interfaz define los m&eacute;todos o funciones que se deber&aacute;n
 * implementar para dar soporte a las operaciones requeridas por la
 * l&oacute;gica del negocio y que requieren acceso o interacci&oacute;n con la
 * capa encargada de brindar acceso a los datos de las entidades
 * {@code DeviceStatus}.
 * <p>
 * De es modo, esta interfaz debe ser implementada por aquella clase que defina
 * de una forma espec&iacute;fica todos los procesos del negocio referentes a
 * las entidades {@code DeviceStatus}. En otras palabras, el objetivo primordial
 * de esta interfaz es definir las operaciones m&aacute;s b&aacute;sicas y
 * requeridas que se realizar&aacute;n sobre la l&oacute;fica del negocio y que
 * en su mayor&iacute;a, interactuar&aacute;n con la capa que define el contexto
 * de persistencia en la aplicaci&oacute;n con respecto a la instancias
 * {@code DeviceStatus}.
 * 
 * @since JDK1.7
 * 
 * @version 1.0
 * 
 * @author Andersson Garc&iacute;a Sotelo
 * @author Miguel &Aacute;ngel Ossa Ruiz
 * @author Neiber Padierna P&eacute;rez
 */
public interface IDeviceStatusBusiness {

	/**
	 * M&acute;todo que sirve para efectuar el proceso de negocio encargado de
	 * evaluar las diversas peticiones de pr&eacute;stamo o reserva con respecto
	 * a los diversos dispositivos registrados en el sistema.
	 * <p>
	 * Este m&eacute;todo realizar&aacute; una actualizaci&oacute;n consecutiva
	 * de los estados de las instancias {@code DeviceStatus} enviadas como
	 * par&aacute;metro al momento de ejecutar la invocaci&oacute;n a este
	 * proceso de negocio.
	 * <p>
	 * Este m&eacute;todo ejecutar&aacute; todas las validaciones requeridas con
	 * respecto a las reglas de negocio exigidas para efectuar o llevar a cabo
	 * este proceso, y de ese modo, garantizar la integridad de los datos, y que
	 * los resultados del proceso sean los realmente adecuados y esperados.
	 * 
	 * @param deviceStatusesList
	 *            Instancia o lista de valores que representan los objetos
	 *            {@code DeviceStatus} que se desean actualizar.
	 * @return Un objeto que representan las entidades que han sido exitosamente
	 *         actualizadas durante la ejecuci&oacute;n del proceso del negocio.
	 * @throws MANDevicesLendingBusinessException
	 *             Excepci&oacute;n lanzada cuando alg&uacute;n error ha surgido
	 *             durante la ejecuci&oacute;n de alg&uacute;n proceso en el
	 *             l&oacute;gica del negocio.
	 */
	public List<DeviceStatus> evaluateLendings(
			List<DeviceStatus> deviceStatusesList)
			throws MANDevicesLendingBusinessException;

	/**
	 * M&acute;todo que sirve para efectuar el proceso de negocio encargado de
	 * encontrar y listar todas aquellas peticiones de pr&eacute;stamo o reserva
	 * con respecto a los diversos dispositivos registrados en el sistema.
	 * <p>
	 * Este m&eacute;todo realizar&aacute; una consulta con los
	 * par&aacute;metros adecuados hacia el contexto de persistencia, logrando
	 * de ese modo extraer los datos de las instancias {@code DeviceStatus} para
	 * ser evaluadas y operadas durante la ejecuci&oacute;n del proceso de
	 * negocio que apoya esta funci&oacute;n.
	 * <p>
	 * Este m&eacute;todo est&aacute; en la capacidad de restringir los
	 * resultados arrojados como respuesta a la ejecuci&oacute;n de este
	 * m&eacute;todo, con el fin de cumplir con ciertas reglas del negocio
	 * definidas para la gesti&oacute;n y administraci&oacute;n de las reservas
	 * realizadas.
	 * <p>
	 * Este m&eacute;todo ejecutar&aacute; todas las validaciones requeridas con
	 * respecto a las reglas de negocio exigidas para efectuar o llevar a cabo
	 * este proceso, y de ese modo, garantizar la integridad de los datos, y que
	 * los resultados del proceso sean los realmente adecuados y esperados.
	 * 
	 * @param clientUserName
	 *            Instancia que representa el nombre de usuario del cliente o
	 *            persona que inicia o ejecuta este proceso de consulta de
	 *            negocio.
	 * @return Un objeto tipo lista que contiene todos los registros consultados
	 *         o arrojados como resultado de la ejecuci&oacute;n de este proceso
	 *         de negocio.
	 * @throws MANDevicesLendingBusinessException
	 *             Excepci&oacute;n lanzada cuando alg&uacute;n error ha surgido
	 *             durante la ejecuci&oacute;n de alg&uacute;n proceso en el
	 *             l&oacute;gica del negocio.
	 */
	public List<DeviceStatus> findUnsolvedLendings(String clientUserName)
			throws MANDevicesLendingBusinessException;

	/**
	 * M&eacute;todo que sirve para efectuar el proceso de negocio encargado de
	 * seleccionar, mostrar y realizar la reserva sobre una lista de
	 * dispositivos registrados en el sistema, para de ese modo, generar una
	 * reserva pediente en el sistema para ser evaluada.
	 * <p>
	 * Este m&eacute;todo se encargar&aacute; de actualizar el contexto de
	 * persistencia, para generar una serie de reservas listas para ser
	 * evaluadas. Este proceso registrar&aacute; los rangos de fechas,
	 * dispositivos y la persona o cliente que est&aacute; interesada para
	 * efecutar el pr&eacute;stamo.
	 * <p>
	 * Este m&eacute;todo ejecutar&aacute; todas las validaciones requeridas con
	 * respecto a las reglas de negocio exigidas para efectuar o llevar a cabo
	 * este proceso, y de ese modo, garantizar la integridad de los datos, y que
	 * los resultados del proceso sean los realmente adecuados y esperados.
	 * 
	 * @param deviceStatusesList
	 *            Instancia que representa el listado de reservas asociadas a
	 *            los diversos dispositivos deseados para el pr&eacute;stamo.
	 * @param clientUserName
	 *            Instancia que representa el nombre de usuario del cliente o
	 *            persona que inicia o ejecuta este proceso de consulta de
	 *            negocio.
	 * @return Un objeto tipo lista que contiene todos los registros
	 *         correspondientes a las reservas realizadas y que fueron
	 *         exitosamente guardadas o persistidas.
	 * @throws MANDevicesLendingBusinessException
	 *             Excepci&oacute;n lanzada cuando alg&uacute;n error ha surgido
	 *             durante la ejecuci&oacute;n de alg&uacute;n proceso en el
	 *             l&oacute;gica del negocio.
	 */
	public List<DeviceStatus> reserveDevices(
			List<DeviceStatus> deviceStatusesList, String clientUserName)
			throws MANDevicesLendingBusinessException;
}