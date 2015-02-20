package co.edu.udea.we.mandl.business.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import co.edu.udea.we.mandl.business.IClientBusiness;
import co.edu.udea.we.mandl.business.exception.MANDevicesLendingBusinessException;
import co.edu.udea.we.mandl.business.util.TextUtils;
import co.edu.udea.we.mandl.model.dto.Client;
import co.edu.udea.we.mandl.model.dto.Person;
import co.edu.udea.we.mandl.model.dto.PersonId;
import co.edu.udea.we.mandl.model.dto.Profile;
import co.edu.udea.we.mandl.persistence.dao.IClientDAO;
import co.edu.udea.we.mandl.persistence.dao.IPersonDAO;
import co.edu.udea.we.mandl.persistence.dao.IProfileDAO;
import co.edu.udea.we.mandl.persistence.dao.exception.MANDevicesLendingDAOException;

/**
 * Clase que define la implementaci&oacute;n espec&iacute;fica para los
 * m&eacute;todos que sirven de apoyo para efectuar los procesos definidos en la
 * capa de negocio con respecto a la gesti&oacute;n de la entidad {@code Client}
 * .
 * <p>
 * Esta clase ser&aacute; el &uacute;nico punto de acceso a los m&eacute;todos o
 * funciones definidas para soportar los procesos de negocio relacionados con
 * las instancias pertenecientes a la clase {@code Client}.
 * <p>
 * Los m&eacute;todos expuestos para la gesti&oacute;n de los procesos de
 * negocio con respecto a las entidades pertencientes a la clase {@code Client},
 * son solo aquellos que se han definido en la interfaz o prototipo
 * {@code IClientBusiness}.
 * 
 * @since JDK1.7
 * 
 * @version 1.0
 * 
 * @author Andersson Garc&iacute;a Sotelo
 * @author Miguel &Aacute;ngel Ossa Ruiz
 * @author Neiber Padierna P&eacute;rez
 */
public class ClientBusinessImpl implements IClientBusiness {

	/**
	 * Instancia requerida para poder realizar la gesti&oacute;n de los datos de
	 * las instancias {@code Client} con respecto a la capa que define el
	 * contexto de persistencia para la aplicaci&oacute;n.
	 */
	private IClientDAO clientDAO;
	/**
	 * Instancia requerida para poder realizar la gesti&oacute;n de los datos de
	 * las instancias {@code Person} con respecto a la capa que define el
	 * contexto de persistencia para la aplicaci&oacute;n.
	 */
	private IPersonDAO personDAO;
	/**
	 * Instancia requerida para poder realizar la gesti&oacute;n de los datos de
	 * las instancias {@code Profile} con respecto a la capa que define el
	 * contexto de persistencia para la aplicaci&oacute;n.
	 */
	private IProfileDAO profileDAO;

	/**
	 * Constructor por defecto, sin par&aacute;metros, y &uacute;nico para
	 * generar instancias de esta clase.
	 * <p>
	 * Este constructor realizar&aacute; una llamada expl&iacute;cita a su
	 * constructor padre.
	 */
	public ClientBusinessImpl() {
		super();
	}

	/**
	 * M&eacute;todo para obtener la instancia que sirve para realizar la
	 * gesti&oacute;n de los datos con respecto a la capa que define el contexto
	 * de persistencia en la aplicaci&oacute;n para la entidad {@code Client}.
	 * 
	 * @return Un objeto que representa la propiedad que ayuda al acceso de los
	 *         datos en la capa de persistencia.
	 */
	public IClientDAO getClientDAO() {

		return (this.clientDAO);
	}

	/**
	 * M&eacute;todo para establecer una instancia que servir&aacute; para
	 * realizar la gesti&oacute;n de los datos con respecto a la capa que define
	 * el contexto de persistencia en la aplicaci&oacute;n para la entidad
	 * {@code Client}.
	 * 
	 * @param clientDAO
	 *            Instancia que representa la nueva propiedad que ayuda al
	 *            acceso de los datos en la capa de persistencia.
	 */
	public void setClientDAO(IClientDAO clientDAO) {
		this.clientDAO = clientDAO;
	}

	/**
	 * M&eacute;todo para obtener la instancia que sirve para realizar la
	 * gesti&oacute;n de los datos con respecto a la capa que define el contexto
	 * de persistencia en la aplicaci&oacute;n para la entidad {@code Person}.
	 * 
	 * @return Un objeto que representa la propiedad que ayuda al acceso de los
	 *         datos en la capa de persistencia.
	 */
	public IPersonDAO getPersonDAO() {

		return (this.personDAO);
	}

