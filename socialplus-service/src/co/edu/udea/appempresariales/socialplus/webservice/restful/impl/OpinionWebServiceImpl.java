package co.edu.udea.appempresariales.socialplus.webservice.restful.impl;

import javax.ws.rs.Consumes;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import co.edu.udea.appempresariales.socialplus.business.IOpinionBusiness;
import co.edu.udea.appempresariales.socialplus.business.exception.SocialPlusBusinessException;
import co.edu.udea.appempresariales.socialplus.business.impl.OpinionBusinessImpl;
import co.edu.udea.appempresariales.socialplus.dao.dto.Author;
import co.edu.udea.appempresariales.socialplus.dao.dto.Opinion;
import co.edu.udea.appempresariales.socialplus.util.TextUtil;
import co.edu.udea.appempresariales.socialplus.webservice.IOpinionWebService;
import co.edu.udea.appempresariales.socialplus.webservice.restful.contract.RESTFulWebServicesContract;
import co.edu.udea.appempresariales.socialplus.webservice.restful.exception.SocialPlusWebServiceException;

@Path(value = RESTFulWebServicesContract.OpinionWebServiceContract.ROOT_PATH)
public class OpinionWebServiceImpl implements IOpinionWebService {

	private IOpinionBusiness opinionBusiness;

	public OpinionWebServiceImpl() {
		this.opinionBusiness = new OpinionBusinessImpl();
	}

	@Consumes(value = { MediaType.APPLICATION_JSON })
	@Override()
	@PUT()
	@Produces(value = { MediaType.APPLICATION_JSON })
	public Response doOpinion(
			@QueryParam(value = RESTFulWebServicesContract.CommentWebServicesContract.POST_ID_PARAM) String postId,
			Opinion opinion) throws SocialPlusWebServiceException {
		if ((TextUtil.isEmpty(postId)) || !(this.validateOpinion(opinion))) {

			return (Response.status(Response.Status.BAD_REQUEST).build());
		}

		Opinion returnedOpinion = null;
		try {
			returnedOpinion = this.opinionBusiness.doOpinion(postId, opinion);
		} catch (SocialPlusBusinessException e) {

			return (Response.status(Response.Status.INTERNAL_SERVER_ERROR)
					.build());
		}

		return ((returnedOpinion != null) ? Response.ok(returnedOpinion)
				.build() : Response.status(Response.Status.NO_CONTENT).build());
	}

	private boolean validateOpinion(Opinion opinion) {
		if (opinion != null) {
			Author author = opinion.getAuthor();

			return ((author != null) && !(TextUtil.isEmpty(author
					.getElectronicEmail())));
		}

		return (false);
	}
}