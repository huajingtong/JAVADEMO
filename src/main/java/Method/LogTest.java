package Method;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by hjt on 2020/3/31.
 */
public class LogTest {
    public static void main(String[] args) throws IOException {
        HashMap<String,Integer> hashMap =new HashMap();
        FileReader fr = new FileReader("D://GIT_hjt//log.txt");
        BufferedReader bd = new BufferedReader(fr);
        String line = null;
        line = bd.readLine();
        while ((line = bd.readLine()) != null) {
            String[] s = line.split("\\t");
            String ss[]=s[0].split("\\.");
            if(hashMap.get(ss[1])!=null){
//                System.out.println(ss[1]);
//                hashMap.get(ss[1]);
                hashMap.put(ss[1],hashMap.get(ss[1])+1);
            }
            else {
//                System.out.println(ss[1]);
                hashMap.put(ss[1],1);
            }
        }


//        hashMap.put()


//        while ((line = bd.readLine()) != null) {
//            String[] s = line.split("\\t");
//            String ss[]=s[0].split("\\.");
//            System.out.println(ss[0]+" "+s[1]);
//        }
        for(String key: hashMap.keySet()){
            System.out.println("key: "+ key + "; value: " + hashMap.get(key));
        }
    }



}
