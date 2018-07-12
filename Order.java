package trng.customers;
import java.sql.Date;

public class Order{
	private int orderID;
	private int customerID;
	private Date invoiceCreationDate;
	private Date deliveryDueDate;
	private Date paymentDueDate;
	private String customMessage;
	private OrderProducts[] op;

	public int getOrderID() {
		return orderID;
	}

	public void setOrderID(int orderID) {
		this.orderID = orderID;
	}

	public int getCustomerID() {
		return customerID;
	}

	public void setCustomerID(int customerID) {
		this.customerID = customerID;
	}

	public Date getInvoiceCreationDate() {
		return invoiceCreationDate;
	}

	public void setInvoiceCreationDate(Date invoiceCreationDate) {
		this.invoiceCreationDate = invoiceCreationDate;
	}

	public Date getDeliveryDueDate() {
		return deliveryDueDate;
	}

	public void setDeliveryDueDate(Date deliveryDueDate) {
		this.deliveryDueDate = deliveryDueDate;
	}

	public Date getPaymentDueDate() {
		return paymentDueDate;
	}

	public void setPaymentDueDate(Date paymentDueDate) {
		this.paymentDueDate = paymentDueDate;
	}

	public String getCustomMessage() {
		return customMessage;
	}

	public void setCustomMessage(String customMessage) {
		this.customMessage = customMessage;
	}

	public OrderProducts[] getOp() {
		return op;
	}

	public void setOp(OrderProducts[] op) {
		this.op = op;
	}

	public Order(int orderID, int customerID, Date invoiceCreationDate, Date deliveryDueDate, Date paymentDueDate,
			String customMessage, OrderProducts[] op) {
		super();
		this.orderID = orderID;
		this.customerID = customerID;
		this.invoiceCreationDate = invoiceCreationDate;
		this.deliveryDueDate = deliveryDueDate;
		this.paymentDueDate = paymentDueDate;
		this.customMessage = customMessage;
		this.op = op;
	}

}