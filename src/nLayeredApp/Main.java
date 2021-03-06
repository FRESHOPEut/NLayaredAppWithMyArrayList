package nLayeredApp;

import nLayeredApp.business.abstracts.ProductService;
import nLayeredApp.business.concretes.ProductManager;
import nLayeredApp.dataAccess.concretes.hibernateimpls.ProductHibernateDao;
import nLayeredApp.entities.concretes.Product;

public class Main {

	public static void main(String[] args) {

		ProductService productService = new ProductManager(new ProductHibernateDao());
		Product product1 = new Product(1,"Elma",15);
		Product product2 = new Product(2,"Armut",10);
		Product product3 = new Product(3,"Üzüm",20);
		Product product4 = new Product(1,"Elma",20);
		
		productService.add(product1);
		productService.add(product2);
		productService.add(product3);
		productService.add(product4);
		productService.update(product4);
		productService.delete(product1);
		for(int i=0; i<productService.getAll().size(); i++) {
		System.out.println("Ürün : " + productService.getAll().get(i).getName());
		}

	}

}
