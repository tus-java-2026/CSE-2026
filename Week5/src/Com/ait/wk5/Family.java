package Com.ait.wk5;

public class Family {

	    public static void main(String[] args) {

	        Family_Person john = new Family_Person(22, "John", "Dublin", 0);
	        Family_Person ann = new  Family_Person(25, "Ann", "Galway", 0);

	        // John's details
	        System.out.println("John's Details");
	        System.out.println("Name: " + john.getName());
	        System.out.println("Age: " + john.getAge());
	        System.out.println("Address: " + john.getAddress());

	        System.out.println();

	        // Ann's details
	        System.out.println("Ann's Details");
	        System.out.println("Name: " + ann.getName());
	        System.out.println("Age: " + ann.getAge());
	        System.out.println("Address: " + ann.getAddress());

	        System.out.println();

	        // Number of people created
	        System.out.println("People created: " +  Family_Person.getCount());

	        System.out.println();

	        // Change John's name to jack
	        john.setName("Jack");
	        john.setAge(23);
	        john.setAddress("Cork");

	        System.out.println("Updated John's Details");
	        System.out.println("Name: " + john.getName());
	        System.out.println("Age: " + john.getAge());
	        System.out.println("Address: " + john.getAddress());
	    }
	}