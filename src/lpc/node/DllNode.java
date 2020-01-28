package lpc.node;

import java.util.Objects;

/**
 * 双向链表节点类
 * @author 濃霧-遠方
 */
public class DllNode {

    private int data;
    private DllNode prev;
    private DllNode next;

    public DllNode(int data) {
        this.data = data;
        prev = null;
        next = null;
    }

    public int getData() {
        return data;
    }

    public void setNext(DllNode next) {
        this.next = next;
    }

    public DllNode getNext() {
        return next;
    }

    public DllNode getPrev() {
        return prev;
    }

    public void setData(int data) {
        this.data = data;
    }

    public void setPrev(DllNode prev) {
        this.prev = prev;
    }
}