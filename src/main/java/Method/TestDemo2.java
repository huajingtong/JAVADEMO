package Method;

import Method.TestDemo20200322.StudentPersonDemo;
import com.sun.org.apache.xpath.internal.SourceTree;

import java.io.*;
import java.util.*;

/**
 * List方法做的
 * <p>
 * 假设1701班有40个学生，学号为170101~170140，
 * 全部参加语文、数学、英语三门考试，给出所有同学的各科成绩
 * （成绩为整数、随机产生，范围为 [50,100]），
 * 并求出每位同学的总成绩。请编写程序将1701班各位同学的总成绩从高到低排序，
 * 并使用IO流的知识的把成绩写入到G:\StudentScore.txt文件中。
 * 注：成绩相同时学号较小的先打印；要求：
 * ①	打印的信息包含学号、姓名（姓名统一为“同学 X”[X=01,02,03,…]和学号后两位一致）和成绩，
 * 具体格式参考下面截图。
 * ②	遍历数组时使用迭代器
 */
//static class CalendarComparator implements Comparator<Object> {
//       public int compare(Object object1, Object object2) {// 实现接口中的方法
//           Student p1 = (Student) object1; // 强制转换
//           Student p2 = (Student) object2;
//           return p2.calendar.compareTo(p1.calendar);
//       }
//   }
public class TestDemo2 {
    public static void main(String[] args) throws IOException {
        List<Student> ls1 = new ArrayList();
        for (int i = 0; i < 40; i++) {
            int Chinese_score;
            int Math_score;
            int English_score;
            int sum;
            int id;
            String name;
            if (i < 10) {
                Chinese_score = Math();
                Math_score = Math();
                English_score = Math();
                sum = Chinese_score + Math_score + English_score;
                String idr = "170100" + (i + 1);//学号
                id = Integer.parseInt(idr);
//                name=Integer.toString(id=);
                Student spd = new Student(id, Chinese_score, Math_score, English_score, sum);
                ls1.add(spd);
            } else {
                Chinese_score = Math();
                Math_score = Math();
                English_score = Math();
                sum = Chinese_score + Math_score + English_score;
                String idr = "17010" + (i + 1);//学号
                id = Integer.parseInt(idr);
                Student spd = new Student(id, Chinese_score, Math_score, English_score, sum);
                ls1.add(spd);
            }
        }

//        System.out.println("Collections 排序前");

        //第一种迭代器遍历
        System.out.println("第一种迭代器遍历");
        Iterator it=ls1.iterator();
        while(it.hasNext()){
            Student s=(Student) it.next();
            System.out.println("同学"+s.getId()+" 成绩："+s.getSum());
        }



        //第二种for遍历
        System.out.println("第二种for循环遍历");
        for (int i=0;i<ls1.size();i++) {
            System.out.println("同学"+ls1.get(i).getId()+" 成绩总和："+ls1.get(i).getSum());
        }

        //第三种for each语句遍历
        System.out.println("第三种for each语句遍历");
        for (Student s:ls1) {
            System.out.println("同学"+s.getId()+" 成绩总和："+s.getSum());
        }




//        System.out.println("排序后");
//        Collections.sort(ls1);
//
//        FileWriter fw = new FileWriter("C:\\下载\\src\\main\\java\\Method\\buf.txt");
//        BufferedWriter bw = new BufferedWriter(fw);
////        bw.write("你好");
////        bw.newline();
////        bw.write("java");
////        w.newline();
//        for (Student s : ls1) {
//            bw.write("同学" + Integer.toString(s.getId()).substring(Integer.toString(s.getId()).length() - 2) + "，成绩总和" + s.getSum());
//            System.out.println("同学" + Integer.toString(s.getId()).substring(Integer.toString(s.getId()).length() - 2) + "，成绩总和" + s.getSum());
//            bw.newLine();
//            bw.flush();
//        }
//        bw.close();
    }

    public static int Math() {
        int num = (int) (50 * Math.random() + 50);
        return num;
    }
//    public static int Sum(int a,int b,int c) {
//        int sum = a+b+c;
//        return sum;
//    }
}

class Student implements Comparable {
    public Student(int id, int chinese_score, int math_score, int english_score, int sum) {
        this.id = id;
        Chinese_score = chinese_score;
        Math_score = math_score;
        English_score = english_score;
        this.sum = sum;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private String name;
    private int id;
    private int Chinese_score;
    private int Math_score;

    public Student(String name, int id, int chinese_score, int math_score, int english_score, int sum) {
        this.name = name;
        this.id = id;
        Chinese_score = chinese_score;
        Math_score = math_score;
        English_score = english_score;
        this.sum = sum;
    }

    private int English_score;
    private int sum;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getChinese_score() {
        return Chinese_score;
    }

    public void setChinese_score(int chinese_score) {
        Chinese_score = chinese_score;
    }

    public int getMath_score() {
        return Math_score;
    }

    public void setMath_score(int math_score) {
        Math_score = math_score;
    }

    public int getEnglish_score() {
        return English_score;
    }

    public void setEnglish_score(int english_score) {
        English_score = english_score;
    }

    public int getSum() {
        return sum;
    }

    public void setSum(int sum) {
        this.sum = sum;
    }


    @Override
    public String toString() {
        return "Student{}";
    }


    public int compareTo(Object obj) {
        if (!(obj instanceof Student)) {
            throw new RuntimeException("不是学生对象");
        }
//        System.out.println("hh");
        Student s = (Student) obj;
        int num = new Integer(s.sum).compareTo(new Integer(this.sum));
        if (num == 0)
            return new Integer(this.id).compareTo(new Integer(s.id));
        return num;

    }
}
