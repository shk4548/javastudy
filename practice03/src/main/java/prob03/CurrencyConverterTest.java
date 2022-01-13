package prob03;

public class CurrencyConverterTest {

	public static void main(String[] args) {
		//  환율을 세팅 합니다.
		CurrencyConverter.setRate(1197.0);
		
		double dollar = CurrencyConverter.toDollar( 1000000. );
		String result = String.format("%.2f", dollar);

		System.out.println( "백만원은 " + result + "달러 입니다" );
		
		double krw = CurrencyConverter.toKRW( 100. );
		String result2 = String.format("%.0f", krw);
		
		System.out.println( "백달러는 " + result2 + "원 입니다" );
	}

}
