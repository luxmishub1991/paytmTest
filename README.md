# PaytmLabs SDE Challenge

## Coding Question

Write an interface for a data structure that can provide the moving average of the last N elements added, add elements to the structure and get access to the elements. Provide an efficient implementation of the interface for the data structure.

### Minimum Requirements

1. Provide a separate interface (IE `interface`/`trait`) with documentation for the data structure
2. Provide an implementation for the interface
3. Provide any additional explanation about the interface and implementation in a README file.

Interface MovingAverage is implemented based on queue as Queue follows First-In-First-Out methodology. Here we need to find moving average of last N elements so older elements need to pop out.
Complexities will adding and deleting element is O(N).

Following algorthim has been used:


if (queue.size() >= sizeOflist) {
removeElement = queue.poll();
}
sum = sum - removeElement;
queue.add(element);
sum = sum + element;
double average = sum / numberOfElements;

	

MovingAverage has three abstract methods :
1.addElement(Double element) 
2.getMovingAverage
3.ArrayList<Double> getElements() 
4)Double getElements(int index)

1.addElement(Double element) method used to enter element into queue and pops out element as the queue get full.Also,calculates sum of elements in thhe queue.
2.getMovingAverage gets average of last N elements in the queue.
3.ArrayList<Double> getElements() And Double getElements(int index) are two co-variant overloaded methods. getElements without argument helps to get complete list of elements and getElements with index helps to get element
  at particular position.

## Design Question

Design A Google Analytic like Backend System.
We need to provide Google Analytic like services to our customers. Please provide a high level solution design for the backend system. Feel free to choose any open source tools as you want.

### Requirements

1. Handle large write volume: Billions of write events per day.
2. Handle large read/query volume: Millions of merchants wish to gain insight into their business. Read/Query patterns are time-series related metrics.
3. Provide metrics to customers with at most one hour delay.
4. Run with minimum downtime.
5. Have the ability to reprocess historical data in case of bugs in the processing logic.
