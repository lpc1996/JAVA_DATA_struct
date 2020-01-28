package lpc.list;

import lpc.node.DllNode;

/**
 * 双向链表的功能实现
 * @author 濃霧-遠方
 */
public class DllList {

    private DllNode head;
    private DllNode last;
    private int length;

    public DllList(){
        this.head = null;
        this.last = null;
        this.length = 0;
    }

    public DllNode getLast() {
        return last;
    }

    public DllNode getHead() {
        return head;
    }

    public int getLength() {
        return length;
    }

    /**
     * 将双向链表中所有数据打印在屏幕上
     */
    public void printList(){
        System.out.println("本双向链表的长度为："+this.length);
        if(this.length > 0){
            System.out.println("单链表中数据如下：");
            DllNode current = this.head;
            for(int i=0; i<10 && current != null; i++,current = current.getNext()){
                System.out.print(current.getData());
                if(i < 9){
                    System.out.print(" ");
                }else{
                    System.out.println();
                    i = -1;
                }
            }
            System.out.println();
        }
    }

    /**
     * 向双向链表头部添加节点
     * @param node 要在双向链表头部添加的节点
     */
    public void addFirst(DllNode node){
        if(length == 0){
            this.head = this.last = node;
        }else{
            node.setNext(this.head);
            this.head.setPrev(node);
            this.head = node;
        }
        this.length++;
    }

    /**
     * 向双向链表尾部添加节点
     * @param node 要添加在双向链表尾部的节点
     */
    public void addLast(DllNode node){
        if(length == 0){
            this.head = this.last = node;
        }else{
            this.last.setNext(node);
            node.setPrev(this.last);
            this.last = node;
        }
        this.length++;
    }
}
