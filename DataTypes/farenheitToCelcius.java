//Write a Java program to convert temperature from Fahrenheit to Celsius degree.

public class demo{
  public static void main(String[] args) {
    double far = 212d;
    double cel = (far - 32) / (1.8);
    System.out.println(far + " farenheit = " + cel + " celcius");
  }
}

