package TreadDemo;

/**
 * 储户2个，每个人都去一行存钱，共存三次
 * Created by hjt on 2020/3/10.
 */
class Bank {
    private int sum;
    Object obj = new Object();

    public void add(int num) {
        synchronized (obj) {
            sum = sum + num;
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("sum=" + sum );
        }
    }
}

class Cus implements Runnable {
    private Bank b = new Bank();

    public void run() {
        for (int x = 0; x < 3; x++) {
            b.add(100);
        }
    }
}

public class ThreadBankDemo {
    public static void main(String[] args) {
        Cus c = new Cus();
        Thread t1 = new Thread(c);
        Thread t2 = new Thread(c);
        t1.start();
        t2.start();
    }
}
