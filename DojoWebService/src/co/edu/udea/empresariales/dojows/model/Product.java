package co.edu.udea.empresariales.dojows.model;

import java.io.Serializable;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
@XmlAccessorType(value = XmlAccessType.PROPERTY)
public class Product implements Serializable {

	private static final long serialVersionUID = 7235806174100295520L;
	private String fullName;
	private String description;
	private Float weight;
	private String providerName;
	private List<ProductByStore> productByStore;

	public Product() {
		super();
	}

	public Product(String fullName, String description, Float weight,
			String providerName, List<ProductByStore> productByStore) {
		super();
		this.fullName = fullName;
		this.description = description;
		this.weight = weight;
		this.providerName = providerName;
		this.productByStore = productByStore;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Float getWeight() {
		return weight;
	}

	public void setWeight(Float weight) {
		this.weight = weight;
	}

	public String getProviderName() {
		return providerName;
	}

	public void setProviderName(String providerName) {
		this.providerName = providerName;
	}

	public List<ProductByStore> getProductByStore() {
		return productByStore;
	}

	public void setProductByStore(List<ProductByStore> productByStore) {
		this.productByStore = productByStore;
	}

}
