package co.edu.udea.we.mandl.business.impl;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;

import co.edu.udea.we.mandl.business.IDeviceStatusBusiness;
import co.edu.udea.we.mandl.business.exception.MANDevicesLendingBusinessException;
import co.edu.udea.we.mandl.business.util.TextUtils;
import co.edu.udea.we.mandl.model.dto.Client;
import co.edu.udea.we.mandl.model.dto.DeviceStatus;
import co.edu.udea.we.mandl.model.dto.Disposition;
import co.edu.udea.we.mandl.persistence.dao.IClientDAO;
import co.edu.udea.we.mandl.persistence.dao.IDeviceStatusDAO;
import co.edu.udea.we.mandl.persistence.dao.exception.MANDevicesLendingDAOException;

/**
 * Clase que define la implementaci&oacute;n espec&iacute;fica para los
 * m&eacute;todos que sirven de apoyo para efectuar los procesos definidos en la
 * capa de negocio con respecto a la gesti&oacute;n de la entidad
 * {@code DeviceStatus}.
 * <p>
 * Esta clase ser&aacute; el &uacute;nico punto de acceso a los m&eacute;todos o
 * funciones definidas para soportar los procesos de negocio relacionados con
 * las instancias pertenecientes a la clase {@code DeviceStatus}.
 * <p>
 * Los m&eacute;todos expuestos para la gesti&oacute;n de los procesos de
 * negocio con respecto a las entidades pertencientes a la clase
 * {@code DeviceStatus}, son solo aquellos que se han definido en la interfaz o
 * prototipo {@code IDeviceStatusBusiness}.
 * 
 * @since JDK1.7
 * 
 * @version 1.0
 * 
 * @author Andersson Garc&iacute;a Sotelo
 * @author Miguel &Aacute;ngel Ossa Ruiz
 * @author Neiber Padierna P&eacute;rez
 */
public class DeviceStatusBusinessImpl implements IDeviceStatusBusiness {

	/**
	 * Instancia requerida para poder realizar la gesti&oacute;n de los datos de
	 * las instancias {@code Client} con respecto a la capa que define el
	 * contexto de persistencia para la aplicaci&oacute;n.
	 */
	private IClientDAO clientDAO;
	/**
	 * Instancia requerida para poder realizar la gesti&oacute;n de los datos de
	 * las instancias {@code DeviceStatus} con respecto a la capa que define el
	 * contexto de persistencia para la aplicaci&oacute;n.
	 */
	private IDeviceStatusDAO deviceStatusDAO;

	/**
	 * Constructor por defecto, sin par&aacute;metros, y &uacute;nico para
	 * generar instancias de esta clase.
	 * <p>
	 * Este constructor realizar&aacute; una llamada expl&iacute;cita a su
	 * constructor padre.
	 */
	public DeviceStatusBusinessImpl() {
		super();
	}

	/**
	 * M&eacute;todo para obtener la instancia que sirve para realizar la
	 * gesti&oacute;n de los datos con respecto a la capa que define el contexto
	 * de persistencia en la aplicaci&oacute;n, para la entidad {@code Client}.
	 * 
	 * @return Un objeto que representa la propiedad que ayuda al acceso de los
	 *         datos en la capa de persistencia.
	 */
	public IClientDAO getClientDAO() {

		return (this.clientDAO);
	}

	/**
	 * M&eacute;todo para obtener la instancia que sirve para realizar la
	 * gesti&oacute;n de los datos con respecto a la capa que define el contexto
	 * de persistencia en la aplicaci&oacute;n, para la entidad
	 * {@code DeviceStatus}.
	 * 
	 * @return Un objeto que representa la propiedad que ayuda al acceso de los
	 *         datos en la capa de persistencia.
	 */
	public IDeviceStatusDAO getDeviceStatusDAO() {

		return (this.deviceStatusDAO);
	}

	/**
	 * M&eacute;todo para establecer una instancia que servir&aacute; para
	 * realizar la gesti&oacute;n de los datos con respecto a la capa que define
	 * el contexto de persistencia en la aplicaci&oacute;n, para la entidad
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
	 * M&eacute;todo para establecer una instancia que servir&aacute; para
	 * realizar la gesti&oacute;n de los datos con respecto a la capa que define
	 * el contexto de persistencia en la aplicaci&oacute;n, para la entidad
	 * {@code DeviceStatus}.
	 * 
	 * @param deviceStatusDAO
	 *            Instancia que representa la nueva propiedad que ayuda al
	 *            acceso de los datos en la capa de persistencia.
	 */
	public void setDeviceStatusDAO(IDeviceStatusDAO deviceStatusDAO) {
		this.deviceStatusDAO = deviceStatusDAO;
	}

