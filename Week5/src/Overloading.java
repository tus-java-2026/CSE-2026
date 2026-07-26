package Com.ait.wk5;

public class Overloading {

	    public static void main(String[] args) {

	        // Uses the default constructor
	        Tree tree1 = new Tree();

	        // Uses the overloaded constructor
	        Tree tree2 = new Tree("Oak");

	        System.out.println(tree1.getType());

	        System.out.println(tree2.getType());

	        System.out.println(tree1.getType("This is a"));

	        System.out.println(tree2.getType("This is an"));
	    }
	}