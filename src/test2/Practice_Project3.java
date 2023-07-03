package test2;

public class Practice_Project3 {
    public static void main(String[] args) {
        SharedResource sharedResource = new SharedResource();

        Thread thread1 = new Thread(new WorkerThread(sharedResource));
        Thread thread2 = new Thread(new WorkerThread(sharedResource));

        thread1.start();
        thread2.start();
    }
}

class SharedResource {
    private int count = 0;

    public 	synchronized  void increment() {
        count++;
        System.out.println("Incremented count: " + count);
    }
}

class WorkerThread implements Runnable {
    private SharedResource sharedResource;

    public WorkerThread(SharedResource sharedResource) {
        this.sharedResource = sharedResource;
    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            sharedResource.increment();
            try {
                Thread.sleep(100); // Introduce a small delay to simulate some work
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
