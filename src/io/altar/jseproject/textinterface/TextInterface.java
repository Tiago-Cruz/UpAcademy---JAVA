package io.altar.jseproject.textinterface;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

import io.altar.jseproject.model.Product;

public class TextInterface {
	
	static Scanner scanner = new Scanner(System.in);
	public static Map <Integer, Product> productLists = new LinkedHashMap <Integer, Product>();
	
	public static void firstScreen() {
		
<<<<<<< HEAD
		System.out.println("Menu Screen 1\n");
		System.out.println("Por favor selecione uma das seguintes opï¿½ï¿½es:");
=======
		System.out.println("Menu Screen 1");
		System.out.println("Por favor selecione uma das seguintes opções:");
>>>>>>> f553f1135d5e2392016a9c4df714cf8f115960b3
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
		
<<<<<<< HEAD
		System.out.println("Menu Screen 2\n");
		System.out.println("Por favor selecione uma das seguintes opÃ§Ãµes:");
=======
		System.out.println("Menu Screen 2");
		System.out.println("Por favor selecione uma das seguintes opções:");
>>>>>>> f553f1135d5e2392016a9c4df714cf8f115960b3
		System.out.println("1) Criar novo produto");
		System.out.println("2) Editar um produto existente");
		System.out.println("3) Consultar o detalhe de um produto");
		System.out.println("4) Remover um produto");
		System.out.println("5) Voltar ao ecrã anterior");
		
		int userInput = checkUserInput(1, 5);
		
		int activeScreen = 2;
		getUserOption(activeScreen, userInput);
		
		int userInput = checkUserInput(1, 5);
		
		int activeScreen = 2;
		getUserOption(activeScreen, userInput);
		
		}
	
