package EnumDemo;

/**
 * Created by hjt on 2020/3/23.
 */
public enum Orientation {
    //成员变量
    NORTH("北京"),SOUTH("南京"),WEST("西藏"),EAST("上海");
    //枚举构造方法
    private String city;

    Orientation(String city){
        this.city=city;
    }

    public String getCity(){
        return city;
    }
}
