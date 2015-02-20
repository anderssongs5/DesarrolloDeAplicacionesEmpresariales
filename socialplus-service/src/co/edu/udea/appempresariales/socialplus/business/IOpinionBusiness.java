package co.edu.udea.appempresariales.socialplus.business;

import co.edu.udea.appempresariales.socialplus.business.exception.SocialPlusBusinessException;
import co.edu.udea.appempresariales.socialplus.dao.dto.Opinion;

public interface IOpinionBusiness {

	public Opinion doOpinion(String postId, Opinion opinion)
			throws SocialPlusBusinessException;
}