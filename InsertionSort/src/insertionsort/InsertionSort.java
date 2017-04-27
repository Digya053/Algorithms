package insertionsort;

public class InsertionSort {

	public <T> void sort(T[] elements){
		int j = 0;
		T temp;

		for(int i = 1; i < elements.length; i++){
			j = i;
			while(j > 0 && this.compare(elements[j], elements[j-1]) < 0){
				temp = elements[j];
				elements[j] = elements[j-1];
				elements[j-1] = temp;
				j = j-1;
			}
		}

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
