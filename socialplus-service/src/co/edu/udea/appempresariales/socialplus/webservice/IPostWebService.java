package co.edu.udea.appempresariales.socialplus.webservice;

import java.util.List;

import javax.ws.rs.core.Response;

import co.edu.udea.appempresariales.socialplus.dao.dto.Post;
import co.edu.udea.appempresariales.socialplus.webservice.restful.exception.SocialPlusWebServiceException;

public interface IPostWebService {

	public Response find(String postId) throws SocialPlusWebServiceException;

	public List<Post> findAll() throws SocialPlusWebServiceException;

	public Response save(Post post) throws SocialPlusWebServiceException;
}