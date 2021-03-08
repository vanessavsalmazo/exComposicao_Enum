package entities;

public class OrderItem {
	
	private Integer quantity;
	private Double price;
	
	//COMPOSIÇÃO ENTRE UM OBJETO E OUTRO (ORDER TEM 1 PRODUCT)
	
	//nome da classe Product
	
	private Product product;
	
	public OrderItem () {
		
	}

	public OrderItem(Integer quantity, Double price, Product product) {
		this.quantity = quantity;
		this.price = price;
		this.product = product;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}
	
	public double subTotal() {
		return quantity*price;
	}
	
	@Override //utilizar o override para reescrever a impressão do programa final
	public String toString( ) {
		return getProduct().getName()
				+ ", $"
				+ String.format("%.2f", price) //formatou 2 casas depois da virgula
				+ ", Quantity: "
				+ quantity
				+ ", Subtotal: $"
				+ String.format("%.2f", subTotal());
	}
	

}

	
