package main;

import bubblesort.Bubblesort;

public class MainClass {

	public static void main(String[] args){

		Bubblesort bubblesort = new Bubblesort();

		Integer[] integers = {1,5,8,9,4,7};
		System.out.println("Sorting integers...");
		bubblesort.sort(integers);
		System.out.println("   ");

		String[] strings = {"s","d","r","z"};
		System.out.println("Sorting strings...");
		bubblesort.sort(strings);
		System.out.println("   ");

		Double[] doubles = {1.11,1.01,3.33,2.22};
		System.out.println("Sorting doubles...");
		bubblesort.sort(doubles);
		System.out.println("   ");

		Character[] characters = {'s','p','q','d'};
		System.out.println("Sorting characters...");
		bubblesort.sort(characters);

	}

}
