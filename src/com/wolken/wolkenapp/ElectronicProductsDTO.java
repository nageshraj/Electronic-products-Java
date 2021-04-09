package com.wolken.wolkenapp;

public class ElectronicProductsDTO {
	private String productName;
	private Integer productId;
	private Double price;
	private String type;
	private Double rating;

	public ElectronicProductsDTO() {
		System.out.println(this.getClass().getSimpleName() + " Object created");
	}

	public Integer getProductId() {
		return productId;
	}

	public void setProductId(Integer productId) {
		this.productId = productId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Double getRating() {
		return rating;
	}

	public void setRating(Double rating) {
		this.rating = rating;
	}

	@Override
	public String toString() {
		return "ElectronicDTO - ProductID: " + this.productId + " | ProductName: " + this.productName + " | Price: "
				+ this.price + " | ProductRating: " + this.rating;
	}

	@Override
	public int hashCode() {
		return productId;
	}

	@Override
	public boolean equals(Object obj) {
		ElectronicProductsDTO dto = (ElectronicProductsDTO) obj;
		if (obj == null)
			return false;
		else {
			if (obj instanceof ElectronicProductsDTO) {
				if (this.hashCode() == obj.hashCode())
					if (this.price.equals(dto.price))
						return true;

			}
		}
		return false;
	}
}
