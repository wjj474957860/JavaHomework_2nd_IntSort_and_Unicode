//��������ã�ͨ��UI���û��Ľ��������û�����5��������
//ͨ������ť��Ȼ��ð�������С���������
//���ߣ��⽨�� 20102100035

import java.awt.Container;
import java.awt.FlowLayout;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
//�¼������
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class IntSortUI extends JFrame{
	//���캯��
	public IntSortUI(){
		super("ð������С���򡣡�����");
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		final JTextField [] t = {
		new JTextField("����5��������",7),
		new JTextField(null,4),
		new JTextField(null,4),
		new JTextField(null,4),
		new JTextField(null,4),
		new JTextField(null,4),
		new JTextField("���5��������",7),
		new JTextField(null,4),
		new JTextField(null,4),
		new JTextField(null,4),
		new JTextField(null,4),
		new JTextField(null,4),
		};
		JButton b = new JButton("ȷ��");
		t[0].setEditable(false);
		t[6].setEditable(false);
		
		b.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				JButton b = (JButton)e.getSource();
				int [] number = new int[5];
				int temp;
				String str =null;
				
				for(int i = 0;i < 5;i++){
					str = t[i + 1].getText();
					number[i] = Integer.parseInt(str);
				}
				
				
				for(int i = 0;i < 5;i++){
					for(int j = i + 1;j < 5;j++){
						if(number[i] > number[j]){
							temp = number[i];
							number[i] = number[j];
							number[j] = temp;
						}
					}
				}
				
				for(int i = 0;i < 5;i++){
					t[i+7].setText(""+number[i]);
				}
				}
			}
		);
		
		for(int i = 0;i < 12;i++){
				c.add(t[i]);
			}
		c.add(b);
	}
	//���������	
	public static void main(String agrs[]){
	    IntSortUI app = new IntSortUI();
		app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		app.setSize(380,130);
		app.setVisible( true );
	}
}