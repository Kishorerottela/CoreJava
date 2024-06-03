import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

public class TreeMapDemo001 {

	public static void main(String[] args) {

		TreeMap<Integer, String> tm1=new TreeMap<>();
		tm1.put(1, "sachin");
		tm1.put(5, "rohit");
		tm1.put(3, "kohli");
		tm1.put(2, "shami");
		
		System.out.println(tm1);
		
		Comparator<Integer> vc=(v1,v2)->tm1.get(v1).compareTo(tm1.get(v2));
		
		TreeMap<Integer, String> treeMap = new TreeMap<>(vc);
		treeMap.putAll(tm1);
		
		System.out.println(treeMap);
		
	}

}
