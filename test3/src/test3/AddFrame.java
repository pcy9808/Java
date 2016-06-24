package test3;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AddFrame extends Frame {
	
	TextField first, second;
	Button add, minus, x,slash, erase;
	TextArea area;
	public AddFrame() {
		setLayout(new FlowLayout());
		first = new TextField(2);
		second = new TextField(2);
		erase = new Button("지우기");
		erase.addActionListener(new ParkHandler());
		add= new Button("+");
		add.addActionListener(new ParkHandler());
		minus= new Button("-");
		minus.addActionListener(new ParkHandler());
		x= new Button("x");
		x.addActionListener(new ParkHandler());
		slash= new Button("/");
		slash.addActionListener(new ParkHandler());
		area = new TextArea();
		
		add(first);
		add(add);
		add(minus);
		add(x);
		add(slash);
		
		add(second);
		add(erase);
		add(area);
		
	}
	public class ParkHandler implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			
			String ab = first.getText();
			int a =Integer.parseInt(ab);
			String bc = second.getText();
			int b =Integer.parseInt(bc);
			
			if(e.getSource()==add){
				area.setText( String.valueOf(a+b));
			}else if(e.getSource() == minus){
				area.setText(String.valueOf(a-b));
			}else if(e.getSource()== x){
				area.setText(String.valueOf(a*b));
			}else if(e.getSource()== slash){
				area.setText(String.valueOf(a/b));
			}else if(e.getSource() == erase){
				first.setText(" ");
				second.setText(" ");
				area.setText(" ");
			}else{
				area.setText("다시 입력하시오");
			}
		}
		
	}

}
