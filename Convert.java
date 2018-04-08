public class Convert{

  public static void main(String[] args){
	  Temperature temperature = new Temperature();

	  double fTemp = 78;
	  double cTemp = temperature.toCelsius(fTemp);
	  System.out.println(fTemp + " Fahrenheit = " + cTemp + " Celsius.")

	   cTemp = 25;
	   fTemp = temperature.toFahrenheit(cTemp);
	  System.out.println(cTemp + " Celsius = " + fTemp + " Fahrenheit.")

	public double toCelsius(double f){
		double c;
		c = (f - 32.0) / 1.8;
	    return c;
	}

	public double toFahrenheit(double c){
		double f;
		c = (c * 1.8) + 32.0;
	    return f;
    }
    Conversion.main(null);
  }
}