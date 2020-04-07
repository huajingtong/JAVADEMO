//package LianBiao;
//
//import static java.lang.Math.abs;
//
///**
// * Created by hjt on 2020/3/8.
// */
//class Node {
//    public int getData() {
//        return data;
//    }
//
//    public void setData(int data) {
//        this.data = data;
//    }
//
//    public Node getNext() {
//        return next;
//    }
//
//    public void setNext(Node next) {
//        this.next = next;
//    }
//
//    private int data;
//    private Node next;
//
//    public Node(int data, Node next) {
//        this.data = data;
//        this.next = next;
//    }
//
//}
//
//public class LiaoBiao_5 {
//    Node n5 = new Node(10, null);
//    Node n4 = new Node(7, n5);
//    Node n3 = new Node(5, n4);
//    Node n2 = new Node(3, n3);
//    Node n1 = new Node(1, n2);
//
//
//    Node m3 = new Node(3, n3);
//    Node m2 = new Node(2, m3);
//    Node m1 = new Node(1, m2);
//
//    public static void main(String[] args) {
//        LiaoBiao_5 lb = new LiaoBiao_5();
//        Node p1 = lb.n1;
//        Node p2 = lb.m1;
//
//        int i = 0;
//        while (p1!= null) {
//            p1 = p1.getNext();
//            i++;
//        }
//        System.out.println("A链表长度为"+i);
//
//
//        int j = 0;
//        while (p2!= null) {
//            p2 = p2.getNext();
//            j++;
//        }
//        System.out.println("B链表长度为"+j);
//
//        //p1、p2重新赋值
//         p1 = lb.n1;
//         p2 = lb.m1;
//        int k = 0;
//        int l = 0;
//
//        if (i<=j) {
//            k=j-i;
//            for(int q=0;q<k;q++){
//                p2=p2.getNext();
//            }
//        } else {
//            k=i-j;
//            for(int q=0;q<k;q++){
//                p1=p1.getNext();
//            }
//        }
//
//
///**  第二种方法
//
//        if(i<=j){
//            l=1;
//            k=j-i;
//        }
//        else {
//            l=-1;
//            k=i-j;
//        }
//
//        while (k > 0) {
//            if (l > 0) {
//                p2 = p2.getNext();
//            } else  {
//                p1 = p1.getNext();
//            }
//            k--;
//        }
//**/
//        while (p1!=p2){
//            p1=p1.getNext();
//            p2=p2.getNext();
//        }
//        System.out.println("~~~~~~~~");
//        System.out.println(p1.getData());
//    }
//}
