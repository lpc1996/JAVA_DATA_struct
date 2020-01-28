package lpc.test;

import lpc.list.DllList;
import lpc.node.DllNode;
import java.util.Scanner;

/**
 * 双向链表功能测试
 * @author 濃霧-遠方
 */
public class DllListTest {

    private DllList list;
    private Scanner in;

    public DllListTest(){
        list = new DllList();
    }

    public void menu(){
        System.out.println("双向链表功能测试");
        int choose;
        in = new Scanner(System.in);
        do{
            System.out.println("1.向双向链表头部添加节点    2.向双向链表尾部添加节点    3.向双向链表中任意位置添加节点\n" +
                               "0.返回上级菜单");
            choose = in.nextInt();
            switch(choose){
                case 1:
                    add(true);
                    break;
                case 2:
                    add(false);
                    break;
                case 3:
                    addIndex();
                    break;
                case 0:
                    return;
                default:
                    System.out.println("请选择已实现的功能");
            }
        }while(true);
    }

    /**
     * 测试向双向链表头部或尾部添加数据的功能
     * @param b true则向头部添加，false则向尾部添加
     */
    private void add(boolean b){
        System.out.println("添加前链表中数据");
        list.printList();
        in = new Scanner(System.in);
        System.out.print("请输入要添加数据的数量：");
        int num = in.nextInt();
        System.out.println();
        int data;
        for(int i=0; i<num; i++){
            System.out.println("请输入第"+(i+1)+"个数字");
            data = in.nextInt();
            if(b){
                list.addFirst(data);
            }else{
                list.addLast(data);
            }

        }
        System.out.println("添加后链表中数据");
        list.printList();
    }

    /**
     * 测试向双向链表的任一位置添加节点
     */
    private void addIndex(){
        System.out.println("添加前链表中数据");
        list.printList();
        in = new Scanner(System.in);
        System.out.print("请输入要添加数据的位置：");
        int index = in.nextInt();
        System.out.println("请输入要添加的数据");
        int data = in.nextInt();
        list.addIndex(data,index);
        System.out.println("添加后链表中数据");
        list.printList();
    }
}
