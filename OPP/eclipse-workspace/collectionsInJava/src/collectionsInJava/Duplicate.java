package collectionsInJava;

public class Duplicate<T extends Comparable<? super T>> implements Comparable<Duplicate<T>> {
	private final T value1;
	
	public Duplicate(T value) {
		this.value1 = value; 
		
	}
	
	public T getValue() {
		return value1;
	}
	@Override
	public int compareTo(Duplicate<T> o) {
		return value1.compareTo(o.value1);
	}
	
}