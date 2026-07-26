package Com.ait.wk5;

class phoneClass {
	
// attributes
	
	private String PhoneNumber;
	private String OwnerName;
	private double price;
	
	public phoneClass () {        // this is constructor and it has public.
		 
		this.PhoneNumber = "0000";
		this.OwnerName = " ";
		this.price = 0.0;
		
	}
	
	public phoneClass(String phoneNumber, String ownersName, double price, String ownerName) {             // Parameterized constructor
		this.PhoneNumber= phoneNumber; // this refers to an instance of an object
		this.OwnerName = ownerName;
		this.price = price;
		
	}
		
		//getter 
		
		public String getPhoneNumber() {

	return PhoneNumber;
	
		}
		
		//ownerName
		public String getownerName() {

			return OwnerName;
			
				
			}
		
		// price
		
		
		public double getprice() {
			return price;
		}



		
		//setters phone
		
		public void setPhoneNumber(String aNumber) {
			PhoneNumber= aNumber;
			
		}
	
		public void setOwnerName(String aOwnerName) {
			OwnerName= aOwnerName;
		}
			
			public void setprice(double aprice) { // for setters no need to write the return statement if its in void. 
				price= aprice;
		

			}
			
			
			

}
