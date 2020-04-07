package Method;

/**
 * Created by hjt on 2020/3/11.
 */
public class CommonMultipleDemo {
    public static void main(String[] args) {
        int a=9;
        int b=6;
        int max=Common(a,b);
        System.out.println(max);
        int min=Multiple(a,b);
        System.out.println(min);
    }
    public static int Common(int a,int b){
        if(a<b){
            int temp=a;
            a=b;
            b=temp;
        }
        if(a%b!=0){
            return Common(b,a%b);
        }
        return b;
    }

    public static int Multiple(int a,int b){
        int c=Common(a,b);
        return a*b/c;
    }
}
