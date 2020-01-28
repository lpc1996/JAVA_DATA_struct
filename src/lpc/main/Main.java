package lpc.main;

import lpc.list.DllList;
import lpc.test.DllListTest;
import lpc.test.SlistTest;

import java.util.Scanner;

/**
 * @author 濃霧-遠方
 */
@SuppressWarnings("AlibabaClassMustHaveAuthor")
public class Main {

	private static Scanner in;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("java数据结构实现");
		int choose;
		do{
			System.out.println("请从下方菜单中选择功能，输入菜单项前面的数字");
			System.out.println("1.单链表功能测试    2.双向链表功能测试    0.退出");
			in = new Scanner(System.in);
			choose = in.nextInt();
			switch (choose){
				case 1:
					SlistTest sListTest = new SlistTest();
					sListTest.menu();
					break;
                case 2:
                    DllListTest dllListTest = new DllListTest();
                    dllListTest.menu();
                    break;
				case 0:
					System.exit(0);
					break;
				default:
					System.out.println("请选择菜单中有的功能");
					break;
			}
		}while(true);
	}

}
