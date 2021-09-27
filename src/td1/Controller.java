package td1;

import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.Map.Entry;
import java.util.Scanner;

public class Controller {

	static HashMap<String, Car> allCars = new HashMap<String, Car>();

	
	public static void menu() {
		System.out.println(Menu.BONJOUR);
		
		do {
			System.out.println(Menu.MENUQUESTION);
	
			Scanner sc = new Scanner(System.in);
			int i = 0;
			try{
				i = sc.nextInt();
			}
			catch(InputMismatchException e) {
				System.out.println(e);
			}
			
			switch(i) {
				case 1 : System.out.println(Menu.MENUCREATE);
					createCar();
				break;
				case 2 : System.out.println(Menu.MENUREAD);
					readCars();
				break;
				case 3 : System.out.println(Menu.MENUUPDATE);
					updateCars();
				break;
				case 4 : System.out.println(Menu.MENUDELETE);
					deleteCars();
				break;
				case 5 : System.out.println("Au revoir!");
					System.exit(0);
				default : System.out.println(Menu.ERREUR);
			}
		}
		while(true);
	}

	private static void readCars() {
		for(Entry<String, Car> entry : allCars.entrySet()) {
			System.out.println(entry.getKey());
		}
	}

	private static void createCar() {
		System.out.println("Entrez un nom de model :");
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		Car c = new Car(4, s);
		allCars.put(s, c);
	}
	
	private static void updateCars() {
		System.out.println("Quelle voiture voulez vous modifier ?");
		for(Entry<String, Car> car : allCars.entrySet()) {
			System.out.println(car.toString());
		}
		Scanner sc = new Scanner(System.in);
		String aModifier = sc.nextLine();
		if(allCars.containsKey(aModifier)) {
			System.out.println("Quel nouveau nom de modèle ? ");
			String newName = sc.nextLine();
			Car c = allCars.get(aModifier);
			c.setModel(newName);
			allCars.put(newName, c);
			allCars.remove(aModifier);
		}
		else {
			System.out.println("Cette voiture n'existe pas!");
		}
	}
	
	private static void deleteCars() {
		System.out.println("Quelle voiture voulez vous detruire ?");
		for(Entry<String, Car> car : allCars.entrySet()) {
			System.out.println(car.toString());
		}
		Scanner sc = new Scanner(System.in);
		String aSup = sc.nextLine();
		if(allCars.containsKey(aSup)) {
			allCars.remove(aSup);
		}
	}
}
