package utils;

public class Entity<T> {

	public T value;

	public void setValue(T value){
		this.value = value;
	}

	public Object getValue(){
		return this.value;
	}
}
