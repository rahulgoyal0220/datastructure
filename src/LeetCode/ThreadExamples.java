package LeetCode;

public class ThreadExamples {

    public static void main(String[] args) {
        Message message = new Message("process it");
        Waiter waiter = new Waiter(message);

        new Thread(waiter, "waiter").start();

        Waiter waiter1 = new Waiter(message);

        new Thread(waiter1, "waiter1").start();

        Notifier notifier = new Notifier(message);
        new Thread(notifier, "notifier").start();

        System.out.println("All thread are started");

        ThreadLocal.<String>withInitial(() -> {
            return "hell";
        });
    }
}


class Notifier implements Runnable {

    private Message message;

    public Notifier(Message message) {
        this.message = message;
    }

    @Override
    public void run() {
        String name = Thread.currentThread().getName();
        System.out.println(name + " started");
        try {
            Thread.sleep(1000);
            synchronized (message) {
                message.setMs(name + " notifier work done");
                message.notifyAll();
            }
        } catch (Exception e) {

        }
    }
}

class Waiter implements Runnable {

    private Message message;

    public Waiter(Message message) {
        this.message = message;
    }

    @Override
    public void run() {

        String name = Thread.currentThread().getName();
        synchronized (message) {
            try {
                System.out.println(name + " waiting to get notified at time :" + System.currentTimeMillis());
                message.wait();
            } catch (Exception e) {
                e.printStackTrace();
            }
            System.out.println(name + " waiter thread got notified at time:" + System.currentTimeMillis());
            System.out.println(name + " processed: " + message.getMs());
        }
    }
}

class Message {

    private String ms;

    public Message(String ms) {
        this.ms = ms;
    }

    public String getMs() {
        return ms;
    }

    public void setMs(String ms) {
        this.ms = ms;
    }
}




