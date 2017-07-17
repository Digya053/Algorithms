package main;

import insertionsort.InsertionSort;

public class MainClass {

	public static void main(String[] args){

		InsertionSort insertionSort = new InsertionSort();

		System.out.println("Sorting integers ...");
		Integer[] integers = {4,13,2,8,19,00};
		insertionSort.sort(integers);
		System.out.println("   ");

		System.out.println("Sorting strings ...");
		String[] strings = {"pqrs", "abc", "mnop", "z"};
		insertionSort.sort(strings);
		System.out.println("  ");

		System.out.println("Sorting capital strings ...");
		String[] capitalStrings = {"PQRS", "ABC", "MNOP", "A"};
		insertionSort.sort(capitalStrings);
		System.out.println("   ");

		System.out.println("Sorting letters ...");
		String[] letters = {"a","m","p"};	
		insertionSort.sort(letters);
		System.out.println("   ");

		System.out.println("Sorting doubles ...");
		Double[] doubles = {1.34, 1.22, 1.11, 3.03};
		insertionSort.sort(doubles);
		System.out.println("   ");

		System.out.println("Sorting characters ...");
		Character[] characters = {'q', 'a', 'm', 'n', 'z'};
		insertionSort.sort(characters);

	}
}
