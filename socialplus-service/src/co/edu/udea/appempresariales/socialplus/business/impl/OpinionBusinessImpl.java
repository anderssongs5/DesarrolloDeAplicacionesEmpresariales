package co.edu.udea.appempresariales.socialplus.business.impl;

import co.edu.udea.appempresariales.socialplus.business.IOpinionBusiness;
import co.edu.udea.appempresariales.socialplus.business.exception.SocialPlusBusinessException;
import co.edu.udea.appempresariales.socialplus.dao.IPostDAO;
import co.edu.udea.appempresariales.socialplus.dao.dto.Author;
import co.edu.udea.appempresariales.socialplus.dao.dto.Opinion;
import co.edu.udea.appempresariales.socialplus.dao.exception.SocialPlusDAOException;
import co.edu.udea.appempresariales.socialplus.dao.impl.PostDAOImpl;
import co.edu.udea.appempresariales.socialplus.util.TextUtil;

public class OpinionBusinessImpl implements IOpinionBusiness {

	private IPostDAO postDAO;

	public OpinionBusinessImpl() {
		this.postDAO = new PostDAOImpl();
	}

	@Override()
	public Opinion doOpinion(String postId, Opinion opinion)
			throws SocialPlusBusinessException {
		Boolean result;

		if (!(TextUtil.isEmpty(postId)) && (this.validateOpinion(opinion))) {
			try {
				Opinion returnedOpinion = this.postDAO.findOpinionByAuthor(
						postId, opinion.getAuthor());

				if (returnedOpinion != null) {
					if (returnedOpinion.isPositive() != opinion.isPositive()) {
						if (this.postDAO.updateOpinionIntoPost(postId, opinion)) {
							this.postDAO.updateOpinionsAmount(postId,
									returnedOpinion, Boolean.FALSE);
							this.postDAO.updateOpinionsAmount(postId, opinion,
									Boolean.TRUE);
						}
					}
				} else {
					result = this.postDAO
							.createOpinionIntoPost(postId, opinion);
					if (result) {
						this.postDAO.updateOpinionsAmount(postId, opinion,
								Boolean.TRUE);

						return (opinion);
					}

					return (null);
				}
			} catch (SocialPlusDAOException e) {
				throw new SocialPlusBusinessException(
						"Error while the DAO was trying to .", e);
			}
		}

		return (null);
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