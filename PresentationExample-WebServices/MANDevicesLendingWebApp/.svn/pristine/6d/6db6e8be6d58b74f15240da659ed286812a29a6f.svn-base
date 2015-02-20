package co.edu.udea.we.mandl.persistence.dao;

import java.util.List;
import java.util.Map;

import co.edu.udea.we.mandl.model.dto.Device;
import co.edu.udea.we.mandl.persistence.dao.exception.MANDevicesLendingDAOException;

/**
 * Interfaz definida para establecer los m&eacute;todos que se podr&aacute;n
 * realizar sobre los datos en las instancias pertenecientes a la clase
 * {@code Device}, sobre el contexto de persistencia definido para el
 * aplicativo.
 * <p>
 * Esta interfaz define los m&eacute;todos o funciones que se deber&aacute;n
 * implementar para dar soporte a las operaciones requeridas por la
 * l&oacute;gica del negocio sobre las entidades o instancias persistences de la
 * clase {@code Device}.
 * <p>
 * De es modo, esta interfaz debe ser implementada por aquella clase que defina
 * de una forma espec&iacute;fica el acceso a las funciones C.R.U.D. <i>Create
 * Retrieve Update Delete</i>, o las necesariamente requeridas, sobre el
 * repositorio de datos para la entidad {@code Device}. En otras palabras, el
 * objetivo primordial de esta interfaz es definir las operaciones m&aacute;s
 * b&aacute;sicas y requeridas que se realizar&aacute;n sobre el contexto de
 * persistencia en la aplicaci&oacute;n con respecto a la instancias
 * {@code Device}.
 * 
 * @since JDK1.7
 * 
 * @version 1.0
 * 
 * @author Andersson Garc&iacute;a Sotelo
 * @author Miguel &Aacute;ngel Ossa Ruiz
 * @author Neiber Padierna P&eacute;rez
 */
public interface IDeviceDAO {

	/**
	 * M&eacute;todo que sirve para ejecutar una consulta sobre el contexto de
	 * persistencia definido para la aplicaci&oacute;n, con el objetivo de
	 * extrear una &uacute;nica instancia con todos sus datos o atributos que ha
	 * sido salvada previamente y que es del tipo de entidad {@code Device}.
	 * <p>
	 * La b&uacute;squeda se efectuar&aacute; por medio del criterio establecido
	 * o dado por la <b>primary key</b> y as&iacute; de ese modo, encontrar una
	 * sola entidad y espec&iacute;fica en el contexto de persistencia.
	 * 
	 * @param deviceKey
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
	public Device find(Long deviceKey) throws MANDevicesLendingDAOException;

	/**
	 * M&eacute;todo que sirve para ejecutar una consulta sobre el contexto de
	 * persistencia definido en la aplicaci&oacute;n, con el objetivo de extrear
	 * todos los datos o atributos pertenecientes a todas las instancias
	 * salvadas previamente que son del tipo de entidad {@code Device}.
	 * <p>
	 * Este m&eacute;todo realizar&aacute; una consulta <i>full</i> sobre el
	 * contexto de persistencia, con el fin de obtener todos los registros
	 * asociados al tipo de objeto o entidad {@code Device}.
	 * <p>
	 * En caso de no haber ninguna instancia persistida previamente, la
	 * funci&oacute;n retornar&aacute; una instancia {@code List} vac&iacute;a.
	 * 
	 * @return Un objeto tipo lista que contiene todos los registros consultados
	 *         y obtenidos.
	 * @throws MANDevicesLendingDAOException
	 *             Excepci&oacute;n lanzada cuando alg&uacute;n error ha surgido
	 *             durante la gesti&oacute;n de los datos en el contexto de
	 *             persistencia.
	 */
	public List<Device> findAll() throws MANDevicesLendingDAOException;

	/**
	 * M&eacute;todo que sirve para ejecutar una consulta y encontrar un grupo
	 * de instancias {@code Device} almacenadas en el contexto de persistencia
	 * definido y aplicando una serie de filtros para refinar la b&uacute;squeda
	 * en concreto.
	 * <p>
	 * Los filtros aplicados a la b&uacute;squeda se efectuar&aacute;n aplicando
	 * la conjunci&oacute;n <b>AND</b>, en otras palabras, las instancias
	 * obtenidas desde el contexto de persistencia y retornadas exitosamente,
	 * ser&aacute;n todas aquellas que cumplan a cabalidad todos los filtros
	 * simult&aacute;neamente.
	 * <p>
	 * La aplicaci&oacute;n de los filtros se har&aacute;n sobre los atributos
	 * definidos para una determinada entidad {@code Device}, es decir, se
	 * har&aacute;n efectivos sobre aquellos campos que est&eacute;n mapeados en
	 * el repositorio de datos.
	 * <p>
	 * En caso de no encontrar ning&uacute;n conjunto de instancias persistidas
	 * previamente, la funci&oacute;n retornar&aacute; una instancia
	 * {@code List} vac&iacute;a.
	 * 
	 * @param parametersMap
	 *            Estructura <i>Key-Value</i> que contiene los nombres de los
	 *            atributos y sus respectivos valores para realizar los filtros
	 *            en la b&uacute;squeda sobre el contexto de persistencia.
	 * @return Un objeto tipo lista que contiene todos los registros consultados
	 *         y obtenidos.
	 * @throws MANDevicesLendingDAOException
	 *             Excepci&oacute;n lanzada cuando alg&uacute;n error ha surgido
	 *             durante la gesti&oacute;n de los datos en el contexto de
	 *             persistencia.
	 */
	public List<Device> findByAttributes(Map<String, Object> parametersMap)
			throws MANDevicesLendingDAOException;

