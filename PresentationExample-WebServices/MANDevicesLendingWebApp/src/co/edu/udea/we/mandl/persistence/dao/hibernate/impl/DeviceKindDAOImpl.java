package co.edu.udea.we.mandl.persistence.dao.hibernate.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import co.edu.udea.we.mandl.model.dto.DeviceKind;
import co.edu.udea.we.mandl.model.dto.DeviceKindId;
import co.edu.udea.we.mandl.model.dto.IEntityContext;
import co.edu.udea.we.mandl.persistence.dao.IDeviceKindDAO;
import co.edu.udea.we.mandl.persistence.dao.exception.MANDevicesLendingDAOException;

/**
 * Clase que define la implementaci&oacute;n espec&iacute;fica para los
 * m&eacute;todos de acceso al repositorio de datos y definidos en la interfaz
 * {@code IDeviceKindDAO}; por otra parte, esta clase hereda indirectamente de
 * clase definida previamente en el framework <b>Spring MVC</b> llamada:
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
 * las entidades pertencientes a la clase {@code DeviceKind}, son solo aquellos
 * que se han definido en la interfaz o prototipo {@code IDeviceKindDAO}; de ese
 * modo, esta clase se convierte en un D.A.O. <i>Data Access Object</i>, para
 * gestionar los datos de las entidades {@code DeviceKind}.
 * 
 * @since JDK1.7
 * 
 * @version 1.0
 * 
 * @author Andersson Garc&iacute;a Sotelo
 * @author Miguel &Aacute;ngel Ossa Ruiz
 * @author Neiber Padierna P&eacute;rez
 */
public class DeviceKindDAOImpl extends AbstractEntityDAO implements
		IDeviceKindDAO {

	/**
	 * Constructor por defecto, sin par&aacute;metros, y &uacute;nico para
	 * generar instancias de esta clase.
	 * <p>
	 * Este constructor realizar&aacute; una llamada expl&iacute;cita a su
	 * constructor padre.
	 */
	public DeviceKindDAOImpl() {
		super();
	}

	@Override()
	public DeviceKind save(DeviceKind deviceKind)
			throws MANDevicesLendingDAOException {
		DeviceKindId deviceKindKey = (DeviceKindId) super.save(deviceKind);

		return ((deviceKindKey != null) ? deviceKind : null);
	}

	@Override()
	public List<DeviceKind> findByAttributes(Map<String, Object> parametersMap)
			throws MANDevicesLendingDAOException {
		List<DeviceKind> deviceKindsFoundList = new ArrayList<DeviceKind>();
		List<IEntityContext> entitiesContextFoundList = super.findByAttributes(
				DeviceKind.class, parametersMap);

		for (IEntityContext entityContext : entitiesContextFoundList) {
			deviceKindsFoundList.add((DeviceKind) entityContext);
		}

		return (deviceKindsFoundList);
	}
}