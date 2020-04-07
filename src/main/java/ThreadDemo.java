import com.sun.org.apache.xpath.internal.SourceTree;

/**
 * Created by hjt on 2020/3/7.
 */
//class ThreadclassA implements Runnable{
//    public void run(){
//        System.out.println(Thread.currentThread().getName());
//    }
//}
//class ThreadclassB implements Runnable{
//    public void run(){
//
//        System.out.println(Thread.currentThread().getName());
//    }
//}
//class ThreadclassC implements Runnable{
//    public void run(){
//
//        System.out.println(Thread.currentThread().getName());
//    }
//}
public class ThreadDemo {
    final static Object lock=new Object();
    //线程间公用的flag，保证可见性。
    public static volatile int flag = 1;
    public static final int count3 = 3;

    public static void main(String[] args) {
//        ThreadclassA t1=new ThreadclassA();
//        ThreadclassB t2=new ThreadclassB();
//        ThreadclassC t3=new ThreadclassC();
//        Thread tc1=new Thread(t1,"A");
//        Thread tc2=new Thread(t2,"B");
//        Thread tc3=new Thread(t3,"C");
//        tc1.start();
//        tc2.start();
//        tc3.start();

//        Runnable a=new Runnable() {
//            public void run() {
//                System.out.println("A");
//            }
//        };
//        new Thread(a);

        new Thread(new Runnable() {
            public void run() {
                for (int i = 0; i < count3; i++) {
                synchronized (lock) {
                    while (flag!=1){
                        try {
                            lock.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                    System.out.println("A");
                    flag = 2;
                    lock.notifyAll();}
            }}
        }).start();


        new Thread(new Runnable() {
            public void run() {
                for (int i = 0; i < count3; i++) {
                synchronized (lock)
                {   while(flag!=2)
                    try {
                        lock.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    flag=3;
                    lock.notifyAll();
                    System.out.println("B");
                }
            }}
        }).start();

        new Thread(new Runnable() {
            public void run() {
                for (int i = 0; i < count3; i++) {
                synchronized (lock) {
                    while (flag!=3){
                        try {
                            lock.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        flag=1;
                        lock.notifyAll();
                    System.out.println("C");
                }}}
            }
        }).start();
    }

}
