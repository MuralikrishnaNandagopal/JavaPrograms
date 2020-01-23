package com.java8;

import java.util.*;

class Product {
	int id;
	String name;
	float price;

	public Product(int id, String name, float price) {
		this.id = id;
		this.name = name;
		this.price = price;
	}
}

public class StreamFilterEx {
	public static void main(String[] args) {
		List<Product> productsList = new ArrayList<Product>();

		productsList.add(new Product(1, "HP Laptop", 25000f));
		productsList.add(new Product(2, "Dell Laptop", 30000f));
		productsList.add(new Product(3, "Lenevo Laptop", 28000f));
		productsList.add(new Product(4, "Sony Laptop", 28000f));
		productsList.add(new Product(5, "Apple Laptop", 90000f));

		productsList.stream().filter(p -> p.price > 30000).map(pm -> pm.price).forEach(System.out::println);

		productsList.stream().filter(product -> product.price > 25000)
				.forEach(product -> System.out.println(product.name));

	}
}