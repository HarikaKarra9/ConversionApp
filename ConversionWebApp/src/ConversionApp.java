import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class ConversionApp {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br;
		
		// Conversion of Temperature from Kelvin to Celsius
		// 1K = -272.15 C
		
		System.out.println("Temperature in Kelvin:");		
		br = new BufferedReader(new InputStreamReader(System.in));
		
		double kelvin = Double.parseDouble(br.readLine());
		
		double celsius = kelvin - 273.15F;
		System.out.println("Temperature in Celsius: "+ celsius);
		
		
		// Conversion of Weight from Pounds to Kilograms
		// 1 pound = 0.454 kilograms
		
		System.out.println("Weight in Pounds:");
		br= new BufferedReader(new InputStreamReader(System.in));
		
		double pounds = Double.parseDouble(br.readLine());
		double kilograms = (pounds*0.454);
		System.out.println("Weight in Kilograms:"+ kilograms);
		
        // Conversion of Distance from Miles to Kilometers
		// 1 mile = 1.609 kilometers;
		
		System.out.println("Distance in Miles:");
		br= new BufferedReader(new InputStreamReader(System.in));
		
		double miles = Double.parseDouble(br.readLine());
		double kilometers = (miles*1.609);
		System.out.println("Weight in Kilometers:"+ kilometers);
		
	}

}
