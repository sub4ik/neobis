package neobistasks.week3;

public class Orders {
	private Long orderId;
	private Long customerId;
	private String orderDate;
	public Long getOrderId() {
		return orderId;
	}
	public void setOrderId(Long orderId) {
		this.orderId = orderId;
	}
	public Long getCustomerId() {
		return customerId;
	}
	public void setCustomerId(Long customerId) {
		this.customerId = customerId;
	}
	public String getOrderDate() {
		return orderDate;
	}
	public void setOrderDate(String orderDate) {
		this.orderDate = orderDate;
	}
	
	/*
	private String shipDate;	
	private String shipStreetNumber;
	private String shipStreetName;
	private String shipCity;
	private String shipPostalCode;
	private String shipProvince;
	private String shipCountry;
	
    */
}
