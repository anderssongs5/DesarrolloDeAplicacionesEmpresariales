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

import co.edu.udea.appempresariales.socialplus.business.ICommentBusiness;
import co.edu.udea.appempresariales.socialplus.business.exception.SocialPlusBusinessException;
import co.edu.udea.appempresariales.socialplus.business.impl.CommentBusinessImpl;
import co.edu.udea.appempresariales.socialplus.dao.dto.Author;
import co.edu.udea.appempresariales.socialplus.dao.dto.Comment;
import co.edu.udea.appempresariales.socialplus.util.TextUtil;
import co.edu.udea.appempresariales.socialplus.webservice.ICommentWebService;
import co.edu.udea.appempresariales.socialplus.webservice.restful.contract.RESTFulWebServicesContract;
import co.edu.udea.appempresariales.socialplus.webservice.restful.exception.SocialPlusWebServiceException;

@Path(value = RESTFulWebServicesContract.CommentWebServicesContract.ROOT_PATH)
public class CommentWebServiceImpl implements ICommentWebService {

	private ICommentBusiness commentBusiness;

	public CommentWebServiceImpl() {
		this.commentBusiness = new CommentBusinessImpl();
	}

	@Consumes(value = { MediaType.APPLICATION_JSON })
	@POST()
	@Override()
	@Produces(value = { MediaType.APPLICATION_JSON })
	public Response save(
			@QueryParam(value = RESTFulWebServicesContract.CommentWebServicesContract.POST_ID_PARAM) String postId,
			Comment comment) throws SocialPlusWebServiceException {
		if ((TextUtil.isEmpty(postId)) || !(this.validateComment(comment))) {

			return (Response.status(Response.Status.BAD_REQUEST).build());
		}

		Comment returnedComment = null;
		try {
			returnedComment = this.commentBusiness.save(postId, comment);
		} catch (SocialPlusBusinessException e) {

			return (Response.status(Response.Status.INTERNAL_SERVER_ERROR)
					.build());
		}

		return ((returnedComment != null) ? Response.ok(returnedComment)
				.build() : Response.status(Response.Status.NO_CONTENT).build());
	}

	@GET()
	@Override()
	@Produces(value = { MediaType.APPLICATION_JSON })
	public List<Comment> findCommentsByPost(
			@QueryParam(value = RESTFulWebServicesContract.CommentWebServicesContract.POST_ID_PARAM) String postId)
			throws SocialPlusWebServiceException {
		List<Comment> comments = null;

		try {
			comments = this.commentBusiness.findCommentsByPost(postId);

			if (comments == null) {
				comments = new ArrayList<Comment>();
			}

		} catch (SocialPlusBusinessException e) {

			return (null);
		}

		return ((comments.isEmpty()) ? null : comments);
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