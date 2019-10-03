public abstract class Vehicule {

		private String brand;
		private int kilometers;
		
	public Vehicule (){
        }

	public Vehicule(String brand, int kilometers) {

		this.brand = brand;
		this.kilometers = kilometers;

         
	}
	//setters     // Déclaration de setters

	public void setBrand(String brand){
		this.brand = brand;
	}


	public void setKilometers(int kilometers){
		this.kilometers = kilometers;
	}

	

	//getters  // Déclaration de getters
           

	public  String getBrand(){
		return this.brand;
	}


	public  int getKilometers(){
		return this.kilometers;
	}

	public abstract String doStuff ();

	


}
