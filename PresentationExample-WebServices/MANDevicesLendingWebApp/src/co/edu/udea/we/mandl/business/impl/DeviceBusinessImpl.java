package co.edu.udea.we.mandl.business.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import co.edu.udea.we.mandl.business.IDeviceBusiness;
import co.edu.udea.we.mandl.business.exception.MANDevicesLendingBusinessException;
import co.edu.udea.we.mandl.business.util.TextUtils;
import co.edu.udea.we.mandl.model.dto.Device;
import co.edu.udea.we.mandl.model.dto.DeviceKind;
import co.edu.udea.we.mandl.model.dto.DeviceKindId;
import co.edu.udea.we.mandl.persistence.dao.IDeviceDAO;
import co.edu.udea.we.mandl.persistence.dao.IDeviceKindDAO;
import co.edu.udea.we.mandl.persistence.dao.exception.MANDevicesLendingDAOException;

/**
 * Clase que define la implementaci&oacute;n espec&iacute;fica para los
 * m&eacute;todos que sirven de apoyo para efectuar los procesos definidos en la
 * capa de negocio con respecto a la gesti&oacute;n de la entidad {@code Device}
 * .
 * <p>
 * Esta clase ser&aacute; el &uacute;nico punto de acceso a los m&eacute;todos o
 * funciones definidas para soportar los procesos de negocio relacionados con
 * las instancias pertenecientes a la clase {@code Device}.
 * <p>
 * Los m&eacute;todos expuestos para la gesti&oacute;n de los procesos de
 * negocio con respecto a las entidades pertencientes a la clase {@code Device},
 * son solo aquellos que se han definido en la interfaz o prototipo
 * {@code IDeviceBusiness}.
 * 
 * @since JDK1.7
 * 
 * @version 1.0
 * 
 * @author Andersson Garc&iacute;a Sotelo
 * @author Miguel &Aacute;ngel Ossa Ruiz
 * @author Neiber Padierna P&eacute;rez
 */
public class DeviceBusinessImpl implements IDeviceBusiness {

	/**
	 * Instancia requerida para poder realizar la gesti&oacute;n de los datos de
	 * las instancias {@code Device} con respecto a la capa que define el
	 * contexto de persistencia para la aplicaci&oacute;n.
	 */
	private IDeviceDAO deviceDAO;
	/**
	 * Instancia requerida para poder realizar la gesti&oacute;n de los datos de
	 * las instancias {@code DeviceKind} con respecto a la capa que define el
	 * contexto de persistencia para la aplicaci&oacute;n.
	 */
	private IDeviceKindDAO deviceKindDAO;

	/**
	 * Constructor por defecto, sin par&aacute;metros, y &uacute;nico para
	 * generar instancias de esta clase.
	 * <p>
	 * Este constructor realizar&aacute; una llamada expl&iacute;cita a su
	 * constructor padre.
	 */
	public DeviceBusinessImpl() {
		super();
	}

	/**
	 * M&eacute;todo para obtener la instancia que sirve para realizar la
	 * gesti&oacute;n de los datos con respecto a la capa que define el contexto
	 * de persistencia en la aplicaci&oacute;n, para la entidad {@code Device}.
	 * 
	 * @return Un objeto que representa la propiedad que ayuda al acceso de los
	 *         datos en la capa de persistencia.
	 */
	public IDeviceDAO getDeviceDAO() {

		return (this.deviceDAO);
	}

	/**
	 * M&eacute;todo para obtener la instancia que sirve para realizar la
	 * gesti&oacute;n de los datos con respecto a la capa que define el contexto
	 * de persistencia en la aplicaci&oacute;n, para la entidad
	 * {@code DeviceKind}.
	 * 
	 * @return Un objeto que representa la propiedad que ayuda al acceso de los
	 *         datos en la capa de persistencia.
	 */
	public IDeviceKindDAO getDeviceKindDAO() {

		return (this.deviceKindDAO);
	}

