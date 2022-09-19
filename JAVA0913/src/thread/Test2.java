package thread;

public class Test2 {

	public static void main(String[] args) {
		SendMessageThread nt1 = new SendMessageThread("★★A작업★★", 10000);
		FileTransferThread nt2 = new FileTransferThread("○○B작업○○", 10000);
		ReceiveMessageThread nt3 = new ReceiveMessageThread("◆◆C작업◆◆", 10000);
		
//		nt1.run(); // A작업이 100만번 수행이 끝나면
//		nt2.run(); // B작업이 실행되고, B작업이 100만번 수행이 끝나면
//		nt3.run(); // C작업이 실행됨
		nt1.start();
		nt2.start();
		nt3.start();
	}

}

class SendMessageThread extends Thread {
	String str;
	int count;
	public SendMessageThread(String str, int count) {
		this.str = str;
		this.count = count;
		
	}
	@Override
	public void run() {
		for(int i = 0; i < count; i++) {
			System.out.println(i + " : " + str + " 메시지 전송");
		}
	}
	
}


class FileTransferThread extends Thread {
	String str;
	int count;
	public FileTransferThread(String str, int count) {
		this.str = str;
		this.count = count;
		
	}
	@Override
	public void run() {
		for(int i = 0; i < count; i++) {
			System.out.println(i + " : " + str + " 파일 전송");
		}
	}	
}


class ReceiveMessageThread extends Thread {
	String str;
	int count;
	public ReceiveMessageThread(String str, int count) {
		this.str = str;
		this.count = count;
		
	}
	@Override
	public void run() {
		for(int i = 0; i < count; i++) {
			System.out.println(i + " : " + str + " 메시지 수신");
		}
	}
}