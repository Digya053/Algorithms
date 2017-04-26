package bubblesort;

public class Bubblesort{

	public <T> void sort(T[] elements){

		T temp = null;

		for(int i = elements.length-1; i >= 1; i--){

			for(int j = 0; j <= i-1; j++){

				 T firstElement = elements[j];
				T secondElement = elements[j+1];

				if(compare(firstElement, secondElement) == 1){
					temp = elements[j];
					elements[j] = elements[j+1];
					elements[j+1] = temp;
				}
			}
		}
		System.out.println("After sorting: ");
		for(T element : elements){
			System.out.println(element);
		}
	}


	private <T> int compare(T firstElement, T secondElement) {

		try{
			if(firstElement == secondElement){
				return 0;
			} else if((int) firstElement > (int) secondElement){
				return 1;
			} else if((int) firstElement < (int) secondElement){
				return -1;
			}
		}  catch (ClassCastException e) {
			if(String.valueOf(firstElement).equals(secondElement)){
				return 0;
			} else if(String.valueOf(firstElement).compareTo(String.valueOf(secondElement)) > 0){
				return 1;
			} else if(String.valueOf(firstElement).compareTo(String.valueOf(secondElement)) < 0){
				return -1;
			}
		}

		return 0;
	}
}
