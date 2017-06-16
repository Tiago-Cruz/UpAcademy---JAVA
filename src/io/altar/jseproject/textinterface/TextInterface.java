package io.altar.jseproject.textinterface;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Scanner;

import io.altar.jseproject.model.Entity;
import io.altar.jseproject.model.Product;
import io.altar.jseproject.repository.ProductRepository;
import io.altar.jseproject.repository.EntityRepository;

public class TextInterface {
	
	public static Scanner scanner = new Scanner(System.in);
	//public static Map <Integer, Product> productLists = new LinkedHashMap <Integer, Product>();
	private static ProductRepository getInstanceProducts = ProductRepository.getInstance();
	//private static ShelfRepository shelfList = ShelfRepository.getInstance();
	public static int productId = 0;
	
	public static void firstScreen() {
		
		System.out.println("Menu Inicial Screen 1\n");
		System.out.println("Por favor selecione uma das seguintes opções:");
		System.out.println("1) Listar Produtos");
		System.out.println("2) Listar Prateleiras");
		System.out.println("3) Sair");
		
		int userInput = checkUserInput(1, 3);
		
		switch (userInput){
			
			case 1:
				
				secondScreen();
				break;
					
			case 2:
				
				thirdScreen();
				break;
					
			case 3:
				
				System.out.println("BYE!");
				return;
		}
	}
	
	public static void secondScreen() {
		
		showProducts();
		
		System.out.println("Menu Produtos Screen 2\n");
		System.out.println("Por favor selecione uma das seguintes opções:");
		System.out.println("1) Criar novo produto");
		System.out.println("2) Editar um produto existente");
		System.out.println("3) Consultar o detalhe de um produto");
		System.out.println("4) Remover um produto");
		System.out.println("5) Voltar ao ecrã anterior");
		
		int userInput = checkUserInput(1, 5);
		
		int activeScreen = 2;
		getUserOption(activeScreen, userInput);
		
		}
	
	public static void thirdScreen() {
		
		showProducts();
		
		System.out.println("Menu Prateleiras Screen 3\n");
		System.out.println("Por favor selecione uma das seguintes opções:");
		System.out.println("1) Criar nova prateleira");
		System.out.println("2) Editar uma prateleira existente");
		System.out.println("3) Consultar o detalhe de uma prateleira");
		System.out.println("4) Remover uma prateleira");
		System.out.println("5) Voltar ao ecrã anterior");
		
		int userInput = checkUserInput(1, 5);
		
		int activeScreen = 3;
		getUserOption(activeScreen, userInput);
		
		}
	
	public static int checkUserInput(int min, int max) {
		
		int input = 0;
		
		while(true) {
			
			if (scanner.hasNextInt()) {
				
				input = scanner.nextInt();
				
				if (input >= min && input <= max) {
					
					return input;
				} else {
					System.out.println("Por favor introduza um numero entre " + min + " e " + max);
					
				}
				} else {
					
					System.out.println("Por favor introduza um número");
					scanner.next();
				}
		}
	}
	
	public static String protectInputStrings() {
		
		while(true) {
			
			boolean teste = scanner.hasNextLine();
			if (scanner.hasNextLine()) {
				
				String productName = scanner.nextLine();
				
				if (productName == null || productName.trim().isEmpty()) {
					
					System.out.println("Nome do produto não pode estar em branco");
				} else {
					
					return productName;
				}  
			} else {
				
				System.out.println("Nome do produto inválido");
				System.out.println(teste);

				scanner.next();
			}
		}
	}
	
	public static double protectInputDiscount(double pvp) {
		
		double discount = 0;
		
		while(true) {
			
			if (scanner.hasNextDouble()) {
				
				discount = scanner.nextDouble();
				
				if(discount >= 0 && discount <= pvp ) {
					
					return discount;
				} else {
					
					System.out.println("O desconto introduzido é inválido");
				}
			} else {
				
				System.out.println("O desconto introduzido não pode conter caracteres");
				scanner.next();
			}
		}
	}
	
