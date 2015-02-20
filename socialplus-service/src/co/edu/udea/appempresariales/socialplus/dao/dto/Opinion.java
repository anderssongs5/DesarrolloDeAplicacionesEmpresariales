package co.edu.udea.appempresariales.socialplus.dao.dto;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

@XmlAccessorType(value = XmlAccessType.PROPERTY)
@XmlRootElement()
public class Opinion implements Serializable {

	private static final long serialVersionUID = -5461980003186897888L;

	private boolean isPositive;
	private Author author;

	public Opinion() {
		super();
	}

	public Opinion(boolean isPositive, Author author) {
		this.isPositive = isPositive;
		this.author = author;
	}

	public boolean isPositive() {

		return isPositive;
	}

	public void setPositive(boolean isPositive) {
		this.isPositive = isPositive;
	}

	public Author getAuthor() {

		return author;
	}

	public void setAuthor(Author author) {
		this.author = author;
	}
}