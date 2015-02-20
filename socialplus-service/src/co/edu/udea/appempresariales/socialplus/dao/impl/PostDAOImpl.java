
package co.edu.udea.appempresariales.socialplus.dao.impl;

import java.net.UnknownHostException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

import org.bson.BSONObject;
import org.bson.BasicBSONObject;
import org.bson.types.ObjectId;

import co.edu.udea.appempresariales.socialplus.dao.IPostDAO;
import co.edu.udea.appempresariales.socialplus.dao.dto.Author;
import co.edu.udea.appempresariales.socialplus.dao.dto.Comment;
import co.edu.udea.appempresariales.socialplus.dao.dto.Opinion;
import co.edu.udea.appempresariales.socialplus.dao.dto.Post;
import co.edu.udea.appempresariales.socialplus.dao.exception.SocialPlusDAOException;

import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.mongodb.DBObject;
import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;
import com.mongodb.MongoException;

public class PostDAOImpl implements IPostDAO {
	
	public static final String SERVER_NAME = "mongodb://appempresariales:appempresariales@ds031681.mongolab.com:31681/heroku_app33304913";
	public static final int SERVER_PORT = 27017;

	public static final String MONGO_DATABASE_NAME = "heroku_app33304913";	
				
	private static final String author = "author";
	private static final String fullName = "fullName";
	private static final String faceID = "faceId";
	private static final String email = "email";
	private static final String message = "message";
	private static final String comments = "comments";
	private static final String date = "date";
	private static final String like = "likesAmount";
	private static final String dislike = "dislikesAmount";
	private static final String positive = "positive";
	private static final String opinions = "opinionsList";	
	
	

	
	
		
	private DB db;
	private MongoClient mongoClient;	
	

	public PostDAOImpl() {
		super();
	}
	
