package co.edu.udea.appempresariales.socialplus.dao.dto;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

@XmlAccessorType(value = XmlAccessType.PROPERTY)
@XmlRootElement()
public class Post implements Serializable {

	private static final long serialVersionUID = 734690001611636117L;

	private String id;
	private long likes;
	private long dislikes;
	private Date creationTimestamp;
	private String message;
	private Author author;
	private List<Comment> comments;
	private List<Opinion> opinions;

	public Post() {
		super();
	}

	public Post(String id) {
		this.id = id;
	}

	public Post(String id, long likes, long dislikes, Date creationTimestamp,
			String message) {
		this.id = id;
		this.likes = likes;
		this.dislikes = dislikes;
		this.creationTimestamp = creationTimestamp;
		this.message = message;
	}

	public Post(String id, long likes, long dislikes, Date creationTimestamp,
			String message, Author author) {
		this.id = id;
		this.likes = likes;
		this.dislikes = dislikes;
		this.creationTimestamp = creationTimestamp;
		this.message = message;
		this.author = author;
	}

	public String getId() {
		return (this.id);
	}

	public void setId(String id) {
		this.id = id;
	}

	public long getLikes() {
		return (this.likes);
	}

	public void setLikes(long likes) {
		this.likes = likes;
	}

	public long getDislikes() {
		return (this.dislikes);
	}

	public void setDislikes(long dislikes) {
		this.dislikes = dislikes;
	}

	public Date getCreationTimestamp() {
		return (this.creationTimestamp);
	}

	public void setCreationTimestamp(Date creationTimestamp) {
		this.creationTimestamp = creationTimestamp;
	}

	public Author getAuthor() {
		return (this.author);
	}

	public void setAuthor(Author author) {
		this.author = author;
	}

	public String getMessage() {
		return (this.message);
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public List<Comment> getComments() {
		return (this.comments);
	}

	public void setComments(List<Comment> comments) {
		this.comments = comments;
	}

	public List<Opinion> getOpinions() {
		return (this.opinions);
	}

	public void setOpinions(List<Opinion> opinions) {
		this.opinions = opinions;
	}
}