	@Override()
	public List<DeviceStatus> evaluateLendings(
			List<DeviceStatus> deviceStatusesList)
			throws MANDevicesLendingBusinessException {
		if (deviceStatusesList != null) {
			List<DeviceStatus> deviceStatusOkList = new ArrayList<DeviceStatus>();
			for (DeviceStatus deviceStatus : deviceStatusesList) {
				try {
					DeviceStatus ds = this.deviceStatusDAO.update(deviceStatus);

					if (ds != null) {
						deviceStatusOkList.add(ds);
					}
				} catch (MANDevicesLendingDAOException ex) {
					throw new MANDevicesLendingBusinessException(String.format(
							"Error during procedure's \"%s\".",
							"Evaluate Lendigs"), ex);
				}
			}

			return (deviceStatusOkList);
		}

		return (null);
	}

	@Override()
	public List<DeviceStatus> findUnsolvedLendings(String clientUserName)
			throws MANDevicesLendingBusinessException {
		if (!TextUtils.isEmpty(clientUserName)) {
			List<DeviceStatus> diveceStatusesList = new ArrayList<DeviceStatus>();

			try {
				Client client = this.clientDAO.find(clientUserName);
				if ((client != null)
						&& (client.getProfile() != null)
						&& (client.getProfile().getProfile()
								.equals("ADMINISTRADOR"))) {
					diveceStatusesList = this.deviceStatusDAO
							.findUnsolvedLendings(
									TextUtils.toLowerCase(clientUserName),
									new Date());
				}
			} catch (MANDevicesLendingDAOException ex) {
				throw new MANDevicesLendingBusinessException(String.format(
						"Error during procedure's \"%s\".",
						"Find Unsolved Lendings"), ex);
			}

			return (diveceStatusesList);
		}

		return (null);
	}

	@Override()
	public List<DeviceStatus> reserveDevices(
			List<DeviceStatus> deviceStatusesList, String clientUserName)
			throws MANDevicesLendingBusinessException {
		if ((!TextUtils.isEmpty(clientUserName))
				&& (deviceStatusesList != null)) {
			List<DeviceStatus> deviceStatusesOkList = new ArrayList<DeviceStatus>();

			for (DeviceStatus deviceStatus : deviceStatusesList) {
				try {
					Calendar endTimeCalendar = new GregorianCalendar();
					endTimeCalendar.setTime(deviceStatus.getEndTime());

					Calendar startTimeCalendar = new GregorianCalendar();
					startTimeCalendar.setTime(deviceStatus.getStartTime());

					int differentInHours = Math.abs(endTimeCalendar
							.get(Calendar.HOUR_OF_DAY)
							- startTimeCalendar.get(Calendar.HOUR_OF_DAY));

					if ((differentInHours > 8)
							|| (endTimeCalendar.before(startTimeCalendar))) {
						continue;
					}

					List<DeviceStatus> deviceStatusesInConflictList = this.deviceStatusDAO
							.findInConflict(deviceStatus.getDevice().getId(),
									deviceStatus.getStartDate(),
									deviceStatus.getEndDate(),
									deviceStatus.getStartTime(),
									deviceStatus.getEndTime());
					if ((deviceStatus != null)
							&& (!deviceStatusesInConflictList.isEmpty())) {
						continue;
					}

					deviceStatus.getClient().setEmail(
							TextUtils.toLowerCase(clientUserName));
					deviceStatus.setRequestDatetime(new Date());
					deviceStatus.setDisposition(new Disposition(
							"RESERVADO PENDIENTE"));

					DeviceStatus ds = this.deviceStatusDAO.save(deviceStatus);

					if (ds != null) {
						deviceStatusesOkList.add(ds);
					}
				} catch (MANDevicesLendingDAOException ex) {
					throw new MANDevicesLendingBusinessException(String.format(
							"Error during procedure's \"%s\".",
							"Reserve Devices"), ex);
				}
			}

			return (deviceStatusesOkList);
		}

		return (null);
	}
}