package EnumDemo;

import org.junit.Test;

import java.util.EnumMap;
import java.util.Map;

/**
 * Created by hjt on 2020/3/23.
 */
public class TestSeasonDemo {
    private TrafficLight trafficLight=TrafficLight.RED;
    @Test
    public void test1(){
        //枚举的创建
        SeasonDemo sd = SeasonDemo.SPRING;
    }
    @Test
    public void test2(){
        //枚举常用方法
        SeasonDemo[] values=SeasonDemo.values();
        for(SeasonDemo s:values){
            System.out.println(s.ordinal()+":"+s);
        }
    }

    public void change(){
        switch (this.trafficLight){
            case RED://枚举的case只写名字，不能加上枚举的名字
                this.trafficLight=TrafficLight.YELLOW;
                break;
            case YELLOW:
                this.trafficLight=TrafficLight.GREEN;
                break;
            case GREEN:
                this.trafficLight=TrafficLight.RED;
                break;
            default:
                break;
        }
    }

    @Test
    public void test3(){
        for(int i=0;i<10;i++){
            this.change();
            System.out.println(this.trafficLight);
        }
    }

    @Test
    public void test4(){
        Orientation o1=Orientation.EAST;
        Orientation o2=Orientation.NORTH;
        Orientation o3=Orientation.SOUTH;
        Orientation o4=Orientation.WEST;
        System.out.println(o1.getCity());
        System.out.println(o2.getCity());
        System.out.println(o3.getCity());
        System.out.println(o4.getCity());
    }

    @Test
    public void test5(){
        EnumMap<Orientation,String> enumMap=new EnumMap(Orientation.class);
        enumMap.put(Orientation.EAST,"东边");
        enumMap.put(Orientation.NORTH,"北面");
        enumMap.put(Orientation.SOUTH,"南京");
        enumMap.put(Orientation.WEST,"西方");

        for(Orientation o: enumMap.keySet()){
            System.out.println(enumMap.get(o));
        }
    }

    @Test
    public void test6(){
        TypeEnum typeEnum=TypeEnum.TEXT;//type的value属性值为3
        System.out.println(typeEnum.getValue());
    }



}
