package io.altar.jseproject.model;

import io.altar.jseproject.textinterface.TextInterface;

public class Product {

		private int productId;
		//public int shelfList[];
		private String productName;
		private double discount;
		private int iva;
		private double pvp;
		
		public int getProductId() {
			return productId;
		}
		public void setProductId(int productId) {
			this.productId = productId;
		}
		public String getProductName() {
			return productName;
		}
		public void setProductName(String productName) {
			this.productName = productName;
		}
		public double getDiscount() {
			return discount;
		}
		public void setDiscount(double discount) {
			this.discount = discount;
		}
		public int getIva() {
			return iva;
		}
		public void setIva(int iva) {
			this.iva = iva;
		}
		public double getPvp() {
			return pvp;
		}
		public void setPvp(double pvp) {
			this.pvp = pvp;
		}
		
		public Product (int productId, String productName, double discount, int iva, double pvp) {
			
		    //Se for escolhido o construtor sem a COR do veículo
		    // definimos a cor padrão como sendo PRETA
			
			this.productId = productId;
			this.productName = productName;
			this.discount = discount;
			this.iva = iva;
			this.pvp = pvp;
			
			TextInterface.productLists.put(this.productId,this);
		}
		
		@Override
		public String toString(){
			
			return "Id:" + productId + " | Nome: " + productName + " | PVP: " + pvp + "€ | IVA: " + iva + "% | Desconto: " + discount + "€";
		}
}
