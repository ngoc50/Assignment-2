package nguyen_p1;
import java.util.Scanner;

public class Encrypt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int encryptVal;
		int n = 0;
		int num1 = (n / 100) % 10;
		int num2 = (n / 1000) % 10;
		int num3 = (n / 1) % 10;
		int num4 = (n / 10) % 10;
		
		num1 = (num1 + 7) % 10;
		num2 = (num2 + 7) % 10;
		num3 = (num3 + 7) % 10;
		num4 = (num4 + 7) % 10;
		
		encryptVal = ((1000 * num2) + (100 * num1) + (10 * num4) + (1 * num3));
		System.out.println("Encrypted number: " + encryptVal);
	}

}
