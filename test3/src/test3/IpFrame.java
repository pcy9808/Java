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
		submit=new Button("눌러");
		submit.addActionListener(new ParkHandler());
		ip = new Label("아이피: ");
		field = new TextField(10);
	
		add(ip);
		add(field);
		add(submit);
		add(area);
		
	}
	
	public class ParkHandler implements ActionListener{
//override는 오류 떠블 클릭
		@Override
		public void actionPerformed(ActionEvent e) {
			String a = field.getText();
			String[] b = a.split("\\.");
			int c =Integer.parseInt(b[0]);
			System.out.println(c);
			//int y=x.split(".");
			if(c<=127){
			System.out.println("입력하신 IP는 A클래스입니다.");	
			area.setText("입력하신 IP는 A클래스입니다.");
			}else if (c<=192){
				System.out.println("입력하신 IP는 B클래스입니다.");
				area.setText("입력하신 IP는 B클래스입니다.");
			}else if(c<=224){
				System.out.println("입력하신 IP는 C클래스입니다.");
				area.setText("입력하신 IP는 C클래스입니다.");
			}else{
				System.out.println("입력하신 IP는 D클래스입니다.");
				area.setText("입력하신 IP는 D클래스입니다.");
			}
		}
		
		
	}
}
