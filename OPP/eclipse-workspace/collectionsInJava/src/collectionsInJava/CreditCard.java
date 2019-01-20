package collectionsInJava;

import java.util.HashMap;
import java.util.Map;

public class CreditCard {
	private int number;
	
	public CreditCard(int number) {
		this.number = number;
	}
	
	public boolean equals(Object o) {
		if (o == this) {
			return true;
		}
		if (!(o instanceof CreditCard)) {
			return false;
		}
		
		CreditCard cc = (CreditCard)o;
		return cc.number == number;

	}
	
	public int hashCode() {
		int result = 13;
		result = 31 * result + number;
		return result;
	}

	public static void main(String[] args) {
		Map<CreditCard, String> map = new HashMap<>();
		map.put(new CreditCard(100), "4111111111111111");
		System.out.println(map.get(new CreditCard(100)));

	}

}