	/**
	 * M&eacute;todo para establecer una instancia que servir&aacute; para
	 * realizar la gesti&oacute;n de los datos con respecto a la capa que define
	 * el contexto de persistencia en la aplicaci&oacute;n, para la entidad
	 * {@code Device}.
	 * 
	 * @param deviceDAO
	 *            Instancia que representa la nueva propiedad que ayuda al
	 *            acceso de los datos en la capa de persistencia.
	 */
	public void setDeviceDAO(IDeviceDAO deviceDAO) {
		this.deviceDAO = deviceDAO;
	}

	/**
	 * M&eacute;todo para establecer una instancia que servir&aacute; para
	 * realizar la gesti&oacute;n de los datos con respecto a la capa que define
	 * el contexto de persistencia en la aplicaci&oacute;n, para la entidad
	 * {@code DeviceKind}.
	 * 
	 * @param deviceKindDAO
	 *            Instancia que representa la nueva propiedad que ayuda al
	 *            acceso de los datos en la capa de persistencia.
	 */
	public void setDeviceKindDAO(IDeviceKindDAO deviceKindDAO) {
		this.deviceKindDAO = deviceKindDAO;
	}

	@Override()
	public Device changeAvailability(Long deviceId, Boolean newAvailability)
			throws MANDevicesLendingBusinessException {
		if ((deviceId != null) && (newAvailability != null)) {
			try {
				Device device = this.deviceDAO.find(deviceId);

				if (device != null) {
					device.setIsAvailable(newAvailability);

					device = this.deviceDAO.update(device);
				}

				return (device);
			} catch (MANDevicesLendingDAOException ex) {
				throw new MANDevicesLendingBusinessException(String.format(
						"Error during procedure's \"%s\".",
						"Change Availability"), ex);
			}
		}

		return (null);
	}

	@Override()
	public List<Device> findAllAvailables()
			throws MANDevicesLendingBusinessException {
		Map<String, Object> parametersMap = new HashMap<String, Object>();
		parametersMap.put("isAvailable", Boolean.TRUE);

		try {

			return (this.deviceDAO.findByAttributes(parametersMap));
		} catch (MANDevicesLendingDAOException ex) {
			throw new MANDevicesLendingBusinessException(String.format(
					"Error during procedure's \"%s\".", "Find By Availables"),
					ex);
		}
	}

	@Override()
	public Device save(String fullName, Boolean isAvailable,
			String description, String photoImage, List<String> kindsNamesList)
			throws MANDevicesLendingBusinessException {
		if ((kindsNamesList != null) && (!kindsNamesList.isEmpty())
				&& (!TextUtils.isEmpty(fullName)) && (isAvailable != null)) {
			Device device = new Device(
					fullName,
					isAvailable,
					(!TextUtils.isEmpty(description) ? description.trim()
							: null),
					(!TextUtils.isEmpty(photoImage) ? photoImage.trim() : null),
					null, null);

			try {
				device = this.deviceDAO.save(device);

				for (String kindName : kindsNamesList) {
					this.deviceKindDAO.save(new DeviceKind(new DeviceKindId(
							device.getId(), kindName)));
				}

				return ((device != null) ? device : null);
			} catch (MANDevicesLendingDAOException ex) {
				throw new MANDevicesLendingBusinessException(String.format(
						"Error during procedure's \"%s\".", "Save"), ex);
			}
		}

		return (null);
	}

	@Override
	public List<Device> findByDevicesKindsNamesList(List<String> kindsNamesList)
			throws MANDevicesLendingBusinessException {
		List<Device> devicesFound = new ArrayList<Device>();

		if ((kindsNamesList != null) && (!(kindsNamesList.isEmpty()))) {

			try {
				devicesFound = deviceDAO
						.findByDevicesKindsNamesList(kindsNamesList);
			} catch (MANDevicesLendingDAOException ex) {
				throw new MANDevicesLendingBusinessException(String.format(
						"Error during procedure's \"%s\".",
						"Find By Devices Kinds Names"), ex);
			}
		}

		return devicesFound;
	}
}