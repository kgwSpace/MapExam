import java.util.*;

class KeyComparator implements Comparator<Integer>
{
	// 오름차순으로 정렬은 그대로, 단 90 이상은 맨 앞으로 위치.
	@Override
	public int compare(Integer n1, Integer n2) {
		// TODO Auto-generated method stub
		if((n1>=90)&&(n2>=90))
		{
			return n1.intValue() - n2.intValue();
		}
		else if(n1>=90)
		{
			return -1;
		}
		else if(n2>=90)
		{
			return 1;
		}
		else
		{
			return n1.intValue() - n2.intValue();
		}
	}

	
	
}

public class ExamMap3 {

	public static void main(String[] args) {
		//TreeMap 기본값 : 오름차순
		TreeMap<Integer, String> map = new TreeMap<>(new KeyComparator());
		
		// map 안에 데이터를 입력
		// 번호-이름 10개. 그중에 3개는 번호가 99
		map.put(23, "임형민");
		map.put(12, "손영호");
		map.put(8,  "전광식");
		map.put(34,  "이순신");
		map.put(98,  "홍길동");
		map.put(63,  "연개소문");
		map.put(96,  "임꺽정");
		map.put(97,  "흥부");
		map.put(25,  "놀부");
		map.put(44,  "김건우");
		map.put(44,  "김철수");
		
		
		
		//kset(key) 값을 출력
		//출력된 값을 이용해서 value 출력
		Set<Integer> kset = map.keySet();
		
		
		
		// Iterator를 이용하여 map을 순회하는 방식
		Iterator<Integer> iter = kset.iterator();
		int key = 0;
		
		while(iter.hasNext())
		{
			key = iter.next();
			System.out.println(key+" : "+map.get(key));
		}
		
	}

}
