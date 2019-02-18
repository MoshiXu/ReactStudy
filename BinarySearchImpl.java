package com.in28minutes.spring.basics.springin5steps;

public class BinarySearchImpl {

	
	private SortAlgorithm sortAlgorithm;
	
	public BinarySearchImpl(SortAlgorithm sortAlgorithm) {
		super();
		this.sortAlgorithm = sortAlgorithm;
	}
	
	public int binarySearch(int[]numbers,int numberToSearchFor) {
		
		//BubbleSortAlgorithm bubbleSortAlgorithm=new BubbleSortAlgorithm();
		//int[] sortedNumbers=sortAlgorithm.sort(numbers);
		String sortedNumber=sortAlgorithm.sort(numbers);
		//int[] sortedNumbers=bubbleSortAlgorithm.sort(numbers);
		System.out.print(sortAlgorithm);
		
		//search the array
		
		return 3;
		
		//quick sort
	}
}
