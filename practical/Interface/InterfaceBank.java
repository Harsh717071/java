package corejava;

 interface InterfaceBank {
   float rateOfinterest();
   
}
class SBI implements InterfaceBank{
	public float rateOfinterest() {
		return 9.15f;
	}
}
	class PNB implements InterfaceBank{
		public float rateOfinterest() {
			return 9.12f;
		}
	}
	class Testinterface{
		public static void main(String[]args) {
			InterfaceBank b = new SBI();
			System.out.println("ROI:"+ b.rateOfinterest());
		}
	}
	

