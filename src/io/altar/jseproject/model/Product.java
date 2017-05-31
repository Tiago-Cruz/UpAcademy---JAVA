package io.altar.jseproject.model;

public class Product {

		private int productId;
		//public int shelfList[];
		private String productName;
		private float discount;
		private int iva;
		private float pvp;
		
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
		public float getDiscount() {
			return discount;
		}
		public void setDiscount(float discount) {
			this.discount = discount;
		}
		public int getIva() {
			return iva;
		}
		public void setIva(int iva) {
			this.iva = iva;
		}
		public float getPvp() {
			return pvp;
		}
		public void setPvp(float pvp) {
			this.pvp = pvp;
		}
		
		public Product (int productId, String productName, float discount, int iva, float pvp) {
			
		    //Se for escolhido o construtor sem a COR do veículo
		    // definimos a cor padrão como sendo PRETA
			
			this.productId = productId;
			this.productName = productName;
			this.discount = discount;
			this.iva = iva;
			this.pvp = pvp;
			
		}
}
