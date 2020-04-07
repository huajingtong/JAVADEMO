package Collections;

import java.util.LinkedList;

/**
 * 实现一个队列，队列是先进先出
 * Created by hjt on 2020/3/8.
 */
class DuiLie{
    private LinkedList linkedList;
    public DuiLie(){
        linkedList=new LinkedList();
    }
    public void myAdd(Object obj){
        linkedList.addFirst(obj);
    }
    public Object myGet(){
        return linkedList.removeFirst();
    }
    public boolean isNull(){
        return linkedList.isEmpty();
    }
}
public class QueueDemo {
    public static void main(String[] args) {
        DuiLie dl =new DuiLie();
        dl.myAdd("a");
        dl.myAdd("b");
        dl.myAdd("c");

        while(!dl.isNull()){
            System.out.println(dl.myGet());
        }
    }
}
