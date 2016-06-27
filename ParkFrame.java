package test3;
import java.awt.Button;
import java.awt.Choice;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.List;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class ParkFrame extends Frame{
 TextField name, num1,num2,num3;
 Label nam,sex,phone,and,ad;
 Button submit;
 TextArea area;
 Choice cho;
 
 public ParkFrame(){
 setLayout(new FlowLayout());
 name = new TextField(8);
 num1=new TextField(3); 
 num2=new TextField(3); 
 num3=new TextField(3); 
 submit = new Button("입력");
 submit.addActionListener(new ParkHandler());
 area = new TextArea();
 nam = new Label("이름 : ");
 sex= new Label("성별 : ");
 and = new Label(" - ");
 ad = new Label(" - ");
 phone = new Label("전화번호 : ");
 
 cho = new Choice();
 cho.add("man");
 cho.add("woman");
 
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
 
 
 
 addWindowListener(new WindowAdapter() {
  public void windowClosing(WindowEvent e) {
   System.exit(0);
  }
 });
 
 }
 
 
 
public class ParkHandler implements ActionListener {
 @Override
 public void actionPerformed(ActionEvent e) {
  String inname = name.getText();
  String insex=cho.getSelectedItem();
 // if(cho.getSelectedItem().equals("남자"))  insex ="man";
  String inphone = num1.getText()+num2.getText()+num3.getText();
  
  Connection myCon = null;
  
  try {
   Class.forName("com.mysql.jdbc.Driver");
   myCon = DriverManager.getConnection("jdbc:mysql://localhost:3306/hanyang","root","apmsetup");
  
   
   String sql = "insert into comnet values(?,?,?)";
   PreparedStatement stmt = myCon.prepareStatement(sql);
   
   if(e.getSource()==submit){
    stmt.setString(1, inname);
    stmt.setString(2, insex);
    stmt.setString(3, inphone);
    stmt.executeUpdate();
    stmt.close();
   }
   
   
   
   sql = "select name,sex,phone from comnet";
   stmt = myCon.prepareStatement(sql);
   
   // 여기까지가 실행준비
   // 4. SQL문 실행
   ResultSet rs = stmt.executeQuery();
//   PreparedStatement pstmt = conn.prepareStatement(sql);
   area.setText("");
   String str = "";
  
   
   while(rs.next()) {
 
    str="이름 : "+ rs.getString("name") + " 성별 : "+ rs.getString("sex")+" 번호: "+rs.getString("phone")+"\n";
    area.append(str);
    
    //area.setText(str);
   }
   stmt.close();
   rs.close();
//   (pstmt).getString("name");
//   pstmt.getString("sex");
//   pstmt.getString("phone");
   
   
//  
//  System.out.println("완료염");
//  
//  if(e.getSource()==submit){
//   name.setText(" ");
//   num1.setText(" ");
//   num2.setText(" ");
//   num3.setText(" ");
//   
//  }

   
   
   
   //Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/hanyang","root","apmsetup");
   //Statement stmt = conn.createStatement();
   
    
    
    
    
 
   
   
  } catch(Exception e1){
   e1.printStackTrace();
  }
}
 
  
 }
  
  
  
  
} 