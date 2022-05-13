package inheritance;

public class Main {

	public static void main(String[] args) {
		
		IndividualCustomer musa = new IndividualCustomer();
		musa.customerNumber = "12345";
		
		CorporateCustomer hepsiBurada = new CorporateCustomer();
		hepsiBurada.customerNumber = "78910";
		
		SendikaCustomer sendikaCustomer = new SendikaCustomer();
		sendikaCustomer.customerNumber = "99999";
		
		CustomerManager customerManager = new CustomerManager();
		
		Customer[] customers = {musa,hepsiBurada,sendikaCustomer};
		customerManager.addMultiple(customers);
	}

}
