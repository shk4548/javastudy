package prob05;

import java.util.Random;
import java.util.Scanner;

public class Prob05 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner( System.in );

		// 정답 램덤하게 만들기
		Random random = new Random();
		int correctNumber = random.nextInt( 100 ) + 1;
		System.out.println("수를 결정하였습니다 맞추어보세요 1 - 100");
		int count= 1;
			
			while(true) {
			System.out.print(count + " >>");

			int num = scanner.nextInt();
			if(num>correctNumber) {
				System.out.println("더 낮게");
			}else if(num<correctNumber) {
				System.out.println("더 높게");
			}else {
				System.out.println("맞았습니다");
				System.out.print( "다시 하겠습니까(y/n)>>" );
				String answer = scanner.next();
				if( "y".equals( answer ) == true ) {
					count =1;
					correctNumber = random.nextInt( 100 ) + 1;
					System.out.println("수를 결정하였습니다 맞추어보세요 1 - 100");
				}
				else {
					break;
				}
			}count ++;
			
		}
		
		scanner.close();
	}

}