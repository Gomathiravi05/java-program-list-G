package introclasses;

class Box {
    double width;
    double height;
    double depth;

    double volume() {
        return width * height * depth;
    }

    void setDim(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }
}



public class classbox2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Box mybox=new Box();
		Box mybox1=new Box();
		double vol;
		
		mybox.setDim(10,20,30);
		
		mybox1.setDim(3,6,9);
		
		vol=mybox.volume();

		System.out.println("Volume is "+vol);
		
		vol=mybox1.volume();
		
		System.out.println("Volume is "+vol);
	}

}

