package IO;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.HashMap;

/**
 * Created by hjt on 2020/3/8.
 */
public class asd {
    public static void main(String[] args) {
        String line="111|a|1231231212122|1";
        String[] s=line.split("\\|");
        for(int i=0;i<s.length;i++){
            System.out.println(s[i]);
        }

        String ss="huajingtong,hanxiaojie,peijie";
        String[] ssss=ss.split(",");
        for(int i=0;i<ssss.length;i++){
            System.out.println(ssss[i]);
        }

        HashMap<String,String> mp =new HashMap<String, String>();
        mp.put("1","huajingtong");
        mp.put("2","hanxiaojie");
        System.out.println(!mp.containsKey("1"));
        System.out.println(mp.containsKey("3"));
    }
}
