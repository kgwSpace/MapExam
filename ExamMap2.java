import java.util.*;

public class ExamMap2 {

	public static void main(String[] args) {
		HashMap<Integer, String> map = new HashMap<>();
		
		map.put(23, "임형민");
		map.put(12, "손영호");
		map.put(8,  "전광식");
		
		
		//kset(key) 값을 출력
		//출력된 값을 이용해서 value 출력
		Set<Integer> kset = map.keySet();
		
		
		//key set을 이용하여 map을 순회하는 방식
		for(Integer i : kset)
		{
			System.out.println(i+map.get(i));
		}
	
		// Iterator를 이용하여 map을 순회하는 방식
//		Iterator<Integer> iter = kset.iterator();
//		int key = 0;
//		
//		while(iter.hasNext())
//		{
//			key = iter.next();
//			System.out.println(key);
//			System.out.println(map.get(key));
//		}
		
	}

}
