package collectionsInJava;

public class OrderedPair<K, V> implements Pair<K, V> {
	private K key;
	private V value;

	public OrderedPair(K key, V value) {
		this.key = key;
		this.value = value;
	}
	@Override
	public K getKey() {
		return key;
	}

	@Override
	public V getValue() {
		return value;
	}
	
	
	public static void main(String[] args) {
		Pair<Integer, String> p1 = new OrderedPair<Integer, String>(1, "Helen");
		Pair<Integer, String> p2 = new OrderedPair<Integer, String>(2, "Meron");
		System.out.println(p1.getKey());
		System.out.println(p2.getKey());
	}
}