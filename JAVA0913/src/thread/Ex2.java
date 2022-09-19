package thread;

public class Ex2 {

	public static void main(String[] args) {
		MyThread nt1 = new MyThread("★★A작업★★", 1000000);
		MyThread nt2 = new MyThread("○○B작업○○", 1000000);
		MyThread nt3 = new MyThread("◆◆C작업◆◆", 1000000);
		
//		nt1.run(); // A작업이 100만번 수행이 끝나면
//		nt2.run(); // B작업이 실행되고, B작업이 100만번 수행이 끝나면
//		nt3.run(); // C작업이 실행됨
		nt1.start();
		nt2.start();
		nt3.start();
	}

}
class MyThread extends Thread {
	String str;
	int count;
	public MyThread(String str, int count) {
		this.str = str;
		this.count = count;
	}
	@Override
	public void run() {
		for(int i = 0; i < count; i++) {
			System.out.println(i + " : " + str);
		}
	}
	
}