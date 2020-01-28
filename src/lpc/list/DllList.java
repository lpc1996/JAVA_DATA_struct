package lpc.list;

import lpc.node.DllNode;

/**
 * 双向链表的功能实现
 * @author 濃霧-遠方
 */
public class DllList implements List{

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
    @Override
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
     * @param data 要在双向链表头部添加的数据
     */
    public void addFirst(int data){
        DllNode node = new DllNode(data);
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
     * @param data 要添加在双向链表尾部的数据
     */
    public void addLast(int data){
        DllNode node = new DllNode(data);
        if(length == 0){
            this.head = this.last = node;
        }else{
            this.last.setNext(node);
            node.setPrev(this.last);
            this.last = node;
        }
        this.length++;
    }

    /**
     * 向双向链表任意位置添加节点
     * @param data 要向双向链表中添加的数据
     * @param index 要添加节点的位置
     */
    public void addIndex(int data,int index){
        if(index == 0){
            addFirst(data);
        }else if(index == this.length){
            addLast(data);
        }else if(index > 0 && index < this.length){
            DllNode currentNode = this.head;
            DllNode node = new DllNode(data);
            //for循环用于寻找要插入位置的节点
            for(int i=0; i < index; i++){
                currentNode = currentNode.getNext();
            }
            DllNode prevNode = currentNode.getPrev();
            node.setNext(currentNode);
            currentNode.setPrev(node);
            prevNode.setNext(node);
            node.setPrev(prevNode);
            this.length++;
        }else{
            System.out.println("要插入的位置不在双向链表中");
        }
    }

    /**
     * 删除双向链表的头结点
     */
    public void deleteFirst(){
        if(this.length == 0){
            System.out.println("此双向链表已为空！");
            return;
        }
        if(this.length == 1){
            this.head = this.last = null;
            this.length = 0;
        }else{
            this.head = this.head.getNext();
            this.head.setPrev(null);
            this.length--;
        }
    }
}
