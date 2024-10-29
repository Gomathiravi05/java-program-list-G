package introclasses;

class Boxa {
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



public class Box2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Boxa mybox=new Boxa();
		Boxa mybox1=new Boxa();
		double vol;
		
		mybox.setDim(10,20,30);
		
		mybox1.setDim(3,6,9);
		
		vol=mybox.volume();

		System.out.println("Volume is "+vol);
		
		vol=mybox1.volume();
		
		System.out.println("Volume is "+vol);
	}

}

