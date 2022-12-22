import java.util.*;

public class ExamMap {

	public static void main(String[] args) {
		HashMap<Integer, String> map = new HashMap<>();
		
		map.put(23, "임형민");
		map.put(12, "손영호");
		map.put(8,  "전광식");
		
		
		System.out.println(map.get(8));
		System.out.println(map.get(12));
		System.out.println(map.get(23));
		
		map.remove(12);
		
		System.out.println(map.get(8));
		System.out.println(map.get(12));
		System.out.println(map.get(23));
	}

}
