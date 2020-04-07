package Method;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

/**
 * 定义图书类Book，具有属性账号id，书名name、作者author 和价格price，
 * 在创建图书对象时要求通过构造器进行创建，一次性将四个属性全部赋值，
 * 要求账户属性是int型，名称是String型，作者是String型，价格是double,
 * 请合理进行封装。
 * 2)在Book类，添加toString方法，要求返回 图书信息字符串，使用\t隔开各信息
 * 3)要求定义一个图书馆Library类，在图书馆类中添加一个HashSet集合用于保存多本图书
 * 4）在图书馆类中要求能够新增图书
 * 5）在图书馆类中要求可以查看所有添加过的图书
 * 6）不允许添加重复的图书（如果账号id和书名name相同，则认为两本书是相同的）
 * 效果：
 * 请输入图书编号：
 * 1
 * 请输入图书名称：
 * 致青春
 * 请输入图书作者：
 * 王小五
 * 请输入图书价格：
 * 120
 * 是否继续输入：y
 * 请输入图书编号：
 * 2
 * 请输入图书名称：
 * 西游记
 * 请输入图书作者：
 * 吴承恩
 * 请输入图书价格：
 * 230
 * 是否继续输入：n
 * 查看图书
 * 1，致青春，王小五，120
 * 2，西游记，吴承恩，230
 * <p>
 * Created by hjt on 2020/4/6.
 */
class Book {//implements Comparable{
    public Book(int id, String name, String author, double price) {
        this.id = id;
        this.name = name;
        this.author = author;
        this.price = price;
    }
    int id;

//    public int compareTo(Object obj){
////        if (!(obj instanceof Book)) {
////            throw new RuntimeException("不是书对象");
////        }
//        Book book =(Book)obj;
////        int num=
//        return this.getId()-book.getId();
//    }

    @Override
    public int hashCode() {
        return name.hashCode()+id;
    }

    public boolean equals(Object object){
        if(!(object instanceof Book))
            return false;
        Book book=(Book)object;
//        System.out.println(this.n);
        return this.name.equals(this.name)&&this.id==book.id;
    }
    Book() {
        super();
    }
    @Override
    public String toString() {
        return id +"," + name + "," + author + "," + price;
    }

    String name;
    String author;
    double price;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

}

class Library{
    Book book;
    HashSet hashSet=new HashSet();
    void add(){
        do{
            Scanner sc = new Scanner(System.in);
            sc.useDelimiter("\n") ;
            System.out.println("请输入图书编号：");
            String id = sc.nextLine();
            System.out.println("请输入图书名称：");
            String name = sc.nextLine();
            System.out.println("请输入图书作者：");
            String author = sc.nextLine();
            System.out.println("请输入图书价格：");
            String price = sc.nextLine();
            int id1=Integer.valueOf(id);
            Double price1=Double.valueOf(price);
            hashSet.add(new Book(id1,name,author,price1));
            System.out.println("是否继续，请输入y/n:");
            String str=sc.next();
            if("y".equals(str)){
//                System.out.println(hashSet);
            }
            else {
                System.out.println("查看图书");
                select();
                break;
            }
        }while (true);
    }
    void select(){
        Iterator it=hashSet.iterator();
        while(it.hasNext()){
            Object object=it.next();
            System.out.println(object);
        }
    }
}

public class BookDemo20200406 {
    public static void main(String[] args) {
        Library lb=new Library();
        lb.add();


//        System.out.println(id+" "+name+ " " +author+" "+price);

//        int id1=Integer.parseInt(id);
//        double price1=Double.parseDouble(price);
//        lb.add(id1,name,author,price1);
//        System.out.println("==================");
//        lb.select();
    }
}
