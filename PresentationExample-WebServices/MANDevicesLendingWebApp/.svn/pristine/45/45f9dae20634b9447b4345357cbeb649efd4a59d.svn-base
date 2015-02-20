package co.edu.udea.we.mandl.webservice;

import java.util.List;

import javax.ws.rs.core.Response;

import co.edu.udea.we.mandl.model.dto.DeviceStatus;
import co.edu.udea.we.mandl.webservice.exception.MANDevicesLendingWebServiceException;

/**
 * Interfaz definida para establecer los m&eacute;todos que se podr&aacute;n
 * realizar sobre los procesos que involucran los Servicios Web que est&aacute;n
 * relacionados con instancias pertenecientes a la clase {@code DeviceStatus}, y
 * de ese modo, poder realizar el paso de informaci&oacute;n y mensajes entre
 * los sistemas heterog&eacute;neos, y de ese modo, cumplir con los procesos de
 * negocio definidos para el aplicativo.
 * <p>
 * Esta interfaz define los m&eacute;todos o funciones que se deber&aacute;n
 * implementar en todos los Servicios Web de todo tipo, para dar soporte a las
 * operaciones requeridas por la l&oacute;gica definida para la arquitectura de
 * los Servicios Web, y que requieren acceso o interacci&oacute;n con la capa
 * encargada de ejecutar o brindar el acceso a los procesos de negocio referidos
 * a las entidades {@code DeviceStatus}.
 * <p>
 * De ese modo, esta interfaz debe ser implementada por aquellas clases que
 * definan de una forma espec&iacute;fica alg&uacute;n proceso referido al paso
 * de informaci&oacute;n por medio de Servicios Web, referentes a las entidades
 * {@code DeviceStatus}. En otras palabras, el objetivo primordial de esta
 * interfaz es definir las operaciones m&aacute;s b&aacute;sicas y requeridas
 * que se realizar&aacute;n sobre la arquitectura de los Servicios Web, y que en
 * su mayor&iacute;a, interactuar&aacute;n con la capa que define el contexto de
 * la l&oacute;gica del Negocio en la aplicaci&oacute;n con respecto a la
 * instancias {@code DeviceStatus}.
 * 
 * @since JDK1.7
 * 
 * @version 1.0
 * 
 * @author Andersson Garc&iacute;a Sotelo
 * @author Miguel &Aacute;ngel Ossa Ruiz
 * @author Neiber Padierna P&eacute;rez
 */
public interface IDeviceStatusWebService {

	/**
	 * M&eacute;todo que se encarga de proveer un Servicio Web el cual puede ser
	 * consumido por los usuarios, el cual consiste en realizar una
	 * actualizaci&oacute;n con el objetivo de aprobar o denengar un
	 * pr&eacute;stamo que ha sido registrado previamente en el sistema, el cual
	 * es representado por medio de una entidad {@code DeviceStatus}.
	 * <p>
	 * En caso de no poder realizarse la actualizaci&oacute;n o
	 * evaluaci&oacute;ne exitosa del pr&eacute;stamo, el m&eacute;todo
	 * retornar&aacute; un valor <code>null</code>, representando de ese modo
	 * una repuesta vac&iacute;a y sin datos para el cliente que realiza la
	 * invocaci&oacute;n al Servicio Web.
	 * 
	 * @param deviceStatus
	 *            Instancia que representa el pr&eacute;stamo que se desea
	 *            actualizar como aprobado o denegado en el contexto de
	 *            persistencia de la aplicaci&oacute;n.
	 * @return Una instancia que representa una respuesta HTTP para el Servicio
	 *         Web, la cual contiene en su cuerpo de mensaje los valores
	 *         arrojados por la ejecuci&oacute;n exitosa o no, del Servicio Web.
	 * @throws MANDevicesLendingWebServiceException
	 *             Excepci&oacute;n lanzada cuando alg&uacute;n error ha surgido
	 *             durante la ejecuci&oacute;n de alg&uacute;n proceso referente
	 *             a los Servicios Web.
	 */
	public Response evaluateLending(DeviceStatus deviceStatus)
			throws MANDevicesLendingWebServiceException;

