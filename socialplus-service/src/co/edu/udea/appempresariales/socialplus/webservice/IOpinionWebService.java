package co.edu.udea.appempresariales.socialplus.webservice;

import javax.ws.rs.core.Response;

import co.edu.udea.appempresariales.socialplus.dao.dto.Opinion;
import co.edu.udea.appempresariales.socialplus.webservice.restful.exception.SocialPlusWebServiceException;

public interface IOpinionWebService {

	public Response doOpinion(String postId, Opinion opinion)
			throws SocialPlusWebServiceException;
}