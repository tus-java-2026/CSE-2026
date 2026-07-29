package Arrays;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListStringLiterals {
	private static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		//arrayListStringLiterals();
		//arrayListStringfromScanner();
		// arrayListStringWithLoops();
		//arrayListInteger();
		arrayListPerson();
		
		
		

	}

	private static void arrayListPerson() {
		
			ArrayList<Person> people = new ArrayList<Person>();
			
			String userChoice="y";
			while(userChoice.equalsIgnoreCase("y")){
				
				System.out.print("Enter name: ");
				String name = sc.next();
				
				System.out.print("Enter address: ");
				String address = sc.next();
				
				System.out.print("Enter age: ");
				int age = sc.nextInt();
				
				Person p = new Person(age, name, address);
				people.add(p);
				System.out.print("Do you wish to create more people (y/n): ");
				userChoice=sc.next();
			}
			
			for(Person person:people)
				System.out.println(person);	
		}

	}
		
	
	/*private static void arrayListInteger() {
		ArrayList<Integer> numbers = new ArrayList<Integer>(3);
		
		System.out.print("Enter an integer to be addad ('-1' to exit)--> ");
		int number = sc.nextInt();
		
		while(number != -1){
		numbers.add(number);
		System.out.print("Enter an integer to be addad ('-1' to exit)--> ");
		 number=sc.nextInt();
	
		}
	
		System.out.println(numbers);
		
		for (Integer num :numbers)
			System.out.println ("The number is " + num);
		
	}	
		
	}

	
		


	/*private static void arrayListStringWithLoops() {
		ArrayList<String> names = new ArrayList<String>();
	
		System.out.print("Enter a name to be addad ('x' to exit)--> ");
		String name = sc.next();
		
		while(!name.equalsIgnoreCase("x")){
		names.add(name);
		System.out.print("Enter a name to be addad ('x' to exit)--> ");
		 name = sc.next();
	
		}
	
		System.out.println(names);
		
		for (String somename:names)
			System.out.println ("The anme is " + somename);
		
	}	
		
	}



	/*private static void arrayListStringfromScanner() {
		ArrayList<String> names = new ArrayList <String>();
		
		System.out.print("Enter a name to be addad --> ");
		String name = sc.next();
		names.add(name);
		
		System.out.print("Enter a name to be addad --> ");
		 name = sc.next();
		names.add(name);
		
		System.out.print("Enter a name to be addad --> ");
		name=sc.next();
		names.add(name);
		
		System.out.print("Enter a name to be addad --> ");
		name=sc.next();
		names.add(name);
		System.out.println(names);
	}
}	

/*private static void arrayListStringLiterals() {
	ArrayList<String> names = new ArrayList <String>();
	names.add("Zoe");
	names.add("Paul");
	names.add("Alan");
	names.add("Thomas");
	System.out.println(names);
	}
	} */
	
		



