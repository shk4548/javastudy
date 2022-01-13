package prob04;

public class StringUtil {

	public static String concatenate(String[] strArr) {
		
	//	String str = null;
		String str = "";
		
		// 문자열 길이만큼 하나씩 넣어줌
		for(int i =0; i< strArr.length; i++) {
			str += strArr[i];
		}

		return str;
	}
}
