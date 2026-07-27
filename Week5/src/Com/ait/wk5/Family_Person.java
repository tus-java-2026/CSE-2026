package Com.ait.wk5;

public class Family_Person {

	
	// Instance variables (attributes)
    private int age ;
    private String name;
    private String address;
    private static int count;
    
    
 // Default constructor
    public Family_Person() {
        age = 00;
        name = " ";
        address = " ";
        count = 00;
        
    } 
    
    // constructor with parameters
        		
    public Family_Person(int age, String name, String address, int count) {
		this.age = age;
		this.name = name;
		this.address = address;
		Family_Person.count = count;
	}

	// getters and setters
   
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public static int getCount() {
		return count;
	}
	public void setCount(int count) {
		Family_Person.count = count;
	}
}
	

	