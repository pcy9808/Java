package test3;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class YangFrame extends Frame {
	TextField firstField,secondField;
	Label l1;
	Button b1,b2,b3;
	public YangFrame(){
		setLayout(new FlowLayout()); //����ϰ� ����
		b1 = new Button("1");
		b1.addActionListener(new ParkHandler());
		
		b2 = new Button("2");
		b1.addActionListener(new ParkHandler());
		
		
		b3 = new Button("clean");
		b3.addActionListener(new ParkHandler());
		
		l1 = new Label("���̵�: ");
		firstField = new TextField(10);
		secondField= new TextField(10);

		add(l1);
		add(firstField);
		add(b1);
		add(secondField);
		add(b2);
		add(b3);
		//b1.setLabel("������");
		//b2.setLabel("���");
		
	}
	public class ParkHandler implements ActionListener {
		public void actionPerformed(ActionEvent e){
			if(e.getSource()==b1){
			
			}else if(e.getSource()==b2){
				
			secondField.setText("ȣȣȣ");
				
			}else if(e.getSource()==b3){
				firstField.setText("");
				secondField.setText("");
				}
		}
	}
}
