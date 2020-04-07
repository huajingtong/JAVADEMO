package LianBiao;

/**
 * 反转链表
 * Created by hjt on 2020/3/7.
 */
class Node {
    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    private int data;
    private Node next;

    public Node(int data, Node next) {
        this.data = data;
        this.next = next;
    }
}

public class LiaoBiao_2 {
    Node n7 = new Node(7, null);
    Node n6 = new Node(6, n7);
    Node n5 = new Node(5, n6);
    Node n4 = new Node(4, n5);
    Node n3 = new Node(3, n4);
    Node n2 = new Node(2, n3);
    Node n1 = new Node(1, n2);

    public static void main(String[] args) {
        LiaoBiao_2 lb = new LiaoBiao_2();
        Node p = lb.n1;
        lb.reverse(lb);

    }

    public void reverse(LiaoBiao_2 lb) {
        Node p = lb.n1;
        Node q = lb.n2;
        Node x = lb.n3;
        while (q != null) {
            q.setNext(p);
            p = q;
            q = x;
            if (x != null) {
                x = x.getNext();
            }
        }
        lb.n1.setNext(null);
        lb.print(p);

    }

    public void print(Node p) {
        while (p != null) {
            System.out.println(p.getData());
            p = p.getNext();
        }
    }

}
