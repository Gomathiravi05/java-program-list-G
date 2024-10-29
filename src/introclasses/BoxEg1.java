package introclasses;

class Boxb{
	double width;
	double height;
	double depth;
	public double volume() {
		// TODO Auto-generated method stub
		return 0;
	}
}
public class BoxEg1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Boxb mybox=new Boxb();
		Boxb mybox1=new Boxb();
		double vol;
		
		mybox.width=10;
		mybox.height=20;
		mybox.depth=15;
		
		mybox1.width=3;
		mybox1.height=6;
		mybox1.depth=9;
		
		vol=mybox.width*mybox.height*mybox.depth;

		System.out.println("Volume is "+vol);
		
		vol=mybox1.width*mybox1.height*mybox1.depth;
		
		System.out.println("Volume is "+vol);
	}
}
