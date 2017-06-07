package io.altar.jseproject.test;

import io.altar.jseproject.repository.ProductRepository;
import io.altar.jseproject.textinterface.TextInterface;


public class test {

	public static void main(String[] args) {
		
		TextInterface teste = new TextInterface();
		teste.firstScreen();
		System.out.println(ProductRepository.Singleton);
		//System.out.println(ProductRepository.Teste);
	}
}
