package introclasses;

	//return width*height*depth;
class Box1{
	double width;
	double height;
	double depth;
	
	double volume() {
		return width*height*depth;
	}
	
}

public class classbox1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Box1 mybox=new Box1();
		Box1 mybox1=new Box1();
		double vol;
		
		mybox.width=10;
		mybox.height=20;
		mybox.depth=15;
		
		mybox1.width=3;
		mybox1.height=6;
		mybox1.depth=9;
		
		vol=mybox.volume();

		System.out.println("Volume is "+vol);
		
		vol=mybox1.volume();
		
		System.out.println("Volume is "+vol);
	}

}
