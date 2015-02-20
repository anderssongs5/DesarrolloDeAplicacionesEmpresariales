package co.edu.udea.appempresariales.socialplus.dao.dto;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

@XmlAccessorType(value = XmlAccessType.PROPERTY)
@XmlRootElement()
public class Author implements Serializable {

	private static final long serialVersionUID = 9084320882059778189L;

	private String fullName;
	private String electronicEmail;
	private String facebookId;

	public Author() {
		super();
	}

	public Author(String fullName, String electronicEmail) {
		this.fullName = fullName;
		this.electronicEmail = electronicEmail;
	}

	public String getFullName() {
		return (this.fullName);
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public String getElectronicEmail() {
		return (this.electronicEmail);
	}

	public void setElectronicEmail(String electronicEmail) {
		this.electronicEmail = electronicEmail;
	}

	public String getFacebookId() {
		return (this.facebookId);
	}

	public void setFacebookId(String facebookId) {
		this.facebookId = facebookId;
	}
}