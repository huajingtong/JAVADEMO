package Method.TestDemo20200322;

/**
 * Created by hjt on 2020/3/22.
 */
public class StudentPersonDemo implements Comparable<StudentPersonDemo>{
    //静态变量
    private int StudentNumber;//学号
    private String Name;//名字
    private int language;//语文
    private int math;//数学
    private int English;//英语
    private int TotalPoints;//总成绩
    //无参构造器
    public StudentPersonDemo(){}
    //有参构造器
    public StudentPersonDemo(int studentNumber, String name, int language,
                             int math, int english, int totalPoints) {
        super();
        StudentNumber = studentNumber;
        Name = name;
        this.language = language;
        this.math = math;
        English = english;
        TotalPoints = totalPoints;
    }
    public int getStudentNumber() {
        return StudentNumber;
    }

    public void setStudentNumber(int studentNumber) {
        StudentNumber = studentNumber;
    }

    public String getName() {
        return Name;
    }
    public void setName(String name) {
        Name = name;
    }
    public int getLanguage() {
        return language;
    }
    public void setLanguage(int language) {
        this.language = language;
    }
    public int getMath() {
        return math;
    }
    public void setMath(int math) {
        this.math = math;
    }
    public int getEnglish() {
        return English;
    }
    public void setEnglish(int english) {
        English = english;
    }
    public int getTotalPoints() {
        return TotalPoints;
    }

    public void setTotalPoints(int totalPoints) {
        TotalPoints = totalPoints;
    }

    //重写排序方法

    public int compareTo(StudentPersonDemo o) {
        //要是判断一项的话，就不用判断了。当判断一项无法，按照你的思想排序，就可以多判断一下
        // 从小到大 ：this‐o
        // 从大到小：o‐this
        // return this.age ‐ o.age;
        if (this.TotalPoints!=o.TotalPoints) {
            return o.TotalPoints- this.TotalPoints ;
        }else{
            return  this.StudentNumber-o.StudentNumber ;
        }

    }

}
