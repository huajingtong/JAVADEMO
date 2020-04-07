package IO;

import java.util.*;

/**
 * Created by hjt on 2020/3/9.
 */
public class HashMapDemo {
    public static void main(String[] args) {
        HashMap<String,String> hp = new HashMap<String, String>();
        hp.put("1","huajingtong");
        hp.put("2","hanxiaojie");
        hp.put("3","peijie");
        hp.put("4","paul");
        hp.put("5","sky");


//        Collection<String> values=hp.values();
//        Iterator<String> it=values.iterator();
//        while (it.hasNext()){
//            String me=it.next();
//            System.out.println(me);
//        }

        /**
         * 第一种方式
        Set<String> keySet=hp.keySet();
        Iterator<String> it=keySet.iterator();
        while(it.hasNext()){
            String key=it.next();
            System.out.println("key:"+key);
            String value=hp.get(key);
            System.out.println("value:"+value);
        }
         */
//        Set<Map.Entry<String,String>> entrySet=hp.entrySet();
//        Iterator<Map.Entry<String,String>> it=entrySet.iterator();
//        while(it.hasNext()){
//            Map.Entry<String,String> me=it.next();
//            System.out.println(me.getKey()+" "+me.getValue());
//        }

    }
}
