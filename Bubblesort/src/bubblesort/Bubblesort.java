package bubblesort;

import utils.Entity;

public class Bubblesort{

	Entity<Object> firstElement = new Entity<Object>();
	Entity<Object> secondElement = new Entity<Object>();


	public <Entity> void sort(Entity[] elements){

		Entity temp = null;

		for(int i = elements.length-1; i >= 1; i--){

			for(int j = 0; j <= i-1; j++){

				firstElement.setValue(elements[j]);
				secondElement.setValue(elements[j+1]);

				if(compare(firstElement, secondElement) == 1){
					temp = elements[j];
					elements[j] = elements[j+1];
					elements[j+1] = temp;
				}
			}
		}
		System.out.println("After sorting: ");
		for(Entity element : elements){
			System.out.println(element);
		}
	}


	private int compare(Entity<Object> firstElement, Entity<Object> secondElement) {

		try{
			if(firstElement.value == secondElement.value){
				return 0;
			} else if((int) firstElement.value > (int) secondElement.value){
				return 1;
			} else if((int) firstElement.value < (int) secondElement.value){
				return -1;
			}
		}  catch (ClassCastException e) {
			if(String.valueOf(firstElement.value).equals(secondElement.value)){
				return 0;
			} else if(String.valueOf(firstElement.value).compareTo(String.valueOf(secondElement.value)) > 0){
				return 1;
			} else if(String.valueOf(firstElement.value).compareTo(String.valueOf(secondElement.value)) < 0){
				return -1;
			}
		}

		return 0;
	}
}
