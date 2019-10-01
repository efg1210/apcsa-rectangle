
import java.util.Scanner;

public class Rectangle {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		System.out.print("Enter a length: ");
		double rectLength = in.nextDouble();
		in.nextLine();
		System.out.print("Enter a width: ");
		double rectWidth = in.nextDouble();
		in.nextLine();

		double rectArea = rectLength * rectWidth;

		System.out.print("The area of a ");
		System.out.printf("%.1f", rectLength);
		System.out.print("-by-");
		System.out.printf("%.1f", rectWidth);
		System.out.print(" rectangle is ");
		System.out.printf("%.1f", rectArea);
		System.out.print(".");

		in.close();
	}

}
