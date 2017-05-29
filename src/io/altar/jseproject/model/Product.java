package io.altar.jseproject.model;

public class Product {

		private int productId;
		//public int shelfList[];
		private float discount;
		private int iva;
		private float pvp;
		
		public int getProductId() {
			return productId;
		}
		public void setProductId(int productId) {
			this.productId = productId;
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
		
}
