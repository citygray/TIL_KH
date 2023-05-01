package exam_inheritance2;

public class CustomerTest {

	public static void main(String[] args) {

		Customer customer1 = new Customer();
		customer1.setCustomerID("10010");
		customer1.setCustomerName("이순신");
		customer1.bonusPoint = 1000;
		
		System.out.println(customer1.showCustomerInfo());
		
		
		VIPCustomer customer2 = new VIPCustomer();
		customer2.setCustomerID("10011");
		customer2.setCustomerName("김유신");
		customer2.bonusPoint = 3000;
		
		System.out.println(customer2.showCustomerInfo());
	}

}
