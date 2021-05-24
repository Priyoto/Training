package Day2.Exercise4;

import java.io.Serializable;

public class Order implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	private int order_id;
	private  String product_name;
	 transient private  String customer_name;
	public Order(int order_id, String product_name, String customer_name) {
		super();
		this.order_id = order_id;
		this.product_name = product_name;
		this.customer_name = customer_name;
	}
	public int getOrder_id() {
		return order_id;
	}
	public void setOrder_id(int order_id) {
		this.order_id = order_id;
	}
	public String getProduct_name() {
		return product_name;
	}
	public void setProduct_name(String product_name) {
		this.product_name = product_name;
	}
	public String getCustomer_name() {
		return customer_name;
	}
	public void setCustomer_name(String customer_name) {
		this.customer_name = customer_name;
	}
	@Override
	public String toString() {
		return "Order [order_id=" + order_id + ", product_name=" + product_name + 
				 "]";
	}

}
