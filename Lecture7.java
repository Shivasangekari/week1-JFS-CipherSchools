package week1;
interface olaCustomers{
	void bookCab();
	void findARide();
	void rentCab();
	void rateDriver();
	void scheduletoWallet();
	void cancelCab();
	void addMoneytoWallet();
	void raiseTicket();
	void signup();
	void signIn();
}
interface olaDriver{
	void acceptBooking();
	void getCustomerLocation();
	void setAvailableStatus();
	void getMyComission();
	void raiseMoneyTransferRequest();
	void callCustomer();
	void setUpYourVehicle();
	void customerFeedback();
}
interface olaOwner{
	void getDriveRecords();
	void getReportByDriverID();
	void getReportByRegion();
	void getTotalRevenue();
	void getCustomerFeedback();
	void addDriver();
	void removeDriver();
	void changeDriverStatus();
}
public class lecture7 implements olaOwner , olaDriver, olaCustomers{

	public static void main(String[] args) {
		
		olaOwner shiva=new lecture7();
		shiva.addDriver();
		olaCustomers naga=new lecture7();
		naga.bookCab();
		olaDriver nani=new lecture7();
		nani.callCustomer();
	}

	@Override
	public void bookCab() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void findARide() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void rentCab() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void rateDriver() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void scheduletoWallet() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void cancelCab() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void addMoneytoWallet() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void raiseTicket() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void signup() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void signIn() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void acceptBooking() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void getCustomerLocation() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setAvailableStatus() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void getMyComission() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void raiseMoneyTransferRequest() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void callCustomer() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setUpYourVehicle() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void customerFeedback() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void getDriveRecords() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void getReportByDriverID() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void getReportByRegion() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void getTotalRevenue() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void getCustomerFeedback() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void addDriver() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void removeDriver() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void changeDriverStatus() {
		// TODO Auto-generated method stub
		
	}

}
