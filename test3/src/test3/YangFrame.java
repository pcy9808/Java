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
		setLayout(new FlowLayout()); //깔끔하게 나옴
		b1 = new Button("1");
		b1.addActionListener(new ParkHandler());
		
		b2 = new Button("2");
		b1.addActionListener(new ParkHandler());
		
		
		b3 = new Button("clean");
		b3.addActionListener(new ParkHandler());
		
		l1 = new Label("아이디: ");
		firstField = new TextField(10);
		secondField= new TextField(10);

		add(l1);
		add(firstField);
		add(b1);
		add(secondField);
		add(b2);
		add(b3);
		//b1.setLabel("눌러라");
		//b2.setLabel("취소");
		
	}
	public class ParkHandler implements ActionListener {
		public void actionPerformed(ActionEvent e){
			if(e.getSource()==b1){
			
			}else if(e.getSource()==b2){
				
			secondField.setText("호호호");
				
			}else if(e.getSource()==b3){
				firstField.setText("");
				secondField.setText("");
				}
		}
	}
}
