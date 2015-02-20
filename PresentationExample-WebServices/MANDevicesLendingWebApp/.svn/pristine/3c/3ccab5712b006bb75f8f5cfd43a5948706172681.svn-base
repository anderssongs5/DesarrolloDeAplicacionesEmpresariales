package co.edu.udea.we.mandl.persistence.dao.hibernate.impl;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Conjunction;
import org.hibernate.criterion.Disjunction;
import org.hibernate.criterion.Restrictions;

import co.edu.udea.we.mandl.model.dto.DeviceStatus;
import co.edu.udea.we.mandl.model.dto.IEntityContext;
import co.edu.udea.we.mandl.persistence.dao.IDeviceStatusDAO;
import co.edu.udea.we.mandl.persistence.dao.exception.MANDevicesLendingDAOException;

/**
 * Clase que define la implementaci&oacute;n espec&iacute;fica para los
 * m&eacute;todos de acceso al repositorio de datos y definidos en la interfaz
 * {@code IDeviceStatusDAO}; por otra parte, esta clase hereda indirectamente de
 * clase definida en el framework <b>Spring MVC</b> llamada:
 * <code>HibernateDaoSupport</code>, dando de ese modo un soporte directo para
 * el acceso y gesti&oacute;n de los datos en el contexto de persistencia
 * definido en la aplicaci&oacute;n.
 * <p>
 * Esta clase implementar&aacute; los m&eacute;todos de acceso a los datos de
 * acuerdo al contexto de persistencia asociado a la aplicaci&oacute;n, en otras
 * palabras, realizar&aacute; las operaciones C.R.U.D. <i>Create Retrieve Update
 * Delete</i>, necesarias y &uacute;nicamente definidas, sobre la Base de Datos
 * a trav&eacute;s de un contexto de persistencia defindo por el framework
 * <b>Hibernate</b>.
 * <p>
 * Los m&eacute;todos expuestos para la gesti&oacute;n de los datos asociados a
 * las entidades pertencientes a la clase {@code DeviceStatus}, son solo
 * aquellos que se han definido en la interfaz o prototipo
 * {@code IDeviceStatusDAO}; de ese modo, esta clase se convierte en un D.A.O.
 * <i>Data Access Object</i>, para gestionar los datos de las entidades
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
public class DeviceStatusDAOImpl extends AbstractEntityDAO implements
		IDeviceStatusDAO {

	/**
	 * Constructor por defecto, sin par&aacute;metros, y &uacute;nico para
	 * generar instancias de esta clase.
	 * <p>
	 * Este constructor realizar&aacute; una llamada expl&iacute;cita a su
	 * constructor padre.
	 */
	public DeviceStatusDAOImpl() {
		super();
	}

	// WHERE disposition.name <> "RESERVADO NEGADO" AND device.id = ? AND
	// (((endTime0 > startTime1) AND (endTime0 <= endTime1))
	// OR ((startTime0 >= startTime1) AND (startTime0 < endTime1))
	// OR ((startTime0 <= startTime1) AND (endTime0 >= endTime1)))
	// AND
	// (((endDate0 > startDate1) AND (endDate0 <= endDate1))
	// OR ((startDate0 >= startDate1) AND (startDate0 < endDate1))
	// OR ((startDate0 <= startDate1) AND (endDate0 >= endDate1)))
	@Override()
	@SuppressWarnings(value = { "unchecked" })
	public List<DeviceStatus> findInConflict(Long deviceId, Date startDate,
			Date endDate, Date startTime, Date endTime)
			throws MANDevicesLendingDAOException {
		List<DeviceStatus> deviceStatusesFound = new ArrayList<DeviceStatus>();
		Session session = null;

		try {
			session = super.getSession();

			Criteria criteria = session.createCriteria(DeviceStatus.class);
			Conjunction globalConjunction = Restrictions.conjunction();
			Conjunction conjunction = Restrictions.conjunction();
			Disjunction disjunction = Restrictions.disjunction();

			globalConjunction.add(Restrictions.ne("disposition.name",
					"RESERVADO NEGADO"));
			globalConjunction.add(Restrictions.eq("device.id", deviceId));

			// (endTime0 > startTime1) AND (endTime0 <= endTime1)
			conjunction.add(Restrictions.gt("endTime", startTime));
			conjunction.add(Restrictions.le("endTime", endTime));
			disjunction.add(conjunction);

			// (startTime0 >= startTime1) AND (startTime0 < endTime1)
			conjunction = Restrictions.conjunction();
			conjunction.add(Restrictions.ge("startTime", startTime));
			conjunction.add(Restrictions.lt("startTime", endTime));
			disjunction.add(conjunction);

			// (startTime0 <= startTime1) AND (endTime0 >= endTime1)
			conjunction = Restrictions.conjunction();
			conjunction.add(Restrictions.le("startTime", startTime));
			conjunction.add(Restrictions.ge("endTime", endTime));
			disjunction.add(conjunction);
			globalConjunction.add(disjunction);

			disjunction = Restrictions.disjunction();
			conjunction = Restrictions.conjunction();

			// (endDate0 > startDate1) AND (endDate0 <= endDate1)
			conjunction.add(Restrictions.gt("endDate", startDate));
			conjunction.add(Restrictions.le("endDate", endDate));
			disjunction.add(conjunction);

			// (startDate0 >= startDate1) AND (startDate0 < endDate1)
			conjunction = Restrictions.conjunction();
			conjunction.add(Restrictions.ge("startDate", startDate));
			conjunction.add(Restrictions.lt("startDate", endDate));
			disjunction.add(conjunction);

			// (startDate0 <= startDate1) AND (endDate0 >= endDate1)
			conjunction = Restrictions.conjunction();
			conjunction.add(Restrictions.le("startDate", startDate));
			conjunction.add(Restrictions.ge("endDate", endDate));
			disjunction.add(conjunction);
			globalConjunction.add(disjunction);

			criteria.add(globalConjunction);

			List<IEntityContext> entitesContextFoundList = criteria.list();
			for (IEntityContext entityContext : entitesContextFoundList) {
				deviceStatusesFound.add((DeviceStatus) entityContext);
			}
		} catch (Exception ex) {
			throw new MANDevicesLendingDAOException(String.format(
					"Error during procedure's \"%s\" for class: %s",
					"Find In Conflict", DeviceStatus.class.getSimpleName()), ex);
		}

		return (deviceStatusesFound);
	}

	@Override()
	@SuppressWarnings(value = { "unchecked" })
	public List<DeviceStatus> findUnsolvedLendings(String clientUserName,
			Date currentDate) throws MANDevicesLendingDAOException {
		List<DeviceStatus> deviceStatusesFound = new ArrayList<DeviceStatus>();
		Session session = null;

		try {
			session = super.getSession();

			Criteria criteria = session.createCriteria(DeviceStatus.class);

			Conjunction conjunction = Restrictions.conjunction();
			conjunction.add(Restrictions.eq("disposition.name",
					"RESERVADO PENDIENTE"));
			conjunction.add(Restrictions.ne("client.email", clientUserName));
			conjunction.add(Restrictions.ge("startDate", currentDate));

			criteria.add(conjunction);

			List<IEntityContext> entitesContextFoundList = criteria.list();
			for (IEntityContext entityContext : entitesContextFoundList) {
				DeviceStatus deviceStatus = (DeviceStatus) entityContext;

				// FIXME: WTF is that shiiiittt!!
				if ((deviceStatus.getStartDate().equals(currentDate))
						&& (deviceStatus.getStartTime().before(currentDate))) {
					//deviceStatusesFound.add(deviceStatus);
					continue;
				}

				deviceStatusesFound.add(deviceStatus);
			}
		} catch (Exception ex) {
			throw new MANDevicesLendingDAOException(String.format(
					"Error during procedure's \"%s\" for class: %s",
					"Find By Attributes", DeviceStatus.class.getSimpleName()),
					ex);
		}

		return (deviceStatusesFound);
	}

	@Override()
	public DeviceStatus save(DeviceStatus deviceStatus)
			throws MANDevicesLendingDAOException {
		Long deviceStatusKey = (Long) super.save(deviceStatus);

		return ((deviceStatusKey != null) ? deviceStatus : null);
	}

	@Override()
	public DeviceStatus update(DeviceStatus deviceStatus)
			throws MANDevicesLendingDAOException {
		Long deviceStatusKey = (Long) super.update(deviceStatus);

		return ((deviceStatusKey != null) ? deviceStatus : null);
	}
}