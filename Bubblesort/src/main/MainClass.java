package main;

import bubblesort.Bubblesort;

public class MainClass {

	public static void main(String[] args){

		Bubblesort bubblesort = new Bubblesort();

		Integer[] elements = {1,6,7,5};
		System.out.println("Sorting integers...");
		bubblesort.sort(elements);
		System.out.println("   ");

		String[] strings = {"s","d","r","z"};
		System.out.println("Sorting strings...");
		bubblesort.sort(strings);
		System.out.println("   ");

		Double[] numbers = {1.11,3.33,2.22};
		System.out.println("Sorting doubles...");
		bubblesort.sort(numbers);
		System.out.println("   ");

		Character[] characters = {'s','p','q','d'};
		System.out.println("Sorting characters...");
		bubblesort.sort(characters);

	}

}
