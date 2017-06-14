package io.altar.jseproject.repository;

import java.util.Collection;

import io.altar.jseproject.model.Entity;
import io.altar.jseproject.model.Product;
import io.altar.jseproject.repository.EntityRepository;

public class ProductRepository extends EntityRepository<Product> {
	
	private static final ProductRepository INSTANCE = new ProductRepository();

	private ProductRepository() {}

	public static ProductRepository getInstance() {
		return INSTANCE;
	}
	
	public static void alterElement(Integer id, String productName, Double discount, int iva, Double pvp) {
		
		((Product)ProductRepository.getInstance().get(id)).setDiscount(discount);
		((Product)ProductRepository.getInstance().get(id)).setIva(iva);
		((Product)ProductRepository.getInstance().get(id)).setPvp(pvp);
	}

	public void forEach(Collection<Entity> all) {
		// TODO Auto-generated method stub
		
	}
}


 

//addToMyLinkedHashMap	
	
//public static void alterElement(Integer id, Integer[] shelf, Double discount, Integer tax, Double price) {
	//((Product)ProductRepository.getInstance().get(id)).setShelf_idLoc(shelf);
	
	
	

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
		

	
	

