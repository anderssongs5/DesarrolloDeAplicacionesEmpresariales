package co.edu.udea.we.mandl.webservice.restful.impl;

import java.util.List;

import javax.jws.WebService;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.web.context.WebApplicationContext;

import co.edu.udea.we.mandl.business.IDeviceBusiness;
import co.edu.udea.we.mandl.business.exception.MANDevicesLendingBusinessException;
import co.edu.udea.we.mandl.model.dto.Device;
import co.edu.udea.we.mandl.webservice.IDeviceWebService;
import co.edu.udea.we.mandl.webservice.exception.MANDevicesLendingWebServiceException;
import co.edu.udea.we.mandl.webservice.restful.contract.WebServicePathsContract;

/**
 * Clase que define la implementaci&oacute;n espec&iacute;fica para los
 * m&eacute;todos que sirven para acceder a ellos a trav&eacute;s de peticiones
 * HTTP realizadas por medio de Servicios Web RESTFul, y que son de apoyo para
 * efectuar los procesos definidos en la capa de negocio con respecto a la
 * gesti&oacute;n de la entidad {@code Device}.
 * <p>
 * Esta clase ser&aacute; el &uacute;nico punto de acceso a los m&eacute;todos o
 * funciones definidas para soportar los procesos de negocio relacionados con la
 * arquitectura definida para los Servicios Web, con respecto a las instancias
 * pertenecientes a la clase {@code Device}.
 * <p>
 * Los m&eacute;todos expuestos para la comunicaci&oacute;n por medio de
 * Servicios Web RESTFul, con respecto a las entidades pertencientes a la clase
 * {@code Device}, son solo aquellos que se han definido en la interfaz o
 * prototipo {@code IDeviceWebService}.
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
@Path(value = WebServicePathsContract.DeviceWebServiceContract.ROOT_PATH)
@Scope(value = WebApplicationContext.SCOPE_REQUEST)
@WebService(endpointInterface = WebServicePathsContract.DeviceWebServiceContract.END_POINT_INTERFACE)
public class DeviceWebServiceImpl implements IDeviceWebService {

	/**
	 * Instancia requerida para poder realizar la gesti&oacute;n de los datos y
	 * procesos del negocio para las instancias {@code Device} con respecto a la
	 * capa que define el contexto de l&oacute;gica del negocio para la
	 * aplicaci&oacute;n.
	 */
	@Autowired()
	private IDeviceBusiness deviceBusiness;

	/**
	 * Constructor por defecto, sin par&aacute;metros, y &uacute;nico para
	 * generar instancias de esta clase.
	 * <p>
	 * Este constructor realizar&aacute; una llamada expl&iacute;cita a su
	 * constructor padre.
	 */
	public DeviceWebServiceImpl() {
		super();
	}

	/**
	 * M&eacute;todo para obtener la instancia que sirve para realizar los
	 * procesos correspondientes a la gesti&oacute;n de los datos e
	 * informaci&oacute;n con respecto a la capa que define la l&oacute;gica de
	 * negocio en la aplicaci&oacute;n, para la entidad {@code Device}.
	 * 
	 * @return Un objeto que representa la propiedad que ayuda a la
	 *         gesti&oacute;n y acceso de los datos en la capa que define la
	 *         l&oacute;gica de negocio.
	 */
	public IDeviceBusiness getDeviceBusiness() {

		return (this.deviceBusiness);
	}

	/**
	 * M&eacute;todo para establecer una nueva instancia que servir&aacute; para
	 * realizar la gesti&oacute;n de los datos e informaci&oacute;n con respecto
	 * a la capa que define la l&oacute;gica de negocio en la aplicaci&oacute;n,
	 * para la entidad {@code Device}.
	 * 
	 * @param deviceDAO
	 *            Instancia que representa la nueva propiedad que ayuda al
	 *            acceso de los datos en la capa de persistencia.
	 */
	public void setDeviceBusiness(IDeviceBusiness deviceBusiness) {
		this.deviceBusiness = deviceBusiness;
	}

	@GET()
	@Override()
	@Path(value = WebServicePathsContract.DeviceWebServiceContract.FIND_ALL_AVAILABLES)
	@Produces(value = { MediaType.APPLICATION_JSON })
	public List<Device> findAllAvailablesDevices()
			throws MANDevicesLendingWebServiceException {
		List<Device> availableDevicesFoundList = null;

		try {
			availableDevicesFoundList = this.deviceBusiness.findAllAvailables();
		} catch (MANDevicesLendingBusinessException ex) {
			throw new MANDevicesLendingWebServiceException(String.format(
					"Error during Web Service's procedure \"%s\".",
					"Find All Available Devices"), ex);
		}

		return (((availableDevicesFoundList == null) || (availableDevicesFoundList
				.isEmpty())) ? null : availableDevicesFoundList);
	}
}