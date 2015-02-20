package co.edu.udea.we.mandl.persistence.dao;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

import co.edu.udea.we.mandl.model.dto.IEntityContext;
import co.edu.udea.we.mandl.persistence.dao.exception.MANDevicesLendingDAOException;

/**
 * Interfaz definida para establecer un contexto com&uacute;n y estrictamente
 * definido para todas las operaciones que representan acceso a los datos
 * persistentes en la aplicaci&oacute;n.
 * <p>
 * Esta interfaz define los m&eacute;todos o funciones a un nivel muy
 * gen&eacute;rico o abstracto, dando de ese modo la posibilidad de
 * generalizaci&oacute;n de las operaciones de acceso a los datos para todas las
 * entidades persistentes en el aplicativo.
 * <p>
 * Esta interfaz debe ser implementada por aquella clase que defina de una forma
 * general el acceso a las funciones C.R.U.D. <i>Create Retrieve Update
 * Delete</i> sobre el repositorio de datos. El objetivo primordial de esta
 * interfaz es definir las operaciones m&aacute;s b&aacute;sicas y comunes que
 * se realizar&aacute;n sobre el contexto de persistencia en la
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
public interface IEntityContextDAO {

	/**
	 * M&eacute;todo que sirve de apoyo para contar la cantidad de instancias
	 * {@code IEntityContext} almacenadas en el contexto de persistencia
	 * definido.
	 * <p>
	 * Este m&eacute;todo realizar&aacute; una consulta sobre el contexto de
	 * persistencia con el fin de obtener la cantidad de registros asociados a
	 * un tipo de objeto o entidad que implementa la interfaz
	 * {@code IEntityContext}.
	 * <p>
	 * En caso de no haber ninguna instancia persistida, la funci&oacute;n
	 * retornar&aacute; el valor 0.
	 * 
	 * @param c
	 *            Clase que representa las instancias que se desean contar.
	 * @return Un ojeto que encapsula la cantidad total de registros obtenidos y
	 *         contados.
	 * @throws MANDevicesLendingDAOException
	 *             Excepci&oacute;n lanzada cuando alg&uacute;n error ha surgido
	 *             durante la gesti&oacute;n de los datos en el contexto de
	 *             persistencia.
	 */
	public Long count(Class<? extends IEntityContext> c)
			throws MANDevicesLendingDAOException;

	/**
	 * M&eacute;todo que sirve de apoyo para eliminar o borrar una instancia
	 * {@code IEntityContext} de una forma duradera en el contexto de
	 * persistencia definido.
	 * <p>
	 * Este m&eacute;todo realizar&aacute; la b&uacute;squeda de la entidad que
	 * se desea borrar, utilizando los atributos definidos en esta y
	 * compar&aacute;ndolos con los campos dados en el contexto de persistencia.
	 * <p>
	 * La eliminaci&oacute;n que hace este m&eacute;todo es un borrado
	 * f&iacute;sico, es decir, luego de la invocaci&oacute;n de esta
	 * funci&oacute;n, no hay forma de recuperar los datos asociados a la
	 * entidad eliminada en el contexto de persistencia.
	 * 
	 * @param entityContext
	 *            Instancia que representa una entidad que se desea eliminar
	 *            f&iacute;sicamente en el contexto de persistencia.
	 * @return Un objeto que representa la clave primaria asociada a la entidad
	 *         o instancia que ha sido eliminada f&iacute;sicamente.
	 * @throws MANDevicesLendingDAOException
	 *             Excepci&oacute;n lanzada cuando alg&uacute;n error ha surgido
	 *             durante la gesti&oacute;n de los datos en el contexto de
	 *             persistencia.
	 */
	public Object delete(IEntityContext entityContext)
			throws MANDevicesLendingDAOException;

	/**
	 * M&eacute;todo que sirve de apoyo para la b&uacute;squeda o la
	 * selecci&oacute;n en particular de una sola instancia
	 * {@code IEntityContext} almacenada en el contexto de persistencia
	 * definido.
	 * <p>
	 * Este m&eacute;todo realizar&aacute; un mapeo adecuado entre los atributos
	 * definidos en la entidad que ha sido encontrada en el contexto de
	 * persistencia y los atributos definidos espec&iacute;ficamente en la
	 * instancia.
	 * <p>
	 * La b&uacute;squeda se efectuar&aacute; por medio del criterio establecido
	 * o dado por la <b>primary key</b> y as&iacute; de ese modo, encontrar una
	 * sola entidad y espec&iacute;fica en el contexto de persistencia.
	 * 
	 * @param c
	 *            Clase que representa la instancia que se desea consultar y
	 *            recuperar.
	 * @param primaryKey
	 *            Instancia que reprenta los valores o valor dado para la
	 *            <b>primary key</b> asociada a la entidad a buscar.
	 * @return Un objeto que representa la entidad que ha sido recuperada
	 *         exitosamente desde el contexto de persistencia. <code>null</code>
	 *         si la b&uacute;squeda no ha sido exitosa.
	 * @throws MANDevicesLendingDAOException
	 *             Excepci&oacute;n lanzada cuando alg&uacute;n error ha surgido
	 *             durante la gesti&oacute;n de los datos en el contexto de
	 *             persistencia.
	 */
	public IEntityContext find(Class<? extends IEntityContext> c,
			Serializable primaryKey) throws MANDevicesLendingDAOException;

	/**
	 * M&eacute;todo que sirve de apoyo para encontrar todas las instancias
	 * {@code IEntityContext} almacenadas en el contexto de persistencia
	 * definido.
	 * <p>
	 * Este m&eacute;todo realizar&aacute; un consulta <i>full</i> sobre el
	 * contexto de persistencia con el fin de obtener todos los registros
	 * asociados a un tipo de objeto o entidad que implementa la interfaz
	 * {@code IEntityContext}.
	 * <p>
	 * En caso de no haber ninguna instancia persistida previamente, la
	 * funci&oacute;n retornar&aacute; una instancia {@code List} vac&iacute;a.
	 * 
	 * @param c
	 *            Clase que representa las instancias que se desean consultar y
	 *            extraer todas.
	 * @return Un objeto tipo lista que contiene todos los registros consultados
	 *         y obtenidos.
	 * @throws MANDevicesLendingDAOException
	 *             Excepci&oacute;n lanzada cuando alg&uacute;n error ha surgido
	 *             durante la gesti&oacute;n de los datos en el contexto de
	 *             persistencia.
	 */
	public List<IEntityContext> findAll(Class<? extends IEntityContext> c)
			throws MANDevicesLendingDAOException;

	/**
	 * M&eacute;todo que sirve de apoyo para encontrar un grupo de instancias
	 * {@code IEntityContext} almacenadas en el contexto de persistencia
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
	 * definidos para una determinada entidad {@code IEntityContext}, es decir,
	 * se har&aacute;n efectivos sobre aquellos campos que est&eacute;n mapeados
	 * en el repositorio de datos.
	 * <p>
	 * En caso de no encontrar ning&uacute;n conjunto de instancias persistidas
	 * previamente, la funci&oacute;n retornar&aacute; una instancia
	 * {@code List} vac&iacute;a.
	 * 
	 * @param c
	 *            Clase que representa las instancias que se desean consultar y
	 *            extraer todas.
	 * @param attributesMap
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
	public List<IEntityContext> findByAttributes(
			Class<? extends IEntityContext> c, Map<String, Object> attributesMap)
			throws MANDevicesLendingDAOException;

	/**
	 * M&eacute;todo que sirve de apoyo para guardar o salvar una instancia
	 * {@code IEntityContext} de una forma duradera en el contexto de
	 * persistencia definido.
	 * <p>
	 * Este m&eacute;todo realizar&aacute; un mapeo adecuado entre los atributos
	 * definidos en la entidad a ser guardada y los atributos o componentes
	 * definidos espec&iacute;ficamente en el contexto de persistencia.
	 * 
	 * @param entityContext
	 *            Instancia que representa una entidad que se desea persistir en
	 *            el contexto de persistencia.
	 * @return Un objeto que representa la clave primaria obtenida y generada
	 *         para la entidad o instancia que ha sido guardada o persistida.
	 * @throws MANDevicesLendingDAOException
	 *             Excepci&oacute;n lanzada cuando alg&uacute;n error ha surgido
	 *             durante la gesti&oacute;n de los datos en el contexto de
	 *             persistencia.
	 */
	public Object save(IEntityContext entityContext)
			throws MANDevicesLendingDAOException;

	/**
	 * M&eacute;todo que sirve de apoyo para actualizar los atributos o campos
	 * de una instancia {@code IEntityContext} de una forma duradera y que los
	 * cambios se vean reflejados en el contexto de persistencia.
	 * <p>
	 * Este m&eacute;todo realizar&aacute; un mapeo adecuado entre los atributos
	 * definidos en la entidad a ser actualizada y los atributos o componentes
	 * definidos espec&iacute;ficamente en el contexto de persistencia.
	 * 
	 * @param entityContext
	 *            Instancia que representa una entidad que se desea actualizar
	 *            en el contexto de persistencia.
	 * @return Un objeto que representa la clave primaria obtenida para la
	 *         entidad o instancia que ha sido actualizada.
	 * @throws MANDevicesLendingDAOException
	 *             Excepci&oacute;n lanzada cuando alg&uacute;n error ha surgido
	 *             durante la gesti&oacute;n de los datos en el contexto de
	 *             persistencia.
	 */
	public Object update(IEntityContext entityContext)
			throws MANDevicesLendingDAOException;
}