	/* Este meetodo permite realizar la conexi�n a la base de datos*/
	private boolean makeConnection(){
		this.mongoClient = null;

		try {		
			MongoClientURI mongoUrl = new MongoClientURI(SERVER_NAME);
			this.mongoClient = new MongoClient(mongoUrl);
			this.db = this.mongoClient.getDB(MONGO_DATABASE_NAME);
		}catch(MongoException e) {
			e.printStackTrace();
			return false;
		} catch (UnknownHostException ex) {			
			return false;
		}
		
		return true;
		
		
	}	
	
	
	/*Este metodo es auxiliar para encontrar todos los post de la base de datos*/
	private List<Post> makePost(List<DBObject> postDB){
		
		List<Post> posts = new ArrayList<Post>();
		
		for(int i=0;i<postDB.size();i++){		
			
			Post post = new Post();
			DBObject json = postDB.get(i);
			post.setId(json.get("_id").toString());
			
			
			
			BSONObject jpost = (BSONObject) json.get("post");
			BSONObject jAuthor = (BSONObject) jpost.get(author);
					
			Author postAuthor = new Author(jAuthor.get(fullName).toString(),jAuthor.get(email).toString());  
			
			if(jAuthor.containsField(faceID)){
				postAuthor.setFacebookId(jAuthor.get(faceID).toString());
			}
			post.setAuthor(postAuthor);
			DBObject jComments = (DBObject) jpost.get(comments);
			
			
			if(jpost.containsField(comments)){
				List<Comment> commentsArray = new ArrayList<Comment>();
				String[] g = jComments.toString().split(author,10);				
				
				for(int s = 1;s<g.length;s++){					
					
					String partial = g[s];
					int indexA = partial.indexOf(email);
					int indexC = partial.indexOf(",",indexA+1);
					
					
					String em = partial.substring(indexA+10,indexC-2);
					
					indexA = partial.indexOf("fullName");
					indexC = partial.indexOf("}",indexA);
					int indexId = partial.indexOf(faceID);
					int indexIdEnd = -1;
					String faceIdComment = null;
					
					if(indexId != -1){
						indexIdEnd = indexC; 
						indexC = indexId - 5;
						indexId = partial.indexOf(":",indexId);
						faceIdComment = partial.substring(indexId+3,indexIdEnd-1);
					}
					
					String funame = partial.substring(indexA+13,indexC);
					
					Comment co = new Comment();
					Author au = new Author(funame,em);

					if(indexIdEnd != -1){
						au.setFacebookId(faceIdComment);
					}
											
					co.setAuthor(au);
					indexA = partial.indexOf("date");
					indexC = partial.indexOf(",",indexA);
					
					String dateString = partial.substring(indexA+9,indexC-2);						
			        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("EE MMM dd HH:mm:ss z yyyy",
                            Locale.ENGLISH);
			        try
			        {
			            Date date = simpleDateFormat.parse(dateString);
			            co.setCreationTimestamp(date);
			        }
			        catch (Exception ex)
			        {
			            System.out.println("Exception "+ex);
			        }						
					indexA = partial.indexOf("message");
					indexC = partial.indexOf("}",indexA);
					
					String commentString = partial.substring(indexA+12,indexC-1);
					co.setMessage(commentString);
					
					commentsArray.add(co);
														
				}
				
				post.setComments(commentsArray);
				
			}
					
			
			if(jpost.toString().contains(opinions)){
				
				try{
					String lik = jpost.get(like).toString();
					int li = Integer.parseInt(lik);
					post.setLikes(li);				
				}catch(Exception e){
					
				}
				try{
					String dislik = jpost.get(dislike).toString();
					int dil = Integer.parseInt(dislik);
					post.setDislikes(dil);
				}catch(Exception e){
					
				}
				
				DBObject jOpinion = (DBObject) jpost.get(opinions);
				String[] opis = jOpinion.toString().split(author);
				
				List<Opinion> opinionsList = new ArrayList<Opinion>();
				for(int opin=1;opin<opis.length;opin++){
					
					Opinion op = new Opinion();																	
																		
					String opisPartial = opis[opin];
					int indexA = opisPartial.indexOf(email);
					int indexC = opisPartial.indexOf(",",indexA+1);
																	
					String em = opisPartial.substring(indexA+10,indexC-2);
					
					indexA = opisPartial.indexOf("fullName");
					indexC = opisPartial.indexOf("}",indexA);
					int indexId = opisPartial.indexOf(faceID);
					int indexIdEnd = -1;
					String faceIdOpin = null;
					
					if(indexId != -1){
						indexIdEnd = indexC; 
						indexC = indexId - 5;
						indexId = opisPartial.indexOf(":",indexId);
						faceIdOpin = opisPartial.substring(indexId+3,indexIdEnd-1);
					}
										
					String funame = opisPartial.substring(indexA+13,indexC);
					
					Author a = new Author(funame,em);													
					if(indexIdEnd != -1){
						a.setFacebookId(faceIdOpin);
					}
					
					op.setAuthor(a);
					
					indexA = opisPartial.indexOf(":",indexC);
					indexC = opisPartial.indexOf("}",indexA);
					
					String opiPosit = opisPartial.substring(indexA+3,indexC-1);
					
					if(opiPosit.equalsIgnoreCase("true")){
						op.setPositive(true);
					}else{
						op.setPositive(false);
					}
					
					opinionsList.add(op);
					 			
				}
				post.setOpinions(opinionsList);
				
			}
						
			
			
			String [] dataFinal = null; 							
			String dataString =  null;
			
			if(jpost.containsField(date)){
				dataFinal  = jpost.toString().split(date); 							
				dataString = dataFinal[dataFinal.length-1];				
			}
			
			if(dataFinal != null){
				int indexA = dataString.indexOf(":");
				int indexC = dataString.indexOf(",",indexA);
				
				String dateFinal = dataString.substring(indexA+3,indexC-2);
		        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("EE MMM dd HH:mm:ss z yyyy",
	                    Locale.ENGLISH);
		        try
		        {
		            Date date = simpleDateFormat.parse(dateFinal);
		            post.setCreationTimestamp(date);
		        }
		        catch (Exception ex)
		        {
		            
		        }	
		        
				indexA = dataString.indexOf(":",indexC);
				indexC = dataString.indexOf("}",indexA);
		        
				String messagePost = dataString.substring(indexA+3,indexC-1); 
				post.setMessage(messagePost);
			}
			else{
				return null;
			}

			
			posts.add(post);		
			
		}
		
		return posts;				
		
	}
	
	
	/*Este metodo es auxiliar para la conversion de una Clase post a un objeto dirijido a la base de datos*/
	private BasicBSONObject makeJson(Post post){
		
		BasicBSONObject bPost = new BasicBSONObject();
		BasicBSONObject bAuthor = new BasicBSONObject(email,post.getAuthor().getElectronicEmail());
		bAuthor.put(fullName, post.getAuthor().getFullName());
		if(post.getAuthor().getFacebookId() != null){
			bAuthor.put(faceID,post.getAuthor().getFacebookId());	
		}
		bPost.put(author,bAuthor);
				
		
		if(post.getComments() != null){
			
			List<BasicBSONObject> commentsList = new ArrayList<BasicBSONObject>();
						
			for(int i = 0;i<post.getComments().size();i++){
				BasicBSONObject jsonC = new BasicBSONObject();
				BasicBSONObject jsonCA = new BasicBSONObject();
				Comment c = post.getComments().get(i);
				jsonCA.put(email, c.getAuthor().getElectronicEmail());
				jsonCA.put(fullName,c.getAuthor().getFullName());
				if(c.getAuthor().getFacebookId() != null){
					jsonCA.put(faceID,c.getAuthor().getFacebookId());
				}
				jsonC.put(author, jsonCA);
				jsonC.put(date,c.getCreationTimestamp().toString());
				jsonC.put(message, c.getMessage());
				commentsList.add(jsonC);
				
			}
			
			bPost.put(comments, commentsList);
		}
		
		bPost.put(date, post.getCreationTimestamp().toString());

		bPost.put(message, post.getMessage());	

		if(post.getOpinions() != null){
			
			List<BasicBSONObject> opinionList = new ArrayList<BasicBSONObject>();
						
			for(int i = 0;i<post.getOpinions().size();i++){
				BasicBSONObject jsonO = new BasicBSONObject();
				BasicBSONObject jsonOA = new BasicBSONObject();
				Opinion o = post.getOpinions().get(i);
				jsonOA.put(email, o.getAuthor().getElectronicEmail());
				jsonOA.put(fullName,o.getAuthor().getFullName());
				if(o.getAuthor().getFacebookId() != null){
					jsonOA.put(faceID,o.getAuthor().getFacebookId());
				}
				jsonO.put(author, jsonOA);				
				if(o.isPositive()){
					jsonO.put(positive,"True");
					bPost.put(like,(post.getLikes()+1));	
				}
				else{
					jsonO.put(positive,"False");
					bPost.put(dislike, (post.getDislikes() + 1));
				}
				
				opinionList.add(jsonO);
				
			}
					
			
			bPost.put(opinions,opinionList);
		}
		
		
		
		
		return bPost;
	}	
	
	
	/*Este metodo permite encontrar todos los comentarios de un post por medio del ID*/
	public List<Comment> findCommentList(String postId)throws SocialPlusDAOException {
		makeConnection();
		DBCollection currentPost = db.getCollection("post");
		DBCursor cursor = currentPost.find();
		List<Post> posts = findAll();
		if(posts == null){
			return null;
		}
		DBObject p = null;		
		int pos = -1;
		
		if(cursor.size() != 0){				
			try {
				for(int i=0;i<cursor.size();i++){
					p = cursor.next();										
					if(p.get("_id").toString().equalsIgnoreCase(postId)){
						pos = i;						
						i = cursor.size() + 1;						
					}					
				}
			}catch(Exception e){
				
			}
			
		}
		if(pos != -1){
			Post post = posts.get(pos);
			List<Comment> c = post.getComments();	
			mongoClient.close();
			return c;
		}	
		
		return null;
	}
	
	
	/*Este metodo permite encontrar la clase Post por medio del ID*/
	public Post findPost(String postId)throws SocialPlusDAOException {
		makeConnection();
		DBCollection currentPost = db.getCollection("post");
		DBCursor cursor = currentPost.find();
		List<Post> posts = findAll();
		if(posts == null){
			return null;
		}
		DBObject p = null;		
		int pos = -1;
		
		if(cursor.size() != 0){				
			try {
				for(int i=0;i<cursor.size();i++){
					p = cursor.next();										
					if(p.get("_id").toString().equalsIgnoreCase(postId)){
						pos = i;						
						i = cursor.size() + 1;						
					}					
				}
			}catch(Exception e){
				
			}
			
		}
		if(pos != -1){
			Post post = posts.get(pos);
			mongoClient.close();		
			return post;
		}	
		
		return null;
	}
	
	
	

