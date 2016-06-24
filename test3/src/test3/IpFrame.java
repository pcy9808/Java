package test3;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class IpFrame extends Frame{
	TextField field;
	TextArea area;
	Label ip;
	Button submit;
	
	public IpFrame() {
		setLayout(new FlowLayout());
		submit=new Button("����");
		submit.addActionListener(new ParkHandler());
		ip = new Label("������: ");
		field = new TextField(10);
	
		add(ip);
		add(field);
		add(submit);
		add(area);
		
	}
	
	public class ParkHandler implements ActionListener{
//override�� ���� ���� Ŭ��
		@Override
		public void actionPerformed(ActionEvent e) {
			String a = field.getText();
			String[] b = a.split("\\.");
			int c =Integer.parseInt(b[0]);
			System.out.println(c);
			//int y=x.split(".");
			if(c<=127){
			System.out.println("�Է��Ͻ� IP�� AŬ�����Դϴ�.");	
			area.setText("�Է��Ͻ� IP�� AŬ�����Դϴ�.");
			}else if (c<=192){
				System.out.println("�Է��Ͻ� IP�� BŬ�����Դϴ�.");
				area.setText("�Է��Ͻ� IP�� BŬ�����Դϴ�.");
			}else if(c<=224){
				System.out.println("�Է��Ͻ� IP�� CŬ�����Դϴ�.");
				area.setText("�Է��Ͻ� IP�� CŬ�����Դϴ�.");
			}else{
				System.out.println("�Է��Ͻ� IP�� DŬ�����Դϴ�.");
				area.setText("�Է��Ͻ� IP�� DŬ�����Դϴ�.");
			}
		}
		
		
	}
}
