package string;

import java.util.HashMap;
import java.util.Map;

public class FrequencyCountUsingMap {
	
	public static void freqCount(String str) {
		
		str = str.replace(" ","");
		Map freqCount = new HashMap<Character,Integer>();
		
		for (char ch:str.toCharArray()) {
			if(freqCount.containsKey(ch)) {
				freqCount.put(ch, (Integer)freqCount.get(ch) + 1);
			}else {
				freqCount.put(ch, 1);
			}
		}
		
		System.out.println(freqCount);

	}
	
	public static void main(String[] args) {
		
		freqCount("sambhusahoo  "); 

	}

}
