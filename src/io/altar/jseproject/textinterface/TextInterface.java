package io.altar.jseproject.textinterface;

import java.util.ArrayList;
import java.util.Scanner;

import io.altar.jseproject.model.Product;

public class TextInterface {
	
	public static void firstScreen() {
		
		System.out.println("Menu Screen 1");
		System.out.println("Por favor selecione uma das seguintes opções:");
		System.out.println("1) Listar Produtos");
		System.out.println("2) Listar Prateleiras");
		System.out.println("3) Sair");
		
		int userInput = checkUserInput(1, 3);
		
		int activeScreen;
		switch (userInput){
			
			case 1:
				
				secondScreen();
				userInput = checkUserInput(1, 5);
				
				activeScreen = 2;
				getUserOption(activeScreen, userInput);
				break;
					
			case 2:
				
				thirdScreen();
				userInput = checkUserInput(1, 5);
				
				activeScreen = 3;
				getUserOption(activeScreen, userInput);
				break;
					
			case 3:
				
				System.out.println("BYE!");
				return;
		}
	}
	
	public static void secondScreen() {
		
		System.out.println("Menu Screen 2");
		System.out.println("Por favor selecione uma das seguintes opções:");
		System.out.println("1) Criar novo produto");
		System.out.println("2) Editar um produto existente");
		System.out.println("3) Consultar o detalhe de um produto");
		System.out.println("4) Remover um produto");
		System.out.println("5) Voltar ao ecrã anterior");
		
		}
	
	public static void thirdScreen() {
		
		System.out.println("Menu Screen 3");
		System.out.println("Por favor selecione uma das seguintes opções:");
		System.out.println("1) Criar novo produto");
		System.out.println("2) Editar um produto existente");
		System.out.println("3) Consultar o detalhe de um produto");
		System.out.println("4) Remover um produto");
		System.out.println("5) Voltar ao ecrã anterior");
		
		}
	
	public static int checkUserInput(int min, int max) {
		
		Scanner s = new Scanner(System.in);
		int input = 0;
		
		while(true) {
			
			if (s.hasNextInt()) {
				
				input = s.nextInt();
				
				if (input >= min && input <= max) {
					
					return input;
				} else {
					System.out.println("Por favor introduza um numero entre " + min + " e " + max);
					
				}
				} else {
					
					System.out.println("Por favor introduza um número");
					s.next();
				}
		}
	}
	
	public static void getUserOption(int activeScreen, int option) {
		
		Scanner scanner = new Scanner(System.in);
		
		if (activeScreen == 2) {
			
			switch (option) {
			
				case 1:
									
					System.out.println("Menu criar novo produto:");
					
					System.out.println("Insira o nome do novo produto:");
					String productName = scanner.nextLine();
					
					System.out.println("Insira o desconto do novo produto:");
					float discount = scanner.nextInt();
					
					System.out.println("Insira o IVA em percentagem do novo produto:");
					int iva = scanner.nextInt();
					
					System.out.println("Insira o PVP do novo produto:");
					float pvp = scanner.nextInt();
					
					int productId = 0;
					productId += 1; 
					
					Product newProduct = new Product(productId, productName, discount, iva, pvp);
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
									
					System.out.println("Screen 3-1");
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
	
	public static void saveValues(int productID, String productName, ) {
		
		ArrayList productList = new ArrayList();
		System.out.println("Initial size of al: " + productList.size());
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
		}
	}

	public static int getInput(int min, int max) {
		Scanner s = new Scanner(System.in);
		int input = 0;

		while (true) {
			if (s.hasNextInt()) {
				input = s.nextInt();
				if (input >= min && input <= max) {
					return input;
				} else {
					System.out.println("Por favor introduza um numero entre " + min + " e " + max);
				}
			} else {
				System.out.println("Por favor introduza um número");
				s.next();
			}
		}
	}

}
*/

/*if( userOption > 3 && userOption <=5){
				
				switch (userOption) {
					
					case 1:
						System.out.println("Criar novo produto");
						break;
						
					case 2:
						System.out.println("Editar um produto existente");
						break;
						
					case 3:
						System.out.println("Consultar o detalhe de um produto");
						break;
							
					case 4:
						System.out.println("Remover um produto");
						break;
							
					case 5:
						firstScreen();
						break;
				}
			}			
			else if( userOption >= 1 && userOption <=3 ){
				
				switch (userOption) {
				
					case 1:
						secondScreen();
						break;
						
					case 2:
						thirdScreen();
						break;
						
					case 3:
						System.exit(0);
						break;
				}
			}							*/
//Scanner s = new Scanner(System.in);
/* while (!s.hasNextInt()) { // Enquanto não tiver número inteiro
				
				System.out.println("Por favor introduza um caracter numérico!");
				s.next(); // Pedir uma nova inserção
			}
			
			userOption = s.nextInt(); // Recolher o input válido
			//s.close();
			System.out.println(userOption);
			
			
		}*/