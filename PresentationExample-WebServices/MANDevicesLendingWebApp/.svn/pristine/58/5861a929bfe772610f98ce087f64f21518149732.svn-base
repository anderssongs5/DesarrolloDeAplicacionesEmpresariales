package co.edu.udea.we.mandl.webservice.restful.impl;

import java.util.Arrays;
import java.util.List;

import javax.jws.WebService;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.web.context.WebApplicationContext;

import co.edu.udea.we.mandl.business.IDeviceStatusBusiness;
import co.edu.udea.we.mandl.business.exception.MANDevicesLendingBusinessException;
import co.edu.udea.we.mandl.business.util.TextUtils;
import co.edu.udea.we.mandl.model.dto.DeviceStatus;
import co.edu.udea.we.mandl.webservice.IDeviceStatusWebService;
import co.edu.udea.we.mandl.webservice.exception.MANDevicesLendingWebServiceException;
import co.edu.udea.we.mandl.webservice.restful.contract.WebServicePathsContract;

/**
 * Clase que define la implementaci&oacute;n espec&iacute;fica para los
 * m&eacute;todos que sirven para acceder a ellos a trav&eacute;s de peticiones
 * HTTP realizadas por medio de Servicios Web RESTFul, y que son de apoyo para
 * efectuar los procesos definidos en la capa de negocio con respecto a la
 * gesti&oacute;n de la entidad {@code DeviceStatus}.
 * <p>
 * Esta clase ser&aacute; el &uacute;nico punto de acceso a los m&eacute;todos o
 * funciones definidas para soportar los procesos de negocio relacionados con la
 * arquitectura definida para los Servicios Web, con respecto a las instancias
 * pertenecientes a la clase {@code DeviceStatus}.
 * <p>
 * Los m&eacute;todos expuestos para la comunicaci&oacute;n por medio de
 * Servicios Web RESTFul, con respecto a las entidades pertencientes a la clase
 * {@code DeviceStatus}, son solo aquellos que se han definido en la interfaz o
 * prototipo {@code IDeviceStatusWebService}.
 * 
 * @since JDK1.7
 * 
 * @version 1.0
 * 
 * @author Andersson Garc&iacute;a Sotelo
 * @author Miguel &Aacute;ngel Ossa Ruiz
 * @author Neiber Padierna P&eacute;rez
 */
@Component()
@Path(value = WebServicePathsContract.DeviceStatusWebServiceContract.ROOT_PATH)
@Scope(value = WebApplicationContext.SCOPE_REQUEST)
@WebService(endpointInterface = WebServicePathsContract.DeviceStatusWebServiceContract.END_POINT_INTERFACE)
public class DeviceStatusWebServiceImpl implements IDeviceStatusWebService {

	/**
	 * Instancia requerida para poder realizar la gesti&oacute;n de los datos y
	 * procesos del negocio para las instancias {@code DeviceStatus} con
	 * respecto a la capa que define el contexto de l&oacute;gica del negocio
	 * para la aplicaci&oacute;n.
	 */
	@Autowired()
	private IDeviceStatusBusiness deviceStatusBusiness;

	/**
	 * Constructor por defecto, sin par&aacute;metros, y &uacute;nico para
	 * generar instancias de esta clase.
	 * <p>
	 * Este constructor realizar&aacute; una llamada expl&iacute;cita a su
	 * constructor padre.
	 */
	public DeviceStatusWebServiceImpl() {
		super();
	}

	/**
	 * M&eacute;todo para obtener la instancia que sirve para ejecutar los
	 * diferentes procesos definidos en la capa del negocio que se relacionan
	 * con las solicitudes de pr&eacute;stamo o reserva de dispositivos, y por
	 * consiguiente con la entidad {@code DeviceStatus}.
	 * 
	 * @return Un objeto que permite la ejecuci&oacute;n de los procesos
	 *         definidos en el negocio para las solicitudes pr&eacute;stamo o
	 *         reserva de dispositivos.
	 */
	public IDeviceStatusBusiness getDeviceStatusBusiness() {

		return (this.deviceStatusBusiness);
	}

	/**
	 * M&eacute;todo para establecer una instancia que servir&aacute; para
	 * realizar los procesos del negocio vinculados con las solicitudes de
	 * pr&eacute;stamo o reserva de dispositivos, y por consiguiente, con las
	 * instancias de la
	 * 
	 * @param deviceStatusBusiness
	 *            Instancia que representa la nueva propiedad que permite la
	 *            ejecuci&oacute;n de los procesos del negocio relacionados con
	 *            las solicitudes de pr&eacute;stamo o reserva de dispositivos.
	 */
	public void setDeviceStatusBusiness(
			IDeviceStatusBusiness deviceStatusBusiness) {
		this.deviceStatusBusiness = deviceStatusBusiness;
	}

