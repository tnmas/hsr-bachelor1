package collectionsInJava;

//import java.util.HashMap;
import java.util.HashSet;
//import java.util.Map;

public class Test {

	public static void main(String[] args) {
//		Map<Integer, Student> map = new HashMap<>();
//		Student s1 = new Student("Titi", "Farmer");
//		
//		map.put(101, s1);
//		Student st = map.get(101);
//		System.out.println(st);
//		for (Student x : map.values()) {
//			System.out.println(x);
//		}
		
		var set = new HashSet<Integer>();
		set.add(7);
		set.add(100);
		set.add(3);
		set.add(60);
		set.add(17);
		for (Integer integer : set) {
			System.out.println(integer.hashCode());
		}
		
		System.out.println(set.contains(1000));
	}

}