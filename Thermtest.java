package lab1;

public class Thermtest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Thermometer thermA = new Thermometer();
		
		
		System.out.println("temp of Thermometer A is" +thermA.getCelsius()); 
		thermA.setCelsius(20.0);
		System.out.println("temp of thermometer A is" +thermA.getCelsius());
		
		Thermometer thermB = new Thermometer(10.0);
	
	double tempB = thermB.getCelsius();
	
	System.out.println("temp of thermometer b is " +tempB);
	
	
	tempB = thermB.getFahrenheit();
	
	System.out.println("temp of thermometer B  in Fahrenheit is" +tempB);
	
	thermB.setFahrenheit(100);
	
	tempB = thermB.getCelsius();
	
	System.out.println("Temp of Thermometer B is" +tempB );
	}
	

}
