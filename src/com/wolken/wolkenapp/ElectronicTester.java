package com.wolken.wolkenapp;

public class ElectronicTester {
	public static void main(String[] args) {
		
		ElectronicProductsDTO dto = new ElectronicProductsDTO();
		dto.setPrice(5000.0);
		dto.setProductId(01);
		dto.setProductName("Grinder");
		dto.setRating(4.0);
		dto.setType("Home");
		
		ElectronicProductsDTO dto1 = new ElectronicProductsDTO();
		dto1.setPrice(5000.0);
		dto1.setProductId(01);
		dto1.setProductName("Grinder");
		dto1.setRating(4.0);
		dto1.setType("Home");
		
		System.out.println(dto);
	//	System.out.println(dto.getProductName() + " " + dto.getProductId() + " " + dto.getType() + " " + dto.getPrice()
	//			+ " " + dto.getRating());

		System.out.println(dto.hashCode());
		System.out.println(dto.equals(dto1));
		
	}
}
