package co.edu.udea.empresariales.dojows.model;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

@XmlRootElement
@XmlAccessorType(value = XmlAccessType.PROPERTY)
public class ProductByStore implements Serializable {

	private static final long serialVersionUID = -645319798905036257L;
	private Store store;
	private Product product;
	private Integer tax;
	private Double price;

	public ProductByStore() {
		super();
	}

	public ProductByStore(Store store, Product product, Integer tax,
			Double price) {
		super();
		this.store = store;
		this.product = product;
		this.tax = tax;
		this.price = price;
	}

	@XmlTransient
	public Store getStore() {
		return store;
	}

	public void setStore(Store store) {
		this.store = store;
	}

	@XmlTransient
	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public Integer getTax() {
		return tax;
	}

	public void setTax(Integer tax) {
		this.tax = tax;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

}
