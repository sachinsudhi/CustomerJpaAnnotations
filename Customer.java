package trng.customers;
public final class Customer {
	private int customerID;
	private String title;
	private String firstName;
	private String middleName;
	private String lastName;
	private String suffix;
	private String email;
	private String company;
	private String displayName;
	private String printOnCheckAs;
	private String otherDetails;
	private Order[] orders;
	private Address address;

	public Address getAddress() {
		return address;
	}

	public int getCustomerID() {
		return customerID;
	}

	public String getTitle() {
		return title;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getMiddleName() {
		return middleName;
	}

	public String getLastName() {
		return lastName;
	}

	public String getSuffix() {
		return suffix;
	}

	public String getEmail() {
		return email;
	}

	public String getCompany() {
		return company;
	}

	public String getDisplayName() {
		return displayName;
	}

	public String getPrintOnCheckAs() {
		return printOnCheckAs;
	}

	
	public String getOtherDetails() {
		return otherDetails;
	}

	public Order[] getOrder() {
		return orders;
	}

	public Customer(int customerID, String title, String firstName, String middleName, String lastName, String suffix,
			String email, String company, String displayName, String printOnCheckAs,  String otherDetails,
			Order[] order) {
		super();
		this.customerID = customerID;
		this.title = title;
		this.firstName = firstName;
		this.middleName = middleName;
		this.lastName = lastName;
		this.suffix = suffix;
		this.email = email;
		this.company = company;
		this.displayName = displayName;
		this.printOnCheckAs = printOnCheckAs;
		this.otherDetails = otherDetails;
		this.orders = order;
	}

}