	@Override()
	public Boolean saveCommentIntoPost(String postId, Comment comment)
			throws SocialPlusDAOException {
		makeConnection();
		DBCollection currentPost = db.getCollection("post");
		DBCursor cursor = currentPost.find();
		List<Post> posts = findAll();
		if(posts == null){
			return Boolean.FALSE;
		}
		DBObject p = null;		
		int pos = -1;
		
		if(cursor.size() != 0){				
			try {
				for(int i=0;i<cursor.size();i++){
					p = cursor.next();										
					if(p.get("_id").toString().equalsIgnoreCase(postId)){
						pos = i;						
						i = cursor.size() + 1;						
					}					
				}
			}catch(Exception e){
				
			}
			
		}
		if(pos != -1){
			Post post = posts.get(pos);
			List<Comment> c = post.getComments();	
			if(c == null){
				c = new ArrayList<Comment>();
			}
			c.add(comment);
			post.setComments(c);
			BasicBSONObject newDocument = makeJson(post);	
			p.put("post",newDocument);			
			DBObject query2 = new BasicDBObject("_id", p.get("_id"));
			currentPost.findAndModify(query2,p);	
			mongoClient.close();
			return Boolean.TRUE;
		}
						

		return (Boolean.FALSE);
	}

	@Override()
	public Boolean createOpinionIntoPost(String postId, Opinion opinion)
			throws SocialPlusDAOException {
		makeConnection();
		DBCollection currentPost = db.getCollection("post");
		DBCursor cursor = currentPost.find();
		List<Post> posts = findAll();
		if(posts == null){
			return Boolean.FALSE;
		}
		DBObject p = null;		
		int pos = -1;
		
		if(cursor.size() != 0){				
			try {
				for(int i=0;i<cursor.size();i++){
					p = cursor.next();										
					if(p.get("_id").toString().equalsIgnoreCase(postId)){
						pos = i;						
						i = cursor.size() + 1;						
					}					
				}
			}catch(Exception e){
				
			}
			
		}
		if(pos != -1){
			Post post = posts.get(pos);
			List<Opinion> op;
			if(post.getOpinions() != null){
				op = post.getOpinions();			
			}else{
				op = new ArrayList<Opinion>();								
			}
			op.add(opinion);
			post.setOpinions(op);
			BasicBSONObject newDocument = makeJson(post);	
			p.put("post",newDocument);			
			DBObject query2 = new BasicDBObject("_id", p.get("_id"));
			currentPost.findAndModify(query2,p);	
			mongoClient.close();
			return Boolean.TRUE;
		}						
		return (Boolean.FALSE);
	}

