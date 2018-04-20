package ma;

import java.util.Scanner;

/**
 * 
 *
 * @version 
 * @author 马伟杰
 * @date 2018年4月20日 下午11:52:32
 * @Description: 解决三门问题（Monty Hall problem）亦称为蒙提霍尔问题、蒙特霍问题或蒙提霍尔悖论
 */
public class MontyHall {
	static void MontyHall(int number) {
		//本程序采用1.2.3代表三个不同的选项
		int keep = 0;// 坚持胜利次数
		int change = 0;// 改变胜利次数
		for (int d = 0; d < number; d++) {
			long win = Math.round(Math.random() * (3 - 1) + 1);// 设置冠军
			System.out.println("冠军是win:" + win);
			long i = Math.round(Math.random() * (3 - 1) + 1);// 随机选一个
			System.out.println("本次选择的门是 i:" + i);
			long j = Math.round(Math.random() * (3 - 1) + 1);// 随机打开另一个不是冠军的门
			while (j == i || j == win) {
				j = Math.round(Math.random() * (3 - 1) + 1);
			}
			System.out.println("本次打开另一扇不是冠军的门是 j:" + j);
			if (i == win) {
				keep++;
			}else {
				change++;
			}
			System.out.println("坚持胜利次数keep:" + keep);
			System.out.println("改变胜利次数change:" + change);
			if (i==j||j==win) {
				System.err.println("出错"+i+j+win);
			}
			System.out.println("++++++++++++++++++++++++++++++++++++");
		}
		
	}

	public static void main(String[] args) {
		System.out.println("请输入要模拟的次数：");
		Scanner sc = new Scanner(System.in); 
		MontyHall(sc.nextInt());
	}
}
