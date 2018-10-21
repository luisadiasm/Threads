import java.lang.Thread;

public class ThreadsSO {
	public static void main(String[] args) {
		new Thread(T1).start();
		new Thread(T2).start();
	}

	public static Runnable T1 = new Runnable() {

		@Override
		public void run() {
			for (int x = 1; x < 101; x++) {
				System.out.println("numero: " + x);
				try {
					Thread.sleep(1 * 100);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	};

	public static Runnable T2 = new Runnable() {
		@Override
		public void run() {
			for (int y = 0; y < 11; y++) {
				int aux = y * 10;
				System.out.println("contagem total: " + aux);
				try {
					Thread.sleep(1 * 1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	};
}
