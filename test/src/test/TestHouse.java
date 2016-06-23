package test;

public class TestHouse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		House prugio=new House();
		prugio.width=200;
		prugio.height=30;
		prugio.name="프루지오";
		
		House raemian = new House();
		raemian.width=300;
		raemian.height=40;
		raemian.name ="래지만";
		
		System.out.println(prugio.name+"("+prugio.width+","+prugio.height+")");
		System.out.println(raemian.name+"("+raemian.width+","+raemian.height+")");
		//ctrl + alt + 화살표키 아래 
	}
	 

}
