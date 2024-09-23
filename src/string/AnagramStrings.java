package string;

import java.util.HashMap;
import java.util.Map;

public class AnagramStrings {
	
	public static void main(String[] args) throws Exception {
		String s1 = "aabbcc";
		String s2 = "cbcaab";
		
		boolean isAnagram = checkAnagram(s1, s2);
		
		if (isAnagram) {
			System.out.println("Given strings are Anagram!");
		} 
		else {
			System.out.println("Given strings are not Anagram!");
		}
	}

	
	private static boolean checkAnagram(String s1, String s2) throws Exception {
		if (s1.isEmpty() || s2.isEmpty()) {
			throw new Exception("Either s1 or s2 is an empty string!");
		}
		
		char[] a = s1.toCharArray().length>s2.length()?s1.toCharArray():s2.toCharArray();
		char[] b = s1.toCharArray().length<s2.length()?s1.toCharArray():s2.toCharArray();
		
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		
		for (char c : a) {
			if (map.containsKey(c)) {
				map.put(c, map.get(c)+1);
			} 
			else {
				map.put(c, 1);
			}
		}

		for (char d : b) {
			
			if (map.containsKey(d)) {
				map.put(d, map.get(d)-1);
				if (map.get(d)==0) {
					map.remove(d);
				}
			}
		}
		
		return map.isEmpty();
	}

}
