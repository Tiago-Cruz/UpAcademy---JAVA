package io.altar.jseproject.repository;

import java.util.LinkedHashMap;
import java.util.Map;

import io.altar.jseproject.model.Product;

public final class ProductRepository {

	/*public enum MySingleton {
		
		INSTANCE;  
	}*/
	
	
		
		private static final ProductRepository INSTANCE = new ProductRepository();
		private static final String Teste = "Ola Singleton";
		public static final String Singleton = "Esse eu vejo fora";
		private ProductRepository() {
			
		}
		public static synchronized ProductRepository getInstance() { 
			
			if(INSTANCE == null) {
				
				INSTANCE = new ProductRepository();
			}
			return INSTANCE; 
		}
		
		public static Map <Integer, Product> productLists = new LinkedHashMap <Integer, Product>();
		
}
	
	

