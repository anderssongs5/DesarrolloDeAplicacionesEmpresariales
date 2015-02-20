package co.edu.udea.we.mandl.business;

import java.util.List;

import co.edu.udea.we.mandl.business.exception.MANDevicesLendingBusinessException;
import co.edu.udea.we.mandl.model.dto.Disposition;

/**
 * Interfaz definida para establecer los m&eacute;todos que se podr&aacute;n
 * realizar sobre los procesos que involucran instancias pertenecientes a la
 * clase {@code Disposition}, y de ese modo, realizar la gesti&oacute;n de los
 * diversos datos sobre el contexto de persistencia definido para el aplicativo.
 * <p>
 * Esta interfaz define los m&eacute;todos o funciones que se deber&aacute;n
 * implementar para dar soporte a las operaciones requeridas por la
 * l&oacute;gica del negocio y que requieren acceso o interacci&oacute;n con la
 * capa encargada de brindar acceso a los datos de las entidades
 * {@code Disposition}.
 * <p>
 * De es modo, esta interfaz debe ser implementada por aquella clase que defina
 * de una forma espec&iacute;fica todos los procesos del negocio referentes a
 * las entidades {@code Disposition}. En otras palabras, el objetivo primordial
 * de esta interfaz es definir las operaciones m&aacute;s b&aacute;sicas y
 * requeridas que se realizar&aacute;n sobre la l&oacute;fica del negocio y que
 * en su mayor&iacute;a, interactuar&aacute;n con la capa que define el contexto
 * de persistencia en la aplicaci&oacute;n con respecto a la instancias
 * {@code Disposition}.
 * 
 * @since JDK1.7
 * 
 * @version 1.0
 * 
 * @author Andersson Garc&iacute;a Sotelo
 * @author Miguel &Aacute;ngel Ossa Ruiz
 * @author Neiber Padierna P&eacute;rez
 */
public interface IDispositionBusiness {

	/**
	 * M&eacute;todo que sirve para efectuar el proceso de negocio encargado de
	 * obtener y listar todos los registros correspondientes a la entidad
	 * {@code Disposition}, y de ese modo, tener el listado de estados que
	 * pueden ser asignados a una determinada reserva realizada en el sistema
	 * para los dispotivos.
	 * <p>
	 * Esta funci&oacute;n se encargar&aacute; de realizar una consulta al
	 * contexto de persistencia de la aplicaci&oacute;n, para de ese modo
	 * obtener el listado completo de registros actualmente persistidos en el
	 * contexto de persistencia.
	 * <p>
	 * En caso de no haber ninguna instancia persistida previamente, la
	 * funci&oacute;n retornar&aacute; una instancia {@code List} vac&iacute;a.
	 * 
	 * @return Un objeto tipo lista que contiene todos los registros consultados
	 *         y obtenidos.
	 * @throws MANDevicesLendingBusinessException
	 *             Excepci&oacute;n lanzada cuando alg&uacute;n error ha surgido
	 *             durante la ejecuci&oacute;n de alg&uacute;n proceso en el
	 *             l&oacute;gica del negocio.
	 */
	public List<Disposition> findAll()
			throws MANDevicesLendingBusinessException;

	/**
	 * M&eacute;todo que sirve para efectuar el proceso de negocio encargado de
	 * guarda o persistir una nueva entidad correspondiente a la clase
	 * {@code Disposition}.
	 * <p>
	 * Este m&eacute;todo invocar&aacute; a las funciones del contexto de
	 * persistencia definido en la aplicaci&oacute;n para efectuar una
	 * actualizaci&oacute;n o registro de una nueva entidad {@code Disposition}.
	 * <p>
	 * Este m&eacute;todo ejecutar&aacute; todas las validaciones requeridas con
	 * respecto a las reglas de negocio exigidas para efectuar o llevar a cabo
	 * este proceso, y de ese modo, garantizar la integridad de los datos, y que
	 * los resultados del proceso sean los realmente adecuados y esperados.
	 * 
	 * @param name
	 *            Un objeto que contiene o representa el valor del nombre a ser
	 *            asignado a la nueva instancia a ser persistida.
	 * @param description
	 *            Un objeto que contiene o representa la descripci&oacute;n a
	 *            ser asignada a la nueva instancia a ser persistida.
	 * @return Un objeto que representa la nueva instancia que ha sido
	 *         persistida en el contexto de persistencia.
	 * @throws MANDevicesLendingBusinessException
	 *             Excepci&oacute;n lanzada cuando alg&uacute;n error ha surgido
	 *             durante la ejecuci&oacute;n de alg&uacute;n proceso en el
	 *             l&oacute;gica del negocio.
	 */
	public Disposition save(String name, String description)
			throws MANDevicesLendingBusinessException;
}