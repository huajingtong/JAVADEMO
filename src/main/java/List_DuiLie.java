import javax.sound.midi.Soundbank;
import java.util.LinkedList;

/**
 * 实现一个队列，队列是先进先出
 * Created by hjt on 2020/3/7.
 */
class DuiLIe{
    private LinkedList link;
    DuiLIe(){
        link=new LinkedList();
    }
    public void myAdd(Object obj){
        link.addFirst(obj);
    }
    public Object myget(){
        return link.removeFirst();
    }
    public boolean isNull(){
        return link.isEmpty();
    }
}
public class List_DuiLie {
    public static void main(String[] args) {
        DuiLIe duiLIe =new DuiLIe();
        duiLIe.myAdd("a");
        duiLIe.myAdd("b");
        duiLIe.myAdd("c");
        duiLIe.myAdd("d");
        while (!duiLIe.isNull()){
//            System.out.println(duiLIe.);
            System.out.println(duiLIe.myget());
        }
    }
}
