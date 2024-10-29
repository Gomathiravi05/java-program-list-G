package introclasses;

class BoxC {
    double width;
    double height;
    double depth;

    BoxC() {
    	System.out.println("Constructing Box");
    	width=10;
    	height=10;
    	depth=10;
    }
    
    double volume() {
        return width * height * depth;
    }

   
}
public class BoxEgCons {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		BoxC mybox=new BoxC();
		BoxC mybox1=new BoxC();
		double vol;
		
		vol=mybox.volume();

		System.out.println("Volume is "+vol);
		
		vol=mybox1.volume();
		
		System.out.println("Volume is "+vol);
	
	}

}
