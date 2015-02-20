package co.edu.udea.we.mandl.business;

import java.util.List;

import co.edu.udea.we.mandl.business.exception.MANDevicesLendingBusinessException;
import co.edu.udea.we.mandl.model.dto.Profile;

/**
 * Interfaz que ah sido definida para establecer los m&eacute;todos que se
 * podr&aacute;n realizar sobre los procesos que involucran instancias
 * pertenecientes a la clase {@code Profile}, y de ese modo, realizar la
 * gesti&oacute;n de los diversos datos sobre la capa de persistencia definida
 * para el aplicativo.
 * <p>
 * Esta interfaz define los m&eacute;todos o funciones que se deber&aacute;n
 * implementar para dar soporte a las operaciones requeridas por la
 * l&oacute;gica del negocio y que requieren acceso o interacci&oacute;n con la
 * capa encargada de brindar acceso a los datos de las entidades {@code Profile}.
 * <p>
 * De es modo, esta interfaz debe ser implementada por aquella clase que defina
 * de una forma espec&iacute;fica todos los procesos del negocio referentes a
 * las entidades {@code Profile}. En otras palabras, el objetivo primordial de
 * esta interfaz es definir las operaciones m&aacute;s b&aacute;sicas y
 * requeridas que se realizar&aacute;n sobre la l&oacute;fica del negocio y que
 * en su mayor&iacute;a, interactuar&aacute;n con la capa que define el contexto
 * de persistencia en la aplicaci&oacute;n con respecto a la instancias
 * {@code Profile}.
 * 
 * @since JDK1.7
 * 
 * @version 1.0
 * 
 * @author Andersson Garc&iacute;a Sotelo
 * @author Miguel &Aacute;ngel Ossa Ruiz
 * @author Neiber Padierna P&eacute;rez
 */
public interface IProfileBusiness {

	/**
	 * M&eacute;todo que se define para ejecutar una consulta sobre la capa de
	 * persistencia definida en la aplicaci&oacute;n, con el objetivo de extrear
	 * todos los datos o atributos pertenecientes a todas las instancias
	 * guardadas previamente que son del tipo de entidad {@code Profile}.
	 * <p>
	 * Este m&eacute;todo realizar&aacute; una consulta <i>full</i> sobre la
	 * capa de persistencia, con el fin de obtener todos los registros asociados
	 * al tipo de objeto o entidad {@code Profile}.
	 * <p>
	 * En caso de no haber ninguna instancia persistida previamente, la
	 * funci&oacute;n retornar&aacute; una instancia {@code List} vac&iacute;a.
	 * <p>
	 * 
	 * @return Un objeto tipo lista que contiene todos los registros consultados
	 *         y obtenidos.
	 * @throws MANDevicesLendingBusinessException
	 *             Excepci&oacute;n lanzada cuando alg&uacute;n error ha surgido
	 *             durante la gesti&oacute;n de los datos en el contexto de la
	 *             l&oacute;gica de negocio.
	 **/
	public List<Profile> findAll() throws MANDevicesLendingBusinessException;

	/**
	 * M&eacute;todo que es usado para ejecutar una actualizaci&oacute;n sobre
	 * la capa de persistencia definida en la aplicaci&oacute;n, con el objetivo
	 * de guardar o salvar todos los datos o atributos pertenecientes a una
	 * entidad del tipo {@code Profile} que se desea persistir
	 * f&iacute;sicamente.
	 * <p>
	 * Este m&eacute;todo realizar&aacute; un mapeo adecuado entre los atributos
	 * definidos en la entidad a ser guardada y los atributos o componentes
	 * definidos espec&iacute;ficamente en el contexto de persistencia.
	 * <p>
	 * Adem&aacute;s este m&eacute;todo ejecutar&aacute; todas las validaciones
	 * requeridas con respecto a las reglas de negocio exigidas para efectuar o
	 * llevar a cabo este proceso, y de ese modo, garantizar la integridad de
	 * los datos, y que los resultados del proceso sean los realmente adecuados
	 * y esperados.
	 * <p>
	 * 
	 * @param profileName
	 *            Atributo que reprensenta la clave primar&iacute;a de la
	 *            entidad {@code Profile} que se desea persistir en la capa de
	 *            persistencia.
	 * @param description
	 *            Atributo que reprensenta la descripci&oacute;n de la entidad
	 *            {@code Profile} que se desea persistir en la capa de
	 *            persistencia.
	 * @return Un objeto que representa la nueva instancia de la clase
	 *         {@code Profile} que ha sido persistida en la capa de
	 *         persistencia.
	 * @throws MANDevicesLendingBusinessException
	 *             Excepci&oacute;n lanzada cuando alg&uacute;n error ha surgido
	 *             durante la gesti&oacute;n de los datos en el contexto de la
	 *             l&oacute;gica de negocio.
	 */
	public Profile save(String profileName, String description)
			throws MANDevicesLendingBusinessException;
}