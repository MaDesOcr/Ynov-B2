package cours;

public class Boucles {
	
	
	public static void boucleFor() {
		for(int i = 0; i < 5; i++) {
			System.out.println("i : " + i);
		}
	}
	
	
	//boucle foreach à utiliser avec des collections, array, String...
	public static void boucleForEach() {
		int[] tabInt = new int[5];
		
		for(int i : tabInt) {
			System.out.println(i);
		}
	}
	
	public static void boucleWhile() {
		int i = 0;
		while(i<4) {
			System.out.println("i : " + i);
			i++;
		}
	}

	public static void boucleDoWhile() {
		int i = 0;
		do{
			System.out.println("i : " + i);
			i++;
		}
		while(i<4);
	}
	
}
