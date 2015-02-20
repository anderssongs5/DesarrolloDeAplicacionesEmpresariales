package co.edu.udea.we.mandl.business;

import java.util.List;

import co.edu.udea.we.mandl.business.exception.MANDevicesLendingBusinessException;
import co.edu.udea.we.mandl.model.dto.Kind;

/**
 * Interfaz definida para establecer los m&eacute;todos que se podr&aacute;n
 * realizar sobre los procesos quen involucran instancias pertenecientes a la
 * clase {@code Kind}, y de ese modo, realizar la gesti&oacute;n de los diversos
 * datos sobre el contexto de persistencia definido para el aplicativo.
 * <p>
 * Esta interfaz define los m&eacute;todos o funciones que se deber&aacute;n
 * implementar para dar soporte a las operaciones requeridas por la
 * l&oacute;gica del negocio y que requieren acceso o interacci&oacute;n con la
 * capa encargada de brindar acceso a los datos de las entidades {@code Kind}.
 * <p>
 * De es modo, esta interfaz debe ser implementada por aquella clase que defina
 * de una forma espec&iacute;fica todos los procesos del negocio referentes a
 * las entidades {@code Kind}. En otras palabras, el objetivo primordial de esta
 * interfaz es definir las operaciones b&aacute;sicas y requeridas que se
 * realizar&aacute;n sobre la l&oacute;fica del negocio y que en su
 * mayor&iacute;a, interactuar&aacute;n con la capa que define el contexto de
 * persistencia en la aplicaci&oacute;n con respecto a la instancias de la clase
 * {@code Kind}.
 * 
 * @since JDK1.7
 * 
 * @version 1.0
 * 
 * @author Andersson Garc&iacute;a Sotelo
 * @author Miguel &Aacute;ngel Ossa Ruiz
 * @author Neiber Padierna P&eacute;rez
 */
public interface IKindBusiness {

	/**
	 * M&eacute;todo que sirve para ejecutar una consulta con el objetivo de
	 * extrear todos los datos o atributos pertenecientes a todas las instancias
	 * salvadas previamente que son del tipo de entidad {@code Kind}.
	 * <p>
	 * Este m&eacute;todo realizar&aacute; una consulta <i>full</i>, con el fin
	 * de obtener todos los registros asociados al tipo de objeto o entidad
	 * {@code Kind}.
	 * <p>
	 * En caso de no haber ninguna instancia persistida previamente, la
	 * funci&oacute;n retornar&aacute; una instancia {@code List} vac&iacute;a.
	 * <p>
	 * 
	 * @return Un objeto tipo lista que contiene todos los registros consultados
	 *         y obtenidos de tipo {@code Kind}.
	 * @throws MANDevicesLendingBusinessException
	 *             Excepci&oacute;n lanzada cuando alg&uacute;n error ha surgido
	 *             durante la gesti&oacute;n de los datos en el contexto de la
	 *             l&oacute;gica de negocio.
	 **/
	public List<Kind> findAll() throws MANDevicesLendingBusinessException;

	/**
	 * M&eacute;todo que es usado para ejecutar una actualizaci&oacute;n sobre
	 * la capa de persistencia definida en la aplicaci&oacute;n, con el objetivo
	 * de guardar o salvar todos los datos o atributos pertenecientes a una
	 * entidad del tipo {@code Kind} que se desea persistir f&iacute;sicamente.
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
	 * @param kindName
	 *            Atributo que reprensenta la clave primar&iacute;a de la
	 *            entidad {@code Kind} que se desea persistir en la capa de
	 *            persistencia.
	 * @param description
	 *            Atributo que reprensenta la descripci&oacute;n de la entidad
	 *            {@code Kind} que se desea persistir en la capa de
	 *            persistencia.
	 * @return Un objeto que representa la nueva instancia de la clase
	 *         {@code Kind} que ha sido persistida en la capa de persistencia.
	 * @throws MANDevicesLendingBusinessException
	 *             Excepci&oacute;n lanzada cuando alg&uacute;n error ha surgido
	 *             durante la gesti&oacute;n de los datos en el contexto de la
	 *             l&oacute;gica de negocio.
	 */
	public Kind save(String kindName, String description)
			throws MANDevicesLendingBusinessException;
}