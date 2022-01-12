package prob5;

public class Prob5 {

	public static void main(String[] args) {
		int i, a, b;
		for (i = 1; i < 100; i++) {
			a = i / 10;
			b = i % 10;
			if (a > 0 && b > 0 && a % 3 == 0 && b % 3 == 0)
				System.out.println(i + " 짝짝");
			else if (a > 0 && a % 3 == 0)
				System.out.println(i + " 짝");
			else if (b > 0 && b % 3 == 0)
				System.out.println(i + " 짝");

		}
	}
}
