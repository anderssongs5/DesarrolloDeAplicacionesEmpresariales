package co.edu.udea.appempresariales.socialplus.business;

import java.util.List;

import co.edu.udea.appempresariales.socialplus.business.exception.SocialPlusBusinessException;
import co.edu.udea.appempresariales.socialplus.dao.dto.Post;

public interface IPostBusiness {

	public Post find(String postId) throws SocialPlusBusinessException;

	public List<Post> findAllPosts() throws SocialPlusBusinessException;

	public Post savePost(Post post) throws SocialPlusBusinessException;
}