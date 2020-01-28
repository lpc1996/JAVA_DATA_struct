package lpc.list;

import lpc.node.ListNode;
import org.jetbrains.annotations.NotNull;

/**
 * @author 濃霧-遠方
 * 单链表功能的java实现
 */
@SuppressWarnings({"unused"})
public class Slist implements List{

    private ListNode head;
    private ListNode last;
    private int length;

    /**
     * 类的构造函数，创建单链表时对单链表进行初始化
     */
    public Slist(){
        this.head = null;
        this.last = null;
        this.length = 0;
    }

    /**
     * 返回单链表长度
     * @return length
     */
    public int getLength() {
        return length;
    }

    /**
     * 返回单链表头结点
     * @return 返回单链表的头结点
     */
    public ListNode getHead() {
        return head;
    }

    /**
     *返回单链表的尾结点
     * @return 返回单链表的尾结点
     */
    public ListNode getLast() {
        return last;
    }

    /**
     * 将链表中所有数据打印在屏幕上，每10个数据为一行
     */
    @Override
    public void printList(){
        System.out.println("链表长度为："+length);
        if(length > 0){
            System.out.println("单链表中数据如下：");
            ListNode node = head;
            int i=0;
            while(node != null){
                System.out.print(node.getData());
                node = node.getNext();
                i++;
                if(node != null && i < 10){
                    System.out.print(" ");
                }
                if(i == 10) {
                    System.out.println();
                    i=0;
                }
            }
            if( i != 0) {
                System.out.println();
            }
        }
    }

    /**
     * 在单链表头部插入新节点
     * @param node 要插入单链表的节点对象
     */
    public void addFirst(@NotNull ListNode node){
        node.setNext(this.head);
        this.head = node;
        if(length == 0){
            this.last = this.head;
        }
        length++;
    }

    /**
     * 在链表末尾添加节点
     * @param node 要在单链表尾部添加的节点对象
     */
    public void addLast(ListNode node){
        if(this.head == null){
            this.head = node;
        }else{
            this.last.setNext(node);
        }
        this.last = node;
        this.length++;
    }

    /**
     * 向单链表中index位置添加节点node,初始位置为0
     * @param node 要添加进单链表中的节点对象
     * @param index 要添加的位置
     */
    public void addIndex(ListNode node,int index){
        if(index < 0 || index > length){
            System.out.println("要插入的位置不在单链表中");
            return;
        }
        if(index == 0){
            addFirst(node);
        }else if(index == length){
            addLast(node);
        }else {
            ListNode preNode = head;
            for (int count = 0; count < index - 1; count++) {
                preNode = preNode.getNext();
            }
            node.setNext(preNode.getNext());
            preNode.setNext(node);
            length++;
        }
    }

    /**
     * 删除单链表中的头结点（第一个节点）
     */
    public void deleteFirst(){
        if(length == 0){
            System.out.println("此单链表以为空！");
        }else if( length == 1){
            this.head = null;
            this.last = null;
            length = 0;
        }else{
            this.head = this.head.getNext();
            length--;
        }
    }

    /**
     * 删除单链表中间的一个节点
     * @param index 要删除的节点在单链表中的位置
     */
    public void deleteIndex(int index){
        if(length == 0) {
            System.out.println("此单链表已为空！");
            return;
        }
        if(index == 0){
            deleteFirst();
        }else if(index > 0 && index < length){
            ListNode preNode = head;
            for(int i=0; i<index - 1; i++){
                //循环完成后preNode指向要删除节点的前一个节点
                preNode = preNode.getNext();
            }
            preNode.setNext(preNode.getNext().getNext());
            if(index == length - 1){
                last = preNode;
            }
            length--;
        }else{
            System.out.println("请输入正确的位置：（"+0+"-"+(length-1)+"）！");
        }
    }

    /**
     * 清空整个单链表中的数据
     */
    public void deleteAll(){
        this.head = this.last = null;
        this.length = 0;
    }

    /**
     * 在单链表中查找与data的值相等的节点的位置
     * @param data 要查找的数据
     * @return 如果找到返回该节点的位置，否则，返回-1
     */
    public int indexOf(int data){
        if(length == 0){
            System.out.println("链表为空！");
            return -1;
        }
        int index = -1;
        ListNode node = head;
        for(int i=0; i < length; i++,node = node.getNext()){
            if(node.getData() == data){
                index = i;
                break;
            }
        }
        return index;
    }
}
