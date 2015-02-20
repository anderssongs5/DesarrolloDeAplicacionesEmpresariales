package co.edu.udea.we.mandl.business.impl;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.transaction.annotation.Transactional;

import co.edu.udea.we.mandl.business.IDeviceBusiness;
import co.edu.udea.we.mandl.business.exception.MANDevicesLendingBusinessException;
import co.edu.udea.we.mandl.model.dto.Device;

/**
 * Esta clase se encargar&aacute; de exponer los m&eacute;todos adecuados para
 * realizar un testeo sobre la clase definida en la capa de negocio llamada:
 * {@code DeviceBusinessImpl}.
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
public class DeviceBusinessImplTest {

	/**
	 * Instancia requerida para poder realizar el testeo de los procesos de
	 * negocio definidos en la clase {@code DeviceBusinessImpl}, donde este
	 * objeto es una instancia de la clase mencionada.
	 * <p>
	 * Esta instancia es inyectada a trav&eacute;s del contexto de <b>Spring
	 * Framework MVC</b>.
	 */
	@Autowired()
	private IDeviceBusiness deviceBusiness;

	/**
	 * M&eacute;todo para testear el proceso de negocio definido en la clase
	 * {@code DeviceBusinessImpl}, el cual es:
	 * {@link co.edu.udea.we.mandl.business.impl.DeviceBusinessImpl#changeAvailability(java.lang.Long, java.lang.Boolean)}
	 * .
	 */
	@Test()
	@Rollback(true)
	public void testChangeAvailability() {
		try {
			Long deviceId = Long.valueOf(1L);

			Device device = this.deviceBusiness.changeAvailability(deviceId,
					Boolean.FALSE);

			Assert.assertTrue(device != null);
		} catch (MANDevicesLendingBusinessException ex) {
			ex.printStackTrace();
			fail(ex.getMessage());
		}
	}

	/**
	 * M&eacute;todo para testear el proceso de negocio definido en la clase
	 * {@code DeviceBusinessImpl}, el cual es:
	 * {@link co.edu.udea.we.mandl.business.impl.DeviceBusinessImpl#findAllAvailables()}
	 * .
	 */
	@Test()
	public void testFindAllAvailables() {
		try {
			List<Device> devicesFoundList = this.deviceBusiness
					.findAllAvailables();

			Assert.assertTrue(devicesFoundList.isEmpty());
		} catch (MANDevicesLendingBusinessException ex) {
			ex.printStackTrace();
			fail(ex.getMessage());
		}
	}

	/**
	 * M&eacute;todo para testear el proceso de negocio definido en la clase
	 * {@code DeviceBusinessImpl}, el cual es:
	 * {@link co.edu.udea.we.mandl.business.impl.DeviceBusinessImpl#findByDevicesKindsNamesList(java.util.List)}
	 * .
	 */
	@Test()
	public void testFindByDevicesKindsNamesList() {
		List<String> kindsNamesList = Arrays.asList("MICROSCOPIO OPTICO");

		try {
			List<Device> devicesFound = this.deviceBusiness
					.findByDevicesKindsNamesList(kindsNamesList);

			assertTrue(devicesFound.isEmpty() == false);
		} catch (MANDevicesLendingBusinessException ex) {
			ex.printStackTrace();
			fail(ex.getMessage());
		}
	}

	/**
	 * M&eacute;todo para testear el proceso de negocio definido en la clase
	 * {@code DeviceBusinessImpl}, el cual es:
	 * {@link co.edu.udea.we.mandl.business.impl.DeviceBusinessImpl#save(java.lang.String, java.lang.Boolean, java.lang.String, java.lang.String, java.util.List)}
	 * .
	 */
	@Test()
	@Rollback(true)
	public void testSave() {
		try {
			String fullName = "Cruel Device 1";
			Boolean isAvailable = Boolean.FALSE;
			String description = "Your cruel device #1...";
			String photoImage = null;
			List<String> devicesKindsNamesList = new ArrayList<String>();
			devicesKindsNamesList.add("MICROSCOPIO OPTICO");
			devicesKindsNamesList.add("MICROSCOPIO");

			Device device = this.deviceBusiness.save(fullName, isAvailable,
					description, photoImage, devicesKindsNamesList);

			assertTrue(device != null);
		} catch (MANDevicesLendingBusinessException ex) {
			ex.printStackTrace();
			fail(ex.getMessage());
		}
	}
}