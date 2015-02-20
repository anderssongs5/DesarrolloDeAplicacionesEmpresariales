package co.edu.udea.appempresariales.socialplus.dao;

import java.util.List;

import co.edu.udea.appempresariales.socialplus.dao.dto.Author;
import co.edu.udea.appempresariales.socialplus.dao.dto.Comment;
import co.edu.udea.appempresariales.socialplus.dao.dto.Opinion;
import co.edu.udea.appempresariales.socialplus.dao.dto.Post;
import co.edu.udea.appempresariales.socialplus.dao.exception.SocialPlusDAOException;

public interface IPostDAO {

	/**
	 * Guarda un nuevo Comentario a un Post almanceado o existente en la Base de
	 * Datos. Se debe buscar internamente en el m�todo el Post a ser
	 * actualizado.
	 * 
	 * @param postId
	 *            Clave del Post en la Base de Datos.
	 * @param comment
	 *            Instancia que representa el nuevo Post a ser agregado.
	 * @return True, en caso que el guardado haya sido exitoso; False, en el
	 *         otro caso.
	 * @throws SocialPlusDAOException
	 */
	public Boolean saveCommentIntoPost(String postId, Comment comment)
			throws SocialPlusDAOException;

	/**
	 * Guarda una nueva Opini�n a un Post almacenado o existente en la Base de
	 * Datos. Se debe buscar internamente en el m�todo el Post a ser
	 * actualizado.
	 * 
	 * @param postId
	 *            Clave del Post en la Base de Datos.
	 * @param opinion
	 *            Instancia que representa la nueva Opini�n a ser agregada.
	 * @return True, en caso que el guardado haya sido exitoso; False, en el
	 *         otro caso.
	 * @throws SocialPlusDAOException
	 */
	public Boolean createOpinionIntoPost(String postId, Opinion opinion)
			throws SocialPlusDAOException;

	/**
	 * Actualiza un Opini�n ya existente en un Post almacenado o existente en la
	 * Base de Datos. Tanto la Opini�n como el Post deben ser buscados
	 * internamente en el m�todo, y luego ser actualizados.
	 * 
	 * @param postId
	 *            Clave del Post en la Base de Datos.
	 * @param opinion
	 *            Instancia que representa la Opini�n a ser actualizada.
	 * @return True, en caso que el guardado haya sido exitoso; False, en el
	 *         otro caso.
	 * @throws SocialPlusDAOException
	 */
	public Boolean updateOpinionIntoPost(String postId, Opinion opinion)
			throws SocialPlusDAOException;

	public Post find(String postId) throws SocialPlusDAOException;

	public List<Comment> findCommentList(String postId)
			throws SocialPlusDAOException;

	public List<Post> findAll() throws SocialPlusDAOException;

	public Opinion findOpinionByAuthor(String postId, Author author)
			throws SocialPlusDAOException;

	public Post save(Post post) throws SocialPlusDAOException;

	/**
	 * Actualiza la cantidad de Opiniones como atributo, ya sean positivas o
	 * negativas dependiendo de los valores recibidos como par�metros al m�todo.
	 * 
	 * @param postId
	 *            Clave del Post en la Base de Datos.
	 * @param opinion
	 *            Instancia que representa s� hay que actualizar, ya sea la
	 *            cantidad de Opiniones positivas o negativas.
	 * @param isIncrement
	 *            Valor que indica si la actualizaci�n es un incremento de la
	 *            cantidad de Opinioes.
	 * @return La cantidad de Opiniones resultantes luego de la actualizaci�n.
	 * @throws SocialPlusDAOException
	 */
	public Long updateOpinionsAmount(String postId, Opinion opinion,
			Boolean isIncrement) throws SocialPlusDAOException;
}