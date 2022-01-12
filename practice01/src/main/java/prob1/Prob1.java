package prob1;

import java.util.Scanner;

public class Prob1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("수를 입력하세요");
		int num = scanner.nextInt();

		if (num % 3==0) {
			System.out.println("3의배수");
		} else {
			System.out.println("3의배수가 아닙니다");
		}
		
		scanner.close();
	}
}
