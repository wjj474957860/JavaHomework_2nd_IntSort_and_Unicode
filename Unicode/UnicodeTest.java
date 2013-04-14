//程序的作用：输入某人的姓名，输出姓名每一个字的Unicode上的编码
//和该字的前后的字

//作者：吴建杰 20102100035

import java.util.Scanner;   //导入扫描器文件

public class UnicodeTest{
    
    public static void main(String agrs[]){
           UnicodeTest uic = new UnicodeTest();
           uic.Input();
    }
	
	//接收单个char字符，进行对此字符的转化成编码和找出前后的字符，并输出
    public void print(char ch){
        System.out.println("“"+ch+"”字在Unicode编码表的编号是："+(int)ch);
        System.out.println("    在Unicode编码表的前一个字是："+(char)((int)ch-1));
        System.out.println("    在Unicode编码表的后一个字是："+(char)((int)ch+1));
		System.out.println("==================================================");
    }
	
	//进行用户的输入处理
    public void Input(){
	
        Scanner scan = new Scanner(System.in);   //创建输入流扫描器
        System.out.print("请输入你的姓名：");
        String str = scan.nextLine();            //接收某人的姓名，存放在str里面
		System.out.println("    你的姓名是："+str);
		
        char[] ch = str.toCharArray();           //将String类型转化成char 数组类型
		
        for(int i =0;i < ch.length;i++){
            this.print(ch[i]);                   //单个char字符进行print处理
      }
      
    }
}