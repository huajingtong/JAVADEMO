//package LianBiao;
//
///**
// * 快慢指针
// * Created by hjt on 2020/3/7.
// */
//class Node{
//    public int getData() {
//        return data;
//    }
//    public void setData(int data) {
//        this.data = data;
//    }
//    public Node getNext() {
//        return next;
//    }
//    public void setNext(Node next) {
//        this.next = next;
//    }
//    private int data;
//    private Node next;
//    public  Node(int data,Node next){
//        this.data=data;
//        this.next=next;
//    }
//}
//public class LiaoBiao_3 {
//    Node n13 = new Node(13, null);
//    Node n12 = new Node(12, n13);
//    Node n11 = new Node(11, n12);
//    Node n10 = new Node(10, n11);
//    Node n9 = new Node(9, n10);
//    Node n8 = new Node(8, n9);
//    Node n7 = new Node(7, n8);
//    Node n6 = new Node(6, n7);
//    Node n5 = new Node(5, n6);
//    Node n4 = new Node(4, n5);
//    Node n3 = new Node(3, n4);
//    Node n2 = new Node(2, n3);
//    Node n1 = new Node(1, n2);
//
//    public static void main(String[] args) {
//        LiaoBiao_3 lb3= new LiaoBiao_3();
//        Node p1=lb3.n1;
//        Node p2=lb3.n1;
//        int i=0;
//        //让p2先走2步
//        while(i<2){
//            if (p2!=null){
//                p2=p2.getNext();
//                i++;
//            }
//        }
//
//        while(p2.getNext()!=null){
//            p2=p2.getNext();
//            p1=p1.getNext();
//        }
//
//        System.out.println(p1.getData());
//    }
//}
