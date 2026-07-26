package Com.ait.wk5;

public class SimpleConstructor {

	public static void main (String[] args) {



		for (int i=1; i <=5; i++) {
			System.out.println(" Creating instance "+i+" of Rock");
			Rock rock= new Rock();
		}
	}
}

//1.	File name is the same as the public class (not Rock.java)
//2.	Constructor has :
//		- same name as class name
//		- no return type at all (not even void)
//3.	Constructor is called when object instantiated/created i.e. when "new" executed
//4.	Methods which happen to have the same name as the constructor
//	are not called when an object of the class is instantiated
//5.	How to call an ordinary (non-static) method in the class




