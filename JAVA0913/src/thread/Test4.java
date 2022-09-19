package thread;

public class Test4 {

	public static void main(String[] args) {

		new Thread(new Runnable() {
			
			@Override
			public void run() {
				for(int i=0; i<100; i++) {
					System.out.println(i + " : 메시지 송신");
				}
			}
		}).start();
		new Thread(new Runnable() {
			
			@Override
			public void run() {
				for(int i=0; i<100; i++) {
					System.out.println(i + " : 메시지 수신");
				}
			}
		}).start();
		new Thread(new Runnable() {
			
			@Override
			public void run() {
				for(int i=0; i<100; i++) {
					System.out.println(i + " : 파일 전송");
				}
			}
		}).start();
		
		
	}

}
