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
            System.out.println("1.向双向链表头部添加节点    0.返回上级菜单");
            choose = in.nextInt();
            switch(choose){
                case 1:
                    addFirst();
                    break;
                case 0:
                    return;
                default:
                    System.out.println("请选择已实现的功能");
            }
        }while(true);
    }

    /**
     * 测试向双向链表头部添加数据的功能
     */
    private void addFirst(){
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
            list.addFirst(new DllNode(data));
        }
        System.out.println("添加后链表中数据");
        list.printList();
    }
}
