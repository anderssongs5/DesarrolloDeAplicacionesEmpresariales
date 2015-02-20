package co.edu.udea.appempresariales.socialplus.webservice;

import java.util.List;

import javax.ws.rs.core.Response;

import co.edu.udea.appempresariales.socialplus.dao.dto.Comment;
import co.edu.udea.appempresariales.socialplus.webservice.restful.exception.SocialPlusWebServiceException;

public interface ICommentWebService {

	public Response save(String postId, Comment comment)
			throws SocialPlusWebServiceException;

	public List<Comment> findCommentsByPost(String postId)
			throws SocialPlusWebServiceException;
}