package math;

public class Pattern {

	public static void main(String[] args) {
		/* Read this numbers, find the pattern then implement the logic from this pattern.which will give you this output.
		 * 100,99,98,97,96,95,94,93,92,91,90,88,86,84,82,80,78,76,74,72,70,67,64,61,58,55,52,49,46,43,40,36,32............
		 *
		 * Use any databases[MongoDB, Oracle, MySql] to store data and retrieve data.
		 *
		 */

		int pattern = 0;
		for (int i = 100; i >= 0; i--) {
			pattern++;
			if (pattern <= 10) {
				System.out.print(i + " ");
			}
			else {
				for( i = 90; i >= 0; i-= 2) {
					if (pattern > 10 && pattern <= 20) {
						System.out.print(i + " ");
						pattern++;
					}
					else {
						for (i = 70; i >= 0; i -= 3) {
							if (pattern > 20 && pattern <= 30) {
								System.out.print(i + " ");
								pattern++;
							}
							else {
								for (i = 40; i >= 0; i -= 4) {
									if (pattern > 30 && pattern <= 40) {
										System.out.print(i + " ");
										pattern++;
									}
								}
							}
						}
					}
				}
			}
		}
	}
}
