package IO;

import com.sun.corba.se.impl.encoding.CDROutputStream;
import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

/**
 * Created by hjt on 2020/3/8.
 */
public class IoTestDemo {
    public static void main(String[] args) throws IOException {
        HashMap<String, HashMap<String, Integer>> hp1 = new HashMap();
        FileReader fr = new FileReader("D://GIT_hjt//aa.txt");
        BufferedReader bd = new BufferedReader(fr);
        String line = null;
        line = bd.readLine();
        while ((line = bd.readLine()) != null) {
            String[] s = line.split("\\|");
            System.out.println("s[1]:"+s[1] + "------- s[3]:" + s[3]);
            if (!(hp1.containsKey(s[1]))) {
                HashMap<String, Integer> hp2 = new HashMap();
                hp2.put("count", 1);
                hp2.put("time", Integer.parseInt(s[3]));
                hp1.put(s[1], hp2);
            } else {
                hp1.get(s[1]).put("count", hp1.get(s[1]).get("count") + 1);
                hp1.get(s[1]).put("time", hp1.get(s[1]).get("time") + Integer.parseInt(s[3]));
                hp1.put(s[1], hp1.get(s[1]));
            }
        }
        //获取集合的值
        Set<String> s1 = hp1.keySet();
        for (String s : s1) {
//            System.out.println(s);
             HashMap<String,Integer> s2=hp1.get(s);

//090ooo
            System.out.println(s+"平均时间为："+hp1.get(s).get("time")/hp1.get(s).get("count"));
//             Set<String> s3=s2.keySet();
//             for(String s4:s3){
//                 System.out.println(s+"的平均响应时间为"+hp1.get(s).get("time")/hp1.get(s).get("count"));
//             }


        }
    }
}