	public static int protectInputIva() {
		
		int iva = 0;
		
		while(true) {
			
			if(scanner.hasNextInt()) {
				
				iva = scanner.nextInt();
				
				switch (iva) {
				
					case 0:
					case 6:
					case 13:
					case 23:
						return iva;
					default:
						System.out.println("O valor do iva introduzido não existe");
						break;
				}
			} else {
				

				System.out.println("O valor do iva introduzido é inválido");

				scanner.next();
			}
		}
	}
	
	public static double protectInputPvp() {
		
		double pvp = 0;
		
		while(true) {
			
			if(scanner.hasNextDouble()) {
				
				pvp = scanner.nextDouble();
				
				if(pvp < 0) {
					
					System.out.println("O PVP introduzido é inválido");
				} else {
					
					
					return pvp;
				}
			} else {
				
				System.out.println("O PVP não pode conter caracteres");
				scanner.next();
			}
		}
	}
	
	public static int protectProductId() {
		
		while(true) {
			
			int productId = 0;
			int counter = 0;
			int aux = 0;
			
			if (scanner.hasNextInt()) {
				
				productId = scanner.nextInt();
				
				if(productId <= 0) {
					
					System.out.println("O ID introduzido é inválido");
					
				} else {
					
					for (Integer key : getInstanceProducts.keySet()) {
					    System.out.println("Key = " + key);
					    
					    if(key == productId) {
					    	
					    	counter += 1;
					    	aux = productId;
					    } else {
					    	
					    	continue;
					    }
					}
					
					if(counter == 1) {
						
						return aux;
					} else {
						
						System.out.println("O ID introduzido não existe");
					}
				}
			} else {
				
				System.out.println("O ID introduzido é inválido");
				scanner.next();
			}
		}		
	}
	
	public static void getUserOption(int activeScreen, int option) {
		
		if (activeScreen == 2) {
			
			switch (option) {
			
				case 1:
					
					createNewProduct();
					break;
					
				case 2:
					
					editProduct();
					break;
					
				case 3:
					
					viewProductDetail();
					break;
					
				case 4:
					
					removeProduct();
					break;
					
				case 5:
					firstScreen();
					break;
			}
			
		} else if (activeScreen == 3) {
			
			switch (option) {
			
				case 1:
					
					createNewShelf();
					break;
					
				case 2:
					
					System.out.println("Screen 3-2");
					break;
					
				case 3:
					
					System.out.println("Screen 3-3");
					break;
					
				case 4:
					
					System.out.println("Screen 3-4");
					break;
					
				case 5:
					
					firstScreen();
					break;
			}
		}
	}
	
	public static void createNewProduct() {
		
		String validation;
		
		do {
			
			System.out.println("Menu criar novo produto: ");
			
			scanner.nextLine();
			System.out.println("Insira o nome do novo produto: ");
			String productName = protectInputStrings();
			
			System.out.println("Insira o PVP do novo produto:");
			double pvp = protectInputPvp();
			
			System.out.println("Insira o IVA em percentagem do novo produto:");
			int iva = protectInputIva();
			
			System.out.println("Insira o desconto do novo produto:");
			double discount = protectInputDiscount(pvp);
			
			productId += 1; 
			
			Product newProduct = new Product(productId, productName, discount, iva, pvp);
			
			showProducts();
			
			System.out.println("Quer continuar a inserir novo produto? (S/N)");
			validation = scanner.next();
			
		} while(validation.equalsIgnoreCase("s"));
		
		secondScreen();
	}
	
	public static void showProducts() {
		
		//boolean check = getInstanceProducts.isEmpty();
		//if(check != true) {
			
			//System.out.println("Lista de produtos no sistema:\n");
			
//			((Collection<Product>)getInstanceProducts.getAll()).forEach(); {
//				
//			    System.out.println(key + " -> " + value);
//			});
			//for(Product p : ((Collection<Product>)getInstanceProducts.getAll())){
			    //System.out.println(p.getId());
			//	
			//}
			
			String text = "Lista de Produtos:\n";
			if (!getInstanceProducts.isEmpty()) {
				for (int ID : getInstanceProducts.keySet()) {
					text += getInstanceProducts.get(ID).toString();
				}
			} else {
				text += "Vazia!\n";
			}
			System.out.println(text);
			System.out.println("\n");
			
		}
	//}
	
