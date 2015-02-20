package co.edu.udea.appempresariales.socialplus.dao.dto;

import java.io.Serializable;
import java.util.Date;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

@XmlAccessorType(value = XmlAccessType.PROPERTY)
@XmlRootElement()
public class Comment implements Serializable {

	private static final long serialVersionUID = 8544257903510304148L;

	private Date creationTimestamp;
	private String message;
	private Author author;

	public Comment() {
		super();
	}

	public Comment(Date creationTimestamp, String message, Author author) {
		this.creationTimestamp = creationTimestamp;
		this.message = message;
		this.author = author;
	}

	public Date getCreationTimestamp() {
		return (this.creationTimestamp);
	}

	public void setCreationTimestamp(Date creationTimestamp) {
		this.creationTimestamp = creationTimestamp;
	}

	public String getMessage() {
		return (this.message);
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Author getAuthor() {
		return (this.author);
	}

	public void setAuthor(Author author) {
		this.author = author;
	}
}