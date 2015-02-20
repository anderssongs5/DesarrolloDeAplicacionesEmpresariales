package co.edu.udea.we.mandl.business.impl;

import java.util.ArrayList;
import java.util.List;

import co.edu.udea.we.mandl.business.IProfileBusiness;
import co.edu.udea.we.mandl.business.exception.MANDevicesLendingBusinessException;
import co.edu.udea.we.mandl.business.util.TextUtils;
import co.edu.udea.we.mandl.model.dto.Profile;
import co.edu.udea.we.mandl.persistence.dao.IProfileDAO;
import co.edu.udea.we.mandl.persistence.dao.exception.MANDevicesLendingDAOException;

/**
 * Clase que define la implementaci&oacute;n espec&iacute;fica para los
 * m&eacute;todos que sirven de apoyo para efectuar los procesos definidos en la
 * capa de negocio con respecto a la gesti&oacute;n de la entidad
 * {@code Profile}.
 * <p>
 * Esta clase ser&aacute; el &uacute;nico punto de acceso a los m&eacute;todos o
 * funciones definidas para soportar los procesos de negocio relacionados con
 * las instancias pertenecientes a la clase {@code Profile}.
 * <p>
 * Los m&eacute;todos expuestos para la gesti&oacute;n de los procesos de
 * negocio con respecto a las entidades pertencientes a la clase {@code Profile}
 * , son solo aquellos que se han definido en la interfaz o prototipo
 * {@code IProfileBusiness} que esta implementa.
 * 
 * @since JDK1.7
 * 
 * @version 1.0
 * 
 * @author Andersson Garc&iacute;a Sotelo
 * @author Miguel &Aacute;ngel Ossa Ruiz
 * @author Neiber Padierna P&eacute;rez
 */
public class ProfileBusinessImpl implements IProfileBusiness {

	/**
	 * Instancia requerida para poder realizar la gesti&oacute;n de los datos de
	 * las instancias {@code Kind} con respecto a la capa que define el contexto
	 * de persistencia para la aplicaci&oacute;n.
	 */
	private IProfileDAO profileDAO;

	/**
	 * Constructor por defecto, sin par&aacute;metros, y &uacute;nico para
	 * generar instancias de esta clase.
	 * <p>
	 * Este constructor realizar&aacute; una llamada expl&iacute;cita a su
	 * constructor padre.
	 */
	public ProfileBusinessImpl() {
		super();
	}

	/**
	 * M&eacute;todo que se encarga de obtener la instancia que sirve para
	 * realizar la gesti&oacute;n de los datos con respecto a la capa que define
	 * el contexto de persistencia en la aplicaci&oacute;n, para la entidad
	 * {@code Profile}.
	 * 
	 * @return Un objeto que representa la propiedad que ayuda al acceso de los
	 *         datos en la capa de persistencia.
	 */
	public IProfileDAO getProfileDAO() {

		return (this.profileDAO);
	}

	/**
	 * M&eacute;todo para asignar una nueva instancia que servir&aacute; para
	 * realizar la gesti&oacute;n de los datos con respecto a la capa que define
	 * el contexto de persistencia en la aplicaci&oacute;n, para la entidad
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
	public List<Profile> findAll() throws MANDevicesLendingBusinessException {
		List<Profile> profileList = new ArrayList<Profile>();
		try {
			profileList = this.profileDAO.findAll();
		} catch (MANDevicesLendingDAOException ex) {
			throw new MANDevicesLendingBusinessException(String.format(
					"Error during procedure's \"%s\".", "Find All"), ex);
		}

		return (profileList);
	}

	@Override()
	public Profile save(String profileName, String description)
			throws MANDevicesLendingBusinessException {

		if (!TextUtils.isEmpty(profileName)) {
			Profile profile = new Profile(
					TextUtils.toUpperCase(profileName),
					(TextUtils.isEmpty(description) ? null : description.trim()),
					null);

			try {
				profile = this.profileDAO.save(profile);

				return ((profile != null) ? profile : null);
			} catch (MANDevicesLendingDAOException ex) {
				throw new MANDevicesLendingBusinessException(String.format(
						"Error during procedure's \"%s\".", "Save"), ex);
			}
		}

		return (null);
	}
}