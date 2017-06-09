package io.altar.jseproject.repository;

import io.altar.jseproject.model.Product;

public class ProductRepository extends EntityRepository<Product> {
	
	private static final ProductRepository INSTANCE = new ProductRepository();

	private ProductRepository() {}

	public static ProductRepository getInstance() {
		return INSTANCE;
	}
	
	public static void () {
		
		((Product)ProductRepository.getInstance().get(Id)).setDiscount(discount);
	}
}
	
	
public static void alterElement(Integer id, Integer[] shelf, Double discount, Integer tax, Double price) {
	((Product)ProductRepository.getInstance().get(id)).setShelf_idLoc(shelf);
	((Product)ProductRepository.getInstance().get(id)).setDiscount(discount);
	((Product)ProductRepository.getInstance().get(id)).setIva(tax);
	((Product)ProductRepository.getInstance().get(id)).setPrice(price);
}
//public enum ProductRepository { 
	
    //INSTANCE;
	
	//public static Map <Integer, Product> productLists = new LinkedHashMap <Integer, Product>();
//}
	//productrepository.instance.map
	
		
		/*private static final ProductRepository INSTANCE = new ProductRepository();
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
		
		public static Map <Integer, Product> productLists = new LinkedHashMap <Integer, Product>();*/
		

	
	

