package co.edu.udea.we.mandl.webservice.restful.impl;

import javax.jws.WebService;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.web.context.WebApplicationContext;

import co.edu.udea.we.mandl.business.IClientBusiness;
import co.edu.udea.we.mandl.business.exception.MANDevicesLendingBusinessException;
import co.edu.udea.we.mandl.model.dto.Client;
import co.edu.udea.we.mandl.webservice.IClientWebService;
import co.edu.udea.we.mandl.webservice.exception.MANDevicesLendingWebServiceException;
import co.edu.udea.we.mandl.webservice.restful.contract.WebServicePathsContract;

/**
 * Clase que define la implementaci&oacute;n espec&iacute;fica para los
 * m&eacute;todos que sirven para acceder a ellos a trav&eacute;s de peticiones
 * HTTP realizadas por medio de Servicios Web RESTFul, y que son de apoyo para
 * efectuar los procesos definidos en la capa de negocio con respecto a la
 * gesti&oacute;n de la entidad {@code Client}.
 * <p>
 * Esta clase ser&aacute; el &uacute;nico punto de acceso a los m&eacute;todos o
 * funciones definidas para soportar los procesos de negocio relacionados con la
 * arquitectura definida para los Servicios Web, con respecto a las instancias
 * pertenecientes a la clase {@code Client}.
 * <p>
 * Los m&eacute;todos expuestos para la comunicaci&oacute;n por medio de
 * Servicios Web RESTFul, con respecto a las entidades pertencientes a la clase
 * {@code Client}, son solo aquellos que se han definido en la interfaz o
 * prototipo {@code IClientWebService}.
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
@Path(value = WebServicePathsContract.ClientWebServiceContract.ROOT_PATH)
@Scope(value = WebApplicationContext.SCOPE_REQUEST)
@WebService(endpointInterface = WebServicePathsContract.ClientWebServiceContract.END_POINT_INTERFACE)
public class ClientWebServiceImpl implements IClientWebService {

	/**
	 * Instancia requerida para poder realizar la gesti&oacute;n de los datos y
	 * procesos del negocio para las instancias {@code Client} con respecto a la
	 * capa que define el contexto de l&oacute;gica del negocio para la
	 * aplicaci&oacute;n.
	 */
	@Autowired()
	private IClientBusiness clientBusiness;

	/**
	 * Constructor por defecto, sin par&aacute;metros, y &uacute;nico para
	 * generar instancias de esta clase.
	 * <p>
	 * Este constructor realizar&aacute; una llamada expl&iacute;cita a su
	 * constructor padre.
	 */
	public ClientWebServiceImpl() {
		super();
	}

	/**
	 * M&eacute;todo para obtener la instancia que sirve para realizar los
	 * procesos correspondientes a la gesti&oacute;n de los datos e
	 * informaci&oacute;n con respecto a la capa que define la l&oacute;gica de
	 * negocio en la aplicaci&oacute;n, para la entidad {@code Client}.
	 * 
	 * @return Un objeto que representa la propiedad que ayuda a la
	 *         gesti&oacute;n y acceso de los datos en la capa que define la
	 *         l&oacute;gica de negocio.
	 */
	public IClientBusiness getClientBusiness() {

		return (this.clientBusiness);
	}

	/**
	 * M&eacute;todo para establecer una nueva instancia que servir&aacute; para
	 * realizar la gesti&oacute;n de los datos e informaci&oacute;n con respecto
	 * a la capa que define la l&oacute;gica de negocio en la aplicaci&oacute;n,
	 * para la entidad {@code Client}.
	 * 
	 * @param clientBusiness
	 *            Instancia que representa la nueva propiedad que ayuda al
	 *            acceso de los datos en la capa de persistencia.
	 */
	public void setClientBusiness(IClientBusiness clientBusiness) {
		this.clientBusiness = clientBusiness;
	}

	@GET()
	@Override()
	@Path(value = WebServicePathsContract.ClientWebServiceContract.LOGIN)
	@Produces(value = { MediaType.APPLICATION_JSON })
	public Client login(
			@QueryParam(WebServicePathsContract.ClientWebServiceContract.CLIENT_USER_NAME_QUERY) String email,
			@QueryParam(WebServicePathsContract.ClientWebServiceContract.CLIENT_PASSWORD_QUERY) String password)
			throws MANDevicesLendingWebServiceException {
		Client client = null;

		try {
			client = this.clientBusiness.findByLogin(email, password);
		} catch (MANDevicesLendingBusinessException ex) {
			throw new MANDevicesLendingWebServiceException(String.format(
					"Error during Web Service's procedure \"%s\".",
					"Client Login"), ex);
		}

		return ((client == null) ? null : client);
	}
}