package co.edu.udea.appempresariales.socialplus.webservice.restful.contract;

public final class RESTFulWebServicesContract {

	private RESTFulWebServicesContract() {
		super();
	}

	public static final class CommentWebServicesContract {

		/*
		 * Parameteres
		 */
		public static final String POST_ID_PARAM = "postId";

		/*
		 * Paths
		 */
		public static final String ROOT_PATH = "/comment";

		private CommentWebServicesContract() {
			super();
		}
	}

	public static final class OpinionWebServiceContract {

		/*
		 * Parameteres
		 */
		public static final String POST_ID_PARAM = "postId";

		/*
		 * Paths
		 */
		public static final String ROOT_PATH = "/opinion";

		private OpinionWebServiceContract() {
			super();
		}
	}

	public static final class PostWebServicesContract {

		/*
		 * Parameters
		 */
		public static final String POST_ID_PARAM = "postId";

		/*
		 * Paths
		 */
		public static final String FIND_ALL_PATH = "/all";
		public static final String ROOT_PATH = "/post";

		private PostWebServicesContract() {
			super();
		}
	}
}