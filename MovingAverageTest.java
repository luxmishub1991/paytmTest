import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.LinkedList;

import org.junit.jupiter.api.Test;

class MovingAverageTest {

	MovingAvgImplemenation mv = new MovingAvgImplemenation(2);

	@Test
	public void positiveTestCases() {

		mv.addElement(8.0);
		assertEquals(4.0, mv.getMovingAverage());
		mv.addElement(9.0);
		assertEquals(8.5, mv.getMovingAverage());
		mv.addElement(3.0);
		assertEquals(6.0, mv.getMovingAverage());
	}

	@Test
	public void NegativeTestCases() {
		try {
			assertThrows(InputMismatchException.class, () -> new MovingAvgImplemenation(-1));
		} catch (Throwable e) {
			System.out.println(e.getMessage());
		}
	}

	@Test
	public void movingelementTestCase() {
		MovingAvgImplemenation movingAverageQueueImpl = new MovingAvgImplemenation(6);

		movingAverageQueueImpl.addElement(17.6d);
		movingAverageQueueImpl.addElement(12.5d);
		movingAverageQueueImpl.addElement(2.4d);
		movingAverageQueueImpl.addElement(3.4d);
		movingAverageQueueImpl.addElement(9.8d);
		movingAverageQueueImpl.addElement(12.8d);

		ArrayList<Double> orgListElements = movingAverageQueueImpl.getElements();
		ArrayList<Double> expectedElements = new ArrayList<Double>();
		expectedElements.add(17.6d);
		expectedElements.add(12.5d);
		expectedElements.add(2.4d);
		expectedElements.add(3.4d);
		expectedElements.add(9.8d);
		expectedElements.add(12.8d);

		assertTrue(orgListElements.equals(expectedElements));

		movingAverageQueueImpl.addElement(2d);
		movingAverageQueueImpl.addElement(6d);

		orgListElements = movingAverageQueueImpl.getElements();
		expectedElements = new ArrayList<Double>();
		expectedElements.add(17.6d);
		expectedElements.add(12.5d);
		expectedElements.add(2.4d);
		expectedElements.add(3.4d);
		expectedElements.add(9.8d);
		expectedElements.add(12.8d);
		expectedElements.add(2d);
		expectedElements.add(6d);

		assertTrue(orgListElements.equals(expectedElements));

	}
	
	@Test
	public void getElementTestCase() {
		MovingAvgImplemenation movingAverageQueueImpl = new MovingAvgImplemenation(6);

		movingAverageQueueImpl.addElement(17.6d);
		movingAverageQueueImpl.addElement(12.5d);
		movingAverageQueueImpl.addElement(2.4d);
		movingAverageQueueImpl.addElement(3.4d);
		movingAverageQueueImpl.addElement(9.8d);
		movingAverageQueueImpl.addElement(12.8d);

		Double searchedElement = movingAverageQueueImpl.getElements(3);

		assertTrue(searchedElement.equals(2.4));

	}
	
	

}
