package test3;

import java.awt.Button;
import java.awt.Choice;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.swing.text.html.parser.DTD;

public class ParkFrame extends Frame{
	DTD dto = new DTD(choice);
	TextField name, num1,num2,num3;
	Label nam,sex,phone,and,ad;
	Button submit;
	TextArea area;
	
	
	public ParkFrame(){
	setLayout(new FlowLayout());
	name = new TextField(8);
	num1=new TextField(3);	
	num2=new TextField(3);	
	num3=new TextField(3);	
	submit = new Button("�Է�");
	submit.addActionListener(new ParkHandler());
	area = new TextArea();
	nam = new Label("�̸� : ");
	sex= new Label("���� : ");
	and = new Label(" - ");
	ad = new Label(" - ");
	phone = new Label("��ȭ��ȣ : ");
	
	Choice cho= new Choice();
	cho.add("����");
	cho.add("����");
	
	add(nam);
	add(name);
	add(sex);
	add(cho);
	add(phone);
	add(num1);
	add(ad);
	add(num2);
	add(and);
	add(num3);
	add(submit);
	add(area);
	
	String abc=cho.getSelectedItem();
	}
	
public class ParkHandler implements ActionListener{
		
	public void actionPerformed(ActionEvent e){
	
		
		Connection myCon = null;
		try{
			Class.forName("com.mysql.jdbc.Driver");
			myCon = DriverManager.getConnection("jdbc:mysql://localhost:3306/hanyang","root","apmsetup");
			String query = "insert into comnet values( ?,?,?)";
			PreparedStatement pstmt = myCon.prepareStatement(query);
//for(Comnet hanyang: c){
				//�ڹ� mysql insert
				pstmt.setString(1, name.getText());
				pstmt.setString(2, abc);
				pstmt.setInt(3, hanyang.getWeight());
				pstmt.execute();
//}
		}catch(Exception e){
			e.printStackTrace();
		}
		System.out.println("�Ϸ῰");
	}	
		
		
		
		
		
		
		
		
		
		}
	}
	
	
	
	
	
	
	
	
}
