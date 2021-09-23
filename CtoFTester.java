//they should both have one int parameter. one will have celcius parameter to change to fahrenheit and the other will be the other way around. they can be double, but i am only inputting integers, but the output will be double.
public class CtoFTester{
  public static void main(String[] args) {
    System.out.print("0 degrees celcius to fahrenheit: ");
    System.out.println(celciusToFahrenheit(0));

    System.out.print("0 degrees fahrenheit to celcius: ");
    System.out.println(fahrenheitToCelsius(0));
  }

  public static double celciusToFahrenheit(int celcius) {
  return ((celcius * 9/5) + 32);
  }

  public static double fahrenheitToCelsius(int fahrenheit) {
    return ((fahrenheit - 32) * 5/9);
  }
}
