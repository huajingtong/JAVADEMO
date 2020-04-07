//package TreadDemo;
//
///**
// * Created by hjt on 2020/3/10.
// */
//
//class Resource{
//    String name;
//    String sex;
//}
//class Input implements Runnable{
//    Resource r;
//    Input(Resource r){
//        this.r=r;
//    }
//    public void run(){
//        int x=0;
//        while(true){
//            synchronized (r){
//                if(flag)
//                    wait();
//                if(x==0){
//
//                }
//                else {
//                    r.name="丽丽";
//                    r.sex="女女";
//                }
//
//            }
//        }
//    }
//}
//
//public class ThreadDemo1 {
//    public static void main(String[] args) {
//
//    }
//}
