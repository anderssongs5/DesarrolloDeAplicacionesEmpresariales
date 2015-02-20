package co.edu.udea.appempresariales.socialplus.business.impl;

import java.util.Date;
import java.util.List;

import co.edu.udea.appempresariales.socialplus.business.IPostBusiness;
import co.edu.udea.appempresariales.socialplus.business.exception.SocialPlusBusinessException;
import co.edu.udea.appempresariales.socialplus.dao.IPostDAO;
import co.edu.udea.appempresariales.socialplus.dao.dto.Author;
import co.edu.udea.appempresariales.socialplus.dao.dto.Post;
import co.edu.udea.appempresariales.socialplus.dao.exception.SocialPlusDAOException;
import co.edu.udea.appempresariales.socialplus.dao.impl.PostDAOImpl;
import co.edu.udea.appempresariales.socialplus.util.TextUtil;

public class PostBusinessImpl implements IPostBusiness {

	private IPostDAO postDAO;

	public PostBusinessImpl() {
		this.postDAO = new PostDAOImpl();
	}

	@Override()
	public Post find(String postId) throws SocialPlusBusinessException {
		Post post = null;

		if (!TextUtil.isEmpty(postId)) {
			try {
				post = this.postDAO.find(postId);
			} catch (SocialPlusDAOException e) {
				throw new SocialPlusBusinessException(
						"Error while the DAO was trying to find one Post.", e);
			}
		}

		return (post);
	}

	@Override()
	public List<Post> findAllPosts() throws SocialPlusBusinessException {
		List<Post> postsList = null;

		try {
			postsList = this.postDAO.findAll();
		} catch (SocialPlusDAOException e) {
			throw new SocialPlusBusinessException(
					"Error while the DAO was trying to find all Posts.", e);
		}

		 return (postsList);
	}

	@Override()
	public Post savePost(Post post) throws SocialPlusBusinessException {
		if (this.validatePost(post)) {
			try {
				post.setCreationTimestamp(new Date());

				return (this.postDAO.save(post));
			} catch (SocialPlusDAOException e) {
				throw new SocialPlusBusinessException(
						"Error while the DAO was trying to save a new Post.", e);
			}
		}

		return (null);
	}

	private boolean validatePost(Post post) {
		if (post != null) {
			Author author = post.getAuthor();

			return (!(TextUtil.isEmpty(post.getMessage())) && (author != null) && !(TextUtil
					.isEmpty(author.getElectronicEmail())));
		}

		return (false);
	}
}