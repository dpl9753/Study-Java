package interfaceex;

public class CustomerTest {

	public static void main(String[] args) {
		
		Customer customer = new Customer();
		
		Buy buyer = customer;
		buyer.buy();
		
		Sell seller = customer;
		seller.sell();
		
		//�´� Customer���� �ҷ���
		customer.order();
		buyer.order();
		seller.order();
		
	}
}