	/**
	 * M&eacute;todo para establecer una instancia que servir&aacute; para
	 * realizar la gesti&oacute;n de los datos con respecto a la capa que define
	 * el contexto de persistencia en la aplicaci&oacute;n para la entidad
	 * {@code Person}.
	 * 
	 * @param personDAO
	 *            Instancia que representa la nueva propiedad que ayuda al
	 *            acceso de los datos en la capa de persistencia.
	 */
	public void setPersonDAO(IPersonDAO personDAO) {
		this.personDAO = personDAO;
	}

	/**
	 * M&eacute;todo para obtener la instancia que sirve para realizar la
	 * gesti&oacute;n de los datos con respecto a la capa que define el contexto
	 * de persistencia en la aplicaci&oacute;n para la entidad {@code Profile}.
	 * 
	 * @return Un objeto que representa la propiedad que ayuda al acceso de los
	 *         datos en la capa de persistencia.
	 */
	public IProfileDAO getProfileDAO() {

		return (this.profileDAO);
	}

	/**
	 * M&eacute;todo para establecer una instancia que servir&aacute; para
	 * realizar la gesti&oacute;n de los datos con respecto a la capa que define
	 * el contexto de persistencia en la aplicaci&oacute;n para la entidad
	 * {@code Profile}.
	 * 
	 * @param profileDAO
	 *            Instancia que representa la nueva propiedad que ayuda al
	 *            acceso de los datos en la capa de persistencia.
	 */
	public void setProfileDAO(IProfileDAO profileDAO) {
		this.profileDAO = profileDAO;
	}

	@Override()
	public Client findByLogin(String email, String password)
			throws MANDevicesLendingBusinessException {
		if ((!TextUtils.isEmpty(email)) && (!TextUtils.isEmpty(password))) {
			Map<String, Object> parametersMap = new HashMap<String, Object>();
			parametersMap.put("email", TextUtils.toLowerCase(email));
			parametersMap.put("password", password);

			try {
				List<Client> clientsFoundList = this.clientDAO
						.findByAttributes(parametersMap);

				if ((clientsFoundList != null) && (!clientsFoundList.isEmpty())) {

					return (clientsFoundList.get(0));
				}

				return (null);
			} catch (MANDevicesLendingDAOException ex) {
				throw new MANDevicesLendingBusinessException(String.format(
						"Error during procedure's \"%s\".", "Find By Login"),
						ex);
			}
		}

		return (null);
	}

	@Override()
	public Client save(String idNumber, String documentType, String firstNames,
			String lastNames, String email, String password, String profile,
			String mobilePhoneNumber, String homePhoneNumber)
			throws MANDevicesLendingBusinessException {
		if ((!TextUtils.isEmpty(idNumber))
				&& (!TextUtils.isEmpty(documentType))
				&& (!TextUtils.isEmpty(firstNames))
				&& (!TextUtils.isEmpty(lastNames))
				&& (!TextUtils.isEmpty(profile)) && (!TextUtils.isEmpty(email))
				&& (!TextUtils.isEmpty(password))) {
			Person person = new Person(new PersonId(idNumber.trim(),
					documentType.trim()), firstNames.trim(), lastNames.trim());
			Client client = new Client(TextUtils.toLowerCase(email),
					new Profile(TextUtils.toUpperCase(profile)), person,
					password, (TextUtils.isEmpty(mobilePhoneNumber) ? null
							: mobilePhoneNumber.trim()),
					(TextUtils.isEmpty(homePhoneNumber) ? null
							: homePhoneNumber.trim()), null);

			try {
				person = this.personDAO.save(person);
				client = this.clientDAO.save(client);

				return (((client != null) && (person != null)) ? client : null);
			} catch (MANDevicesLendingDAOException ex) {
				throw new MANDevicesLendingBusinessException(String.format(
						"Error during procedure's \"%s\".", "Save"), ex);
			}
		}

		return (null);
	}

	@Override()
	public Client changeProfile(String clientId, String newProfile)
			throws MANDevicesLendingBusinessException {
		if ((!TextUtils.isEmpty(clientId)) && (!TextUtils.isEmpty(newProfile))) {
			try {
				Profile profile = this.profileDAO.find(TextUtils
						.toUpperCase(newProfile));

				if (profile != null) {
					Client client = this.clientDAO.find(TextUtils
							.toLowerCase(clientId));
					if (client != null) {
						client.setProfile(profile);
						client = this.clientDAO.update(client);

						return ((client != null) ? client : null);
					}
				}

				return (null);
			} catch (MANDevicesLendingDAOException ex) {
				throw new MANDevicesLendingBusinessException(String.format(
						"Error during procedure's \"%s\".", "change Profile"),
						ex);
			}
		}

		return (null);
	}
}