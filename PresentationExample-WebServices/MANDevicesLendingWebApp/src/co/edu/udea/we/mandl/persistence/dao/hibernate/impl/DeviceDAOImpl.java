package co.edu.udea.we.mandl.persistence.dao.hibernate.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.CriteriaSpecification;
import org.hibernate.criterion.Disjunction;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;

import co.edu.udea.we.mandl.model.dto.Device;
import co.edu.udea.we.mandl.model.dto.IEntityContext;
import co.edu.udea.we.mandl.persistence.dao.IDeviceDAO;
import co.edu.udea.we.mandl.persistence.dao.exception.MANDevicesLendingDAOException;

/**
 * Clase que define la implementaci&oacute;n espec&iacute;fica para los
 * m&eacute;todos de acceso al repositorio de datos y definidos en la interfaz
 * {@code IDeviceDAO}; por otra parte, esta clase hereda indirectamente de clase
 * definida en el framework <b>Spring MVC</b> llamada:
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
 * las entidades pertencientes a la clase {@code Device}, son solo aquellos que
 * se han definido en la interfaz o prototipo {@code IDeviceDAO}; de ese modo,
 * esta clase se convierte en un D.A.O. <i>Data Access Object</i>, para
 * gestionar los datos de las entidades {@code Device}.
 * 
 * @since JDK1.7
 * 
 * @version 1.0
 * 
 * @author Andersson Garc&iacute;a Sotelo
 * @author Miguel &Aacute;ngel Ossa Ruiz
 * @author Neiber Padierna P&eacute;rez
 */
public class DeviceDAOImpl extends AbstractEntityDAO implements IDeviceDAO {

	/**
	 * Constructor por defecto, sin par&aacute;metros, y &uacute;nico para
	 * generar instancias de esta clase.
	 * <p>
	 * Este constructor realizar&aacute; una llamada expl&iacute;cita a su
	 * constructor padre.
	 */
	public DeviceDAOImpl() {
		super();
	}

	@Override()
	public Device find(Long deviceId) throws MANDevicesLendingDAOException {

		return ((Device) super.find(Device.class, deviceId));
	}

	@Override()
	public List<Device> findAll() throws MANDevicesLendingDAOException {
		List<Device> devicesFound = new ArrayList<Device>();
		List<IEntityContext> entitiesContextFoundList = super
				.findAll(Device.class);

		for (IEntityContext entityContext : entitiesContextFoundList) {
			devicesFound.add((Device) entityContext);
		}

		return (devicesFound);
	}

	@Override()
	public List<Device> findByAttributes(Map<String, Object> parametersMap)
			throws MANDevicesLendingDAOException {
		List<Device> devicesFoundList = new ArrayList<Device>();
		List<IEntityContext> entitiesContextFoundList = super.findByAttributes(
				Device.class, parametersMap);

		for (IEntityContext entityContext : entitiesContextFoundList) {
			devicesFoundList.add((Device) entityContext);
		}

		return (devicesFoundList);
	}

	@Override()
	public Device save(Device device) throws MANDevicesLendingDAOException {
		Long deviceKey = (Long) super.save(device);

		return ((deviceKey != null) ? device : null);
	}

	@Override()
	public Device update(Device device) throws MANDevicesLendingDAOException {
		Long deviceKey = (Long) super.update(device);

		return ((deviceKey != null) ? device : null);
	}

	// SELECT d.* FROM DEVICE AS d LEFT OUTER JOIN DEVICE_KIND AS dk ON d.id =
	// dk.device_id WHERE (kind = ? OR ...) GROUP BY d.id;
	@Override()
	@SuppressWarnings(value = { "unchecked" })
	public List<Device> findByDevicesKindsNamesList(List<String> kindsNamesList)
			throws MANDevicesLendingDAOException {
		List<Device> devicesFound = new ArrayList<Device>();
		Session session = null;

		try {
			session = super.getSession();

			Criteria criteria = session.createCriteria(Device.class);
			criteria.createAlias("devicesKinds", "dk",
					CriteriaSpecification.LEFT_JOIN);

			Disjunction disjunction = Restrictions.disjunction();
			for (String kindName : kindsNamesList) {
				disjunction.add(Restrictions.eq("dk.id.kind", kindName));
			}

			criteria.add(disjunction);
			criteria.setProjection(Projections.projectionList()
					.add(Projections.property("fullName"))
					.add(Projections.property("isAvailable"))
					.add(Projections.property("description"))
					.add(Projections.property("photoImage"))
					.add(Projections.groupProperty("id")));

			List<Object> objectsFound = criteria.list();
			for (Object o : objectsFound) {
				Object[] temp = (Object[]) o;

				Device device = new Device((String) temp[0], (Boolean) temp[1],
						(String) temp[2], (String) temp[3], null, null);
				device.setId((Long) temp[4]);

				devicesFound.add(device);
			}
		} catch (Exception ex) {
			throw new MANDevicesLendingDAOException(String.format(
					"Error during procedure's \"%s\" for class: %s",
					"Find by Devices Kind", Device.class.getSimpleName(), ex));
		}

		return (devicesFound);
	}
}