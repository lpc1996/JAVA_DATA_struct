package lpc.main;

import lpc.list.ListNode;
import lpc.list.Slist;
import java.util.Scanner;

/**
 * 对单链表功能进行测试
 * @author 濃霧-遠方
 */
@SuppressWarnings("ALL")
public class SlistTest {

    private Slist list;
    private Scanner in;

    public SlistTest() {
        this.list = new Slist();
    }

    public void menu(){
        System.out.println("单链表功能测试");
        int choose;
        in = new Scanner(System.in);
        do{
            System.out.println("1.向单链表尾部添加数据节点    2.向单链表头部添加数据节点    3.向单链表中指定位置添加数据节点");
            System.out.println("4.删除单链表的头结点（第一个节点）    5.删除单链表中间的节点    0.返回上层菜单");
            choose = in.nextInt();
            switch (choose){
                case 1:
                    addLastData();
                    break;
                case 2:
                    addFirstData();
                    break;
                case 3:
                    addIndex();
                    break;
                case 4:
                    deleteFirst();
                    break;
                case 5:
                    deleteIndex();
                    break;
                case 0:
                    return;
                default:
                    System.out.println("请选择已经实现的功能");
            }
        }while(true);
    }

    /**
     * 测试单链表向尾部添加数据的功能
     */
    private void addLastData(){
        System.out.println("添加数据之前单链表中的数据");
        list.printList();
        int data;
        in = new Scanner(System.in);
        System.out.println("请输入要添加的数据的数量");
        int number = in.nextInt();
        for(int i=0; i < number; i++){
            System.out.print("请输入第"+(i+1)+"个数据：");
            data = in.nextInt();
            list.addLast(new ListNode(data));
            System.out.println();
        }
        System.out.println("添加数据之后单链表中的数据");
        list.printList();
    }

    /**
     * 测试向单链表头部添加数据的功能
     */
    private void addFirstData(){
        System.out.println("添加数据之前单链表中的数据");
        list.printList();
        int data;
        in = new Scanner(System.in);
        System.out.println("请输入要添加的数据的数量");
        int number = in.nextInt();
        for(int i=0; i < number; i++){
            System.out.print("请输入第"+(i+1)+"个数据：");
            data = in.nextInt();
            list.addFirst(new ListNode(data));
            System.out.println();
        }
        System.out.println("添加数据之后单链表中的数据");
        list.printList();
    }

    /**
     * 测试向单链表中任意位置插入数据的功能
     */
    private void addIndex(){
        System.out.println("添加数据之前单链表中的数据");
        list.printList();
        in = new Scanner(System.in);
        System.out.println("请输入要填加数据的位置");
        int index = in.nextInt();
        System.out.println("请输入要添加的数据");
        in = new Scanner(System.in);
        int data = in.nextInt();
        list.addIndex(new ListNode(data),index);
        System.out.println("添加数据之后单链表中的数据");
        list.printList();
    }

    /**
     * 测试删除单链表的头结点（第一个节点）
     */
    private void deleteFirst(){
        System.out.println("删除数据之前单链表中的数据");
        list.printList();
        list.deleteFirst();
        System.out.println("删除数据之后单链表中的数据");
        list.printList();
    }

    /**
     * 测试删除单链表中间的节点
     */
    private void deleteIndex(){
        System.out.println("删除数据之前单链表中的数据");
        list.printList();
        in = new Scanner(System.in);
        System.out.println("请输入要删除的节点在单链表中的位置");
        int index = in.nextInt();
        list.deleteIndex(index);
        System.out.println("删除数据之后单链表中的数据");
        list.printList();
    }


}
