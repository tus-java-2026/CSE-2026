package examples;

public class VariableScope {
	
	int localVariable = 10;
	private char[] instanceVariable;
	static int classVariable = 23;
	

	public static void main(String[] args) {
		int localVariable = 8;
		localVariable = 20;
		System.out.println("Local variable " + localVariable );
		//System.out.println(instanceVariable);
		System.out.println(VariableScope.classVariable);
		
		method2();
		VariableScope vs = new VariableScope();
		System.out.println(vs.instanceVariable);
		
		
		vs.method3();
		
		
	}
	public static void method2() {
		
		System.out.println("Method 2 "+ classVariable);	
	}
		
		public void method3() { // if the method is not static 
			
			System.out.println("Method 3 ");	

    }
}
