package ThreadPoolExecutorDemo;

import java.util.concurrent.ArrayBlockingQueue;
//import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * Created by hjt on 2020/3/10.
 */
public class UseThreadPoolExecutor1 {
    public static void main(String[] args) {
        ThreadPoolExecutor pool=new ThreadPoolExecutor(1,2,
                60, TimeUnit.SECONDS,
                new ArrayBlockingQueue<Runnable>(3),
//                new LinkedBlockingDeque<Runnable>(),
                new MyRejected()
            );

        MyTask mytask1 =new MyTask(


                1,"任务1");
        MyTask mytask2 =new MyTask(1,"任务2");
        MyTask mytask3 =new MyTask(1,"任务3");
        MyTask mytask4 =new MyTask(1,"任务4");
        MyTask mytask5 =new MyTask(1,"任务5");
        MyTask mytask6 =new MyTask(1,"任务6");

        pool.execute(mytask1);
        pool.execute(mytask2);
        pool.execute(mytask3);
        pool.execute(mytask4);
        pool.execute(mytask5);
        pool.execute(mytask6);

        pool.shutdown();


    }
}
