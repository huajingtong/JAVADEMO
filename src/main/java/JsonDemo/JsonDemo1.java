package JsonDemo;

import com.alibaba.fastjson.JSON;

/**
 * Created by hjt on 2020/3/11.
 */
class Person{
    Person(){}
    Person(String name,String[] listname){
        this.name=name;
        this.listname=listname;
    }
    public int hashCode(){
        return super.hashCode();
    }

    public boolean equals(Object obj){
        return (this == obj);
    }

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String[] getListname() {
        return listname;
    }

    public void setListname(String[] listname) {
        this.listname = listname;
    }

    private String[] listname;
}
public class JsonDemo1 {
    public static void main(String[] args) {
        String s="{\n" +
                "            \"name\":\"中国\",\n" +
                "                    \"province\":[\n" +
                "            {\n" +
                "                \"name\":\"黑龙江\",\n" +
                "                    \"cities\":{\n" +
                "                \"city\":[\"哈尔滨\",\"大庆\"]\n" +
                "            }\n" +
                "            },\n" +
                "            {\n" +
                "                \"name\":\"广东\",\n" +
                "                    \"cities\":{\n" +
                "                \"city\":[\"广州\",\"深圳\"]\n" +
                "            }\n" +
                "            },\n" +
                "            {\n" +
                "                \"name\":\"台湾\",\n" +
                "                    \"cities\":{\n" +
                "                \"city\":[\"台北\",\"高雄\"]\n" +
                "            }\n" +
                "            },\n" +
                "      ]\n" +
                "        }";

        Object obj = JSON.parse(s);
        String objjson= JSON.toJSONString(obj);

        System.out.println(objjson);


    }
}
