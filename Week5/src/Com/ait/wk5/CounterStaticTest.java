package Com.ait.wk5;

public class CounterStaticTest {

	public static void main(String[] args) {
		CounterStatic counter1 = new CounterStatic();
		CounterStatic counter2 = new CounterStatic();
		CounterStatic counter3 = new CounterStatic();
		System.out.println(counter1.getCounter());
		System.out.println(counter2.getCounter());
		System.out.println(counter3.getCounter());
		
		
		System.out.println(CounterStatic.getCounter());
	}

}
