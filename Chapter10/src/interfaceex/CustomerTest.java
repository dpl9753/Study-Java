package interfaceex;

public class CustomerTest {

	public static void main(String[] args) {
		
		Customer customer = new Customer();
		
		Buy buyer = customer;
		buyer.buy();
		
		Sell seller = customer;
		seller.sell();
		
		//셋다 Customer에서 불러옴
		customer.order();
		buyer.order();
		seller.order();
		
	}
}
