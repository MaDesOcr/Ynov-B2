package td1;

public class Car {

	int nbWheels;
	String model;
	
	
	public Car(int nbWheels, String model) {
		super();
		this.nbWheels = nbWheels;
		this.model = model;
	}

	
	@Override
	public String toString() {
		return "Car [nbWheels=" + nbWheels + ", model=" + model + "]";
	}


	public int getNbWheels() {
		return nbWheels;
	}


	public void setNbWheels(int nbWheels) {
		this.nbWheels = nbWheels;
	}


	public String getModel() {
		return model;
	}


	public void setModel(String model) {
		this.model = model;
	}
	
	
	
	
}
