package co.edu.udea.appempresariales.socialplus.business.impl;

import java.util.Date;
import java.util.List;

import co.edu.udea.appempresariales.socialplus.business.ICommentBusiness;
import co.edu.udea.appempresariales.socialplus.business.exception.SocialPlusBusinessException;
import co.edu.udea.appempresariales.socialplus.dao.IPostDAO;
import co.edu.udea.appempresariales.socialplus.dao.dto.Author;
import co.edu.udea.appempresariales.socialplus.dao.dto.Comment;
import co.edu.udea.appempresariales.socialplus.dao.exception.SocialPlusDAOException;
import co.edu.udea.appempresariales.socialplus.dao.impl.PostDAOImpl;
import co.edu.udea.appempresariales.socialplus.util.TextUtil;

public class CommentBusinessImpl implements ICommentBusiness {

	private IPostDAO postDAO;

	public CommentBusinessImpl() {
		this.postDAO = new PostDAOImpl();
	}

	@Override()
	public Comment save(String postId, Comment comment)
			throws SocialPlusBusinessException {
		if (!(TextUtil.isEmpty(postId)) && (this.validateComment(comment))) {
			try {
				comment.setCreationTimestamp(new Date());

				return (this.postDAO.saveCommentIntoPost(postId, comment) ? comment
						: null);
			} catch (SocialPlusDAOException e) {
				throw new SocialPlusBusinessException(
						"Error while the DAO was trying to add a new Comment to Post.",
						e);
			}
		}

		return (null);
	}

	@Override
	public List<Comment> findCommentsByPost(String postId)
			throws SocialPlusBusinessException {
		List<Comment> comments = null;

		if (!TextUtil.isEmpty(postId)) {
			try {
				comments = this.postDAO.findCommentList(postId);
			} catch (SocialPlusDAOException e) {
				throw new SocialPlusBusinessException(
						"Error while the DAO was trying to find one Post.", e);
			}
		}

		return (comments);
	}

	private boolean validateComment(Comment comment) {
		if (comment != null) {
			Author author = comment.getAuthor();

			return (!(TextUtil.isEmpty(comment.getMessage()))
					&& (author != null) && !(TextUtil.isEmpty(author
					.getElectronicEmail())));
		}

		return (false);
	}
}