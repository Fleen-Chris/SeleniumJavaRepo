package week2.day4;

public class Amazon extends CanaraBank {
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Amazon a = new Amazon();
		a.cardPayments();
		a.cashOnDelivery();
		a.recordPaymentDetails();
		a.internetBanking();
		a.upiPayments();
		
	
	}

	@Override
	public void cashOnDelivery() {
		System.out.println("Using Cash On Delivery ");
		
	}

	

	@Override
	void recordPaymentDetails() {
		System.out.println("Record Payment Details");
		
	}

	@Override
	public void upiPayments() {
		System.out.println("UPI Payments");
		
	}

	@Override
	public void cardPayments() {
		System.out.println("Card Payments");
		
	}

	
	}


