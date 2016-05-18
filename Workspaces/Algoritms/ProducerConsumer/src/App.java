import java.util.Random;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;


public class App {

	private static BlockingQueue<Integer> queue = new ArrayBlockingQueue<Integer>(10);
	
	public static void main(String[] args) throws InterruptedException {

		Thread t1 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				try {
					producer();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});
		
		Thread t2 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				try {
					consumer();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});
		
		t1.start();
		t2.start();
		
		t1.join();
		t2.join();

	}

	private static void producer() throws InterruptedException{
		
		Random random = new Random();
		
		while(true){
		
			int value = random.nextInt(10);
			queue.put(value);
			System.out.println("Value Added : "+value);
		}
	}
	
	private static void consumer() throws InterruptedException{
		
		Thread.sleep(100);
		Random random = new Random();
		while(true){
			if(random.nextBoolean()){
				int value = queue.take();
				System.out.println("Value consumed : "+value+" Queue Length : "+queue.size());
			}
		}
	}
	
}
