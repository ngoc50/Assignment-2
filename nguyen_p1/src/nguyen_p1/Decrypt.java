package nguyen_p1;
import java.util.Scanner;

public class Decrypt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 0;
		int num1 = (n / 10) % 10;
		int num2 = (n / 10) % 10;
		int num3 = (n / 10) % 10;
		int num4 = (n / 10) % 10;
		
		num1 = (num1 + 3) % 10;
		num2 = (num2 + 3) % 10;
		num3 = (num3 + 3) % 10;
		num4 = (num4 + 3) % 10;
		
		System.out.println("Decrypted code: " + num2 + "" + num1 + "" + num4 + "" + num3);
	}

}
