import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.LinkedList;
import java.util.Queue;

/**
 * Class implementing the Moving Average Interface
 *
 * @author Shub Luxmi
 */
public class MovingAvgImplemenation implements MovingAverage {
	private Queue<Double> queue;
	private Double sum = 0.0d;
	private int sizeOflist;
	private ArrayList<Double> fullList;

	/**
	 * Constructor that initializes the Queue
	 *
	 * @param sizeOflist number for which moving average needs to be computed
	 * @exception InputMismatchException if the number is a less than or equal to
	 *                                   zero(0)
	 */
	public MovingAvgImplemenation(int sizeOflist) {

		if (sizeOflist <= 0) {
			throw new InputMismatchException("Average cannot be detemined for values less than or equal to zero");
		}

		this.sizeOflist = sizeOflist;
		queue = new LinkedList<>();
		fullList = new ArrayList<Double>();
	}

	/**
	 * Adds an element in the Queue
	 *
	 * @param element number that needs to be added to the Queue
	 */
	@Override
	public void addElement(Double element) {
		if (queue.size() >= sizeOflist) {
			Double removeElement = queue.poll();
			sum = sum - removeElement;
		}
		queue.add(element);
		fullList.add(element);
		sum = sum + element;

	}

	/**
	 * Calculate the moving average for 'N' numbers (N being the number entered)
	 * 
	 * @return double Computed average
	 */
	@Override
	public double getMovingAverage() {
		double average = sum / sizeOflist;
		return average;
	}

	/**
	 * Get all the elements from the Queue
	 * 
	 * @return ArrayList<Double> returns the list with all elements
	 */
	@Override
	public ArrayList<Double> getElements() {
		return fullList;
	}

	/**
	 * Get single element
	 * 
	 * @param index number for which element is searched
	 * @return Double Returns the searched element
	 * @exception ArrayIndexOutOfBoundsException Number entered is either less than/
	 *                                           equal to zero or greater than size
	 *                                           of list
	 */
	@Override
	public Double getElements(int index) {
		if (index <= 0 || index > fullList.size()) {
			throw new ArrayIndexOutOfBoundsException("Index cannot be greater or less than the size of list");
		}
		return fullList.get(index - 1);
	}
}
