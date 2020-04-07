package EnumDemo;

/**
 * Created by hjt on 2020/3/25.
 */
public enum TypeEnum {
//    VIDEO(1),AUDIO(2),TEXT(3),IMAGE(4);
    VIDEO(1,"视频"),AUDIO(2,"啊啊"),TEXT(3,"汉堡"),IMAGE(4,"asd");
    int value;
    String name;
    TypeEnum(){}
    TypeEnum(int value){
        this.value=value;
    }
    TypeEnum(int value, String name) {
        this.value = value;
        this.name = name;
    }

    public int getValue(){
        return value;
    }

    public String getName(){
        return name;
    }

    public static TypeEnum getByValue(int value) {
        for(TypeEnum typeEnum : TypeEnum.values()) {
            if(typeEnum.value == value) {
                return typeEnum;
            }
        }
        throw new IllegalArgumentException("No element matches " + value);
    }

}
