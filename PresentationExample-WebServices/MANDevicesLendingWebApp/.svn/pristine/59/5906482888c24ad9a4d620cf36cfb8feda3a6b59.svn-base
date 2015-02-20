package co.edu.udea.we.mandl.business.impl;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import org.springframework.test.annotation.Rollback;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.transaction.annotation.Transactional;

import co.edu.udea.we.mandl.business.IKindBusiness;
import co.edu.udea.we.mandl.business.exception.MANDevicesLendingBusinessException;
import co.edu.udea.we.mandl.model.dto.Kind;

/**
 * Esta clase se encargar&aacute; de exponer los m&eacute;todos adecuados para
 * realizar un testeo sobre la clase definida en la capa de negocio llamada:
 * {@code KindBusinessImplTest}.
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
public class KindBusinessImplTest {

	/**
	 * Instancia requerida para poder realizar el testeo de los procesos de
	 * negocio definidos en la clase {@code KindBusinessImpl}, donde este objeto
	 * es una instancia de la clase mencionada.
	 * <p>
	 * Esta instancia es inyectada a trav&eacute;s del contexto de <b>Spring
	 * Framework MVC</b>.
	 */
	@Autowired()
	private IKindBusiness kindBusiness;

	/**
	 * M&eacute;todo para testear el proceso de negocio definido en la clase
	 * {@code KindBusinessImpl}, el cual es:
	 * {@link co.edu.udea.we.mandl.business.impl.KindBusinessImpl#findAll()}.
	 */
	@Test()
	public void testFindAll() {
		try {
			List<Kind> kindList = this.kindBusiness.findAll();

			assertTrue(kindList.isEmpty());
		} catch (MANDevicesLendingBusinessException ex) {
			ex.printStackTrace();
			fail(ex.getMessage());
		}
	}

	/**
	 * M&eacute;todo para testear el proceso de negocio definido en la clase
	 * {@code KindBusinessImpl}, el cual es:
	 * {@link co.edu.udea.we.mandl.business.impl.KindBusinessImpl#save(java.lang.String, java.lang.String)}
	 * .
	 */
	@Test()
	@Rollback(true)
	public void testSave() {
		try {
			String kindName = "fkljsdalf";
			String description = "Frasco de vidrio.";

			Kind kind = this.kindBusiness.save(kindName, description);

			assertTrue(kind != null);
		} catch (MANDevicesLendingBusinessException ex) {
			ex.printStackTrace();
			fail(ex.getMessage());
		}
	}
}