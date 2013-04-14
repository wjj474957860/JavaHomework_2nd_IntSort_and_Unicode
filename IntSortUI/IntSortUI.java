//程序的作用：通过UI与用户的交互，让用户输入5个整数，
//通过按按钮，然后冒泡输出从小到大的排序
//作者：吴建杰 20102100035

import java.awt.Container;
import java.awt.FlowLayout;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
//事件处理包
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class IntSortUI extends JFrame{
	//构造函数
	public IntSortUI(){
		super("冒泡排序小程序。。。。");
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		final JTextField [] t = {
		new JTextField("输入5个整数：",7),
		new JTextField(null,4),
		new JTextField(null,4),
		new JTextField(null,4),
		new JTextField(null,4),
		new JTextField(null,4),
		new JTextField("输出5个整数：",7),
		new JTextField(null,4),
		new JTextField(null,4),
		new JTextField(null,4),
		new JTextField(null,4),
		new JTextField(null,4),
		};
		JButton b = new JButton("确定");
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
	//主程序入口	
	public static void main(String agrs[]){
	    IntSortUI app = new IntSortUI();
		app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		app.setSize(380,130);
		app.setVisible( true );
	}
}