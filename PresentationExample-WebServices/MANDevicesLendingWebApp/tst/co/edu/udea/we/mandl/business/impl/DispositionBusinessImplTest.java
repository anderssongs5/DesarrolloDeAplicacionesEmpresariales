package co.edu.udea.we.mandl.business.impl;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.transaction.annotation.Transactional;

import co.edu.udea.we.mandl.business.IDispositionBusiness;
import co.edu.udea.we.mandl.business.exception.MANDevicesLendingBusinessException;
import co.edu.udea.we.mandl.model.dto.Disposition;

/**
 * Esta clase se encargar&aacute; de exponer los m&eacute;todos adecuados para
 * realizar un testeo sobre la clase definida en la capa de negocio llamada:
 * {@code ClientBusinessImpl}.
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
public class DispositionBusinessImplTest {

	/**
	 * Instancia requerida para poder realizar el testeo de los procesos de
	 * negocio definidos en la clase {@code ClientBusinessImpl}, donde este
	 * objeto es una instancia de la clase mencionada.
	 * <p>
	 * Esta instancia es inyectada a trav&eacute;s del contexto de <b>Spring
	 * Framework MVC</b>.
	 */
	@Autowired()
	private IDispositionBusiness dispositionBusiness;

	/**
	 * M&eacute;todo para testear el proceso de negocio definido en la clase
	 * {@code DispositionBusinessImpl}, el cual es: Test method for
	 * {@link co.edu.udea.we.mandl.business.impl.DispositionBusinessImpl#findAll()}
	 * .
	 */
	@Test()
	public void testFindAll() {
		try {
			List<Disposition> dispositions = this.dispositionBusiness.findAll();
			assertTrue(dispositions.isEmpty());
		} catch (MANDevicesLendingBusinessException ex) {
			ex.printStackTrace();
			fail(ex.getMessage());
		}
	}

	/**
	 * M&eacute;todo para testear el proceso de negocio definido en la clase
	 * {@code DispositionBusinessImpl}, el cual es: Test method for
	 * {@link co.edu.udea.we.mandl.business.impl.DispositionBusinessImpl#save(java.lang.String, java.lang.String)}
	 * .
	 */
	@Test()
	@Rollback(true)
	public void testSave() {
		String name = "disponible";
		String description = "Este estado hace referencia a la disponibilidad";

		try {
			Disposition disposition = this.dispositionBusiness.save(name,
					description);
			assertTrue(disposition != null);
		} catch (MANDevicesLendingBusinessException ex) {
			ex.printStackTrace();
			fail(ex.getMessage());
		}
	}
}