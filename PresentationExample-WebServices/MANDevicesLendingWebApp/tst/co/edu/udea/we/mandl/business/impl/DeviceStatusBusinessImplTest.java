package co.edu.udea.we.mandl.business.impl;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.transaction.annotation.Transactional;

import co.edu.udea.we.mandl.business.IDeviceStatusBusiness;
import co.edu.udea.we.mandl.business.exception.MANDevicesLendingBusinessException;
import co.edu.udea.we.mandl.model.dto.Client;
import co.edu.udea.we.mandl.model.dto.Device;
import co.edu.udea.we.mandl.model.dto.DeviceStatus;
import co.edu.udea.we.mandl.model.dto.Disposition;

/**
 * Esta clase se encargar&aacute; de exponer los m&eacute;todos adecuados para
 * realizar un testeo sobre la clase definida en la capa de negocio llamada:
 * {@code DeviceStatusBusinessImpl}.
 * <p>
 * La invocaci&oacute;n de los m&eacute;todos que efect&uacute;an en testing se
 * har&aacute; utilizando el framework de <b>JUnit</b>; igualmente, las
 * dependiencias requeridas ser&aacute;n inyectadas a trav&eacute;s del contexto
 * definido por <b>Spring</b>.
 * <p>
 * Los errores, excepciones o fallos ser&aacute;n autom&aacute;ticamen escritos
 * en la salida est&aacute;ndar definida; igualmente, hay algunas excepciones
 * que se registrar&aacute;n en el archivo de <i>LOG</i> definido para la
 * aplicaci&oacute;n.
 * 
 * @since JDK1.7
 * 
 * @version 1.0
 * 
 * @author Andersson Garc&iacute;a Sotelo
 * @author Miguel &Aacute;ngel Ossa Ruiz
 * @author Neiber Padierna P&eacute;rez
 */
@ContextConfiguration(locations = { "file:WebContent/WEB-INF/spring-config.xml" })
@RunWith(SpringJUnit4ClassRunner.class)
@Transactional()
@WebAppConfiguration(value = "web.xml")
public class DeviceStatusBusinessImplTest {

	/**
	 * Instancia requerida para poder realizar el testeo de los procesos de
	 * negocio definidos en la clase {@code DeviceStatusBusinessImpl}, donde
	 * este objeto es una instancia de la clase mencionada.
	 * <p>
	 * Esta instancia es inyectada a trav&eacute;s del contexto de <b>Spring
	 * Framework MVC</b>.
	 */
	@Autowired()
	private IDeviceStatusBusiness deviceStatusBusiness;

	/**
	 * M&eacute;todo para testear el proceso de negocio definido en la clase
	 * {@code DeviceStatusBusinessImpl}, el cual es:
	 * {@link co.edu.udea.we.mandl.business.impl.DeviceStatusBusinessImpl#evaluateLendings(java.util.List)}
	 * .
	 */
	@Test()
	@Rollback(true)
	public void testEvaluateLendings() {
		try {
			List<DeviceStatus> deviceStatusesList = this.deviceStatusBusiness
					.findUnsolvedLendings("oellave@gmail.com");
			for (DeviceStatus deviceStatus : deviceStatusesList) {
				deviceStatus
						.setDisposition(new Disposition("RESERVADO NEGADO"));
			}

			deviceStatusesList = this.deviceStatusBusiness
					.evaluateLendings(deviceStatusesList);

			assertTrue(!deviceStatusesList.isEmpty());
		} catch (MANDevicesLendingBusinessException ex) {
			ex.printStackTrace();
			fail(ex.getMessage());
		}
	}

	/**
	 * M&eacute;todo para testear el proceso de negocio definido en la clase
	 * {@code DeviceStatusBusinessImpl}, el cual es:
	 * {@link co.edu.udea.we.mandl.business.impl.DeviceStatusBusinessImpl#findUnsolvedLendings(java.lang.String)}
	 * .
	 */
	@Test()
	public void testFindUnsolvedLendings() {
		try {
			String clientUserName = "abcdefgh@ijkilm.no.pq";

			List<DeviceStatus> devicesStatusesList = this.deviceStatusBusiness
					.findUnsolvedLendings(clientUserName);

			assertTrue(devicesStatusesList.isEmpty());
		} catch (MANDevicesLendingBusinessException ex) {
			ex.printStackTrace();
			fail(ex.getMessage());
		}
	}

	/**
	 * M&eacute;todo para testear el proceso de negocio definido en la clase
	 * {@code DeviceStatusBusinessImpl}, el cual es:
	 * {@link co.edu.udea.we.mandl.business.impl.DeviceStatusBusinessImpl#reserveDevices(java.util.List, java.lang.String)}
	 * .
	 */
	@SuppressWarnings(value = { "deprecation" })
	@Test()
	@Rollback(true)
	public void testReserveDevices() {
		try {
			String clientUserName = "abcdefgh@ijklm.no.pq";

			Client client = new Client();
			client.setEmail(clientUserName);
			Device device = new Device();
			device.setId(Long.valueOf(1L));
			Disposition disposition = new Disposition();

			Date startDate = new Date();
			Date endDate = new Date();

			Date startTime = new Date();
			startTime.setHours(11);
			startTime.setMinutes(0);
			startTime.setSeconds(0);
			Date endTime = new Date();
			endTime.setHours(13);
			endTime.setMinutes(0);
			endTime.setSeconds(0);

			DeviceStatus deviceStatus = new DeviceStatus(client, device,
					disposition, endDate, startDate, endTime, startTime, null);

			List<DeviceStatus> deviceStatusesList = new ArrayList<DeviceStatus>();
			deviceStatusesList.add(deviceStatus);

			List<DeviceStatus> devicesStatusesList = this.deviceStatusBusiness
					.reserveDevices(deviceStatusesList, clientUserName);
			assertTrue(devicesStatusesList.isEmpty());
		} catch (MANDevicesLendingBusinessException ex) {
			ex.printStackTrace();
			fail(ex.getMessage());
		}
	}
}