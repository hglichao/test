

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class WordCountComparator implements Comparator<String> {

	private Map<String, Long> base_map;

	public WordCountComparator(Map<String, Long> base_map) {
		this.base_map = base_map;
	}

	public int compare(String arg0, String arg1) {
		long a = base_map.get(arg0)==null?0:base_map.get(arg0);
		long b = base_map.get(arg1)==null?0:base_map.get(arg1);

		if (a<b) {
			return 1;
		} else if (a== b) {
			return 0;
		} else {
			return -1;
		}
	}
	
	public static void main(String[] args){
		HashMap m = new HashMap();
		m.put("a", 1l);
		m.put("b", 2l);
		m.put("c", 2l);
		wordCount(m);
	}
	
	
	private static void wordCount(Map<String, Long> wordCountMap) {
		System.out.println(wordCountMap);
		WordCountComparator comparator = new WordCountComparator(wordCountMap);
		TreeMap<String, Long> sorted_map = new TreeMap<String, Long>(comparator);
		sorted_map.putAll(wordCountMap);
		System.out.println(sorted_map);
	}
}
