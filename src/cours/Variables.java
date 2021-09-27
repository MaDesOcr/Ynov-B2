package cours;

public class Variables {

	
	
	//déclaration = affectation;
	//int i;
	//i = 5;
	//ou
	//int i = 5;
	
	//Les primitives stockent des informations.
	
	byte b = 0; // 8bits -128/127
	short s = 0; // 16bits -32768/32767
	int i = 0; // 32bits -2^31/2^31-1
	long l = 0; // 64bits -2^63/2^63-1
			
	float f = 0.0f; //32bits 754 décimal
	double d = 0.0d; //64bits 754 décimal
	
	boolean bo = true;
	
	char c = 'c'; //unicode 16bits
	
	
	public static void infoVariablePrimitive() {
		int a = 1, b = 2, c = 3;
		System.out.println (a == b);
		
		a = b; //-> a == 2 et b ==2;

		//i++ est l'équivalent de i = i + 1;
		//++i est diférent de i++; 
	}
	
	
	
}
