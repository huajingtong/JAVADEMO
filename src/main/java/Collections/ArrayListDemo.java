package Collections;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * 列表去重
 * Created by hjt on 2020/3/8.
 */
public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList al = new ArrayList();
        al.add("1");
        al.add("2");
        al.add("3");
        al.add("4");
        al.add("4");

        sop(QuChong(al));

    }

    public static ArrayList QuChong(ArrayList al) {
        ArrayList al1 = new ArrayList();
        Iterator it = al.iterator();
        while (it.hasNext()) {
            Object obj =it.next();
            if(!al1.contains(obj)){
                al1.add(obj);
            }
        }
        return al1;
    }

    public static void sop(Object obj) {
        System.out.println(obj);
    }
}
