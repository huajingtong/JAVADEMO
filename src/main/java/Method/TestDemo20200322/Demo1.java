package Method.TestDemo20200322;

/**
 * Created by hjt on 2020/3/22.
 */
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Random;

public class Demo1 {
    public static void main(String[] args) {
        //定义一个集合
        ArrayList<StudentPersonDemo> al = new ArrayList<StudentPersonDemo>();

        for ( int i = 0+1; i <40+1; i++) {
            //实例Random类，使用它的随机方法
            Random rea = new Random();
            //在外部声明变量， 方便，if与else同时调用变量。
            int zong =0 ;
            int en;
            int ma;
            int le;
            int stn;
            String sn;
            //因为i小于10的时候是一位数的，所以当小于10的时候添加一个0。
            if(i<10){//rea.nextInt(51)+50意思是调用了Random的方法nexInt，51就是有51位数，加50就是为了在原基础上加上50，这样就不会出现1到50的数了
                en =rea.nextInt(51)+50;//英语
                ma =rea.nextInt(51)+50;//数学
                le =rea.nextInt(51)+50;//语文
                stn=170100+i;//学号
                sn ="同学："+0+i;//名字
                zong =en+ma+le;//总成绩
            }else{
                en =rea.nextInt(51)+50;//英语
                ma =rea.nextInt(51)+50;//数学
                le =rea.nextInt(51)+50;//语文

                stn=170100+i;//学号
                sn = "同学："+i;//名字
                zong =en+ma+le;//总成绩
            }
            StudentPersonDemo spd =new StudentPersonDemo(stn,sn,le,ma,en,zong);
            al.add(spd);
            //可以在这里输出一下结果，
			/*System.out.println(spd.getStudentNumber()+"  "+spd.getName()+"  语文"+spd.getLanguage()+"   数学"+spd.getMath()+"  英语"+spd.getEnglish()+"  总成绩："+spd.getTotalPoints());*/
        }
        //排序一下al集合。
        Collections.sort(al);
        try {
            //创建BufferedWriter对象
            BufferedWriter buf =new BufferedWriter(new FileWriter("C:\\下载\\src\\main\\java\\Method\\StudentScore.txt"));
            //可以直接使用循环写出，也可以使用迭代
            Iterator<StudentPersonDemo> it= al.iterator();
            while (it.hasNext()){
                StudentPersonDemo s =  it.next();
                String str ="学号："+s.getStudentNumber()+"  "+s.getName()+"  语文"+s.getLanguage()+"   数学"+s.getMath()+"  英语"+s.getEnglish()+"  总成绩："+s.getTotalPoints();
                buf.write(str+"\r\n");
				/*buf.newLine();*/

            }
            buf.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}