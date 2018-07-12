package trng.customers;
public class OrderProducts {
	private int productOrderID;
	private int orderID;
	private int productID;
	private int quantity;

	public int getProductOrderID() {
		return productOrderID;
	}

	public int getOrderID() {
		return orderID;
	}

	public int getProductID() {
		return productID;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setProductOrderID(int productOrderID) {
		this.productOrderID = productOrderID;
	}

	public void setOrderID(int orderID) {
		this.orderID = orderID;
	}

	public void setProductID(int productID) {
		this.productID = productID;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public OrderProducts(int productOrderID, int orderID, int productID, int quantity) {
		super();
		this.productOrderID = productOrderID;
		this.orderID = orderID;
		this.productID = productID;
		this.quantity = quantity;
	}

}