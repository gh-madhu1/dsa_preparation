public class DetectCapitalUse{
	public static void main(String... args){
  	System.out.println(detectCapitalUse("mL")); // expected false
		System.out.println(detectCapitalUse("ggg")); // expected true
		System.out.println(detectCapitalUse("USA")); // expected true
		System.out.println(detectCapitalUse("Google")); // expected false
  }
public static boolean detectCapitalUse(String word) {

		final String All_UPPER_CASE = "All_UPPER_CASE";
		final String All_LOWER_CASE = "All_LOWER_CASE";
		char[] chars = word.toCharArray();
		String flag = "";
		if (chars.length >= 2) {
			if (chars[0] < 91 && chars[0] > 64) {
				if (chars[1] < 91 && chars[1] > 64) {
					flag = All_UPPER_CASE;
				} else {
					flag = All_LOWER_CASE;
				}
			} else {
				flag = All_LOWER_CASE;
			}

			for (int i = 1; i < chars.length; i++) {
				if (flag.equals(All_UPPER_CASE)) {
					if (!(chars[i] < 91 && chars[i] > 64)) {
						return Boolean.FALSE;
					}
				} else {
					if (!(chars[i] < 123 && chars[i] > 96)) {
						return Boolean.FALSE;
					}
				}
			}
		} else {

			if (chars.length == 1) {
				return Boolean.TRUE;
			}
		}

		return Boolean.TRUE;
	}
}
