package test3;

import java.awt.*;

public class YangMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		YangFrame yang = new YangFrame();
		yang.setSize(300,200);//크기 지정
		yang.setLocation(1000,500);//위치 지정
		yang.setVisible(true);
		
		IpFrame ip = new IpFrame();
		ip.setSize(500,300);
		ip.setLocation(1000,400);
		ip.setVisible(true);
		
		
		
	}

}
