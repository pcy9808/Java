package test1;
import java.sql.*;
public class TestComnet {
	public static void main(String[] args) {
		Comnet[] c =new Comnet[5];
		c[0]=new Comnet ("�Ⱥ�ȣ ", 173, 74);
		c[1]=new Comnet ("��â�� ", 172, 60);
		c[2]=new Comnet ("��ġ�� ", 176, 69);
		c[3]=new Comnet ("������", 172, 80);
		c[4]=new Comnet ("������ ", 172, 77);
		Connection myCon = null;
		try{
			Class.forName("com.mysql.jdbc.Driver");
			myCon = DriverManager.getConnection("jdbc:mysql://localhost:3306/hanyang","root","apmsetup");
			String query = "insert into comnet values( ?,?,?)";
			PreparedStatement pstmt = myCon.prepareStatement(query);
			for(Comnet hanyang: c){
				//�ڹ� mysql insert
				pstmt.setString(1, hanyang.getName());
				pstmt.setInt(2, hanyang.getHeight());
				pstmt.setInt(3, hanyang.getWeight());
				pstmt.execute();
			}
		}catch(Exception e){
			e.printStackTrace();
		}
		System.out.println("�Ϸ῰");
	}

}
