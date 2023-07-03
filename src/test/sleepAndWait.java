package test;

public class sleepAndWait {

	public static void main(String[] args) {
		Thread sleep = new Thread(new SleepThread());
		Thread wait = new Thread(new WaitThread());
		sleep.start();
		wait.start();
	}

}

class SleepThread implements Runnable{
	public void run() {
        System.out.println("SleepThread started");
        try {
            // Sleep for 3 seconds
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("SleepThread completed");
    }
}

class WaitThread implements Runnable{
	public void run() {
        synchronized (this) {
            System.out.println("WaitThread started");
            try {
                // Wait for 3 seconds
                wait(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("WaitThread completed");
        }
    }
}