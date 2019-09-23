package nguyen_p1;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scnr = new Scanner(System.in);
		int x;
		System.out.println("Enter a four-digit number: ");
		x = scnr.nextInt();
		Encrypt.main(args);
		Decrypt.main(args);
		
	}

}
