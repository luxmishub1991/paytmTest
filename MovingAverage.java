import java.util.ArrayList;

/**
 * Moving Average Interface
 *
 * @author Shub Luxmi
 */
public interface MovingAverage {

	/**
	 * Adds an element
	 *
	 * @param element Number that need to be added 
	 */ 
	void addElement(Double element);

	/**
	 * Calculate Moving Average
	 *
	 * @return Double Computed average
	 */ 
	double getMovingAverage();

	/**
	 * Get all elements
	 *
	 * @return ArrayList<Double> List of elements
	 */ 
	ArrayList<Double> getElements();
	
	/**
	 * Find element at an position
	 *
	 * @return Double Get Element at the index
	 */ 
	Double getElements(int index);

}
