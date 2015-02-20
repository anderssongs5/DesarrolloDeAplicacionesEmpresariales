package co.edu.udea.empresariales.dojows.model;

import java.io.Serializable;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

@XmlRootElement
@XmlAccessorType(value = XmlAccessType.PROPERTY)
public class Store implements Serializable {

	private static final long serialVersionUID = -4660165118689665234L;
	private String fullName;
	private String address;
	private Long phoneNumber;
	private String electronicMail;
	private List<ProductByStore> productByStoreList;

	public Store() {
		super();
	}

	public Store(String fullName, String address, Long phoneNumber,
			String electronicMail, List<ProductByStore> productByStoreList) {
		super();
		this.fullName = fullName;
		this.address = address;
		this.phoneNumber = phoneNumber;
		this.electronicMail = electronicMail;
		this.productByStoreList = productByStoreList;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Long getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(Long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getElectronicMail() {
		return electronicMail;
	}

	public void setElectronicMail(String electronicMail) {
		this.electronicMail = electronicMail;
	}

	@XmlTransient
	public List<ProductByStore> getProductByStoreList() {
		return productByStoreList;
	}

	public void setProductByStoreList(List<ProductByStore> productByStoreList) {
		this.productByStoreList = productByStoreList;
	}

}