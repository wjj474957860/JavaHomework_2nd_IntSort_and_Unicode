//��������ã�����ĳ�˵��������������ÿһ���ֵ�Unicode�ϵı���
//�͸��ֵ�ǰ�����

//���ߣ��⽨�� 20102100035

import java.util.Scanner;   //����ɨ�����ļ�

public class UnicodeTest{
    
    public static void main(String agrs[]){
           UnicodeTest uic = new UnicodeTest();
           uic.Input();
    }
	
	//���յ���char�ַ������жԴ��ַ���ת���ɱ�����ҳ�ǰ����ַ��������
    public void print(char ch){
        System.out.println("��"+ch+"������Unicode�����ı���ǣ�"+(int)ch);
        System.out.println("    ��Unicode������ǰһ�����ǣ�"+(char)((int)ch-1));
        System.out.println("    ��Unicode�����ĺ�һ�����ǣ�"+(char)((int)ch+1));
		System.out.println("==================================================");
    }
	
	//�����û������봦��
    public void Input(){
	
        Scanner scan = new Scanner(System.in);   //����������ɨ����
        System.out.print("���������������");
        String str = scan.nextLine();            //����ĳ�˵������������str����
		System.out.println("    ��������ǣ�"+str);
		
        char[] ch = str.toCharArray();           //��String����ת����char ��������
		
        for(int i =0;i < ch.length;i++){
            this.print(ch[i]);                   //����char�ַ�����print����
      }
      
    }
}