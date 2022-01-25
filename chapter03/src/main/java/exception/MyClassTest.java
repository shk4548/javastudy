package exception;

import java.io.IOException;

public class MyClassTest {

	public static void main(String[] args)  {
		try {
			MyClass mc = new MyClass();
			mc.danger();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (MyException e) {
			e.printStackTrace();
		}

	}
}