	/**
	 * M&eacute;todo que sirve para ejecutar una consultar y encontrar un grupo
	 * de instancias {@code Device} almacenadas en el contexto de persistencia
	 * definido y aplicando un filtro para refinar la b&uacute;squeda en
	 * concreto.
	 * <p>
	 * El filtro aplicado a la b&uacute;squeda se efectuar&aacute; aplicando la
	 * conjunci&oacute;n <b>OR</b>, en otras palabras, las instancias obtenidas
	 * desde el contexto de persistencia y retornadas exitosamente, ser&aacute;n
	 * todas aquellas que cumplan a cabalidad con el filtro.
	 * <p>
	 * La aplicaci&oacute;n del filtro se har&aacute;n sobre los atributos que
	 * permiten identificar por tipo una serie de instancias {@code Device}, es
	 * decir, se har&aacute;n efectivos sobre aquellos campos que est&eacute;n
	 * mapeados en el repositorio de datos.
	 * <p>
	 * En caso de no encontrar ning&uacute;n conjunto de instancias persistidas
	 * previamente, la funci&oacute;n retornar&aacute; una instancia
	 * {@code List} vac&iacute;a.
	 * 
	 * @param devicesKindsNamesList
	 *            Arreglo que contiene los nombres o caracter&iacute;sticas
	 *            sobre las cuales se va a efectuar el filtro.
	 * @return Un objeto tipo lista que contiene todos los registros consultados
	 *         y obtenidos.
	 * @throws MANDevicesLendingDAOException
	 *             Excepci&oacute;n lanzada cuando alg&uacute;n error ha surgido
	 *             durante la gesti&oacute;n de los datos en el contexto de
	 *             persistencia.
	 */
	public List<Device> findByDevicesKindsNamesList(
			List<String> devicesKindsNamesList)
			throws MANDevicesLendingDAOException;

	/**
	 * M&eacute;todo que sirve para ejecutar una actualizaci&oacute;n sobre el
	 * contexto de persistencia definido en la aplicaci&oacute;n, con el
	 * objetivo de guardar o salvar todos los datos o atributos pertenecientes a
	 * una entidad del tipo {@code Device} que se desea persistir
	 * f&iacute;sicamente.
	 * <p>
	 * Este m&eacute;todo realizar&aacute; un mapeo adecuado entre los atributos
	 * definidos en la entidad a ser guardada y los atributos o componentes
	 * definidos espec&iacute;ficamente en el contexto de persistencia.
	 * 
	 * @param device
	 *            Instancia que reprensenta la entidad que se desea persistir en
	 *            el contexto de persistencia.
	 * @return Un objeto que representa la nueva instancia que ha sido
	 *         persistida en el contexto de persistencia.
	 * @throws MANDevicesLendingDAOException
	 *             Excepci&oacute;n lanzada cuando alg&uacute;n error ha surgido
	 *             durante la gesti&oacute;n de los datos en el contexto de
	 *             persistencia.
	 */
	public Device save(Device device) throws MANDevicesLendingDAOException;

	/**
	 * M&eacute;todo que sirve para ejecutar una actualizaci&oacute;n sobre el
	 * contexto de persistencia definido en la aplicaci&oacute;n, con el
	 * objetivo de actualizar todos o algunos de los datos o atributos
	 * pertenecientes a una entidad del tipo {@code Device}, la cual ya estaba
	 * persistida previamente.
	 * <p>
	 * Este m&eacute;todo realizar&aacute; un mapeo adecuado entre los atributos
	 * definidos en la entidad a ser actualizada y los atributos o componentes
	 * definidos espec&iacute;ficamente en el contexto de persistencia.
	 * 
	 * @param device
	 *            Instancia que representa la entidad que se desea actualizar en
	 *            el contexto de persistencia.
	 * @return Un objeto que representa el objecto actualizado exitosamente
	 *         sobre el contexto de persistencia.
	 * @throws MANDevicesLendingDAOException
	 *             Excepci&oacute;n lanzada cuando alg&uacute;n error ha surgido
	 *             durante la gesti&oacute;n de los datos en el contexto de
	 *             persistencia.
	 */
	public Device update(Device device) throws MANDevicesLendingDAOException;
}