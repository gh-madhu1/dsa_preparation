package my.collections;

public class FindTarget {

	public static void main(String[] args) {

		System.out.println(myAtoi("  +  413"));

		/*
		 * // long start = System.nanoTime();
		 * System.out.println(longestPalindrome("mada")); long start =
		 * System.nanoTime();
		 * 
		 * 
		 * System.out.println(longestPalindrome(
		 * "ukxidnpsdfwieixhjnannbmtppviyppjgbsludrzdleeiydzawnfmiiztsjqqqnthwinsqnrhfjxtklvbozkaeetmblqbxbugxycrlzizthtuwxlmgfjokhqjyukrftvfwikxlptydybmmzdhworzlaeztwsjyqnshggxdsjrzazphugckgykzhqkdrleaueuajjdpgagwtueoyybzanrvrgevolwssvqimgzpkxehnunycmlnetfaflhusauopyizbcpntywntadciopanyjoamoyexaxulzrktneytynmheigspgyhkelxgwplizyszcwdixzgxzgxiawstbnpjezxinyowmqsysazgwxpthloegxvezsxcvorzquzdtfcvckjpewowazuaynfpxsxrihsfswrmuvluwbdazmcealapulnahgdxxycizeqelesvshkgpavihywwlhdfopmmbwegibxhluantulnccqieyrbjjqtlgkpfezpxmlwpyohdyftzgbeoioquxpnrwrgzlhtlgyfwxtqcgkzcuuwagmlvgiwrhnredtulxudrmepbunyamssrfwyvgabbcfzzjayccvvwxzbfgeglqmuogqmhkjebehtwnmxotjwjszvrvpfpafwomlyqsgnysydfdlbbltlwugtapwgfnsiqxcnmdlrxoodkhaaaiioqglgeyuxqefdxbqbgbltrxcnihfwnzevvtkkvtejtecqyhqwjnnwfrzptzhdnmvsjnnsnixovnotugpzuymkjplctzqbfkdbeinvtgdpcbvzrmxdqthgorpaimpsaenmnyuyoqjqqrtcwiejutafyqmfauufwripmpcoknzyphratopyuadgsfrsrqkfwkdlvuzyepsiolpxkbijqw"
		 * ));
		 * 
		 * long end = System.nanoTime();
		 * 
		 * System.out.println("ms: " + (end - start) / 1000000);
		 */
	}

	public static String longestPalindrome(String s) {

		int n = s.length();
		int b_len = 0;
		String substring = "";

		for (int l = 0; l < n; l++) {
			for (int r = 0; l - r >= 0 && l + r < n; r++) {
				System.out.println("l - r: " + (l - r));
				System.out.println("l + r: " + (l + r));
				if (s.charAt(l - r) != s.charAt(l + r)) {
					break;
				}
				int len = 2 * r + 1;
				if (len > b_len) {
					b_len = len;
					substring = s.substring(l - r, len);
				}
			}
		}

		for (int l = 0; l < n - 1; l++) {
			for (int r = 1; l - r + 1 >= 0 && l + r < n; r++) {
				if (s.charAt(l - r + 1) != s.charAt(l + r)) {
					break;
				}
				int len = 2 * r;
				if (len > b_len) {
					b_len = len;
					substring = s.substring(l - r + 1, len);
				}
			}
		}
		return substring;
	}

	public static int myAtoi(String str) {

		StringBuffer sb = new StringBuffer();

		if (str.trim().equals("-") || str.trim().equals("+")) {
			return 0;
		}

		if (!str.trim().matches("[-|+]*[0-9]*[.|-|+]*[\\s|0-9a-zA-Z]*[-|+|\\\\s|0-9a-zA-Z]*")) {
			return 0;
		}

		if (str.startsWith("+-") || str.startsWith("-+")) {
			return 0;
		}

		for (char c : str.trim().toCharArray()) {

			if (c >= 48 && c <= 57 || c == 45 || c == 46 || c == 43) {

				if (sb.toString().length() > 1 && (c == 45 || c == 43)) {
					break;
				}
				sb.append(c != 43? c : '\u0000');
			} else
				break;
		}
		double i = 0;

		if (sb.toString().trim().equals("") || sb.toString().equals("-")) {
			return 0;
		}
		if (sb.toString().length() > 1 && !sb.toString().equals("-") || !sb.toString().equals("+")) {
			i = Double.valueOf(sb.toString());
			if (i > Integer.MAX_VALUE) {
				return Integer.MAX_VALUE;
			}
			if (i < Integer.MIN_VALUE) {
				return Integer.MIN_VALUE;
			}
		} else
			return 0;
		return (int) i;
	}
}
