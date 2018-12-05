package capstoneorderhistory.orderhistory.OrderHistoryCapstone.model;

import java.math.BigDecimal;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;


@JsonIgnoreProperties(ignoreUnknown = true)
public class Product {

	@JsonProperty("id")
	private Long id; 
	
	@JsonProperty("name")
	private String name; 
	
	@JsonProperty("category")
	private String category; 
	@JsonProperty("description")
	private String description; 
	
	@JsonProperty("manufacturerName")
	private String manufacturerName; 
	
	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", category=" + category + ", description=" + description
				+ ", manufacturerName=" + manufacturerName + ", price=" + price + "]";
	}

	@JsonProperty("price")
	private BigDecimal price;
	
	public Product(String name, String category, String description, String manufacturerName,
			BigDecimal price) {
		super();
		this.name = name;
		this.category = category;
		this.description = description;
		this.manufacturerName = manufacturerName;
		this.price = price;
	}

	public Product(String name, String category, String manufacturerName, BigDecimal price) {
		super();
		this.name = name;
		this.category = category;
		this.manufacturerName = manufacturerName;
		this.price = price; 
	}
	public Product() {}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getManufacturerName() {
		return manufacturerName;
	}

	public void setManufacturerName(String manufacturerName) {
		this.manufacturerName = manufacturerName;
	}

	public BigDecimal getPrice() {
		return price;
	}

	public void setPrice(BigDecimal price) {
		this.price = price;
	} 
	
	

	
}
