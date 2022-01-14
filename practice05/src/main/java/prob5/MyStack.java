package prob5;

public class MyStack {
	
	private int number;
	private String[] array;
	
	
	
	public MyStack(int number) {
		this.number = number;
	}

	public void push(String string) {
		if(array==null) {
			array = new String[1];
			array[0] = string;
		}
		else {
			String[] newArray = new String[array.length+1];
			for(int i=0; i<array.length; i++) {
				newArray[i] = array[i];
			}
			newArray[newArray.length-1] = string;
			array=newArray;
		}		
	}

	public boolean isEmpty() {
		if(array.length==0) {
			return true;
		}
		else {
			return false;
		}
		
	}

	public String pop() throws MyStackException {
		if(array.length==0) {
	      throw new MyStackException("stack is empty");
	   }
		else {
			String[] newArray = new String[array.length-1];
			String value = array[array.length-1];
			for(int i=0; i<newArray.length; i++) {
				newArray[i] = array[i];
			}
			array = newArray;
			return value;
		}

		
	}
	
}