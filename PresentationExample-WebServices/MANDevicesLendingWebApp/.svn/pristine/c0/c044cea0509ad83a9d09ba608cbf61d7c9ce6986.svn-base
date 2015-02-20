package co.edu.udea.we.mandl.business.impl;

import java.util.ArrayList;
import java.util.List;

import co.edu.udea.we.mandl.business.IKindBusiness;
import co.edu.udea.we.mandl.business.exception.MANDevicesLendingBusinessException;
import co.edu.udea.we.mandl.business.util.TextUtils;
import co.edu.udea.we.mandl.model.dto.Kind;
import co.edu.udea.we.mandl.persistence.dao.IKindDAO;
import co.edu.udea.we.mandl.persistence.dao.exception.MANDevicesLendingDAOException;

/**
 * Clase que define la implementaci&oacute;n espec&iacute;fica para los
 * m&eacute;todos que sirven de apoyo para efectuar los procesos definidos en la
 * capa de negocio con respecto a la gesti&oacute;n de la entidad {@code Kind}.
 * <p>
 * Esta clase ser&aacute; el &uacute;nico punto de acceso a los m&eacute;todos o
 * funciones definidas para soportar los procesos de negocio relacionados con
 * las instancias pertenecientes a la clase {@code Kind}.
 * <p>
 * Los m&eacute;todos expuestos para la gesti&oacute;n de los procesos de
 * negocio con respecto a las entidades pertencientes a la clase {@code Kind},
 * son solo aquellos que se han definido en la interfaz o prototipo
 * {@code IKindBusiness} que esta implementa.
 * 
 * @since JDK1.7
 * 
 * @version 1.0
 * 
 * @author Andersson Garc&iacute;a Sotelo
 * @author Miguel &Aacute;ngel Ossa Ruiz
 * @author Neiber Padierna P&eacute;rez
 */
public class KindBusinessImpl implements IKindBusiness {

	/**
	 * Instancia requerida para poder realizar la gesti&oacute;n de los datos de
	 * las instancias {@code Kind} con respecto a la capa que define el contexto
	 * de persistencia para la aplicaci&oacute;n.
	 */
	private IKindDAO kindDAO;

	/**
	 * Constructor por defecto, sin par&aacute;metros, y &uacute;nico para
	 * generar instancias de esta clase.
	 * <p>
	 * Este constructor realizar&aacute; una llamada expl&iacute;cita a su
	 * constructor padre.
	 */
	public KindBusinessImpl() {
		super();
	}

	/**
	 * M&eacute;todo que se encarga de obtener la instancia que sirve para
	 * realizar la gesti&oacute;n de los datos con respecto a la capa que define
	 * el contexto de persistencia en la aplicaci&oacute;n, para la entidad
	 * {@code Kind}.
	 * 
	 * @return Un objeto que representa la propiedad que ayuda al acceso de los
	 *         datos en la capa de persistencia.
	 */
	public IKindDAO getKindDAO() {

		return (this.kindDAO);
	}

	/**
	 * M&eacute;todo para asignar una nueva instancia que servir&aacute; para
	 * realizar la gesti&oacute;n de los datos con respecto a la capa que define
	 * el contexto de persistencia en la aplicaci&oacute;n, para la entidad
	 * {@code Kind}.
	 * 
	 * @param kindDAO
	 *            Instancia que representa la nueva propiedad que ayuda al
	 *            acceso de los datos en la capa de persistencia.
	 */
	public void setKindDAO(IKindDAO kindDAO) {
		this.kindDAO = kindDAO;
	}

	@Override()
	public List<Kind> findAll() throws MANDevicesLendingBusinessException {
		List<Kind> kindList = new ArrayList<Kind>();
		try {
			kindList = this.kindDAO.findAll();
		} catch (MANDevicesLendingDAOException ex) {
			throw new MANDevicesLendingBusinessException(String.format(
					"Error during procedure's \"%s\".", "Find All"), ex);
		}

		return (kindList);
	}

	@Override()
	public Kind save(String kindName, String description)
			throws MANDevicesLendingBusinessException {
		if (!TextUtils.isEmpty(kindName)) {
			Kind kind = new Kind(
					TextUtils.toUpperCase(kindName),
					(TextUtils.isEmpty(description) ? null : description.trim()),
					null);

			try {
				kind = this.kindDAO.save(kind);

				return ((kind != null) ? kind : null);
			} catch (MANDevicesLendingDAOException ex) {
				throw new MANDevicesLendingBusinessException(String.format(
						"Error during procedure's \"%s\".", "Save"), ex);
			}
		}

		return (null);
	}
}