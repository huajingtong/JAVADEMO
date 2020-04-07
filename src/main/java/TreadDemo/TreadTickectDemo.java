package TreadDemo;

import IO.Test;

/**
 * Created by hjt on 2020/3/10.
 */
class Ticket implements Runnable//extends Thread
{
    private int num = 100;
//    Object obj = new Object();
    boolean flag = true;

    public void run() {

        if (flag) {
            while (true) {
                synchronized (this) {
                    if (num > 0) {
                        try {
                            Thread.sleep(10);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        System.out.println(Thread.currentThread().getName() + "...sale...." + num--);
                    }
                }
            }
        } else {
            while (true) {
                this.show();
            }
        }
    }



    public synchronized void show() {
        if (num > 0) {
//                System.out.println(num--);
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + "...sale...." + num--);
        }
    }
}

public class TreadTickectDemo {
    public static void main(String[] args) {
        Ticket t = new Ticket();
        System.out.println("t:"+t);
        Thread t1 = new Thread(t);
        Thread t2 = new Thread(t);
        Thread t3 = new Thread(t);
        Thread t4 = new Thread(t);
        t1.start();
        t2.start();
        t3.start();
        t4.start();


//        Ticket t1=new Ticket();
//        Ticket t2=new Ticket();
//        Ticket t3=new Ticket();
//        Ticket t4=new Ticket();
//
//        t1.start();
//        t2.start();
//        t3.start();
//        t4.start();
    }
}
