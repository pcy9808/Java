package test;

public class HanyangComnet {
String studentNumber;
private int height;  //access modifier ����������

public void setheight(int height){
	if(height<0){
		this.height =100;
	}else{
		this.height=height;
	}
	
}
public int getheight(){
	return this.height;
}

}
