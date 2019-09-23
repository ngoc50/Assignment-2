package nguyen_p2;
import java.util.Scanner;

public class BMI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scnr = new Scanner(System.in);
		int option;
		double weightInPounds;
		double weightInKilograms;
		double heightInInches;
		double heightInMeters;
		double BMI1;
		double BMI2;
		
		System.out.println("Option 1: BMI = (703 * weightInPounds) / heightInInches^2");
		System.out.println("Option 2: BMI = weightInKilograms / heightInMeters^2");
		System.out.println("Choose an option: ");
		option = scnr.nextInt();
		
		if(option == 1)
		{	
			System.out.println("Enter weight in pounds: ");
			weightInPounds = scnr.nextDouble();
			System.out.println("Enter height in Inches: ");
			heightInInches = scnr.nextDouble();
			BMI1 = (703 * weightInPounds) / (heightInInches * heightInInches);
			System.out.printf("BMI = %.3f\n", BMI1);
		}
		else if(option == 2)
		{
			System.out.println("Enter weight in kilograms: ");
			weightInKilograms = scnr.nextDouble();
			System.out.println("Enter height in meters: ");
			heightInMeters = scnr.nextDouble();
			BMI2 = weightInKilograms / (heightInMeters * heightInMeters);
			System.out.printf("BMI = %.3f\n", BMI2);
		}
		else
		{
			System.out.println("Invalid choice.");
		}
		
		if (BMI1 < 18.5) {

            System.out.println("underweight");

        } else if (BMI1 < 25) {

            System.out.println("normal");

        } else if (BMI1 < 30) {

            System.out.println("overweight");

        } else {

            System.out.println("obese");
        }   
		
	
	}

}

