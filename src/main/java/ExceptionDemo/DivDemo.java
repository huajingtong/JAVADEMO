package ExceptionDemo;

/**
 * Created by hjt on 2020/3/8.
 */
public class DivDemo {
    public int add(int a,int b){
        int c=0;
        try {
            c=a/b;
        }
        catch (Exception e){
            e.printStackTrace();
        }
        finally {
            System.out.println("。。。。");
        }
        return c;
    }

    public static void main(String[] args) {
        DivDemo divDemo=new DivDemo();
        System.out.println(divDemo.add(3,0));
    }
}
