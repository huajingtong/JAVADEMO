/**
 * 网上的题
 * 写一个程序模拟三个线程，分别输出ABC java
 * Created by hjt on 2020/3/7.
 */
class Print {
    private int flag = 1;
    private int count = 0;

    public int getCount() {
        return count;
    }

    public synchronized void printA() {
        while (flag != 1) { //不为1，所以打印A的线程等待
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.print(Thread.currentThread().getName());
        count++;
        flag = 2;
        notifyAll();
    }
    public synchronized void printB() {
        while (flag != 2) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.print(Thread.currentThread().getName());
        flag = 3;
        count++;
        notifyAll();
    }
    public synchronized void printC() {
        while (flag != 3) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.print(Thread.currentThread().getName());
        flag = 1;
        count++;
        notifyAll();
    }
}

class MyThread implements Runnable {
    private Print print;

    public MyThread(Print print) {
        this.print = print;
    }


    public void run() {
        while (print.getCount() >=0) {
            if (Thread.currentThread().getName().equals("A")) {
                print.printA();
            } else if (Thread.currentThread().getName().equals("B")) {
                print.printB();
            } else if (Thread.currentThread().getName().equals("C")) {
                print.printC();
            }
        }
    }
}



public class test {
    public static void main(String[] args) {
        Print print = new Print();
        MyThread myThread = new MyThread(print);
        Thread thread1 = new Thread(myThread,"A");
        Thread thread2 = new Thread(myThread,"B");
        Thread thread3 = new Thread(myThread,"C");
        thread1.start();
        thread2.start();
        thread3.start();
    }
}