	@Override()
	public Boolean updateOpinionIntoPost(String postId, Opinion opinion)
			throws SocialPlusDAOException {

		return (Boolean.FALSE);
	}

	@Override()
	public List<Post> findAll() throws SocialPlusDAOException {
		makeConnection();
		DBCollection currentPost = db.getCollection("post");
		
		DBCursor cursor = currentPost.find();						
		if(cursor.size() != 0){
			List<DBObject > posts = new ArrayList<DBObject>();			
			try {
				for(int i=0;i<cursor.size();i++){
					posts.add(cursor.next());
					
				}
			}catch(Exception e){
				
			}
			mongoClient.close();
			return(makePost(posts));
			
		}

		
		return (null);
	}

	@Override()
	public Opinion findOpinionByAuthor(String postId, Author author)
			throws SocialPlusDAOException {

		return (null);
	}

	@Override()
	public Post save(Post post) throws SocialPlusDAOException {

		makeConnection();
		DBCollection currentPost = db.getCollection("post");
		BasicDBObject docPost = new BasicDBObject();

		BasicBSONObject fromJson = makeJson(post);			
		docPost.put("post",fromJson);		
		currentPost.insert(docPost);	
		ObjectId id = (ObjectId)docPost.get( "_id" );
		post.setId(id.toString());
		mongoClient.close();
		return (post);
	}

	public Long updateOpinionsAmount(String postId, Opinion opinion,
			Boolean isIncrement) throws SocialPlusDAOException {

		return (null);
	}
}
