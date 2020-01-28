package lpc.node;

/**
 * @author 濃霧-遠方
 * 单链表节点类
 */
public class ListNode {
    private int data;
    private ListNode next;

    public ListNode(int data){
        this.data = data;
        this.next = null;
    }

    public void setData(int data){
        this.data=data;
    }

    public int getData(){
        return data;
    }

    public void setNext(ListNode next) {
        this.next = next;
    }

    public ListNode getNext() {
        return next;
    }
}
