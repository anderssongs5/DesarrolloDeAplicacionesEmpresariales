package co.edu.udea.appempresariales.socialplus.webservice.restful.impl;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import co.edu.udea.appempresariales.socialplus.business.IPostBusiness;
import co.edu.udea.appempresariales.socialplus.business.exception.SocialPlusBusinessException;
import co.edu.udea.appempresariales.socialplus.business.impl.PostBusinessImpl;
import co.edu.udea.appempresariales.socialplus.dao.dto.Author;
import co.edu.udea.appempresariales.socialplus.dao.dto.Post;
import co.edu.udea.appempresariales.socialplus.util.TextUtil;
import co.edu.udea.appempresariales.socialplus.webservice.IPostWebService;
import co.edu.udea.appempresariales.socialplus.webservice.restful.contract.RESTFulWebServicesContract;
import co.edu.udea.appempresariales.socialplus.webservice.restful.exception.SocialPlusWebServiceException;

@Path(value = RESTFulWebServicesContract.PostWebServicesContract.ROOT_PATH)
public class PostWebServiceImpl implements IPostWebService {

	private IPostBusiness postBusiness;

	public PostWebServiceImpl() {
		this.postBusiness = new PostBusinessImpl();
	}

	@GET()
	@Override()
	@Produces(value = { MediaType.APPLICATION_JSON })
	public Response find(
			@QueryParam(value = RESTFulWebServicesContract.PostWebServicesContract.POST_ID_PARAM) String postId)
			throws SocialPlusWebServiceException {
		Post post = null;

		if (TextUtil.isEmpty(postId)) {

			return (Response.status(Response.Status.BAD_REQUEST).build());
		}

		try {
			post = this.postBusiness.find(postId);
		} catch (SocialPlusBusinessException e) {

			return (Response.status(Response.Status.INTERNAL_SERVER_ERROR)
					.build());
		}

		return ((post != null) ? Response.ok(post).build() : Response.status(
				Response.Status.NO_CONTENT).build());
	}

	@GET()
	@Override()
	@Path(value = RESTFulWebServicesContract.PostWebServicesContract.FIND_ALL_PATH)
	@Produces(value = { MediaType.APPLICATION_JSON })
	public List<Post> findAll() throws SocialPlusWebServiceException {
		List<Post> postsList = null;

		try {
			postsList = this.postBusiness.findAllPosts();

			if (postsList == null) {
				postsList = new ArrayList<Post>();
			}
		} catch (SocialPlusBusinessException e) {

			return (null);
		}

		return ((postsList.isEmpty()) ? null : postsList);
	}

	@Consumes(value = { MediaType.APPLICATION_JSON })
	@Override()
	@POST()
	@Produces(value = { MediaType.APPLICATION_JSON })
	public Response save(Post post) throws SocialPlusWebServiceException {
		if (!this.validatePost(post)) {

			return (Response.status(Response.Status.BAD_REQUEST).build());
		}

		Post returnedPost = null;
		try {
			returnedPost = this.postBusiness.savePost(post);
		} catch (SocialPlusBusinessException e) {

			return (Response.status(Response.Status.INTERNAL_SERVER_ERROR)
					.build());
		}

		return ((returnedPost != null) ? Response.ok(returnedPost).build()
				: Response.status(Response.Status.NO_CONTENT).build());
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