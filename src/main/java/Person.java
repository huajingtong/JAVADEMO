/**
 * Created by hjt on 2020/3/6.
 */
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 * Created by paul on 2020/3/6.
 */
public class Person {
    private String name;
    private int age;

    public Person() {
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void run() {
        System.out.println("run");
    }

    public void run(String name) {
        System.out.println(":" + name);
    }

    public static void main(String[] args) throws Exception {
        Constructor<?>[] declaredConstructors = Person.class.getDeclaredConstructors();
        System.out.println(declaredConstructors);

        Method[] declaredMethods = Person.class.getDeclaredMethods();
        System.out.println(declaredMethods);

        Field[] fields = Person.class.getFields();
        System.out.println(fields);

        //创建对象
        Person person1 = new Person();
        Person person111 = Person.class.getConstructor().newInstance();//反射
//        Person person111 = Person.class.newInstance();//反射

        //创建对象
        Person person2 = new Person("paul", 18);
        Person person22 = Person.class.getConstructor
                (new Class[]{String.class, int.class}).
                newInstance(new Object[]{"paul", 18});//反射

        //设置属性
        person1.age = 18;
        Person.class.getDeclaredField("age").set(person111, 19);//反射

        System.out.println(person1.age);
        //获取属性
        System.out.println(Person.class.getDeclaredField("age").get(person111));//反射

        //执行方法
        person1.run();
        person1.run("hello");

        Person.class.getMethod("run").invoke(person1);
        Person.class.getMethod("run",String.class).invoke(person1,"hello");


    }


}
