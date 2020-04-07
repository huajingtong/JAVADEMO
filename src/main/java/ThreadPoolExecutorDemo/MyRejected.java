package ThreadPoolExecutorDemo;

import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadPoolExecutor;

/**
 * Created by hjt on 2020/3/10.
 */
public class MyRejected implements RejectedExecutionHandler{
    public MyRejected(){}
    public void rejectedExecution(Runnable r, ThreadPoolExecutor executor){
        System.out.println("自定义处理");
        System.out.println("当前被拒绝任务为："+ r.toString());
    }
}