	/**
	 * M&eacute;todo que se encarga de proveer un Servicio Web que puede ser
	 * consumido por los usuarios, el cual consisten en realizar una consulta
	 * con el objetivo de extraer todos los datos o atributos pertenecientes a
	 * todas las instancias o entidades {@code DeviceStatus} que actualmente
	 * representan pr&eacute;stamos de Dispositivos que todav&iacute;a no han
	 * sido evaluados ni resueltos por alg&uacute;n Administrador.
	 * <p>
	 * Esta funci&oacute;n tiene la capacidad de encontrar las instancias
	 * {@code DeviceStatus} que representa pr&eacute;stamos que no fueron
	 * realizados por el Administrador que realiza la invocaci&oacute;n de esta
	 * fuci&oacute;n, dando as&iacute; cumpliento a las reglas del negocio sobre
	 * la aprobaci&oacute;n o negaci&oacute;n de pr&eacute;stamos.
	 * <p>
	 * En caso de no haber ninguna instancia con la condici&oacute;n previamente
	 * mencionada, la funci&oacute;n retornar&aacute; un valor <code>null</code>
	 * , lo cual para el Servicio Web representar&iacute;a una respuesta sin
	 * datos o contenido.
	 * 
	 * @param clientUserName
	 *            Par&eacute;tro que sirve para identificar el Administrador que
	 *            realiza la invocaci&oacute;n del Servicio Web.
	 * @return Un objeto tipo list que contiene todos los registros consultados
	 *         y obtenidos del tipo {@code DeviceStatus}, y que son todas las
	 *         peticiones de reservas a&uacute;n no evaluadas.
	 * @throws MANDevicesLendingWebServiceException
	 *             Excepci&oacute;n lanzada cuando alg&uacute;n error ha surgido
	 *             durante la ejecuci&oacute;n de alg&uacute;n proceso referente
	 *             a los Servicios Web.
	 */
	public List<DeviceStatus> findUnsolvedLendings(String clientUserName)
			throws MANDevicesLendingWebServiceException;

	/**
	 * M&eacute;todo que se encarga de proveer un Servicio Web que puede ser
	 * consumido por los usuarios, el cual consiste en realizar una
	 * inserci&oacute;n de nuevos datos pertenecientes a las instancias
	 * {@code DeviceStatus}, la cual representa una intenci&oacute;n o reserva
	 * desea por un Dispositivo en particular.
	 * <p>
	 * Esta funci&oacute;n interactuar&aacute; con el contexto de persistencia
	 * definido para la aplicaci&oacute;n, logrando de ese modo insertar un
	 * nuevo registros {@code DeviceStatus} que representa una reserva a ser
	 * evaluada posteriormente por alg&uacute;n Administrador del sistema.
	 * <p>
	 * En caso de no poderse guardar la reserva exitosamente, la funci&oacute;n
	 * retornar&aacute; un valor <code>null</code>, lo cual para el Servicio Web
	 * representar&iacute;a una respuesta sin datos o contenido.
	 * 
	 * @param deviceStatus
	 *            Instancia que representa el nuevo pr&eacute;stamo que se desea
	 *            guardar o ser insertado en el contexto de persistencia
	 *            asociado a la aplicaci&oacute;n.
	 * @return Una instancia que representa una respuesta HTTP para el Servicio
	 *         Web, la cual contiene en su cuerpo de mensaje los valores
	 *         arrojados por la ejecuci&oacute;n exitosa o no, del Servicio Web.
	 * @throws MANDevicesLendingWebServiceException
	 *             Excepci&oacute;n lanzada cuando alg&uacute;n error ha surgido
	 *             durante la ejecuci&oacute;n de alg&uacute;n proceso referente
	 *             a los Servicios Web.
	 */
	public Response reserveDevice(DeviceStatus deviceStatus)
			throws MANDevicesLendingWebServiceException;
}