	@Consumes(value = { MediaType.APPLICATION_JSON })
	@Override()
	@Path(value = WebServicePathsContract.DeviceStatusWebServiceContract.EVALUATE_LENDINGS)
	@Produces(value = { MediaType.APPLICATION_JSON })
	@PUT()
	public Response evaluateLending(DeviceStatus deviceStatus)
			throws MANDevicesLendingWebServiceException {
		if (this.checkDeviceStatusValidity(deviceStatus)) {
			try {
				List<DeviceStatus> evaluatedDevicesStatusesList = this.deviceStatusBusiness
						.evaluateLendings(Arrays.asList(deviceStatus));

				if ((evaluatedDevicesStatusesList == null)
						|| (evaluatedDevicesStatusesList.isEmpty())) {
					deviceStatus = null;
				} else {
					deviceStatus = evaluatedDevicesStatusesList.get(0);
				}
			} catch (MANDevicesLendingBusinessException ex) {
				throw new MANDevicesLendingWebServiceException(String.format(
						"Error during Web Service's procedure \"%s\".",
						"Evaluate Lending"), ex);
			}

			return (Response.ok(deviceStatus).build());
		}

		return (Response.status(Response.Status.BAD_REQUEST).build());
	}

	@GET()
	@Override()
	@Path(value = WebServicePathsContract.DeviceStatusWebServiceContract.FIND_UNSOLVED_LENDINGS)
	@Produces(value = { MediaType.APPLICATION_JSON })
	public List<DeviceStatus> findUnsolvedLendings(
			@QueryParam(WebServicePathsContract.DeviceStatusWebServiceContract.CLIENT_USER_NAME_QUERY) String clientUserName)
			throws MANDevicesLendingWebServiceException {
		List<DeviceStatus> unsolvedLendingsDevicesStatusesList = null;

		if (!TextUtils.isEmpty(clientUserName)) {
			try {
				unsolvedLendingsDevicesStatusesList = this.deviceStatusBusiness
						.findUnsolvedLendings(TextUtils
								.toLowerCase(clientUserName));
			} catch (MANDevicesLendingBusinessException ex) {
				throw new MANDevicesLendingWebServiceException(String.format(
						"Error during Web Service's procedure \"%s\".",
						"Find Unsolved Lendings"), ex);
			}
		}

		return (((unsolvedLendingsDevicesStatusesList == null) || (unsolvedLendingsDevicesStatusesList
				.isEmpty())) ? null : unsolvedLendingsDevicesStatusesList);
	}

	@Consumes(value = { MediaType.APPLICATION_JSON })
	@Override()
	@Path(value = WebServicePathsContract.DeviceStatusWebServiceContract.RESERVE_DEVICE)
	@POST()
	@Produces(value = { MediaType.APPLICATION_JSON })
	public Response reserveDevice(DeviceStatus deviceStatus)
			throws MANDevicesLendingWebServiceException {
		if (this.checkDeviceStatusValidity(deviceStatus)) {
			try {
				List<DeviceStatus> reservedDevicesStatusesList = this.deviceStatusBusiness
						.reserveDevices(Arrays.asList(deviceStatus),
								deviceStatus.getClient().getEmail());

				if ((reservedDevicesStatusesList == null)
						|| (reservedDevicesStatusesList.isEmpty())) {
					deviceStatus = null;
				} else {
					deviceStatus = reservedDevicesStatusesList.get(0);
				}
			} catch (MANDevicesLendingBusinessException ex) {
				throw new MANDevicesLendingWebServiceException(String.format(
						"Error during Web Service's procedure \"%s\".",
						"Reserve Device"), ex);
			}

			return (Response.ok(deviceStatus).build());
		}

		return (Response.status(Response.Status.BAD_REQUEST).build());
	}

	/**
	 * M&eacute;todo privado que facilita la validaci&oacute;n de los datos
	 * encapsulados dentro de un objeto {@code DeviceStatus}.
	 * <p>
	 * As&iacute;, &eacute;ste es un m&eacute;todo sirve de apoyo en los
	 * procesos vinculados con las solicitudes de pr&eacute;stamo de
	 * dispositivos y est&aacute; en la capacidad de chequear la consistencia e
	 * integridad de los datos frente a las reglas del negocio.
	 * 
	 * @param deviceStatus
	 *            Instancia tipo {@code DeviceStatus} a la cual se le desea
	 *            realizar la respectiva validaci&oacute;n de los datos que
	 *            encapsula.
	 * 
	 * @return Valor booleano que establece la validez de los datos. As&iacute;,
	 *         si este toma el valor <code>true</code> indicar&aacute; que los
	 *         datos son v&aacute;lidos.
	 */
	private boolean checkDeviceStatusValidity(DeviceStatus deviceStatus) {
		if ((deviceStatus == null) || (deviceStatus.getClient() == null)
				|| (deviceStatus.getDevice() == null)) {

			return (false);
		}

		if (TextUtils.isEmpty(deviceStatus.getClient().getEmail())
				|| (deviceStatus.getDevice().getId() < 0L)
				|| (deviceStatus.getDevice().getId() > Long.MAX_VALUE)) {

			return (false);
		}

		return (true);
	}
}