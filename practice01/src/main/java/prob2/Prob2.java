package prob2;

public class Prob2 {
	public static void main(String[] args) {
		
		int n = 1;
		
		for(int i=1; i<=9; i++) {
			for(int j=n; j<n+10; j++) {
				System.out.print(j+"\t");
			}
			n++;
			System.out.println();
		}
	}
}
