package co.edu.udea.appempresariales.socialplus.business;

import java.util.List;

import co.edu.udea.appempresariales.socialplus.business.exception.SocialPlusBusinessException;
import co.edu.udea.appempresariales.socialplus.dao.dto.Comment;

public interface ICommentBusiness {

	public Comment save(String postId, Comment comment)
			throws SocialPlusBusinessException;

	public List<Comment> findCommentsByPost(String postId)
			throws SocialPlusBusinessException;
}