//��������Ϊ�����û�����5����������ͨ��ð�������㷨��������
//����ӡ����� 

import java.util.Scanner;    //����ɨ���ļ�

public class IntSort{
	
	public static void main(String agrs[]){
	
	IntSort intSort = new IntSort();    //���������IntSort
	int [] number = new int[5];
	
	intSort.input(number);
	System.out.println("�������5��������:");
	intSort.print(number);
	System.out.println("\n��5��������ð���С���������������");
	intSort.Bubble_Sort(number);
	System.out.println("��5������ð�ݺ���:");
	intSort.print(number);
	
	
	
	}  
	
	//ð������
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
	
	//��ӡ����
	public void print(int number[]){
		for(int i = 0;i < 5;i++){
			System.out.print(number[i]+" ");
		}
	}
	
	//���������5������
	public void input(int number[]){
		System.out.println("������5�������������:");
		Scanner scan = new Scanner(System.in);
		for(int i = 0;i < 5;i++){
			number[i] = scan.nextInt();
		}
	
	}
}