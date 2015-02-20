package co.edu.udea.romannumbersconverterws.dto;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement()
public class RomanNumber implements Serializable {

	private static final long serialVersionUID = -5824446801031871146L;

	private String romanNumber;

	public RomanNumber() {
		super();
	}

	public RomanNumber(String romanNumber) {
		this.romanNumber = romanNumber;
	}

	public String getRomanNumber() {
		return romanNumber;
	}

	public void setRomanNumber(String romanNumber) {
		this.romanNumber = romanNumber;
	}
}
