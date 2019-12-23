import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Moving Average
 *
 */
public class MovingAvgMain {

	/**
	 * Main class that receives inputs and displays moving average
	 * @param args 
	 * @author Shub Luxmi
	 */

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Double> elements;
		System.out.println("Please enter the count for which average needs to be computed?");
		int numberAverage = sc.nextInt();
		try {
			MovingAverage second = new MovingAvgImplemenation(numberAverage);
			System.out.println("How many number are you going to enter?");
			int size = sc.nextInt();
			System.out.println("Please enter " + size + " numbers");
			for (int i = 0; i < size; i++) {

				double enteredNumber = sc.nextDouble();
				second.addElement(enteredNumber);
				elements = second.getElements();
				System.out.println("Elements in a list: " + elements);
				System.out.println("Moving Average: " + second.getMovingAverage());
				
			}
			System.out.println("");
			System.out.println("Enter which element (e.g 2nd) you would like to search?");
			int index = sc.nextInt();
			System.out.println("The elements is :" + second.getElements(index));
		} catch (InputMismatchException e) {
			System.out.println(e.getMessage());
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(e.getMessage());
		} finally {
			sc.close();
		}

	}
}
