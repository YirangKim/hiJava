package dao;

import java.util.ArrayList;

import dto.Product;

public class ProductRepository {

	//객체 생성
	// listOfProducts = ProductRepository
	private ArrayList<Product> listOfProducts
	= new ArrayList<Product>();
	
	private static ProductRepository instance
	= new ProductRepository();
	
	public static ProductRepository getInstance(){
		return instance;
	}

	public ProductRepository() {
		Product phone = new Product("P123","iPhone 6s", 800000);
		phone.setDescription("4.7-inch, "
				+ "1334X750 display,"
				+ "8-megapixel iSight Camera");
		phone.setCategory("Smart Phone");
		phone.setManufacturer("Apple");
		phone.setUnitsInStock(1000);
		phone.setCondition("New");
		
		Product notebook = new Product("P123","iPhone 6s", 800000);
		notebook.setDescription("4.7-inch, "
				+ "1334X750 display,"
				+ "8-megapixel iSight Camera");
		notebook.setCategory("Smart Phone");
		notebook.setManufacturer("Apple");
		notebook.setUnitsInStock(1000);
		notebook.setCondition("Refurbished");
		
		Product tablet = new Product("P123","iPhone 6s", 800000);
		tablet.setDescription("4.7-inch, "
				+ "1334X750 display,"
				+ "8-megapixel iSight Camera");
		tablet.setCategory("Smart Phone");
		tablet.setManufacturer("Apple");
		tablet.setUnitsInStock(1000);
		tablet.setCondition("Old");
		
	listOfProducts.add(phone);
	listOfProducts.add(notebook);
	listOfProducts.add(tablet);
	}
	
	// 
	//생성자 밑에 메소드 만듬
	public ArrayList<Product> getAllProducts(){
		return listOfProducts;
	}
		
	
	public void addProduct(Product product) {
		listOfProducts.add(product);
	}
	
}
