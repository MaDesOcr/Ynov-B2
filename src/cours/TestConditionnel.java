package cours;

public class TestConditionnel {

	
	static int i = 5;
	
	public static void testIf() {
		if(i<5) {
			System.out.println("i : " + i);
		}
		else if(i==5) {
			System.out.print("i : " + 5);
		}
		else {
			System.out.println("i");
		}
	}
	
	
	public static void testSwitch() {

		switch(i) {
			case 1 : System.out.println("i : 1");
			break;
			case 2 : System.out.println("i : 1");;
			break;
			default: System.out.println("i : ?");;
		}
		
	}
	
}
