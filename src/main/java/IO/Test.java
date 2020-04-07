package IO;

public class Test {
    public final int value = 4;
    public void doIt() {
        final int value = 6;
        Runnable r = new Runnable() {
            public final int value = 5;
            public void run() {
                int value = 10;
                System.out.println(value);//10
                System.out.println(this.value);//5
                System.out.println(value);
                System.out.println(Test.this.value);//4
            }
        };
        r.run();
    }

    public static void main(String... args) {
        Test m = new Test();
        m.doIt();
    }
}