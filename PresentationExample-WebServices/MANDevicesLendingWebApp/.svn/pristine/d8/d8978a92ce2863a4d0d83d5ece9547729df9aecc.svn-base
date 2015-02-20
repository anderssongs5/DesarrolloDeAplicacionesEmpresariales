package co.edu.udea.we.mandl.business.impl;

import java.util.List;

import co.edu.udea.we.mandl.business.IDispositionBusiness;
import co.edu.udea.we.mandl.business.exception.MANDevicesLendingBusinessException;
import co.edu.udea.we.mandl.business.util.TextUtils;
import co.edu.udea.we.mandl.model.dto.Disposition;
import co.edu.udea.we.mandl.persistence.dao.IDispositionDAO;
import co.edu.udea.we.mandl.persistence.dao.exception.MANDevicesLendingDAOException;

/**
 * Clase que define la implementaci&oacute;n espec&iacute;fica para los
 * m&eacute;todos que sirven de apoyo para efectuar los procesos definidos en la
 * capa de negocio con respecto a la gesti&oacute;n de la entidad
 * {@code Disposition}.
 * <p>
 * Esta clase ser&aacute; el &uacute;nico punto de acceso a los m&eacute;todos o
 * funciones definidas para soportar los procesos de negocio relacionados con
 * las instancias pertenecientes a la clase {@code Disposition}.
 * <p>
 * Los m&eacute;todos expuestos para la gesti&oacute;n de los procesos de
 * negocio con respecto a las entidades pertencientes a la clase
 * {@code Disposition}, son solo aquellos que se han definido en la interfaz o
 * prototipo {@code IDispositionBusiness}.
 * 
 * @since JDK1.7
 * 
 * @version 1.0
 * 
 * @author Andersson Garc&iacute;a Sotelo
 * @author Miguel &Aacute;ngel Ossa Ruiz
 * @author Neiber Padierna P&eacute;rez
 */
public class DispositionBusinessImpl implements IDispositionBusiness {

	/**
	 * Instancia requerida para poder realizar la gesti&oacute;n de los datos de
	 * las instancias {@code Disposition} con respecto a la capa que define el
	 * contexto de persistencia para la aplicaci&oacute;n.
	 */
	private IDispositionDAO dispositionDAO;

	/**
	 * Constructor por defecto, sin par&aacute;metros, y &uacute;nico para
	 * generar instancias de esta clase.
	 * <p>
	 * Este constructor realizar&aacute; una llamada expl&iacute;cita a su
	 * constructor padre.
	 */
	public DispositionBusinessImpl() {
		super();
	}

	/**
	 * M&eacute;todo para obtener la instancia que sirve para realizar la
	 * gesti&oacute;n de los datos con respecto a la capa que define el contexto
	 * de persistencia en la aplicaci&oacute;n, para la entidad
	 * {@code Disposition}.
	 * 
	 * @return Un objeto que representa la propiedad que ayuda al acceso de los
	 *         datos en la capa de persistencia.
	 */
	public IDispositionDAO getDispositionDAO() {

		return (this.dispositionDAO);
	}

	/**
	 * M&eacute;todo para establecer una instancia que servir&aacute; para
	 * realizar la gesti&oacute;n de los datos con respecto a la capa que define
	 * el contexto de persistencia en la aplicaci&oacute;n, para la entidad
	 * {@code Disposition}.
	 * 
	 * @param dispositionDAO
	 *            Instancia que representa la nueva propiedad que ayuda al
	 *            acceso de los datos en la capa de persistencia.
	 */
	public void setDispositionDAO(IDispositionDAO dispositionDAO) {
		this.dispositionDAO = dispositionDAO;
	}

	@Override()
	public List<Disposition> findAll()
			throws MANDevicesLendingBusinessException {
		try {
			List<Disposition> dispositionsFoundList = this.dispositionDAO
					.findAll();
			return dispositionsFoundList;
		} catch (MANDevicesLendingDAOException ex) {
			throw new MANDevicesLendingBusinessException(String.format(
					"Error during procedure's \"%s\".", "Find By Login"), ex);
		}
	}

	@Override()
	public Disposition save(String name, String description)
			throws MANDevicesLendingBusinessException {
		if ((!TextUtils.isEmpty(name))) {
			Disposition disposition = new Disposition(
					TextUtils.toUpperCase(name.trim()),
					(TextUtils.isEmpty(description) ? null : description.trim()),
					null);
			try {
				disposition = this.dispositionDAO.save(disposition);
				return disposition;
			} catch (MANDevicesLendingDAOException ex) {
				throw new MANDevicesLendingBusinessException(String.format(
						"Error during procedure's \"%s\".", "Save"), ex);
			}
		}
		return (null);
	}
}