	public static void editProduct() {
		
		System.out.println("Menu Editar Produtos: \n");
		
		System.out.println("Introduza o ID do produto que pretende editar:");
		//int productId = protectProductId();
		skipUserInput();
		
		System.out.println("Insira o novo nome do produto: [" + ((Product) getInstanceProducts.get(productId)).getProductName() + "]");
		scanner.nextLine();
		String productName = protectInputStrings();
		
		System.out.println("Insira o novo PVP do produto: [" + ((Product) getInstanceProducts.get(productId)).getPvp() + "]");
		double pvp = protectInputPvp();
		
		System.out.println("Insira o novo IVA em percentagem do produto:[" + ((Product) getInstanceProducts.get(productId)).getIva() + "]");;
		int iva = protectInputIva();
		
		System.out.println("Insira o novo desconto do produto: [" + ((Product) getInstanceProducts.get(productId)).getDiscount() + "]");
		double discount = protectInputDiscount(pvp);
		
		Product newProduct = new Product(productId, productName, discount, iva, pvp);
		
		secondScreen();
	}
	
	public static void viewProductDetail() {
		
		System.out.println("Menu Consultar Produtos: \n");
		
		System.out.println("Introduza o ID do produto que pretende consultar:");
		int productId = protectProductId();
		
		System.out.println("Consulta produto: " + getInstanceProducts.get(productId));
		
	}
	
	public static void skipUserInput(){
		
		System.out.println("Press enter to continue...");
		
		String test = "";
		
		
		System.out.println("test");
		test = scanner.nextLine();
		
		
		if (test.equals("")){
			
			System.out.println("igual");
		} else {
			
			int productId = protectProductId();
		}
	}
	
	public static void removeProduct() {
		
		String validation;
		
		System.out.println("Menu Apagar Produtos: \n");
		
		System.out.println("Introduza o ID do produto que pretende apagar:");
		int productId = protectProductId();
			
		System.out.println("Deseja mesmo apagar o produto com o ID: " + ((Product) getInstanceProducts.get(productId)) + " ? (S/N)");
		validation = scanner.next();
			
		if (validation.equalsIgnoreCase("s")) {
				
			System.out.println("A remover o produto...");
			getInstanceProducts.remove(productId);
			System.out.println("Produto removido com sucesso!");
				
		} else if (validation.equalsIgnoreCase("n")) {
			
			secondScreen();
		}
	}
			
	public static void createNewShelf() {
		
		int shelfId = 0;
		String validation;
		
		do {
			
			System.out.println("Menu criar nova prateleira:");
			
			System.out.println("Insira o nome da nova prateleira:");
			String productName = scanner.nextLine();
			
			System.out.println("Insira o desconto da nova prateleira:");
			double discount = scanner.nextDouble();
			
			System.out.println("Insira o IVA em percentagem da nova prateleira:");
			int iva = scanner.nextInt();
			
			System.out.println("Insira o PVP do novo produto:");
			double pvp = scanner.nextDouble();
			
			shelfId += 1; 
			
			Product newProduct = new Product(shelfId, productName, discount, iva, pvp);
			
			System.out.println("Quer continuar a inserir novo produto? (S/N)");
			validation = scanner.next();
			
		} while(validation.equalsIgnoreCase("s") );
		
		thirdScreen();
	}
	
}

	/*if(scanner.hasNextInt()) {
	
	productId = scanner.nextInt();
	
	if(productId <= 0) {
		
		System.out.println("O valor introduzido é inválido");
	} else {
		
		for (Integer key : productLists.keySet()) {
			
		    System.out.println("Key = " + key);
		    
		    if (key == productId) {
		
		    	return productId;
		    }   
		}
	} else {
    	
    	System.out.println("O id introduzido não existe");
    	scanner.next();
	}
}
}*/