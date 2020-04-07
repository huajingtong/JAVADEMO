package ThreadPoolExecutorDemo;

/**
 * Created by hjt on 2020/3/10.
 */
public class MyTask implements Runnable {
    private int taskid;

    public int getTaskid() {
        return taskid;
    }

    public void setTaskid(int taskid) {
        this.taskid = taskid;
    }

    public String getTaskname() {
        return taskname;
    }

    public void setTaskname(String taskname) {
        this.taskname = taskname;
    }

    private String taskname;

    public MyTask(int taskid,String taskname){
        this.taskid=taskid;
        this.taskname=taskname;
    }

    public void run(){
        System.out.println("run~~  taskid:"+this.taskid+"run~~  taskname:"+this.taskname);
    }

    public String toString(){
        return Integer.toString(this.taskid);
    }
}
