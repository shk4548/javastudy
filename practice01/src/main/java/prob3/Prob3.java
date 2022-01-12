package prob3;

import java.util.Scanner;

public class Prob3 {
	
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int even = 0;
		int odd = 0;

		System.out.print("숫자를 입력하세요: ");
		int num = scanner.nextInt();
		
		for(int i=1; i<=num; i++){
			if(i % 2 == 1) {
				even += i;
			
			}else if(i % 2 == 0) {
				odd += i;
			}
		}
		
		if(num % 2 == 1) {
			System.out.println("결과 값 : " + even);
		} else if (num % 2 == 0)
			System.out.println("결과 값 : " + odd);
		scanner.close();
	}
}
