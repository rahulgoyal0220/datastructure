package LeetCode;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class ProducerConsumer {

    public static void main(String[] args) {
        BlockingQueue<BMessage> queue = new ArrayBlockingQueue<>(10);
        Producer producer = new Producer(queue);
        Consumer consumer = new Consumer(queue);
        //starting producer to produce messages in queue
        new Thread(producer).start();
        //starting consumer to consume messages from queue
        new Thread(consumer).start();
        System.out.println("Producer and Consumer has been started");
    }
}


class Consumer implements Runnable {

    private BlockingQueue<BMessage> queue;

    public Consumer(BlockingQueue<BMessage> queue) {
        this.queue = queue;
    }

    @Override
    public void run() {
        try {
            BMessage message;
            while ((message = queue.take()).getMsg() != "exit") {
                Thread.sleep(10);
                System.out.println("Consumed " + message.getMsg());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}


class Producer implements Runnable {

    private BlockingQueue<BMessage> queue;

    public Producer(BlockingQueue<BMessage> queue) {
        this.queue = queue;
    }

    @Override
    public void run() {

        for (int i = 0; i < 100; i++) {
            BMessage message = new BMessage("Test " + i);
            try {
                Thread.sleep(i);
                queue.put(message);
                System.out.println("Produced " + message.getMsg());
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        //adding exit message
        BMessage msg = new BMessage("exit");
        try {
            queue.put(msg);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}


class BMessage {

    private String msg;

    public BMessage(String msg) {
        this.msg = msg;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
