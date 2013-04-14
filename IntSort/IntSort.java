//程序作用为：让用户输入5个整型数，通过冒泡排序算法进行排序
//最后打印出结果 

import java.util.Scanner;    //导入扫描文件

public class IntSort{
	
	public static void main(String agrs[]){
	
	IntSort intSort = new IntSort();    //生成类对象IntSort
	int [] number = new int[5];
	
	intSort.input(number);
	System.out.println("你输入的5个整数是:");
	intSort.print(number);
	System.out.println("\n这5个整数在冒泡中。。。。。。。。");
	intSort.Bubble_Sort(number);
	System.out.println("这5个整数冒泡后是:");
	intSort.print(number);
	
	
	
	}  
	
	//冒泡排序
	public void Bubble_Sort(int number[]){
		int temp;
		for(int i = 0;i < 5;i++){
			for(int j = i + 1;j < 5;j++){
				if(number[i] > number[j]){
					temp = number[i];
					number[i] = number[j];
					number[j] = temp;
				}
			}
		}
	}
	
	//打印数组
	public void print(int number[]){
		for(int i = 0;i < 5;i++){
			System.out.print(number[i]+" ");
		}
	}
	
	//处理输入的5个整数
	public void input(int number[]){
		System.out.println("请输入5个待排序的整数:");
		Scanner scan = new Scanner(System.in);
		for(int i = 0;i < 5;i++){
			number[i] = scan.nextInt();
		}
	
	}
}