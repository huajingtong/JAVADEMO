//package LianBiao;
//
///**
// * 合并链表
// * Created by hjt on 2020/3/7.
// */
//class Node{
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
//    public Node(int data,Node next) {
//        this.data=data;
//        this.next=next;
//    }
//
//}
//public class LiaoBiao_4 {
//    Node n5 = new Node(10, null);
//    Node n4 = new Node(7, n5);
//    Node n3 = new Node(5, n4);
//    Node n2 = new Node(3, n3);
//    Node n1 = new Node(1, n2);
//
//    Node m7 = new Node(7, null);
//    Node m6 = new Node(6, m7);
//    Node m5 = new Node(5, m6);
//    Node m4 = new Node(4, m5);
//    Node m3 = new Node(3, m4);
//    Node m2 = new Node(2, m3);
//    Node m1 = new Node(1, m2);
//
////    Node aa = new Node(-1, null);
//
//    public static void main(String[] args) {
//        LiaoBiao_4 lb1=new LiaoBiao_4();
//        LiaoBiao_4 lb2=new LiaoBiao_4();
////        LiaoBiao_4 lb3=new LiaoBiao_4();
//        Node p1=lb1.n1;
//        Node p2=lb2.n2;
////        Node p3=lb3.aa;
//        while(p1!=null&&p2!=null){
//            if(p1.getData()<=p2.getData()){
//                Node p3=p1;
//                p1=p1.getNext();
//                p3.setNext()=null;
//            }else{
//                p2=p2.getNext();
//                p3=null;
//            }
//
//        }
//
//    }
//
//
//    public void printList(Node p) {
//        while (p != null) {
//            System.out.println(p.getData());
//            p = p.getNext();
//        }
//    }
//}
