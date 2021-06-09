public class LongestString {

	public static void main(String... args) {
		System.out.println(findLongestString(args));
		System.out.println(lengthOfLongestSubstring(findLongestString(args)));

	}

	private static String findLongestString(String... strList) {
		int maxLength = 0;
		String longestStr = "";
		for (String str : strList) {
			if (maxLength < str.length()) {
				maxLength = str.length();
				longestStr = str;
			}
		}
		return longestStr;
	}

	public static int lengthOfLongestSubstring(String s) {
		int[] index = new int[256];
		int last = 0, max = 0;
		String subString = "";

		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			if (index[ch] > last)
				last = index[ch];
			max = Math.max(max, i - last + 1);
			index[ch] = i + 1;

			if (subString.contains(String.valueOf(ch)) == false) {
				subString = subString + ch;
			} else {
				subString = String.valueOf(ch);
			}
		}
		return max;

	}
}