	public static void thirdScreen() {
		
<<<<<<< HEAD
		showProducts();
		
		System.out.println("Menu Screen 3\n");
		System.out.println("Por favor selecione uma das seguintes opÃ§Ãµes:");
=======
		System.out.println("Menu Screen 3");
		System.out.println("Por favor selecione uma das seguintes opções:");
>>>>>>> f553f1135d5e2392016a9c4df714cf8f115960b3
		System.out.println("1) Criar novo produto");
		System.out.println("2) Editar um produto existente");
		System.out.println("3) Consultar o detalhe de um produto");
		System.out.println("4) Remover um produto");
		System.out.println("5) Voltar ao ecrã anterior");
		
		int userInput = checkUserInput(1, 5);
		
		int activeScreen = 3;
		getUserOption(activeScreen, userInput);
		
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
			
<<<<<<< HEAD
			boolean teste = scanner.hasNextLine();
			if (scanner.hasNextLine()) {
				
				String productName = scanner.nextLine();
				
				if (productName == null || productName.trim().isEmpty()) {
					
					System.out.println("Nome do produto nÃ£o pode estar em branco");
					System.out.println(teste);
				} else {
					System.out.println(teste);
=======
			String productName;
			
			if (scanner.hasNextLine()) {
				
				productName = scanner.nextLine();
				
				if (productName == null || productName.trim().isEmpty()) {
					
					System.out.println("Nome do produto não pode estar em branco");
					
				} else {
					
>>>>>>> f553f1135d5e2392016a9c4df714cf8f115960b3
					return productName;
				}  
			} else {
				
<<<<<<< HEAD
				System.out.println("Nome do produto invÃ¡lido");
				System.out.println(teste);
=======
				System.out.println("Nome do produto inválido");
>>>>>>> f553f1135d5e2392016a9c4df714cf8f115960b3
				scanner.next();
			}
		}
	}
	
	public static void protectInputDiscount() {
		
		
	}
	
	public static int protectInputIva() {
		
		int iva = 0;
		
		while(true) {
			
			if(scanner.hasNextInt()) {
				
				iva = scanner.nextInt();
				
				switch (iva) {
				
					case 0:
<<<<<<< HEAD
					case 6:
					case 13:
					case 23:
						return iva;
					default:
						System.out.println("O valor do iva introduzido nÃ£o existe");
=======
						return iva;
					case 6:
						return iva;
					case 13:
						return iva;
					case 23:
						return iva;
					default:
						System.out.println("O valor do iva introduzido não existe");
>>>>>>> f553f1135d5e2392016a9c4df714cf8f115960b3
						break;
				}
			} else {
				
<<<<<<< HEAD
				System.out.println("O valor do iva introduzido Ã© invÃ¡lido");
=======
				System.out.println("O valor do iva introduzido é inválido");
>>>>>>> f553f1135d5e2392016a9c4df714cf8f115960b3
				scanner.next();
			}
		}
	}
	
	public static void protectInputPvp() {
		
		
	}
	
	public static void getUserOption(int activeScreen, int option) {
		
		if (activeScreen == 2) {
			
			switch (option) {
			
				case 1:
					
					createNewProduct();
					break;
					
				case 2:
					
					System.out.println("Screen 2-2");
					break;
					
				case 3:
					
					System.out.println("Screen 2-3");
					break;
					
				case 4:
					
					System.out.println("Screen 2-4");
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
		
<<<<<<< HEAD
		int productId = 0;
		String validation;
		
		do {
			
			//System.out.println("Menu criar novo produto: ");
			
			System.out.println("Insira o nome do novo produto: ");
			
			//while(scanner.hasNext()) {
			//   scanner.next();
			//}
			
			String productName = protectInputStrings();
			
			System.out.println("Insira o desconto do novo produto:");
			double discount = scanner.nextDouble();
			
			System.out.println("Insira o IVA em percentagem do novo produto:");
			int iva = protectInputIva();
			
			System.out.println("Insira o PVP do novo produto:");
			double pvp = scanner.nextDouble();
			
			productId += 1; 
			
			Product newProduct = new Product(productId, productName, discount, iva, pvp);
			
			showProducts();
			
			System.out.println("Quer continuar a inserir novo produto? (S/N)");
			validation = scanner.next();
			
		} while(validation.equalsIgnoreCase("s") );
=======
		System.out.println("Initial size of al: " + productLists.size());

		Product p = new Product(productId, productName, discount, iva, pvp);
		productLists.add(p);
		
		for ( int j = 0; j < productId; j++) {
			
			System.out.println("Nome: " + p.getProductName());
			//System.out.println(Product);
		}
			
		//productLists.forEach((Product)->System.out.println(Product));
		
		System.out.println("Size of al after additions: " + productLists.size());
		
		System.out.println("Contents of Product List: " + productLists);
>>>>>>> f553f1135d5e2392016a9c4df714cf8f115960b3
		
		secondScreen();
	}
	
<<<<<<< HEAD
	public static void showProducts() {
		
		boolean check = productLists.isEmpty();
		if(check != true) {
			
			System.out.println("Lista de produtos no sistema:\n");
=======
	public static void createNewProduct() {
		
		int productId = 0;
		String validation;
		
		do {
			
			System.out.println("Menu criar novo produto:");
			
			System.out.println("Insira o nome do novo produto:");
			String productName = protectInputStrings();
			
			System.out.println("Insira o desconto do novo produto:");
			double discount = scanner.nextDouble();
			
			System.out.println("Insira o IVA em percentagem do novo produto:");
			int iva = protectInputIva();
			
			System.out.println("Insira o PVP do novo produto:");
			double pvp = scanner.nextDouble();
			
			productId += 1; 
			
			Product newProduct = new Product(productId, productName, discount, iva, pvp);
			saveValues(productId, productName, discount, iva, pvp);
			
			System.out.println("Quer continuar a inserir novo produto? (S/N)");
			validation = scanner.next();
			
		} while(validation.equalsIgnoreCase("s") );
		
		secondScreen();
	}
	
	public static void showProducts() {
		
		productLists.forEach((Product)->System.out.println(Product));
	}
	
	public static void createNewShelf() {
		
		int productId = 0;
		String validation;
		
		do {
			
			System.out.println("Menu criar nova prateleira:");
			
			System.out.println("Insira o nome da nova prateleira:");
			String productName = scanner.nextLine();
			
			System.out.println("Insira o desconto do novo produto:");
			double discount = scanner.nextDouble();
			
			System.out.println("Insira o IVA em percentagem do novo produto:");
			int iva = scanner.nextInt();
			
			System.out.println("Insira o PVP do novo produto:");
			double pvp = scanner.nextDouble();
			
			productId += 1; 
			
			Product newProduct = new Product(productId, productName, discount, iva, pvp);
			saveValues(productId, productName, discount, iva, pvp);
			
			System.out.println("Quer continuar a inserir novo produto? (S/N)");
			validation = scanner.next();
			
		} while(validation.equalsIgnoreCase("s") );
		
		thirdScreen();
	}
	
}



// Boolean endCheckUserInput = false;
/* package org.altar.session1.test;

import java.util.Scanner;

public class test {

	public static void main(String[] args) {
		int input = getInput(1, 3);
		switch (input) {
		case 1:
			break;
		case 2:
			break;
>>>>>>> f553f1135d5e2392016a9c4df714cf8f115960b3
		}
 
		productLists.forEach((key,value) -> {
		    System.out.println(key + " -> " + value);
		});
		
		if(check != true) {
			
			System.out.println("\n");
		}
	}
	
	public static void createNewShelf() {
		
		int productId = 0;
		String validation;
		
		do {
			
			System.out.println("Menu criar nova prateleira:");
			
			System.out.println("Insira o nome da nova prateleira:");
			String productName = scanner.nextLine();
			
			System.out.println("Insira o desconto do novo produto:");
			double discount = scanner.nextDouble();
			
			System.out.println("Insira o IVA em percentagem do novo produto:");
			int iva = scanner.nextInt();
			
			System.out.println("Insira o PVP do novo produto:");
			double pvp = scanner.nextDouble();
			
			productId += 1; 
			
			Product newProduct = new Product(productId, productName, discount, iva, pvp);
			//saveValues(productId, productName, discount, iva, pvp);
			
			System.out.println("Quer continuar a inserir novo produto? (S/N)");
			validation = scanner.next();
			
		} while(validation.equalsIgnoreCase("s") );
		
		thirdScreen();
	}
	
}



