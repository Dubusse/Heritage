public class Boat extends Vehicule {
		public Boat(String brand, int kilometers) {
			super (brand, kilometers);
		}
		public String doStuff(){
			 return " je suis " + getBrand() + " et je fais glou glou ! ";
		}
}



