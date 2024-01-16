package ch15.sec08;
import java.util.*;
public class ImmutableExample {

	public static void main(String[] args) {
		
		List<String> iL1 = List.of("A","B","C");
		
		Set<String> iS1 = Set.of("A","B","C");
		
		Map<Integer, String> iM1 = Map.of(
				1, "A",
				2, "B",
				3, "C");
		
		List<String> list = new ArrayList<>();
		list.add("A");
		list.add("B");
		list.add("C");
		List<String> iL2  = List.copyOf(list);
		
		Set<String> set = new HashSet<>();
		set.add("A");
		set.add("B");
		set.add("C");
		Set<String> iS2 = Set.copyOf(set);
		
		Map<Integer, String> map = new HashMap<>();
		map.put(1,"A");
		map.put(2,"B");
		map.put(3,"C");
		Map<Integer, String> iM2 = Map.copyOf(map);
		
		String[] arr = {"A","B","C"};
		List<String> iL3 = Arrays.asList(arr);
	}

}
