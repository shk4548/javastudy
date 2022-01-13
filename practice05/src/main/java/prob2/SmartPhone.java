package prob2;

public class SmartPhone extends MusicPhone {
	public void execute (String function) {
		if(function.equals("음악")) {
			music();
			return;
		}else if(function.equals("앱")) {
			app();
			return;
		}
		super.execute(function);
	}
	
	private void music() {
		System.out.println("다운로두해서 음악 재생");
	}
	private void app() {
		System.out.println("앱실행");
	}
}

