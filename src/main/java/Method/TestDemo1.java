//package Method;
//
//import com.sun.org.apache.xpath.internal.SourceTree;
//
//import java.util.*;
//
///**
// * 假设1701班有40个学生，学号为170101~170140，
// * 全部参加语文、数学、英语三门考试，给出所有同学的各科成绩
// * （成绩为整数、随机产生，范围为 [50,100]），
// * 并求出每位同学的总成绩。请编写程序将1701班各位同学的总成绩从高到低排序，
// * 并使用IO流的知识的把成绩写入到G:\StudentScore.txt文件中。
// * 注：成绩相同时学号较小的先打印；要求：
// * ①	打印的信息包含学号、姓名（姓名统一为“同学 X”[X=01,02,03,…]和学号后两位一致）和成绩，
// * 具体格式参考下面截图。
// * ②	遍历数组时使用迭代器
// * //
// */
//class Mycompre implements Comparator {
//    public int compare(Object o1, Object o2) {
//        Student s1 = (Student) o1;
//        Student s2 = (Student) o2;
//
//        System.out.println("比较器");
//        int num = new Integer(s2.getSum()).compareTo(new Integer(s1.getSum()));
//        if (num == 0)
//            return new Integer(s1.getId()).compareTo(new Integer(s2.getId()));
//        return num;
//    }
//}
//
//public class TestDemo1 {
//    public static void main(String[] args) {
//        Set<Student> set1 = new TreeSet<Student>(new Mycompre());
////        Set<Student> set1 = new TreeSet<Student>();
//        String name;
//        int id;
//        int ChineseScore;
//        int MathScore;
//        int EnglishScore;
//        int sum;
//        for (int i = 1; i < 41; i++) {
//            if (i < 11) {
//                id = Integer.valueOf("170100" + i);
//                name = "同学0" + i;
//                ChineseScore = Math();
//                MathScore = Math();
//                EnglishScore = Math();
//                sum = ChineseScore + MathScore + EnglishScore;
//                Student student = new Student(name, id, ChineseScore, MathScore, EnglishScore, sum);
//                set1.add(student);
//            } else {
//                id = Integer.valueOf("17010" + i);
//                name = "同学" + i;
//                ChineseScore = Math();
//                MathScore = Math();
//                EnglishScore = Math();
//                sum = ChineseScore + MathScore + EnglishScore;
//                Student student = new Student(name, id, ChineseScore, MathScore, EnglishScore, sum);
//                set1.add(student);
//            }
//        }
//        System.out.println("treeset自带排序~~~~");
//        //第一种：迭代器遍历
//        Iterator it = set1.iterator();
//        while (it.hasNext()) {
//            Student student = (Student) it.next();
//            System.out.println("迭代器遍历："+student.getName() + "  语文成绩：" + student.getChineseScore() + "  数学成绩：" + student.getMathScore() + "  英语成绩：" + student.getEnglishScore() + "  总分：" + student.getSum());
//        }
////        //第二种 for循环
////        for(int i=0;i<set1.size();i++){
////            System.out.println("for循环遍历："+);
////        }
//
//
//
//    }
//
//    public static int Math() {
//        int num = (int) (50 * Math.random() + 50);
//        return num;
//    }
//}
//
//class Student implements Comparable {
//
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//
//
//
//
//
//    public int getId() {
//        return id;
//    }
//
//    public void setId(int id) {
//        this.id = id;
//    }
//
//    public int getChineseScore() {
//        return ChineseScore;
//    }
//
//    public void setChineseScore(int chineseScore) {
//        ChineseScore = chineseScore;
//    }
//
//    public int getMathScore() {
//        return MathScore;
//    }
//
//    public void setMathScore(int mathScore) {
//        MathScore = mathScore;
//    }
//
//    public int getEnglishScore() {
//        return EnglishScore;
//    }
//
//    public void setEnglishScore(int englishScore) {
//        EnglishScore = englishScore;
//    }
//
//    public int getSum() {
//        return sum;
//    }
//
//    public void setSum(int sum) {
//        this.sum = sum;
//    }
//
//    private String name;
//
//    public Student(String name, int id, int chineseScore, int mathScore, int englishScore, int sum) {
//        this.name = name;
//        this.id = id;
//        ChineseScore = chineseScore;
//        MathScore = mathScore;
//        EnglishScore = englishScore;
//        this.sum = sum;
//    }
//
//    private int id;
//    private int ChineseScore;
//    private int MathScore;
//    private int EnglishScore;
//    private int sum;
//
//
//
//    @Override
//    public String toString() {
//        return "Student{}";
//    }
//
//
//    public int compareTo(Object obj) {
//        if (!(obj instanceof Student)) {
//            throw new RuntimeException("不是学生对象");
//        }
//        System.out.println("继承comparator");
//        Student s = (Student) obj;
//        int num = new Integer(s.sum).compareTo(new Integer(this.sum));
//        if (num == 0)
//            return new Integer(this.id).compareTo(new Integer(s.id));
//        return num;
//
//    }
//}
