package thread;

public class Test3 {

	public static void main(String[] args) {
		GugudanRunable g = new GugudanRunable(2,100);
		
		new Thread(new GugudanRunable(2,100)).start();
	}

}
class GugudanRunable implements Runnable {
	int dan;
	int count;
	public GugudanRunable(int dan, int count) {
		this.dan = dan;
		this.count = count;
	}
	@Override
	public void run() {
		for(int j=0; j< count; j++) {
		for(int i=1; i<10; i++) {
			System.out.println(i + " x " + dan + " = " + i*dan);
		}
	}
	}
}