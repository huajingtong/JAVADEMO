package IO;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

/**
 * Created by hjt on 2020/3/9.
 */
class Hamburg {
    public Hamburg() {
    }

    public Hamburg(int count, int time) {
        this.count = count;
        this.time = time;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }

    @Override
    public String toString() {
        return "Hamburg{" +
                "count=" + count +
                ", time=" + time +
                '}';
    }

    private int count;
    private int time;
}

public class IoTestDemo2 {
    public static void main(String[] args) throws IOException {
        Map<String, Hamburg> hp1 = new HashMap();
        FileReader fr = new FileReader("D://GIT_hjt//aa.txt");
        BufferedReader bd = new BufferedReader(fr);
        String line = null;
        line = bd.readLine();
        while ((line = bd.readLine()) != null) {
            String[] s = line.split("\\|");
            System.out.println("s[1]:" + s[1] + "------- s[3]:" + s[3]);
            if (!(hp1.containsKey(s[1]))) {
                int time = Integer.parseInt(s[3]);
                hp1.put(s[1], new Hamburg(1, time));
            } else {
                Hamburg ss = (Hamburg) hp1.get(s[1]);
                System.out.println("ss:::::::::::"+ss);
                int count = ss.getCount() + 1;
                int time = ss.getTime() + Integer.parseInt(s[3]);
//                System.out.println(count + " " + time);
                ss.setCount(count);
                ss.setTime(time);
//                hp1.put(s[1], new Hamburg(count, time));
            }
        }
//        获取集合的值
        Set<String> s1 = hp1.keySet();
        for (String s : s1) {
            Hamburg ss = (Hamburg) hp1.get(s);
            int count = ss.getCount();
            int time = ss.getTime();
//            System.out.println(s+"~~"+count+"~~"+time );
            System.out.println(s+"平均时间"+time/count);
        }

    }
}