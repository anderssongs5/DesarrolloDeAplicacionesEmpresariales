package co.edu.udea.we.mandl.persistence.dao;

import co.edu.udea.we.mandl.model.dto.Person;
import co.edu.udea.we.mandl.model.dto.PersonId;
import co.edu.udea.we.mandl.persistence.dao.exception.MANDevicesLendingDAOException;

/**
 * Interfaz definida para establecer los m&eacute;todos que se podr&aacute;n
 * realizar sobre los datos en las instancias pertenecientes a la clase
 * {@code Person}, sobre el contexto de persistencia definido para el
 * aplicativo.
 * <p>
 * Esta interfaz define los m&eacute;todos o funciones que se deber&aacute;n
 * implementar para dar soporte a las operaciones requeridas por la
 * l&oacute;gica del negocio sobre las entidades o instancias persistences de la
 * clase {@code Person}.
 * <p>
 * De es modo, esta interfaz debe ser implementada por aquella clase que defina
 * de una forma espec&iacute;fica el acceso a las funciones C.R.U.D. <i>Create
 * Retrieve Update Delete</i>, o las necesariamente requeridas, sobre el
 * repositorio de datos para la entidad {@code Person}. En otras palabras, el
 * objetivo primordial de esta interfaz es definir las operaciones m&aacute;s
 * b&aacute;sicas y requeridas que se realizar&aacute;n sobre el contexto de
 * persistencia en la aplicaci&oacute;n con respecto a la instancias
 * {@code Person}.
 * 
 * @since JDK1.7
 * 
 * @version 1.0
 * 
 * @author Andersson Garc&iacute;a Sotelo
 * @author Miguel &Aacute;ngel Ossa Ruiz
 * @author Neiber Padierna P&eacute;rez
 */
public interface IPersonDAO {

	/**
	 * M&eacute;todo que sirve para ejecutar una consulta sobre el contexto de
	 * persistencia definido para la aplicaci&oacute;n, con el objetivo de
	 * extrear una &uacute;nica instancia con todos sus datos o atributos que ha
	 * sido salvada previamente y que es del tipo de entidad {@code Person}.
	 * <p>
	 * La b&uacute;squeda se efectuar&aacute; por medio del criterio establecido
	 * o dado por la <b>primary key</b> y as&iacute; de ese modo, encontrar una
	 * sola entidad y espec&iacute;fica en el contexto de persistencia.
	 * 
	 * @param personKey
	 *            Instancia que representa los valores o valor dado para la
	 *            <b>primary key</b> asociada a la entidad a buscar.
	 * @return Un objeto que representa la entidad que ha sido recuperada
	 *         exitosamente desde el contexto de persistencia. <code>null</code>
	 *         si la b&uacute;squeda no ha sido exitosa.
	 * @throws MANDevicesLendingDAOException
	 *             Excepci&oacute;n lanzada cuando alg&uacute;n error ha surgido
	 *             durante la gesti&oacute;n de los datos en el contexto de
	 *             persistencia.
	 */
	public Person find(PersonId personKey) throws MANDevicesLendingDAOException;

	/**
	 * M&eacute;todo que sirve para ejecutar una actualizaci&oacute;n sobre el
	 * contexto de persistencia definido en la aplicaci&oacute;n, con el
	 * objetivo de guardar o salvar todos los datos o atributos pertenecientes a
	 * una entidad del tipo {@code Person} que se desea persistir
	 * f&iacute;sicamente.
	 * <p>
	 * Este m&eacute;todo realizar&aacute; un mapeo adecuado entre los atributos
	 * definidos en la entidad a ser guardada y los atributos o componentes
	 * definidos espec&iacute;ficamente en el contexto de persistencia.
	 * 
	 * @param person
	 *            Instancia que reprensenta la entidad que se desea persistir en
	 *            el contexto de persistencia.
	 * @return Un objeto que representa la nueva instancia que ha sido
	 *         persistida en el contexto de persistencia.
	 * @throws MANDevicesLendingDAOException
	 *             Excepci&oacute;n lanzada cuando alg&uacute;n error ha surgido
	 *             durante la gesti&oacute;n de los datos en el contexto de
	 *             persistencia.
	 */
	public Person save(Person person) throws MANDevicesLendingDAOException;;
}